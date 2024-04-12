package org.tensorflow.lite.examples.objectdetection.barcodedetection;

/**
 * A camera reticle that locates at the center of canvas to indicate the system is active but has
 * not detected a barcode yet.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/barcodedetection/BarcodeReticleGraphic;", "Lorg/tensorflow/lite/examples/objectdetection/barcodedetection/BarcodeGraphicBase;", "overlay", "Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;", "animator", "Lorg/tensorflow/lite/examples/objectdetection/camera/CameraReticleAnimator;", "(Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;Lorg/tensorflow/lite/examples/objectdetection/camera/CameraReticleAnimator;)V", "rippleAlpha", "", "ripplePaint", "Landroid/graphics/Paint;", "rippleSizeOffset", "rippleStrokeWidth", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
public final class BarcodeReticleGraphic extends org.tensorflow.lite.examples.objectdetection.barcodedetection.BarcodeGraphicBase {
    @org.jetbrains.annotations.NotNull
    private final org.tensorflow.lite.examples.objectdetection.camera.CameraReticleAnimator animator = null;
    @org.jetbrains.annotations.NotNull
    private final android.graphics.Paint ripplePaint = null;
    private final int rippleSizeOffset = 0;
    private final int rippleStrokeWidth = 0;
    private final int rippleAlpha = 0;
    
    public BarcodeReticleGraphic(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.CameraReticleAnimator animator) {
        super(null);
    }
    
    @java.lang.Override
    public void draw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
}