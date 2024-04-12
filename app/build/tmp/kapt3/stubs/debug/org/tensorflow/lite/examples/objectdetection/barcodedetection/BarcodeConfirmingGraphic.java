package org.tensorflow.lite.examples.objectdetection.barcodedetection;

/**
 * Guides user to move camera closer to confirm the detected barcode.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/barcodedetection/BarcodeConfirmingGraphic;", "Lorg/tensorflow/lite/examples/objectdetection/barcodedetection/BarcodeGraphicBase;", "overlay", "Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;", "barcode", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "(Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;Lcom/google/mlkit/vision/barcode/common/Barcode;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
public final class BarcodeConfirmingGraphic extends org.tensorflow.lite.examples.objectdetection.barcodedetection.BarcodeGraphicBase {
    @org.jetbrains.annotations.NotNull
    private final com.google.mlkit.vision.barcode.common.Barcode barcode = null;
    
    public BarcodeConfirmingGraphic(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull
    com.google.mlkit.vision.barcode.common.Barcode barcode) {
        super(null);
    }
    
    @java.lang.Override
    public void draw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
}