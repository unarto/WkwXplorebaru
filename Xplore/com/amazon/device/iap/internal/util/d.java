package com.amazon.device.iap.internal.util;

import androidx.lifecycle.Jzx.CKwXgHrxgKQXKh;
import defpackage.tv0;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static void a(String str, String str2) {
        if (!a(str)) {
            return;
        }
        defpackage.e.k(tv0.x(str2, CKwXgHrxgKQXKh.OTN));
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        defpackage.e.k(tv0.x(str, " must not be null"));
    }

    public static void a(Collection<? extends Object> collection, String str) {
        if (collection.isEmpty()) {
            defpackage.e.k(tv0.x(str, " must not be empty"));
        }
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }
}
