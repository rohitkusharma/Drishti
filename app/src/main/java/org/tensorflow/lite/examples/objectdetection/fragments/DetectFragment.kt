package org.tensorflow.lite.examples.objectdetection.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

//import org.tensorflow.lite.Interpreter
////import org.tensorflow.lite.support.common.TensorOperator
////import org.tensorflow.lite.support.common.TensorImage
////import org.tensorflow.lite.support.common.ops.NormalizeOp
import org.tensorflow.lite.examples.objectdetection.R

import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel
import android.content.res.AssetFileDescriptor
import android.content.res.AssetManager
//import androidx.room.jarjarred.org.antlr.v4.gui.Interpreter
import java.io.FileInputStream

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetectFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetectFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

//    private lateinit var tflite: Interpreter
//    private lateinit var tfliteModel: MappedByteBuffer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

            // Load the model file
//            tfliteModel = loadModelFile(requireActivity().assets, "detect6_may_2026.tflite")
//
//            // Initialize the TFLite interpreter
//            tflite = Interpreter(tfliteModel)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detect, container, false)
    }

    @Throws(Exception::class)
    private fun loadModelFile(assets: AssetManager, modelPath: String): MappedByteBuffer {
        val fileDescriptor: AssetFileDescriptor = assets.openFd(modelPath)
        val inputStream = FileInputStream(fileDescriptor.fileDescriptor)
        val fileChannel: FileChannel = inputStream.channel
        val startOffset: Long = fileDescriptor.startOffset
        val declaredLength: Long = fileDescriptor.declaredLength
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DetectFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DetectFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}