package org.tensorflow.lite.examples.objectdetection.fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010\'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/fragments/ScanFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "()V", "cameraSource", "Lorg/tensorflow/lite/examples/objectdetection/camera/CameraSource;", "currentWorkflowState", "Lorg/tensorflow/lite/examples/objectdetection/camera/WorkflowModel$WorkflowState;", "flashButton", "Landroid/view/View;", "graphicOverlay", "Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;", "param1", "", "param2", "preview", "Lorg/tensorflow/lite/examples/objectdetection/camera/CameraSourcePreview;", "promptChip", "Lcom/google/android/material/chip/Chip;", "promptChipAnimator", "Landroid/animation/AnimatorSet;", "settingsButton", "workflowModel", "Lorg/tensorflow/lite/examples/objectdetection/camera/WorkflowModel;", "onClick", "", "view", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onResume", "onStart", "onStop", "setUpWorkflowModel", "startCameraPreview", "stopCameraPreview", "Companion", "app_debug"})
public final class ScanFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.Nullable
    private java.lang.String param1;
    @org.jetbrains.annotations.Nullable
    private java.lang.String param2;
    @org.jetbrains.annotations.Nullable
    private org.tensorflow.lite.examples.objectdetection.camera.CameraSource cameraSource;
    @org.jetbrains.annotations.Nullable
    private org.tensorflow.lite.examples.objectdetection.camera.CameraSourcePreview preview;
    @org.jetbrains.annotations.Nullable
    private org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay graphicOverlay;
    @org.jetbrains.annotations.Nullable
    private android.view.View settingsButton;
    @org.jetbrains.annotations.Nullable
    private android.view.View flashButton;
    @org.jetbrains.annotations.Nullable
    private com.google.android.material.chip.Chip promptChip;
    @org.jetbrains.annotations.Nullable
    private android.animation.AnimatorSet promptChipAnimator;
    @org.jetbrains.annotations.Nullable
    private org.tensorflow.lite.examples.objectdetection.camera.WorkflowModel workflowModel;
    @org.jetbrains.annotations.Nullable
    private org.tensorflow.lite.examples.objectdetection.camera.WorkflowModel.WorkflowState currentWorkflowState;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "ScanFragment";
    @org.jetbrains.annotations.NotNull
    public static final org.tensorflow.lite.examples.objectdetection.fragments.ScanFragment.Companion Companion = null;
    
    public ScanFragment() {
        super();
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    private final void startCameraPreview() {
    }
    
    private final void stopCameraPreview() {
    }
    
    private final void setUpWorkflowModel() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/fragments/ScanFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}