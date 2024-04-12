package org.tensorflow.lite.examples.objectdetection.barcodedetection;

/**
 * Draws the graphic to indicate the barcode result is in loading.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/barcodedetection/BarcodeLoadingGraphic;", "Lorg/tensorflow/lite/examples/objectdetection/barcodedetection/BarcodeGraphicBase;", "overlay", "Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;", "loadingAnimator", "Landroid/animation/ValueAnimator;", "(Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;Landroid/animation/ValueAnimator;)V", "boxClockwiseCoordinates", "", "Landroid/graphics/PointF;", "[Landroid/graphics/PointF;", "coordinateOffsetBits", "Landroid/graphics/Point;", "[Landroid/graphics/Point;", "lastPathPoint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
public final class BarcodeLoadingGraphic extends org.tensorflow.lite.examples.objectdetection.barcodedetection.BarcodeGraphicBase {
    @org.jetbrains.annotations.NotNull
    private final android.animation.ValueAnimator loadingAnimator = null;
    @org.jetbrains.annotations.NotNull
    private final android.graphics.PointF[] boxClockwiseCoordinates = null;
    @org.jetbrains.annotations.NotNull
    private final android.graphics.Point[] coordinateOffsetBits = null;
    @org.jetbrains.annotations.NotNull
    private final android.graphics.PointF lastPathPoint = null;
    
    public BarcodeLoadingGraphic(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull
    android.animation.ValueAnimator loadingAnimator) {
        super(null);
    }
    
    @java.lang.Override
    public void draw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
}