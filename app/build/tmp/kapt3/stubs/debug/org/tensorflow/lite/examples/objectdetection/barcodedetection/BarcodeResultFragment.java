package org.tensorflow.lite.examples.objectdetection.barcodedetection;

/**
 * Displays the bottom sheet to present barcode fields contained in the detected barcode.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006H\u0002\u00a8\u0006\u0015"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/barcodedetection/BarcodeResultFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "copyToClipboard", "", "text", "", "onCreateView", "Landroid/view/View;", "layoutInflater", "Landroid/view/LayoutInflater;", "viewGroup", "Landroid/view/ViewGroup;", "bundle", "Landroid/os/Bundle;", "onDismiss", "dialogInterface", "Landroid/content/DialogInterface;", "openWebPage", "url", "Companion", "app_debug"})
public final class BarcodeResultFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "BarcodeResultFragment";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ARG_BARCODE_FIELD_LIST = "arg_barcode_field_list";
    @org.jetbrains.annotations.NotNull
    public static final org.tensorflow.lite.examples.objectdetection.barcodedetection.BarcodeResultFragment.Companion Companion = null;
    
    public BarcodeResultFragment() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater layoutInflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup viewGroup, @org.jetbrains.annotations.Nullable
    android.os.Bundle bundle) {
        return null;
    }
    
    private final void copyToClipboard(java.lang.String text) {
    }
    
    private final void openWebPage(java.lang.String url) {
    }
    
    @java.lang.Override
    public void onDismiss(@org.jetbrains.annotations.NotNull
    android.content.DialogInterface dialogInterface) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ&\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/barcodedetection/BarcodeResultFragment$Companion;", "", "()V", "ARG_BARCODE_FIELD_LIST", "", "TAG", "dismiss", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "show", "barcodeFieldArrayList", "Ljava/util/ArrayList;", "Lorg/tensorflow/lite/examples/objectdetection/barcodedetection/BarcodeField;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void show(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull
        java.util.ArrayList<org.tensorflow.lite.examples.objectdetection.barcodedetection.BarcodeField> barcodeFieldArrayList) {
        }
        
        public final void dismiss(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fragmentManager) {
        }
    }
}