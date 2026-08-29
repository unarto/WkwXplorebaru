package com.amazon.device.iap.internal.b.g;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.venezia.command.SuccessResult;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    protected final Set<String> a;
    protected final String b;

    public a(e eVar, Set<String> set, String str) {
        super(eVar, "purchase_fulfilled", "2.0");
        this.a = set;
        this.b = str;
        b(false);
        a("receiptIds", set);
        a("fulfillmentStatus", str);
    }

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        return true;
    }

    @Override // com.amazon.device.iap.internal.b.i
    public void a_() {
        Object objA = b().d().a("notifyListenerResult");
        if (objA != null && Boolean.FALSE.equals(objA)) {
            a("fulfillmentStatus", com.amazon.device.iap.internal.model.a.DELIVERY_ATTEMPTED.toString());
        }
        super.a_();
    }
}
