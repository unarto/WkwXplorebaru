package com.amazon.device.iap.internal.b;

import com.amazon.android.framework.util.KiwiLogger;
import defpackage.re8;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class f implements com.amazon.device.iap.internal.a {
    private static KiwiLogger a = new KiwiLogger("In App Purchasing SDK - Production Mode");

    private static String c(String str, String str2) {
        return re8.k(str, ": ", str2);
    }

    @Override // com.amazon.device.iap.internal.a
    public void a(String str, String str2) {
        a.trace(c(str, str2));
    }

    @Override // com.amazon.device.iap.internal.a
    public void b(String str, String str2) {
        a.error(c(str, str2));
    }

    @Override // com.amazon.device.iap.internal.a
    public boolean a() {
        return KiwiLogger.TRACE_ON;
    }

    @Override // com.amazon.device.iap.internal.a
    public boolean b() {
        return KiwiLogger.ERROR_ON;
    }
}
