package org.tensorflow.lite.examples.objectdetection.fragments

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.content.Intent
import android.hardware.Camera
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.chip.Chip
import com.google.common.base.Objects
import org.tensorflow.lite.examples.objectdetection.R
import org.tensorflow.lite.examples.objectdetection.Utils
import org.tensorflow.lite.examples.objectdetection.barcodedetection.BarcodeField
import org.tensorflow.lite.examples.objectdetection.barcodedetection.BarcodeProcessor
import org.tensorflow.lite.examples.objectdetection.barcodedetection.BarcodeResultFragment
import org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay
import org.tensorflow.lite.examples.objectdetection.camera.CameraSource
import org.tensorflow.lite.examples.objectdetection.camera.CameraSourcePreview
import org.tensorflow.lite.examples.objectdetection.camera.WorkflowModel
import org.tensorflow.lite.examples.objectdetection.camera.WorkflowModel.WorkflowState
import org.tensorflow.lite.examples.objectdetection.settings.SettingsActivity
import java.io.IOException
import java.util.ArrayList

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ScanFragment :  Fragment(), OnClickListener {

    private var param1: String? = null
    private var param2: String? = null

    private var cameraSource: CameraSource? = null
    private var preview: CameraSourcePreview? = null
    private var graphicOverlay: GraphicOverlay? = null
    private var settingsButton: View? = null
    private var flashButton: View? = null
    private var promptChip: Chip? = null
    private var promptChipAnimator: AnimatorSet? = null
    private var workflowModel: WorkflowModel? = null
    private var currentWorkflowState: WorkflowState? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_scan, container, false)

        preview = view.findViewById(R.id.camera_preview)
        graphicOverlay = view.findViewById<GraphicOverlay>(R.id.camera_preview_graphic_overlay).apply {
                setOnClickListener(this@ScanFragment)
                cameraSource = CameraSource(this)
        }

//        promptChip = view.findViewById(R.id.bottom_prompt_chip)
//        promptChipAnimator =
//            (AnimatorInflater.loadAnimator(requireContext(), R.animator.bottom_prompt_chip_enter) as AnimatorSet).apply {
//                setTarget(promptChip)
//            }

        view.findViewById<View>(R.id.close_button).setOnClickListener(this)
        flashButton = view.findViewById<View>(R.id.flash_button).apply {
            setOnClickListener(this@ScanFragment)
        }
        settingsButton = view.findViewById<View>(R.id.settings_button).apply {
            setOnClickListener(this@ScanFragment)
        }

        setUpWorkflowModel()

        return view
    }

    override fun onStart() {
        super.onStart()

        if (!Utils.allPermissionsGranted(requireContext())) {
            Utils.requestRuntimePermissions(requireActivity())
        }

        workflowModel?.markCameraFrozen()
        settingsButton?.isEnabled = true
        currentWorkflowState = WorkflowState.NOT_STARTED
        cameraSource?.setFrameProcessor(BarcodeProcessor(graphicOverlay!!, workflowModel!!))
        workflowModel?.setWorkflowState(WorkflowState.DETECTING)
        BarcodeResultFragment.dismiss(childFragmentManager)

    }

    override fun onStop() {
        super.onStop()
        currentWorkflowState = WorkflowState.NOT_STARTED
        stopCameraPreview()
        Log.d(TAG, "Current workflow state: ${currentWorkflowState!!.name}")
    }

    override fun onResume() {
        super.onResume()
        startCameraPreview()
        setUpWorkflowModel()
    }

    override fun onDestroy() {
        super.onDestroy()
        cameraSource?.release()
        cameraSource = null
        Log.d(TAG, "Current workflow state: ${currentWorkflowState!!.name}")
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.close_button -> {
                val intent = Intent(requireContext(), ScanFragment::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
                requireActivity().finish()
            }
            R.id.flash_button -> {
                flashButton?.let {
                    if (it.isSelected) {
                        it.isSelected = false
                        cameraSource?.updateFlashMode(Camera.Parameters.FLASH_MODE_OFF)
                    } else {
                        it.isSelected = true
                        cameraSource!!.updateFlashMode(Camera.Parameters.FLASH_MODE_TORCH)
                    }
                }
            }
            R.id.settings_button -> {
                settingsButton?.isEnabled = false
                startActivity(Intent(requireContext(), SettingsActivity::class.java))
            }
        }
    }

    private fun startCameraPreview() {
        val workflowModel = this.workflowModel ?: return
        val cameraSource = this.cameraSource ?: return
        if (!workflowModel.isCameraLive) {
            try {
                workflowModel.markCameraLive()
                preview?.start(cameraSource)
            } catch (e: IOException) {
                Log.e(TAG, "Failed to start camera preview!", e)
                cameraSource.release()
                this.cameraSource = null
            }
        }
    }

    private fun stopCameraPreview() {
        val workflowModel = this.workflowModel ?: return
        if (workflowModel.isCameraLive) {
            workflowModel.markCameraFrozen()
            flashButton?.isSelected = false
            preview?.stop()
        }
    }

    private fun setUpWorkflowModel() {
        workflowModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(requireActivity().application))
            .get(WorkflowModel::class.java)

        // Observes the workflow state changes, if happens, update the overlay view indicators and
        // camera preview state.
        workflowModel!!.workflowState.observe(viewLifecycleOwner, Observer { workflowState ->
            if (workflowState == null || Objects.equal(currentWorkflowState, workflowState)) {
                return@Observer
            }

            currentWorkflowState = workflowState
            Log.d(TAG, "Current workflow state: ${currentWorkflowState!!.name}")

            val wasPromptChipGone = promptChip?.visibility == View.GONE

            when (workflowState) {
                WorkflowState.DETECTING -> {
                    promptChip?.visibility = View.VISIBLE
                    promptChip?.setText(R.string.prompt_point_at_a_barcode)
                    startCameraPreview()
                }
                WorkflowState.CONFIRMING -> {
                    promptChip?.visibility = View.VISIBLE
                    promptChip?.setText(R.string.prompt_move_camera_closer)
                    startCameraPreview()
                }
                WorkflowState.SEARCHING -> {
                    promptChip?.visibility = View.VISIBLE
                    promptChip?.setText(R.string.prompt_searching)
                    stopCameraPreview()
                }
                WorkflowState.DETECTED, WorkflowState.SEARCHED -> {
                    promptChip?.visibility = View.GONE
                    stopCameraPreview()
                }
                else -> promptChip?.visibility = View.GONE
            }

            val shouldPlayPromptChipEnteringAnimation = wasPromptChipGone && promptChip?.visibility == View.VISIBLE
            promptChipAnimator?.let {
                if (shouldPlayPromptChipEnteringAnimation && !it.isRunning) it.start()
            }
        })

        workflowModel?.detectedBarcode?.observe(viewLifecycleOwner, Observer { barcode ->
            if (barcode != null) {
                val barcodeFieldList = ArrayList<BarcodeField>()
                barcodeFieldList.add(BarcodeField("Raw Value", barcode.rawValue ?: ""))
                BarcodeResultFragment.show(childFragmentManager, barcodeFieldList)
            }
        })
    }

    companion object {
        private const val TAG = "ScanFragment"
    }
}