package com.amazon.device.iap;

import android.content.Context;
import android.util.Log;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.e;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class PurchasingService {
    public static final boolean IS_SANDBOX_MODE = e.a();
    public static final String SDK_VERSION = "2.0.76.4";
    private static final String TAG = "PurchasingService";

    private PurchasingService() {
        Log.i(TAG, "In-App Purchasing SDK initializing. SDK Version 2.0.76.4, IS_SANDBOX_MODE: " + IS_SANDBOX_MODE);
    }

    public static RequestId getProductData(Set<String> set) {
        return d.d().a(set);
    }

    public static RequestId getPurchaseUpdates(boolean z) {
        return d.d().a(z);
    }

    public static RequestId getUserData() {
        return d.d().c();
    }

    public static void notifyFulfillment(String str, FulfillmentResult fulfillmentResult) {
        d.d().a(str, fulfillmentResult);
    }

    public static RequestId purchase(String str) {
        return d.d().a(str);
    }

    public static void registerListener(Context context, PurchasingListener purchasingListener) {
        d.d().a(context, purchasingListener);
    }
}
