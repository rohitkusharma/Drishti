package org.tensorflow.lite.examples.objectdetection.camera;

/**
 * Custom animator for the object or barcode reticle in live camera.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/camera/CameraReticleAnimator;", "", "graphicOverlay", "Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;", "(Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;)V", "animatorSet", "Landroid/animation/AnimatorSet;", "<set-?>", "", "rippleAlphaScale", "getRippleAlphaScale", "()F", "rippleSizeScale", "getRippleSizeScale", "rippleStrokeWidthScale", "getRippleStrokeWidthScale", "cancel", "", "start", "Companion", "app_debug"})
public final class CameraReticleAnimator {
    
    /**
     * Returns the scale value of ripple alpha ranges in [0, 1].
     */
    private float rippleAlphaScale = 0.0F;
    
    /**
     * Returns the scale value of ripple size ranges in [0, 1].
     */
    private float rippleSizeScale = 0.0F;
    
    /**
     * Returns the scale value of ripple stroke width ranges in [0, 1].
     */
    private float rippleStrokeWidthScale = 1.0F;
    @org.jetbrains.annotations.NotNull
    private final android.animation.AnimatorSet animatorSet = null;
    private static final long DURATION_RIPPLE_FADE_IN_MS = 333L;
    private static final long DURATION_RIPPLE_FADE_OUT_MS = 500L;
    private static final long DURATION_RIPPLE_EXPAND_MS = 833L;
    private static final long DURATION_RIPPLE_STROKE_WIDTH_SHRINK_MS = 833L;
    private static final long DURATION_RESTART_DORMANCY_MS = 1333L;
    private static final long START_DELAY_RIPPLE_FADE_OUT_MS = 667L;
    private static final long START_DELAY_RIPPLE_EXPAND_MS = 333L;
    private static final long START_DELAY_RIPPLE_STROKE_WIDTH_SHRINK_MS = 333L;
    private static final long START_DELAY_RESTART_DORMANCY_MS = 1167L;
    @org.jetbrains.annotations.NotNull
    public static final org.tensorflow.lite.examples.objectdetection.camera.CameraReticleAnimator.Companion Companion = null;
    
    public CameraReticleAnimator(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay graphicOverlay) {
        super();
    }
    
    /**
     * Returns the scale value of ripple alpha ranges in [0, 1].
     */
    public final float getRippleAlphaScale() {
        return 0.0F;
    }
    
    /**
     * Returns the scale value of ripple size ranges in [0, 1].
     */
    public final float getRippleSizeScale() {
        return 0.0F;
    }
    
    /**
     * Returns the scale value of ripple stroke width ranges in [0, 1].
     */
    public final float getRippleStrokeWidthScale() {
        return 0.0F;
    }
    
    public final void start() {
    }
    
    public final void cancel() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/camera/CameraReticleAnimator$Companion;", "", "()V", "DURATION_RESTART_DORMANCY_MS", "", "DURATION_RIPPLE_EXPAND_MS", "DURATION_RIPPLE_FADE_IN_MS", "DURATION_RIPPLE_FADE_OUT_MS", "DURATION_RIPPLE_STROKE_WIDTH_SHRINK_MS", "START_DELAY_RESTART_DORMANCY_MS", "START_DELAY_RIPPLE_EXPAND_MS", "START_DELAY_RIPPLE_FADE_OUT_MS", "START_DELAY_RIPPLE_STROKE_WIDTH_SHRINK_MS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}