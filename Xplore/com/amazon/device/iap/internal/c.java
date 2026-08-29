package com.amazon.device.iap.internal;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    void a(Context context, Intent intent);

    void a(RequestId requestId);

    void a(RequestId requestId, String str);

    void a(RequestId requestId, String str, FulfillmentResult fulfillmentResult);

    void a(RequestId requestId, Set<String> set);

    void a(RequestId requestId, boolean z);
}
