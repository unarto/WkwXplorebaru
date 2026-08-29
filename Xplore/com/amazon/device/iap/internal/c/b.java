package com.amazon.device.iap.internal.c;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class b {
    private static final b b = new b();
    private final Set<String> a = new ConcurrentSkipListSet();

    public boolean a(String str) {
        if (com.amazon.device.iap.internal.util.d.a(str)) {
            return false;
        }
        return this.a.remove(str);
    }

    public void b(String str) {
        if (com.amazon.device.iap.internal.util.d.a(str)) {
            return;
        }
        this.a.add(str);
    }

    public static b a() {
        return b;
    }
}
