package org.tensorflow.lite.examples.objectdetection.camera;

/**
 * Stores a preview size and a corresponding same-aspect-ratio picture size. To avoid distorted
 * preview images on some devices, the picture size must be set to a size that is the same aspect
 * ratio as the preview size or the preview may end up being distorted. If the picture size is null,
 * then there is no picture size with the same aspect ratio as the preview size.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004\u00a2\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/camera/CameraSizePair;", "", "previewSize", "Landroid/hardware/Camera$Size;", "Landroid/hardware/Camera;", "pictureSize", "(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)V", "Lcom/google/android/gms/common/images/Size;", "(Lcom/google/android/gms/common/images/Size;Lcom/google/android/gms/common/images/Size;)V", "picture", "getPicture", "()Lcom/google/android/gms/common/images/Size;", "preview", "getPreview", "app_debug"})
public final class CameraSizePair {
    @org.jetbrains.annotations.NotNull
    private final com.google.android.gms.common.images.Size preview = null;
    @org.jetbrains.annotations.Nullable
    private final com.google.android.gms.common.images.Size picture = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.common.images.Size getPreview() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.android.gms.common.images.Size getPicture() {
        return null;
    }
    
    public CameraSizePair(@org.jetbrains.annotations.NotNull
    android.hardware.Camera.Size previewSize, @org.jetbrains.annotations.Nullable
    android.hardware.Camera.Size pictureSize) {
        super();
    }
    
    public CameraSizePair(@org.jetbrains.annotations.NotNull
    com.google.android.gms.common.images.Size previewSize, @org.jetbrains.annotations.Nullable
    com.google.android.gms.common.images.Size pictureSize) {
        super();
    }
}