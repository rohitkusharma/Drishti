package org.tensorflow.lite.examples.objectdetection.fragments

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import org.tensorflow.lite.examples.objectdetection.R
import org.tensorflow.lite.examples.objectdetection.ObjectDetectorHelper
import java.io.InputStream
import android.os.Vibrator
import androidx.core.content.ContextCompat


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [FindFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FindFragment : Fragment() {
    // TODO: Rename and change types of parameters


    private val TAG = "FindFragment"

    private lateinit var objectDetectorHelper: ObjectDetectorHelper

    // Define a variable to hold electronicItemLabels
    private var electronicItemLabels: Set<String> = emptySet()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_find, container, false)

        // Create a variable to keep track of the currently selected button
        var selectedButton: ImageButton? = null

        // Attach click listeners to your ImageButtons
        val btnPerson = view.findViewById<ImageButton>(R.id.btnPerson)
        val btnChair = view.findViewById<ImageButton>(R.id.btnChair)
        val btnBottle = view.findViewById<ImageButton>(R.id.btnBottle)
        val btnDesktop = view.findViewById<ImageButton>(R.id.btnDesktop)
        val btnTable = view.findViewById<ImageButton>(R.id.btnTable)



        // Function to highlight the selected button
        fun highlightButton(button: ImageButton) {
            // Restore the previous selected button's appearance
            selectedButton?.setBackgroundResource(R.color.transparent) // Change to your normal button background resource

            // Set the current button as the selected button
            selectedButton = button
            // Change the background of the selected button to the highlighted state
            button.setBackgroundResource(R.color.Tab3Background) // Change to your selected button background resource
        }


        btnPerson.setOnClickListener {
            val personlabel = setOf("व्यक्ति")

            CameraFragment2.setLabels(personlabel)
            highlightButton(btnPerson)
            // Call the sentlabel function in CameraFragment2
            //sentlabel(personlabel)
        }
        btnChair.setOnClickListener {
            val furniturelabel = setOf("कुर्सी","सोफा","डाइनिंग टेबल","बिस्तर","पीठ झोला")

//            CameraFragment2.getInstance()?.sentlabel(personlabel)
            CameraFragment2.setLabels(furniturelabel)
            highlightButton(btnChair)
        }
        btnBottle.setOnClickListener {
            val kitchenlabel = setOf("बोतल","कप","फॉर्क","चाकू","चम्मच","कटोरा","सिंक")

            CameraFragment2.setLabels(kitchenlabel)
            highlightButton(btnBottle)
        }
        btnDesktop.setOnClickListener {
            val electronicslabel = setOf("टीवी","लैपटॉप","माउस","रिमोट","कीबोर्ड","सेल फोन","माइक्रोवेव","ओवन","टोस्टर","फ्रिज","घड़ी")

            CameraFragment2.setLabels(electronicslabel)
            highlightButton(btnDesktop)
        }
        btnTable.setOnClickListener {
            // If you want to remove the highlight when btnTable is clicked
            selectedButton?.setBackgroundResource(R.color.transparent) // Change to your normal button background resource
            selectedButton = null
            CameraFragment2.setLabels(emptySet()) // Clear the labels
        }

        return view

    }

    // Define a function to load a Bitmap from a resource ID
    private fun loadBitmapFromResource(resourceId: Int): Bitmap {
        val inputStream: InputStream = resources.openRawResource(resourceId)
        return BitmapFactory.decodeStream(inputStream)
    }

}