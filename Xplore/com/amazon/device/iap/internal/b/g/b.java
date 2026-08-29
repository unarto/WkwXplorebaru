package com.amazon.device.iap.internal.b.g;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e {
    private final String a;
    private final FulfillmentResult b;

    public b(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        super(requestId);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        this.a = str;
        this.b = fulfillmentResult;
        a((i) new a(this, hashSet, fulfillmentResult.toString()));
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void b() {
        String strC;
        FulfillmentResult fulfillmentResult = FulfillmentResult.FULFILLED;
        FulfillmentResult fulfillmentResult2 = this.b;
        if ((fulfillmentResult == fulfillmentResult2 || FulfillmentResult.UNAVAILABLE == fulfillmentResult2) && (strC = com.amazon.device.iap.internal.c.a.a().c(this.a)) != null) {
            new com.amazon.device.iap.internal.b.f.b(this, strC).a_();
            com.amazon.device.iap.internal.c.a.a().a(this.a);
        }
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void a() {
    }
}
