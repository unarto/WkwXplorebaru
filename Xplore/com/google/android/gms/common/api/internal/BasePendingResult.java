package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.k40;
import defpackage.nh;
import defpackage.q7a;
import defpackage.rv8;
import defpackage.ti6;
import defpackage.xw8;
import defpackage.yw8;
import defpackage.zfa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends ti6> {
    public static final nh j = new nh(2);
    public ti6 e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    private xw8 resultGuardian;
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public BasePendingResult(rv8 rv8Var) {
        new k40(rv8Var != null ? rv8Var.a.J : Looper.getMainLooper(), 1);
        new WeakReference(rv8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(ti6 ti6Var) {
        if (ti6Var instanceof zfa) {
            try {
                ((zfa) ti6Var).a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(ti6Var)), e);
            }
        }
    }

    public final void a(yw8 yw8Var) {
        synchronized (this.a) {
            try {
                if (d()) {
                    yw8Var.a(this.f);
                } else {
                    this.c.add(yw8Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ti6 b(Status status);

    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        return this.b.getCount() == 0;
    }

    public final void e(ti6 ti6Var) {
        synchronized (this.a) {
            try {
                if (this.h) {
                    g(ti6Var);
                    return;
                }
                d();
                q7a.k("Results have already been set", !d());
                q7a.k("Result has already been consumed", !this.g);
                f(ti6Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(ti6 ti6Var) {
        this.e = ti6Var;
        this.f = ti6Var.a();
        this.b.countDown();
        if (this.e instanceof zfa) {
            this.resultGuardian = new xw8(this);
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((yw8) arrayList.get(i)).a(this.f);
        }
        arrayList.clear();
    }
}
