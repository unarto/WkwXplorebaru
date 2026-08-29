package com.amazon.device.iap.internal.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.billingclient.api.YN.mcrmCulfyzf;
import com.google.android.material.floatingactionbutton.lGl.OGXZhi;
import defpackage.tv0;
import defpackage.yu4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    private static c a = new c();
    private static final String b = "c";
    private static final String c = c.class.getName().concat("_PREFS_");

    public void a(String str, String str2, String str3) {
        String str4 = b;
        StringBuilder sbQ = tv0.q("enter saveEntitlementRecord for v1 Entitlement [", str2, "/", str3, "], user [");
        sbQ.append(str);
        sbQ.append("]");
        com.amazon.device.iap.internal.util.e.a(str4, sbQ.toString());
        try {
            com.amazon.device.iap.internal.util.d.a(str, "userId");
            com.amazon.device.iap.internal.util.d.a(str2, OGXZhi.yszBCLiHatvrj);
            com.amazon.device.iap.internal.util.d.a(str3, "sku");
            Context contextB = com.amazon.device.iap.internal.d.d().b();
            com.amazon.device.iap.internal.util.d.a(contextB, "context");
            SharedPreferences.Editor editorEdit = contextB.getSharedPreferences(c + str, 0).edit();
            editorEdit.putString(str3, str2);
            editorEdit.commit();
        } catch (Throwable th) {
            String str5 = b;
            StringBuilder sbQ2 = tv0.q("error in saving v1 Entitlement:", str2, "/", str3, ":");
            sbQ2.append(th.getMessage());
            com.amazon.device.iap.internal.util.e.a(str5, sbQ2.toString());
            str4 = str5;
        }
        StringBuilder sbQ3 = tv0.q("leaving saveEntitlementRecord for v1 Entitlement [", str2, "/", str3, "], user [");
        sbQ3.append(str);
        sbQ3.append("]");
        com.amazon.device.iap.internal.util.e.a(str4, sbQ3.toString());
    }

    public static c a() {
        return a;
    }

    public String a(String str, String str2) {
        String str3 = b;
        com.amazon.device.iap.internal.util.e.a(str3, tv0.m(mcrmCulfyzf.PPAhAKcKgXrOtXJ, str2, "], user [", str, "]"));
        String string = null;
        try {
            com.amazon.device.iap.internal.util.d.a(str, "userId");
            com.amazon.device.iap.internal.util.d.a(str2, "sku");
            Context contextB = com.amazon.device.iap.internal.d.d().b();
            com.amazon.device.iap.internal.util.d.a(contextB, "context");
            string = contextB.getSharedPreferences(c + str, 0).getString(str2, null);
        } catch (Throwable th) {
            String str4 = b;
            StringBuilder sbR = yu4.r("error in saving v1 Entitlement:", str2, ":");
            sbR.append(th.getMessage());
            com.amazon.device.iap.internal.util.e.a(str4, sbR.toString());
            str3 = str4;
        }
        com.amazon.device.iap.internal.util.e.a(str3, tv0.m("leaving saveEntitlementRecord for sku [", str2, "], user [", str, "]"));
        return string;
    }
}
