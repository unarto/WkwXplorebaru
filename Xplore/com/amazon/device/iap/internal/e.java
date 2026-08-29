package com.amazon.device.iap.internal;

import android.util.Log;
import com.amazon.device.iap.internal.b.g;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final String a = "com.amazon.device.iap.internal.e";
    private static volatile boolean b;
    private static volatile boolean c;
    private static volatile c d;
    private static volatile a e;
    private static volatile b f;

    public static boolean a() {
        if (c) {
            return b;
        }
        synchronized (e.class) {
            if (c) {
                return b;
            }
            try {
                e.class.getClassLoader().loadClass("com.amazon.android.Kiwi");
                b = false;
            } catch (Throwable unused) {
                b = true;
            }
            c = true;
            return b;
        }
    }

    public static c b() {
        if (d == null) {
            synchronized (e.class) {
                try {
                    if (d == null) {
                        d = (c) a(c.class);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public static a c() {
        if (e == null) {
            synchronized (e.class) {
                try {
                    if (e == null) {
                        e = (a) a(a.class);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    private static b d() {
        if (f == null) {
            synchronized (e.class) {
                try {
                    if (f == null) {
                        if (a()) {
                            f = new com.amazon.device.iap.internal.a.d();
                        } else {
                            f = new g();
                        }
                    }
                } finally {
                }
            }
        }
        return f;
    }

    private static <T> T a(Class<T> cls) {
        try {
            return d().a(cls).newInstance();
        } catch (Exception e2) {
            Log.e(a, "error getting instance for " + cls, e2);
            return null;
        }
    }
}
