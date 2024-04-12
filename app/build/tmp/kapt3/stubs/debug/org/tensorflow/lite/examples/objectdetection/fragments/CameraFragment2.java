package org.tensorflow.lite.examples.objectdetection.fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018H\u0002J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016J$\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u001fH\u0016J\u0010\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020\u001fH\u0016J0\u00102\u001a\u00020\u001f2\u000e\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001042\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0016J\b\u0010;\u001a\u00020\u001fH\u0016J\u001a\u0010<\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0017J\b\u0010>\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018X\u0082\u000e\u00a2\u0006\u0004\n\u0002\b\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/fragments/CameraFragment2;", "Landroidx/fragment/app/Fragment;", "Lorg/tensorflow/lite/examples/objectdetection/ObjectDetectorHelper$DetectorListener;", "()V", "TAG", "", "_fragmentCameraBinding", "Lorg/tensorflow/lite/examples/objectdetection/databinding/FragmentCameraBinding;", "bitmapBuffer", "Landroid/graphics/Bitmap;", "camera", "Landroidx/camera/core/Camera;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "fragmentCameraBinding", "getFragmentCameraBinding", "()Lorg/tensorflow/lite/examples/objectdetection/databinding/FragmentCameraBinding;", "imageAnalyzer", "Landroidx/camera/core/ImageAnalysis;", "isCameraInitialized", "", "labels", "", "labels$1", "objectDetectorHelper", "Lorg/tensorflow/lite/examples/objectdetection/ObjectDetectorHelper;", "preview", "Landroidx/camera/core/Preview;", "bindCameraUseCases", "", "detectObjects", "image", "Landroidx/camera/core/ImageProxy;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onError", "error", "onInitialized", "onResults", "results", "", "Lorg/tensorflow/lite/task/gms/vision/detector/Detection;", "inferenceTime", "", "imageHeight", "", "imageWidth", "onResume", "onViewCreated", "view", "setUpCamera", "Companion", "app_debug"})
public final class CameraFragment2 extends androidx.fragment.app.Fragment implements org.tensorflow.lite.examples.objectdetection.ObjectDetectorHelper.DetectorListener {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = "CameraFragment";
    @org.jetbrains.annotations.Nullable
    private org.tensorflow.lite.examples.objectdetection.databinding.FragmentCameraBinding _fragmentCameraBinding;
    private org.tensorflow.lite.examples.objectdetection.ObjectDetectorHelper objectDetectorHelper;
    private android.graphics.Bitmap bitmapBuffer;
    @org.jetbrains.annotations.Nullable
    private androidx.camera.core.Preview preview;
    @org.jetbrains.annotations.Nullable
    private androidx.camera.core.ImageAnalysis imageAnalyzer;
    @org.jetbrains.annotations.Nullable
    private androidx.camera.core.Camera camera;
    @org.jetbrains.annotations.Nullable
    private androidx.camera.lifecycle.ProcessCameraProvider cameraProvider;
    @org.jetbrains.annotations.NotNull
    private java.util.Set<java.lang.String> labels$1;
    
    /**
     * Blocking camera operations are performed using this executor
     */
    private java.util.concurrent.ExecutorService cameraExecutor;
    private boolean isCameraInitialized = false;
    @org.jetbrains.annotations.Nullable
    private static org.tensorflow.lite.examples.objectdetection.fragments.CameraFragment2 instance;
    @org.jetbrains.annotations.NotNull
    private static java.util.Set<java.lang.String> labels;
    @org.jetbrains.annotations.NotNull
    public static final org.tensorflow.lite.examples.objectdetection.fragments.CameraFragment2.Companion Companion = null;
    
    public CameraFragment2() {
        super();
    }
    
    private final org.tensorflow.lite.examples.objectdetection.databinding.FragmentCameraBinding getFragmentCameraBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpCamera() {
    }
    
    @android.annotation.SuppressLint(value = {"UnsafeOptInUsageError"})
    public final void bindCameraUseCases() {
    }
    
    private final void detectObjects(androidx.camera.core.ImageProxy image, java.util.Set<java.lang.String> labels) {
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override
    public void onResults(@org.jetbrains.annotations.Nullable
    java.util.List<org.tensorflow.lite.task.gms.vision.detector.Detection> results, long inferenceTime, int imageHeight, int imageWidth) {
    }
    
    @java.lang.Override
    public void onError(@org.jetbrains.annotations.NotNull
    java.lang.String error) {
    }
    
    @java.lang.Override
    public void onInitialized() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/fragments/CameraFragment2$Companion;", "", "()V", "instance", "Lorg/tensorflow/lite/examples/objectdetection/fragments/CameraFragment2;", "labels", "", "", "getInstance", "getLabels", "setLabels", "", "newLabels", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.tensorflow.lite.examples.objectdetection.fragments.CameraFragment2 getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Set<java.lang.String> getLabels() {
            return null;
        }
        
        public final void setLabels(@org.jetbrains.annotations.NotNull
        java.util.Set<java.lang.String> newLabels) {
        }
    }
}