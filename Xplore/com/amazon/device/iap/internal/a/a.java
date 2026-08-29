package com.amazon.device.iap.internal.a;

import android.util.Log;
import defpackage.tv0;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class a implements com.amazon.device.iap.internal.a {
    @Override // com.amazon.device.iap.internal.a
    public void a(String str, String str2) {
        Log.d(str, a(str2));
    }

    @Override // com.amazon.device.iap.internal.a
    public void b(String str, String str2) {
        Log.e(str, a(str2));
    }

    @Override // com.amazon.device.iap.internal.a
    public boolean a() {
        return true;
    }

    @Override // com.amazon.device.iap.internal.a
    public boolean b() {
        return true;
    }

    private static String a(String str) {
        return tv0.k("In App Purchasing SDK - Sandbox Mode: ", str);
    }
}
