package org.tensorflow.lite.examples.objectdetection.barcodedetection;

/**
 * A processor to run the barcode detector.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0014\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018H\u0014J&\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0015J\b\u0010\u001d\u001a\u00020\u0015H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/barcodedetection/BarcodeProcessor;", "Lorg/tensorflow/lite/examples/objectdetection/camera/FrameProcessorBase;", "", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "graphicOverlay", "Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;", "workflowModel", "Lorg/tensorflow/lite/examples/objectdetection/camera/WorkflowModel;", "(Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;Lorg/tensorflow/lite/examples/objectdetection/camera/WorkflowModel;)V", "cameraReticleAnimator", "Lorg/tensorflow/lite/examples/objectdetection/camera/CameraReticleAnimator;", "scanner", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "createLoadingAnimator", "Landroid/animation/ValueAnimator;", "barcode", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "inputInfo", "Lorg/tensorflow/lite/examples/objectdetection/InputInfo;", "results", "stop", "Companion", "app_debug"})
public final class BarcodeProcessor extends org.tensorflow.lite.examples.objectdetection.camera.FrameProcessorBase<java.util.List<? extends com.google.mlkit.vision.barcode.common.Barcode>> {
    @org.jetbrains.annotations.NotNull
    private final org.tensorflow.lite.examples.objectdetection.camera.WorkflowModel workflowModel = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.mlkit.vision.barcode.BarcodeScanner scanner = null;
    @org.jetbrains.annotations.NotNull
    private final org.tensorflow.lite.examples.objectdetection.camera.CameraReticleAnimator cameraReticleAnimator = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "BarcodeProcessor";
    @org.jetbrains.annotations.NotNull
    public static final org.tensorflow.lite.examples.objectdetection.barcodedetection.BarcodeProcessor.Companion Companion = null;
    
    public BarcodeProcessor(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay graphicOverlay, @org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.WorkflowModel workflowModel) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected com.google.android.gms.tasks.Task<java.util.List<com.google.mlkit.vision.barcode.common.Barcode>> detectInImage(@org.jetbrains.annotations.NotNull
    com.google.mlkit.vision.common.InputImage image) {
        return null;
    }
    
    @java.lang.Override
    @androidx.annotation.MainThread
    protected void onSuccess(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.InputInfo inputInfo, @org.jetbrains.annotations.NotNull
    java.util.List<? extends com.google.mlkit.vision.barcode.common.Barcode> results, @org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay graphicOverlay) {
    }
    
    private final android.animation.ValueAnimator createLoadingAnimator(org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay graphicOverlay, com.google.mlkit.vision.barcode.common.Barcode barcode) {
        return null;
    }
    
    @java.lang.Override
    protected void onFailure(@org.jetbrains.annotations.NotNull
    java.lang.Exception e) {
    }
    
    @java.lang.Override
    public void stop() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/barcodedetection/BarcodeProcessor$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}