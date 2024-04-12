/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tensorflow.lite.examples.objectdetection.barcodedetection

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.tensorflow.lite.examples.objectdetection.R
import org.tensorflow.lite.examples.objectdetection.camera.WorkflowModel
import org.tensorflow.lite.examples.objectdetection.camera.WorkflowModel.WorkflowState

/** Displays the bottom sheet to present barcode fields contained in the detected barcode.  */
class BarcodeResultFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        layoutInflater: LayoutInflater,
        viewGroup: ViewGroup?,
        bundle: Bundle?
    ): View {
        val view = layoutInflater.inflate(R.layout.barcode_bottom_sheet, viewGroup)

        val arguments = arguments
        val barcodeFieldList: ArrayList<BarcodeField> =
            if (arguments?.containsKey(ARG_BARCODE_FIELD_LIST) == true) {
                arguments.getParcelableArrayList(ARG_BARCODE_FIELD_LIST) ?: ArrayList()
            } else {
                Log.e(TAG, "No barcode field list passed in!")
                ArrayList()
            }

        view.findViewById<RecyclerView>(R.id.barcode_field_recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity)
            adapter = BarcodeFieldAdapter(barcodeFieldList)
        }
        // Retrieve scanned information (for example, assuming it's the first barcode field)
        val scannedInformation = barcodeFieldList.firstOrNull()?.value ?: ""

        view.findViewById<Button>(R.id.copyButton).setOnClickListener {
            // Copy scanned information to clipboard
            copyToClipboard(scannedInformation)
        }
        view.findViewById<Button>(R.id.openLinkButton).setOnClickListener {
            // Check if the scanned information is a URL
            if (scannedInformation.startsWith("http://") || scannedInformation.startsWith("https://")) {
                // Open the URL in a web browser
                openWebPage(scannedInformation)
            }
        }

        return view
    }
    private fun copyToClipboard(text: String) {
        // Implement logic to copy text to clipboard
        // You can use ClipboardManager to copy text to clipboard
        // Example implementation:
        val clipboard = context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager?
        val clip = ClipData.newPlainText("Scanned Information", text)
        clipboard?.setPrimaryClip(clip)

        // Show a toast message or perform any action after copying
        // Example: Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show()
    }

    private fun openWebPage(url: String) {
        // Implement logic to open a web page
        // You can use an Intent to open a web browser
        // Example implementation:
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    override fun onDismiss(dialogInterface: DialogInterface) {
        activity?.let {
            // Back to working state after the bottom sheet is dismissed.
            ViewModelProvider(it).get(WorkflowModel::class.java).setWorkflowState(WorkflowState.DETECTING)
        }
        super.onDismiss(dialogInterface)
    }

    companion object {

        private const val TAG = "BarcodeResultFragment"
        private const val ARG_BARCODE_FIELD_LIST = "arg_barcode_field_list"

        fun show(fragmentManager: FragmentManager, barcodeFieldArrayList: ArrayList<BarcodeField>) {
            val barcodeResultFragment = BarcodeResultFragment()
            barcodeResultFragment.arguments = Bundle().apply {
                putParcelableArrayList(ARG_BARCODE_FIELD_LIST, barcodeFieldArrayList)
            }
            barcodeResultFragment.show(fragmentManager, TAG)
        }

        fun dismiss(fragmentManager: FragmentManager) {
            (fragmentManager.findFragmentByTag(TAG) as BarcodeResultFragment?)?.dismiss()
        }
    }
}
