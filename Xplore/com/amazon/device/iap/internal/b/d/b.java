package com.amazon.device.iap.internal.b.d;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
abstract class b extends i {
    protected final boolean a;

    public b(e eVar, String str, boolean z) {
        super(eVar, "purchase_updates", str);
        this.a = z;
    }

    public void preExecution() {
        super.preExecution();
        a("cursor", this.a ? null : com.amazon.device.iap.internal.util.b.a((String) b().d().a("userId")));
    }
}
