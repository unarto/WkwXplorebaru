package com.amazon.device.iap.internal;

import android.content.Context;
import android.content.Intent;
import androidx.window.reflection.tV.cgKo;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.lonelycatgames.Xplore.ImgViewer.dsgI.ZRxrnppLQ;
import defpackage.un2;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    private static String a = "d";
    private static String b = "sku";
    private static d c = new d();
    private final c d = e.b();
    private Context e;
    private PurchasingListener f;

    private d() {
    }

    public static d d() {
        return c;
    }

    public RequestId a(Set<String> set) {
        com.amazon.device.iap.internal.util.d.a((Object) set, "skus");
        com.amazon.device.iap.internal.util.d.a((Collection<? extends Object>) set, "skus");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().trim().length() == 0) {
                defpackage.e.k("Empty SKU values are not allowed");
                return null;
            }
        }
        if (set.size() <= 100) {
            e();
            RequestId requestId = new RequestId();
            this.d.a(requestId, new LinkedHashSet(set));
            return requestId;
        }
        throw new IllegalArgumentException(set.size() + " SKUs were provided, but no more than 100 SKUs are allowed");
    }

    public Context b() {
        return this.e;
    }

    public RequestId c() {
        e();
        RequestId requestId = new RequestId();
        this.d.a(requestId);
        return requestId;
    }

    private void e() {
        if (this.f != null) {
            return;
        }
        un2.j(ZRxrnppLQ.nXxWJbjmFofz);
    }

    public void a(Context context, PurchasingListener purchasingListener) {
        com.amazon.device.iap.internal.util.e.a(a, cgKo.UsOPDzVh + purchasingListener);
        com.amazon.device.iap.internal.util.e.a(a, "PurchasingListener Context: " + context);
        if (purchasingListener != null && context != null) {
            this.e = context.getApplicationContext();
            this.f = purchasingListener;
        } else {
            defpackage.e.k("Neither PurchasingListener or its Context can be null");
        }
    }

    public RequestId a(String str) {
        com.amazon.device.iap.internal.util.d.a((Object) str, b);
        e();
        RequestId requestId = new RequestId();
        this.d.a(requestId, str);
        return requestId;
    }

    public PurchasingListener a() {
        return this.f;
    }

    public RequestId a(boolean z) {
        e();
        RequestId requestId = new RequestId();
        this.d.a(requestId, z);
        return requestId;
    }

    public void a(String str, FulfillmentResult fulfillmentResult) {
        if (!com.amazon.device.iap.internal.util.d.a(str)) {
            com.amazon.device.iap.internal.util.d.a(fulfillmentResult, "fulfillmentResult");
            e();
            this.d.a(new RequestId(), str, fulfillmentResult);
            return;
        }
        defpackage.e.k("Empty receiptId is not allowed");
    }

    public void a(Context context, Intent intent) {
        try {
            this.d.a(context, intent);
        } catch (Exception e) {
            com.amazon.device.iap.internal.util.e.b(a, "Error in onReceive: " + e);
        }
    }
}
