package com.amazon.device.iap.internal.b.c;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
abstract class c extends i {
    protected final Set<String> a;

    public c(e eVar, String str, Set<String> set) {
        super(eVar, "getItem_data", str);
        this.a = set;
        a("skus", set);
    }
}
