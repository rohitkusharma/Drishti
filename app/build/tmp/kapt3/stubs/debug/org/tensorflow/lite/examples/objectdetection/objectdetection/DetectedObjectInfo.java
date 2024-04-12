package org.tensorflow.lite.examples.objectdetection.objectdetection;

/**
 * Holds the detected object and its related image info.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001f\u001a\u00020\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006!"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/objectdetection/DetectedObjectInfo;", "", "detectedObject", "Lcom/google/mlkit/vision/objects/DetectedObject;", "objectIndex", "", "inputInfo", "Lorg/tensorflow/lite/examples/objectdetection/InputInfo;", "(Lcom/google/mlkit/vision/objects/DetectedObject;ILorg/tensorflow/lite/examples/objectdetection/InputInfo;)V", "bitmap", "Landroid/graphics/Bitmap;", "boundingBox", "Landroid/graphics/Rect;", "getBoundingBox", "()Landroid/graphics/Rect;", "imageData", "", "getImageData", "()[B", "jpegBytes", "labels", "", "Lcom/google/mlkit/vision/objects/DetectedObject$Label;", "getLabels", "()Ljava/util/List;", "objectId", "getObjectId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getObjectIndex", "()I", "getBitmap", "Companion", "app_debug"})
public final class DetectedObjectInfo {
    @org.jetbrains.annotations.NotNull
    private final com.google.mlkit.vision.objects.DetectedObject detectedObject = null;
    private final int objectIndex = 0;
    @org.jetbrains.annotations.NotNull
    private final org.tensorflow.lite.examples.objectdetection.InputInfo inputInfo = null;
    @org.jetbrains.annotations.Nullable
    private android.graphics.Bitmap bitmap;
    @org.jetbrains.annotations.Nullable
    private byte[] jpegBytes;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer objectId = null;
    @org.jetbrains.annotations.NotNull
    private final android.graphics.Rect boundingBox = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.google.mlkit.vision.objects.DetectedObject.Label> labels = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "DetectedObject";
    private static final int MAX_IMAGE_WIDTH = 640;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String INVALID_LABEL = "N/A";
    @org.jetbrains.annotations.NotNull
    public static final org.tensorflow.lite.examples.objectdetection.objectdetection.DetectedObjectInfo.Companion Companion = null;
    
    public DetectedObjectInfo(@org.jetbrains.annotations.NotNull
    com.google.mlkit.vision.objects.DetectedObject detectedObject, int objectIndex, @org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.InputInfo inputInfo) {
        super();
    }
    
    public final int getObjectIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getObjectId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Rect getBoundingBox() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.google.mlkit.vision.objects.DetectedObject.Label> getLabels() {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    @org.jetbrains.annotations.Nullable
    public final synchronized byte[] getImageData() {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    @org.jetbrains.annotations.NotNull
    public final synchronized android.graphics.Bitmap getBitmap() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/objectdetection/DetectedObjectInfo$Companion;", "", "()V", "INVALID_LABEL", "", "MAX_IMAGE_WIDTH", "", "TAG", "hasValidLabels", "", "detectedObject", "Lcom/google/mlkit/vision/objects/DetectedObject;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean hasValidLabels(@org.jetbrains.annotations.NotNull
        com.google.mlkit.vision.objects.DetectedObject detectedObject) {
            return false;
        }
    }
}