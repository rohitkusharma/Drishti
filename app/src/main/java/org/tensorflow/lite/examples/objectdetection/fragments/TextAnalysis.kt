package org.tensorflow.lite.examples.objectdetection.fragments


import android.annotation.SuppressLint
import android.util.Log
import android.widget.Toast
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.text.TextRecognition
//import com.google.mlkit.vision.text.devanagari.DevanagariTextRecognizerOptions   //for hindi text
import com.google.mlkit.vision.text.latin.TextRecognizerOptions

var textDone="Recognising..."

class TextAnalysis  : ImageAnalysis.Analyzer {

    val recognizerOptions = TextRecognizerOptions.DEFAULT_OPTIONS
    val recognizer = TextRecognition.getClient(recognizerOptions)
//    val recognizer = TextRecognition.getClient(DevanagariTextRecognizerOptions.Builder().build())// for hindi text reco

    @SuppressLint("UnsafeExperimentalUsageError", "UnsafeOptInUsageError")
    override fun analyze(imageProxy: ImageProxy) {
        Log.d("TEXT", "image analysed")

        imageProxy.image?.let {
            val inputImage = InputImage.fromMediaImage(
                it,
                imageProxy.imageInfo.rotationDegrees
            )

            recognizer.process(inputImage)
                .addOnSuccessListener { text ->
/*                    text.textBlocks.forEach { block ->
                        block.recognizedLanguage
                        Log.d(
                            "TEXT", """
                            karan = ${block.lines.joinToString("\n") { it.text }}
                            LANGUAGE=${block.recognizedLanguage}
                        """.trimIndent()
                        )
                        textDone="recognising..."
                        textDone = block.text.toString()*/
                    val resultText = text.text
                    val allRecognizedText = StringBuilder()
                    for (block in text.textBlocks) {
                        val blockText = block.text

                        val blockCornerPoints = block.cornerPoints
                        val blockFrame = block.boundingBox
                        for (line in block.lines) {
                            val lineText = line.text
                            val lineCornerPoints = line.cornerPoints
                            val lineFrame = line.boundingBox
                            allRecognizedText.append(lineText).append("\n")


                            Log.d("karan ka block", blockText  )
                            Log.d("karan ka line",  lineText  )

                        }
                    }

                    textDone = allRecognizedText.toString()
                }
                .addOnFailureListener { ex ->
                    Log.e("TEXT", "Detection failed", ex)
                }
                .addOnCompleteListener {
                    imageProxy.close()
                }

        } ?: imageProxy.close() // close if image not found either

    }
}