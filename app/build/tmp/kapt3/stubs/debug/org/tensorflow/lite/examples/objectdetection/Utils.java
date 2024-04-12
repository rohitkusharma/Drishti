package org.tensorflow.lite.examples.objectdetection;

/**
 * Utility class to provide helper methods.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u00a2\u0006\u0002\b\rJ(\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0006J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0#2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u00a2\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\'\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\'\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b(J$\u0010)\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020!2\b\u0010+\u001a\u0004\u0018\u00010\u000fH\u0002J\u0015\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0000\u00a2\u0006\u0002\b0J\u0015\u00101\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0000\u00a2\u0006\u0002\b2R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/Utils;", "", "()V", "ASPECT_RATIO_TOLERANCE", "", "REQUEST_CODE_PHOTO_LIBRARY", "", "TAG", "", "allPermissionsGranted", "", "context", "Landroid/content/Context;", "allPermissionsGranted$app_debug", "convertToBitmap", "Landroid/graphics/Bitmap;", "data", "Ljava/nio/ByteBuffer;", "width", "height", "rotationDegrees", "generateValidPreviewSizeList", "", "Lorg/tensorflow/lite/examples/objectdetection/camera/CameraSizePair;", "camera", "Landroid/hardware/Camera;", "getCornerRoundedBitmap", "srcBitmap", "cornerRadius", "getExifOrientationTag", "resolver", "Landroid/content/ContentResolver;", "imageUri", "Landroid/net/Uri;", "getRequiredPermissions", "", "(Landroid/content/Context;)[Ljava/lang/String;", "isPortraitMode", "loadImage", "maxImageDimension", "loadImage$app_debug", "maybeTransformBitmap", "uri", "bitmap", "openImagePicker", "", "activity", "Landroid/app/Activity;", "openImagePicker$app_debug", "requestRuntimePermissions", "requestRuntimePermissions$app_debug", "app_debug"})
public final class Utils {
    
    /**
     * If the absolute difference between aspect ratios is less than this tolerance, they are
     * considered to be the same aspect ratio.
     */
    public static final float ASPECT_RATIO_TOLERANCE = 0.01F;
    public static final int REQUEST_CODE_PHOTO_LIBRARY = 1;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "Utils";
    @org.jetbrains.annotations.NotNull
    public static final org.tensorflow.lite.examples.objectdetection.Utils INSTANCE = null;
    
    private Utils() {
        super();
    }
    
    public final void requestRuntimePermissions$app_debug(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    public final boolean allPermissionsGranted$app_debug(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    private final java.lang.String[] getRequiredPermissions(android.content.Context context) {
        return null;
    }
    
    public final boolean isPortraitMode(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    /**
     * Generates a list of acceptable preview sizes. Preview sizes are not acceptable if there is not
     * a corresponding picture size of the same aspect ratio. If there is a corresponding picture size
     * of the same aspect ratio, the picture size is paired up with the preview size.
     *
     *
     * This is necessary because even if we don't use still pictures, the still picture size must
     * be set to a size that is the same aspect ratio as the preview size we choose. Otherwise, the
     * preview images may be distorted on some devices.
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.tensorflow.lite.examples.objectdetection.camera.CameraSizePair> generateValidPreviewSizeList(@org.jetbrains.annotations.NotNull
    android.hardware.Camera camera) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap getCornerRoundedBitmap(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap srcBitmap, int cornerRadius) {
        return null;
    }
    
    /**
     * Convert NV21 format byte buffer to bitmap.
     */
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap convertToBitmap(@org.jetbrains.annotations.NotNull
    java.nio.ByteBuffer data, int width, int height, int rotationDegrees) {
        return null;
    }
    
    public final void openImagePicker$app_debug(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap loadImage$app_debug(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri imageUri, int maxImageDimension) throws java.io.IOException {
        return null;
    }
    
    private final android.graphics.Bitmap maybeTransformBitmap(android.content.ContentResolver resolver, android.net.Uri uri, android.graphics.Bitmap bitmap) {
        return null;
    }
    
    private final int getExifOrientationTag(android.content.ContentResolver resolver, android.net.Uri imageUri) {
        return 0;
    }
}