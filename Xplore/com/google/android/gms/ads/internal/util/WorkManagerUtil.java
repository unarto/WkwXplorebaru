package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import defpackage.a2a;
import defpackage.b01;
import defpackage.ck0;
import defpackage.d1b;
import defpackage.ec5;
import defpackage.ffd;
import defpackage.hm9;
import defpackage.icd;
import defpackage.kj1;
import defpackage.kj7;
import defpackage.ks8;
import defpackage.nc3;
import defpackage.oc8;
import defpackage.pv6;
import defpackage.rg5;
import defpackage.st9;
import defpackage.tt9;
import defpackage.ty8;
import defpackage.wi5;
import defpackage.wr8;
import defpackage.xi5;
import defpackage.xr0;
import defpackage.yr8;
import defpackage.z90;
import defpackage.zb5;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends st9 implements a2a {
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // defpackage.st9
    public final boolean K5(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            nc3 nc3VarG1 = rg5.G1(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            tt9.f(parcel);
            boolean zZze = zze(nc3VarG1, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
            return true;
        }
        if (i == 2) {
            nc3 nc3VarG12 = rg5.G1(parcel.readStrongBinder());
            tt9.f(parcel);
            zzf(nc3VarG12);
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return false;
        }
        nc3 nc3VarG13 = rg5.G1(parcel.readStrongBinder());
        ty8 ty8Var = (ty8) tt9.b(parcel, ty8.CREATOR);
        tt9.f(parcel);
        boolean zZzg = zzg(nc3VarG13, ty8Var);
        parcel2.writeNoException();
        parcel2.writeInt(zZzg ? 1 : 0);
        return true;
    }

    @Override // defpackage.a2a
    public final boolean zze(nc3 nc3Var, String str, String str2) {
        return zzg(nc3Var, new ty8(str, str2, ""));
    }

    @Override // defpackage.a2a
    public final void zzf(nc3 nc3Var) {
        Context context = (Context) rg5.Y1(nc3Var);
        try {
            Context applicationContext = context.getApplicationContext();
            hm9 hm9Var = new hm9(new icd(22));
            applicationContext.getClass();
            synchronized (wr8.m) {
                try {
                    wr8 wr8Var = wr8.k;
                    if (wr8Var != null && wr8.l != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                    if (wr8Var == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        wr8 wr8VarC = wr8.l;
                        if (wr8VarC == null) {
                            wr8VarC = yr8.c(applicationContext2, hm9Var);
                            wr8.l = wr8VarC;
                        }
                        wr8.k = wr8VarC;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException unused) {
        }
        try {
            context.getClass();
            wr8 wr8VarC2 = wr8.c(context);
            ffd ffdVar = (ffd) wr8VarC2.b.I;
            String strConcat = "CancelWorkByTag_".concat("offline_ping_sender_work");
            pv6 pv6Var = (pv6) ((oc8) wr8VarC2.d).b;
            pv6Var.getClass();
            z90.f(ffdVar, strConcat, pv6Var, new ck0(wr8VarC2, 0));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            b01 b01Var = new b01(new zb5(null), ec5.b, false, false, false, false, -1L, -1L, xr0.k0(linkedHashSet));
            wi5 wi5Var = new wi5(OfflinePingSender.class);
            ((ks8) wi5Var.c).j = b01Var;
            ((Set) wi5Var.d).add("offline_ping_sender_work");
            wr8VarC2.b((xi5) wi5Var.m());
        } catch (IllegalStateException e) {
            d1b.j("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // defpackage.a2a
    public final boolean zzg(nc3 nc3Var, ty8 ty8Var) {
        Context context = (Context) rg5.Y1(nc3Var);
        try {
            Context applicationContext = context.getApplicationContext();
            hm9 hm9Var = new hm9(new icd(22));
            applicationContext.getClass();
            synchronized (wr8.m) {
                try {
                    wr8 wr8Var = wr8.k;
                    if (wr8Var != null && wr8.l != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                    if (wr8Var == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        wr8 wr8VarC = wr8.l;
                        if (wr8VarC == null) {
                            wr8VarC = yr8.c(applicationContext2, hm9Var);
                            wr8.l = wr8VarC;
                        }
                        wr8.k = wr8VarC;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException unused) {
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b01 b01Var = new b01(new zb5(null), ec5.b, false, false, false, false, -1L, -1L, xr0.k0(linkedHashSet));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uri", ty8Var.a);
        linkedHashMap.put("gws_query_id", ty8Var.b);
        linkedHashMap.put("image_url", ty8Var.c);
        kj1 kj1Var = new kj1(linkedHashMap);
        kj7.g(kj1Var);
        wi5 wi5Var = new wi5(OfflineNotificationPoster.class);
        ((ks8) wi5Var.c).j = b01Var;
        ((ks8) wi5Var.c).e = kj1Var;
        ((Set) wi5Var.d).add("offline_notification_work");
        xi5 xi5Var = (xi5) wi5Var.m();
        try {
            context.getClass();
            wr8.c(context).b(xi5Var);
            return true;
        } catch (IllegalStateException e) {
            d1b.j("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
