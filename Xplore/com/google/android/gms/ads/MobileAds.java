package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.play.core.common.Ag.XdGEXS;
import defpackage.a6a;
import defpackage.d1b;
import defpackage.d3b;
import defpackage.fna;
import defpackage.h6b;
import defpackage.kp9;
import defpackage.kq9;
import defpackage.ly9;
import defpackage.q7a;
import defpackage.sab;
import defpackage.tz9;
import defpackage.w8;
import defpackage.z9;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class MobileAds {
    private static void setPlugin(String str) {
        sab sabVarD = sab.d();
        synchronized (sabVarD.h) {
            q7a.k("MobileAds.initialize() must be called prior to setting the plugin.", sabVarD.i != null);
            fna fnaVar = sabVarD.i;
            if (fnaVar == null) {
                return;
            }
            try {
                fnaVar.T(str);
            } catch (RemoteException e) {
                d1b.g("Unable to set plugin.", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035 A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void stop() {
        h6b h6bVar;
        h6b h6bVar2;
        h6b h6bVar3;
        fna fnaVar;
        sab sabVarD = sab.d();
        synchronized (sabVarD.d) {
            sabVarD.g = false;
            sabVarD.f = false;
            sabVarD.e.clear();
        }
        synchronized (sabVarD.h) {
            try {
                fnaVar = sabVarD.i;
            } catch (RemoteException e) {
                d1b.g("Unable to stop the SDK.", e);
            }
            if (fnaVar != null) {
                fnaVar.U1();
                sabVarD.i = null;
                h6bVar = sabVarD.a;
                if (h6bVar != null) {
                    h6bVar.F();
                    sabVarD.a = null;
                }
                h6bVar2 = sabVarD.b;
                if (h6bVar2 != null) {
                    h6bVar2.F();
                    sabVarD.b = null;
                }
                h6bVar3 = sabVarD.c;
                if (h6bVar3 != null) {
                    h6bVar3.F();
                    sabVarD.c = null;
                }
            } else {
                sabVarD.i = null;
                h6bVar = sabVarD.a;
                if (h6bVar != null) {
                }
                h6bVar2 = sabVarD.b;
                if (h6bVar2 != null) {
                }
                h6bVar3 = sabVarD.c;
                if (h6bVar3 != null) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[Catch: all -> 0x0048, TryCatch #1 {, blocks: (B:20:0x002e, B:22:0x0035, B:28:0x0051, B:30:0x0062, B:32:0x0074, B:39:0x00b9, B:40:0x00d4, B:33:0x0085, B:35:0x0093, B:37:0x00a5, B:38:0x00b1, B:27:0x004c), top: B:47:0x002e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[Catch: all -> 0x0048, TryCatch #1 {, blocks: (B:20:0x002e, B:22:0x0035, B:28:0x0051, B:30:0x0062, B:32:0x0074, B:39:0x00b9, B:40:0x00d4, B:33:0x0085, B:35:0x0093, B:37:0x00a5, B:38:0x00b1, B:27:0x004c), top: B:47:0x002e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1 A[Catch: all -> 0x0048, TryCatch #1 {, blocks: (B:20:0x002e, B:22:0x0035, B:28:0x0051, B:30:0x0062, B:32:0x0074, B:39:0x00b9, B:40:0x00d4, B:33:0x0085, B:35:0x0093, B:37:0x00a5, B:38:0x00b1, B:27:0x004c), top: B:47:0x002e, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, z9 z9Var) {
        fna fnaVar;
        final sab sabVarD = sab.d();
        synchronized (sabVarD.d) {
            try {
                if (sabVarD.f) {
                    sabVarD.e.add(z9Var);
                    return;
                }
                if (sabVarD.g) {
                    z9.a(sabVarD.e());
                    return;
                }
                final int i = 1;
                sabVarD.f = true;
                sabVarD.e.add(z9Var);
                synchronized (sabVarD.h) {
                    try {
                        sabVarD.b(context);
                        fnaVar = sabVarD.i;
                    } catch (RemoteException e) {
                        d1b.j("MobileAdsSettingManager initialization failed", e);
                    }
                    if (fnaVar != null) {
                        fnaVar.X2(new d3b(1, sabVarD));
                        sabVarD.i.x5(new a6a());
                        ly9.a(context);
                        if (!((Boolean) tz9.a.g()).booleanValue()) {
                            if (((Boolean) kq9.e.c.a(ly9.Bc)).booleanValue()) {
                                d1b.d(XdGEXS.NJiCwMqInTXM);
                                kp9.a.execute(new Runnable() { // from class: g8b
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        int i2 = i;
                                        sab sabVar = sabVarD;
                                        switch (i2) {
                                            case 0:
                                                synchronized (sabVar.h) {
                                                    sabVar.c();
                                                    break;
                                                }
                                                return;
                                            default:
                                                synchronized (sabVar.h) {
                                                    sabVar.c();
                                                    break;
                                                }
                                                return;
                                        }
                                    }
                                });
                            } else if (((Boolean) tz9.b.g()).booleanValue()) {
                                if (((Boolean) kq9.e.c.a(ly9.Bc)).booleanValue()) {
                                    final int i2 = 0;
                                    kp9.b.execute(new Runnable() { // from class: g8b
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            int i22 = i2;
                                            sab sabVar = sabVarD;
                                            switch (i22) {
                                                case 0:
                                                    synchronized (sabVar.h) {
                                                        sabVar.c();
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    synchronized (sabVar.h) {
                                                        sabVar.c();
                                                        break;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                } else {
                                    d1b.d("Initializing on calling thread");
                                    sabVarD.c();
                                }
                            }
                            sabVarD.a = new h6b(context, w8.INTERSTITIAL);
                            sabVarD.b = new h6b(context, w8.REWARDED);
                            sabVarD.c = new h6b(context, w8.APP_OPEN_AD);
                        }
                    } else {
                        ly9.a(context);
                        if (!((Boolean) tz9.a.g()).booleanValue()) {
                        }
                    }
                }
            } finally {
            }
        }
    }
}
