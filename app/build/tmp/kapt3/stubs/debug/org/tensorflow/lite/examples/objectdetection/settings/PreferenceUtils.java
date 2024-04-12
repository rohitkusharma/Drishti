package org.tensorflow.lite.examples.objectdetection.settings;

/**
 * Utility class to retrieve shared preferences.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0002J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u001e"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/settings/PreferenceUtils;", "", "()V", "getBarcodeReticleBox", "Landroid/graphics/RectF;", "overlay", "Lorg/tensorflow/lite/examples/objectdetection/camera/GraphicOverlay;", "getBooleanPref", "", "context", "Landroid/content/Context;", "prefKeyId", "", "defaultValue", "getConfirmationTimeMs", "getIntPref", "getProgressToMeetBarcodeSizeRequirement", "", "barcode", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "getUserSpecifiedPreviewSize", "Lorg/tensorflow/lite/examples/objectdetection/camera/CameraSizePair;", "isAutoSearchEnabled", "isClassificationEnabled", "isMultipleObjectsMode", "saveStringPreference", "", "value", "", "shouldDelayLoadingBarcodeResult", "app_debug"})
public final class PreferenceUtils {
    @org.jetbrains.annotations.NotNull
    public static final org.tensorflow.lite.examples.objectdetection.settings.PreferenceUtils INSTANCE = null;
    
    private PreferenceUtils() {
        super();
    }
    
    public final boolean isAutoSearchEnabled(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final boolean isMultipleObjectsMode(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final boolean isClassificationEnabled(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final void saveStringPreference(@org.jetbrains.annotations.NotNull
    android.content.Context context, @androidx.annotation.StringRes
    int prefKeyId, @org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    public final int getConfirmationTimeMs(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0;
    }
    
    public final float getProgressToMeetBarcodeSizeRequirement(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull
    com.google.mlkit.vision.barcode.common.Barcode barcode) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.RectF getBarcodeReticleBox(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.camera.GraphicOverlay overlay) {
        return null;
    }
    
    public final boolean shouldDelayLoadingBarcodeResult(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    private final int getIntPref(android.content.Context context, @androidx.annotation.StringRes
    int prefKeyId, int defaultValue) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.tensorflow.lite.examples.objectdetection.camera.CameraSizePair getUserSpecifiedPreviewSize(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    private final boolean getBooleanPref(android.content.Context context, @androidx.annotation.StringRes
    int prefKeyId, boolean defaultValue) {
        return false;
    }
}