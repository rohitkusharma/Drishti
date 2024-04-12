package org.tensorflow.lite.examples.objectdetection.camera;

/**
 * A view which renders a series of custom graphics to be overlaid on top of an associated preview
 * (i.e., the camera preview). The creator can add graphics objects, update the objects, and remove
 * them, triggering the appropriate drawing and invalidation within the view.
 *
 *
 * Supports scaling and mirroring of the graphics relative the camera's preview properties. The
 * idea is that detection items are expressed in terms of a preview size, but need to be scaled up
 * to the full view size, and also mirrored in the case of the front-facing camera.
 *
 *
 * Associated [Graphic] items should use [.translateX] and [ ][.translateY] to convert to view coordinate from the preview's coordinate.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\u0013J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bJ\u000e\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "graphics", "Ljava/util/ArrayList;", "Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay$Graphic;", "heightScaleFactor", "", "lock", "", "previewHeight", "", "previewWidth", "widthScaleFactor", "add", "", "graphic", "clear", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setCameraInfo", "cameraSource", "Lorg/tensorflow/lite/examples/objectdetection/camera/CameraSource;", "translateRect", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/Rect;", "translateX", "x", "translateY", "y", "Graphic", "app_debug"})
public final class GraphicOverlay extends android.view.View {
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object lock = null;
    private int previewWidth = 0;
    private float widthScaleFactor = 1.0F;
    private int previewHeight = 0;
    private float heightScaleFactor = 1.0F;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay.Graphic> graphics = null;
    
    public GraphicOverlay(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    /**
     * Removes all graphics from the overlay.
     */
    public final void clear() {
    }
    
    /**
     * Adds a graphic to the overlay.
     */
    public final void add(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay.Graphic graphic) {
    }
    
    /**
     * Sets the camera attributes for size and facing direction, which informs how to transform image
     * coordinates later.
     */
    public final void setCameraInfo(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.CameraSource cameraSource) {
    }
    
    public final float translateX(float x) {
        return 0.0F;
    }
    
    public final float translateY(float y) {
        return 0.0F;
    }
    
    /**
     * Adjusts the `rect`'s coordinate from the preview's coordinate system to the view
     * coordinate system.
     */
    @org.jetbrains.annotations.NotNull
    public final android.graphics.RectF translateRect(@org.jetbrains.annotations.NotNull
    android.graphics.Rect rect) {
        return null;
    }
    
    /**
     * Draws the overlay with its associated graphic objects.
     */
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    /**
     * Base class for a custom graphics object to be rendered within the graphic overlay. Subclass
     * this and implement the [Graphic.draw] method to define the graphics element. Add
     * instances to the overlay using [GraphicOverlay.add].
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay$Graphic;", "", "overlay", "Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;", "(Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getOverlay", "()Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
    public static abstract class Graphic {
        @org.jetbrains.annotations.NotNull
        private final org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay overlay = null;
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        
        protected Graphic(@org.jetbrains.annotations.NotNull
        org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay overlay) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        protected final org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay getOverlay() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        protected final android.content.Context getContext() {
            return null;
        }
        
        /**
         * Draws the graphic on the supplied canvas.
         */
        public abstract void draw(@org.jetbrains.annotations.NotNull
        android.graphics.Canvas canvas);
    }
}