package org.tensorflow.lite.examples.objectdetection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\bH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/CameraInputInfo;", "Lorg/tensorflow/lite/examples/objectdetection/InputInfo;", "frameByteBuffer", "Ljava/nio/ByteBuffer;", "frameMetadata", "Lorg/tensorflow/lite/examples/objectdetection/camera/FrameMetadata;", "(Ljava/nio/ByteBuffer;Lorg/tensorflow/lite/examples/objectdetection/camera/FrameMetadata;)V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "app_debug"})
public final class CameraInputInfo implements org.tensorflow.lite.examples.objectdetection.InputInfo {
    @org.jetbrains.annotations.NotNull
    private final java.nio.ByteBuffer frameByteBuffer = null;
    @org.jetbrains.annotations.NotNull
    private final org.tensorflow.lite.examples.objectdetection.camera.FrameMetadata frameMetadata = null;
    @org.jetbrains.annotations.Nullable
    private android.graphics.Bitmap bitmap;
    
    public CameraInputInfo(@org.jetbrains.annotations.NotNull
    java.nio.ByteBuffer frameByteBuffer, @org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.FrameMetadata frameMetadata) {
        super();
    }
    
    @java.lang.Override
    @kotlin.jvm.Synchronized
    @org.jetbrains.annotations.NotNull
    public synchronized android.graphics.Bitmap getBitmap() {
        return null;
    }
}