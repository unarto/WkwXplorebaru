package com.amazon.device.iap.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.utils.siN.VjDVzYb;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    private static final String a = b.class.getName().concat("_PREFS");

    public static void a(String str, String str2) {
        d.a((Object) str, "userId");
        Context contextB = com.amazon.device.iap.internal.d.d().b();
        d.a(contextB, "context");
        SharedPreferences.Editor editorEdit = contextB.getSharedPreferences(a, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    public static String a(String str) {
        d.a((Object) str, VjDVzYb.IHpFZDDtcsOqZB);
        Context contextB = com.amazon.device.iap.internal.d.d().b();
        d.a(contextB, "context");
        return contextB.getSharedPreferences(a, 0).getString(str, null);
    }
}
