package com.amazon.device.iap.internal.b.f;

import com.amazon.device.iap.internal.b.e;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public c(e eVar, boolean z) {
        super(eVar, "2.0");
        a("receiptDelivered", Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // com.amazon.device.iap.internal.b.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a_() {
        Object objA = b().d().a("notifyListenerResult");
        if (objA != null) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(objA)) {
                a("notifyListenerSucceeded", bool);
            } else {
                a("notifyListenerSucceeded", Boolean.FALSE);
            }
        }
        super.a_();
    }
}
