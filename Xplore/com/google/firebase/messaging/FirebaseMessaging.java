package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Lz.UMpNAVOOSAbtUF;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.ay8;
import defpackage.b10;
import defpackage.bs;
import defpackage.bva;
import defpackage.c9d;
import defpackage.d05;
import defpackage.gh5;
import defpackage.iwa;
import defpackage.iz1;
import defpackage.jec;
import defpackage.kjd;
import defpackage.kn2;
import defpackage.lod;
import defpackage.lp7;
import defpackage.ml;
import defpackage.mn;
import defpackage.np1;
import defpackage.p96;
import defpackage.pb;
import defpackage.pk7;
import defpackage.q7a;
import defpackage.qn;
import defpackage.qnd;
import defpackage.qsb;
import defpackage.rn2;
import defpackage.sn2;
import defpackage.uo4;
import defpackage.uu0;
import defpackage.vl6;
import defpackage.wn2;
import defpackage.yn2;
import defpackage.zn2;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    public static qsb l;
    public static p96 m = new uu0(5);
    public static ScheduledThreadPoolExecutor n;
    public final kn2 a;
    public final Context b;
    public final jec c;
    public final b10 d;
    public final bva e;
    public final ml f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final d05 i;
    public final sn2 j;
    public boolean k;

    public FirebaseMessaging(final kn2 kn2Var, p96 p96Var, p96 p96Var2, final sn2 sn2Var, p96 p96Var3, pk7 pk7Var) {
        kn2Var.a();
        final int i = 0;
        final d05 d05Var = new d05(kn2Var.a, 0);
        kn2Var.a();
        vl6 vl6Var = new vl6(kn2Var.a);
        jec jecVar = new jec();
        jecVar.a = kn2Var;
        jecVar.c = d05Var;
        jecVar.d = vl6Var;
        jecVar.e = p96Var;
        jecVar.I = p96Var2;
        jecVar.b = sn2Var;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ay8("Firebase-Messaging-Task", 2));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ay8("Firebase-Messaging-Init", 2));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ay8("Firebase-Messaging-File-Io", 2));
        this.k = false;
        m = p96Var3;
        this.a = kn2Var;
        ml mlVar = new ml();
        mlVar.d = this;
        mlVar.b = pk7Var;
        this.f = mlVar;
        kn2Var.a();
        final Context context = kn2Var.a;
        this.b = context;
        qn qnVar = new qn();
        this.i = d05Var;
        this.c = jecVar;
        this.j = sn2Var;
        b10 b10Var = new b10(context, kn2Var, sn2Var, jecVar, d05Var);
        this.d = b10Var;
        this.e = new bva(executorServiceNewSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        kn2Var.a();
        Context context2 = kn2Var.a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(qnVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (b10Var.K()) {
            wn2 wn2Var = new wn2(this);
            rn2 rn2Var = (rn2) sn2Var;
            synchronized (rn2Var) {
                rn2Var.j.add(wn2Var);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: xn2
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                lod lodVarE;
                int i3;
                int i4 = i;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i4) {
                    case 0:
                        if (firebaseMessaging.f.i() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.k) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = firebaseMessaging.b;
                        iwa.b(context3);
                        jec jecVar2 = firebaseMessaging.c;
                        boolean zF = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesB = xwa.b(context3);
                            if (!sharedPreferencesB.contains("proxy_retention") || sharedPreferencesB.getBoolean("proxy_retention", false) != zF) {
                                vl6 vl6Var2 = (vl6) jecVar2.d;
                                if (vl6Var2.c.b() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    qnd qndVarG = qnd.G(vl6Var2.b);
                                    synchronized (qndVarG) {
                                        i3 = qndVarG.b;
                                        qndVarG.b = i3 + 1;
                                    }
                                    lodVarE = qndVarG.P(new kjd(i3, 4, bundle, 0));
                                } else {
                                    lodVarE = uo4.e(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                lodVarE.f(new br(1), new zv4(3, context3, zF));
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ay8("Firebase-Messaging-Topics-Io", 2));
        uo4.d(new Callable() { // from class: a38
            @Override // java.util.concurrent.Callable
            public final Object call() {
                z28 z28Var;
                Context context3 = context;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                d05 d05Var2 = d05Var;
                kn2 kn2Var2 = kn2Var;
                FirebaseMessaging firebaseMessaging = this;
                sn2 sn2Var2 = sn2Var;
                synchronized (z28.class) {
                    try {
                        WeakReference weakReference = z28.c;
                        z28 z28Var2 = weakReference != null ? (z28) weakReference.get() : null;
                        if (z28Var2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences(UMpNAVOOSAbtUF.xIduOvYgwTaAqr, 0);
                            z28Var = new z28(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (z28Var) {
                                z28Var.a = mjb.l(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            z28.c = new WeakReference(z28Var);
                        } else {
                            z28Var = z28Var2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new b38(d05Var2, z28Var, new kec(kn2Var2, firebaseMessaging, sn2Var2, 12, (byte) 0), context3, scheduledThreadPoolExecutor3);
            }
        }, scheduledThreadPoolExecutor2).f(scheduledThreadPoolExecutor, new yn2(this, i));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: xn2
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                lod lodVarE;
                int i3;
                int i4 = i2;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i4) {
                    case 0:
                        if (firebaseMessaging.f.i() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.k) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = firebaseMessaging.b;
                        iwa.b(context3);
                        jec jecVar2 = firebaseMessaging.c;
                        boolean zF = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesB = xwa.b(context3);
                            if (!sharedPreferencesB.contains("proxy_retention") || sharedPreferencesB.getBoolean("proxy_retention", false) != zF) {
                                vl6 vl6Var2 = (vl6) jecVar2.d;
                                if (vl6Var2.c.b() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    qnd qndVarG = qnd.G(vl6Var2.b);
                                    synchronized (qndVarG) {
                                        i3 = qndVarG.b;
                                        qndVarG.b = i3 + 1;
                                    }
                                    lodVarE = qndVarG.P(new kjd(i3, 4, bundle, 0));
                                } else {
                                    lodVarE = uo4.e(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                lodVarE.f(new br(1), new zv4(3, context3, zF));
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = n;
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ay8("TAG", 2));
                    n = scheduledThreadPoolExecutor;
                }
                scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized qsb c(Context context) {
        qsb qsbVar;
        qsbVar = l;
        if (qsbVar == null) {
            qsbVar = new qsb(context, 19);
            l = qsbVar;
        }
        return qsbVar;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(kn2 kn2Var) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) kn2Var.b(FirebaseMessaging.class);
        q7a.j(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        lod lodVarH;
        np1 np1VarD = d();
        if (!h(np1VarD)) {
            return (String) np1VarD.b;
        }
        String strH = d05.h(this.a);
        bva bvaVar = this.e;
        zn2 zn2Var = new zn2(this, strH, np1VarD);
        synchronized (bvaVar) {
            lodVarH = (lod) ((bs) bvaVar.c).get(strH);
            if (lodVarH == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strH);
                }
                lodVarH = zn2Var.a().h((Executor) bvaVar.b, new mn(bvaVar, 27, strH));
                ((bs) bvaVar.c).put(strH, lodVarH);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strH);
            }
        }
        try {
            return (String) uo4.b(lodVarH);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("FCM Registration failed!", e);
        }
    }

    public final np1 d() {
        np1 np1VarE;
        qsb qsbVarC = c(this.b);
        kn2 kn2Var = this.a;
        kn2Var.a();
        String strD = "[DEFAULT]".equals(kn2Var.b) ? "" : kn2Var.d();
        String strH = d05.h(this.a);
        synchronized (qsbVarC) {
            np1VarE = np1.e(((SharedPreferences) qsbVarC.b).getString(strD + "|T|" + strH + "|*", null));
        }
        return np1VarE;
    }

    public final void e() {
        lod lodVarE;
        int i;
        vl6 vl6Var = (vl6) this.c.d;
        int i2 = 1;
        if (vl6Var.c.b() >= 241100000) {
            qnd qndVarG = qnd.G(vl6Var.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (qndVarG) {
                i = qndVarG.b;
                qndVarG.b = i + 1;
            }
            lodVarE = qndVarG.P(new kjd(i, 5, bundle, 1)).g(iz1.d, gh5.c);
        } else {
            lodVarE = uo4.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        lodVarE.f(this.g, new yn2(this, i2));
    }

    public final boolean f() {
        Context context = this.b;
        iwa.b(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.a.b(pb.class) != null) {
                    return true;
                }
                if (c9d.b() && m != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final synchronized void g(long j) {
        b(new lp7(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.k = true;
    }

    public final boolean h(np1 np1Var) {
        String str;
        if (np1Var != null) {
            String str2 = (String) np1Var.b;
            String strE = this.i.e();
            if (System.currentTimeMillis() <= np1Var.a + 604800000 && strE.equals((String) np1Var.c)) {
                if (!this.d.K()) {
                    return str2.length() <= 22;
                }
                try {
                    str = (String) uo4.b(((rn2) this.j).c());
                } catch (InterruptedException | ExecutionException unused) {
                    str = null;
                }
                return !str2.equalsIgnoreCase(str);
            }
        }
        return true;
    }
}
