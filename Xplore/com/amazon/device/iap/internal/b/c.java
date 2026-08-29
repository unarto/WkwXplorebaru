package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.amazon.device.iap.internal.c {
    private static final String a = "c";

    @Override // com.amazon.device.iap.internal.c
    public void a(Context context, Intent intent) {
        String str = a;
        com.amazon.device.iap.internal.util.e.a(str, "handleResponse");
        String stringExtra = intent.getStringExtra("response_type");
        if (stringExtra == null) {
            com.amazon.device.iap.internal.util.e.a(str, "Invalid response type: null");
            return;
        }
        com.amazon.device.iap.internal.util.e.a(str, "Found response type: " + stringExtra);
        if ("purchase_response".equals(stringExtra)) {
            new com.amazon.device.iap.internal.b.a.d(RequestId.fromString(intent.getStringExtra("requestId"))).e();
        }
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, String str) {
        com.amazon.device.iap.internal.util.e.a(a, "sendPurchaseRequest");
        new com.amazon.device.iap.internal.b.b.d(requestId, str).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, Set<String> set) {
        com.amazon.device.iap.internal.util.e.a(a, "sendGetProductDataRequest");
        new com.amazon.device.iap.internal.b.c.d(requestId, set).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, boolean z) {
        com.amazon.device.iap.internal.util.e.a(a, "sendGetPurchaseUpdates");
        new com.amazon.device.iap.internal.b.d.a(requestId, z).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        com.amazon.device.iap.internal.util.e.a(a, "sendNotifyFulfillment");
        new com.amazon.device.iap.internal.b.g.b(requestId, str, fulfillmentResult).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId) {
        com.amazon.device.iap.internal.util.e.a(a, "sendGetUserData");
        new com.amazon.device.iap.internal.b.e.a(requestId).e();
    }
}
