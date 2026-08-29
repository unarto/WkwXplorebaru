package com.amazon.device.iap.internal.b.f;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.venezia.command.SuccessResult;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
abstract class a extends i {
    public a(e eVar, String str) {
        super(eVar, "response_received", str);
        b(false);
    }

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        return true;
    }
}
