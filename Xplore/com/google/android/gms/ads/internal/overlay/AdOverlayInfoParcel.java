package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bgd;
import defpackage.bha;
import defpackage.cua;
import defpackage.e;
import defpackage.era;
import defpackage.h5d;
import defpackage.hea;
import defpackage.hh8;
import defpackage.hjd;
import defpackage.kha;
import defpackage.kq9;
import defpackage.lhd;
import defpackage.lmd;
import defpackage.ly9;
import defpackage.m8a;
import defpackage.n3b;
import defpackage.n6b;
import defpackage.obd;
import defpackage.p2a;
import defpackage.q2a;
import defpackage.rg5;
import defpackage.s6;
import defpackage.skc;
import defpackage.sua;
import defpackage.sy8;
import defpackage.t9a;
import defpackage.u29;
import defpackage.y4;
import defpackage.zga;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends y4 implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new obd(6);
    public static final AtomicLong b0 = new AtomicLong(0);
    public static final ConcurrentHashMap c0 = new ConcurrentHashMap();
    public final String I;
    public final boolean J;
    public final String K;
    public final u29 L;
    public final int M;
    public final int N;
    public final String O;
    public final hh8 P;
    public final String Q;
    public final h5d R;
    public final p2a S;
    public final String T;
    public final String U;
    public final String V;
    public final era W;
    public final cua X;
    public final m8a Y;
    public final boolean Z;
    public final t9a a;
    public final long a0;
    public final sy8 b;
    public final hjd c;
    public final zga d;
    public final q2a e;

    public AdOverlayInfoParcel(t9a t9aVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, hh8 hh8Var, String str4, h5d h5dVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z2, long j) {
        this.a = t9aVar;
        this.I = str;
        this.J = z;
        this.K = str2;
        this.M = i;
        this.N = i2;
        this.O = str3;
        this.P = hh8Var;
        this.Q = str4;
        this.R = h5dVar;
        this.T = str5;
        this.U = str6;
        this.V = str7;
        this.Z = z2;
        this.a0 = j;
        if (!((Boolean) kq9.e.c.a(ly9.ze)).booleanValue()) {
            this.b = (sy8) rg5.Y1(rg5.G1(iBinder));
            this.c = (hjd) rg5.Y1(rg5.G1(iBinder2));
            this.d = (zga) rg5.Y1(rg5.G1(iBinder3));
            this.S = (p2a) rg5.Y1(rg5.G1(iBinder6));
            this.e = (q2a) rg5.Y1(rg5.G1(iBinder4));
            this.L = (u29) rg5.Y1(rg5.G1(iBinder5));
            this.W = (era) rg5.Y1(rg5.G1(iBinder7));
            this.X = (cua) rg5.Y1(rg5.G1(iBinder8));
            this.Y = (m8a) rg5.Y1(rg5.G1(iBinder9));
            return;
        }
        bgd bgdVar = (bgd) c0.remove(Long.valueOf(j));
        if (bgdVar == null) {
            e.f("AdOverlayObjects is null");
            throw null;
        }
        this.b = bgdVar.a;
        this.c = bgdVar.b;
        this.d = bgdVar.c;
        this.S = bgdVar.d;
        this.e = bgdVar.e;
        this.W = bgdVar.g;
        this.X = bgdVar.h;
        this.Y = bgdVar.i;
        this.L = bgdVar.f;
        bgdVar.j.cancel(false);
    }

    public static AdOverlayInfoParcel b(Intent intent) {
        Object parcelable;
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = s6.c(bundleExtra);
            } else {
                parcelable = bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
                if (!AdOverlayInfoParcel.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            return (AdOverlayInfoParcel) parcelable;
        } catch (Exception e) {
            if (((Boolean) kq9.e.c.a(ly9.ze)).booleanValue()) {
                lmd.B.h.d("AdOverlayInfoParcel.getFromIntent", e);
            }
            return null;
        }
    }

    public static final rg5 f(Object obj) {
        if (((Boolean) kq9.e.c.a(ly9.ze)).booleanValue()) {
            return null;
        }
        return new rg5(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iQ = skc.q(parcel, 20293);
        skc.i(parcel, 2, this.a, i);
        sy8 sy8Var = this.b;
        skc.f(parcel, 3, f(sy8Var));
        hjd hjdVar = this.c;
        skc.f(parcel, 4, f(hjdVar));
        zga zgaVar = this.d;
        skc.f(parcel, 5, f(zgaVar));
        q2a q2aVar = this.e;
        skc.f(parcel, 6, f(q2aVar));
        skc.j(parcel, 7, this.I);
        skc.p(parcel, 8, 4);
        parcel.writeInt(this.J ? 1 : 0);
        skc.j(parcel, 9, this.K);
        u29 u29Var = this.L;
        skc.f(parcel, 10, f(u29Var));
        skc.p(parcel, 11, 4);
        parcel.writeInt(this.M);
        skc.p(parcel, 12, 4);
        parcel.writeInt(this.N);
        skc.j(parcel, 13, this.O);
        skc.i(parcel, 14, this.P, i);
        skc.j(parcel, 16, this.Q);
        skc.i(parcel, 17, this.R, i);
        p2a p2aVar = this.S;
        skc.f(parcel, 18, f(p2aVar));
        skc.j(parcel, 19, this.T);
        skc.j(parcel, 24, this.U);
        skc.j(parcel, 25, this.V);
        era eraVar = this.W;
        skc.f(parcel, 26, f(eraVar));
        cua cuaVar = this.X;
        skc.f(parcel, 27, f(cuaVar));
        m8a m8aVar = this.Y;
        skc.f(parcel, 28, f(m8aVar));
        skc.p(parcel, 29, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        skc.p(parcel, 30, 8);
        long j = this.a0;
        parcel.writeLong(j);
        skc.r(parcel, iQ);
        if (((Boolean) kq9.e.c.a(ly9.ze)).booleanValue()) {
            c0.put(Long.valueOf(j), new bgd(sy8Var, hjdVar, zgaVar, p2aVar, q2aVar, u29Var, eraVar, cuaVar, m8aVar, hea.d.schedule(new lhd(j), ((Integer) r1.c.a(ly9.Be)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(sy8 sy8Var, bha bhaVar, p2a p2aVar, q2a q2aVar, u29 u29Var, kha khaVar, boolean z, int i, String str, String str2, hh8 hh8Var, cua cuaVar, n6b n6bVar) {
        this.a = null;
        this.b = sy8Var;
        this.c = bhaVar;
        this.d = khaVar;
        this.S = p2aVar;
        this.e = q2aVar;
        this.I = str2;
        this.J = z;
        this.K = str;
        this.L = u29Var;
        this.M = i;
        this.N = 3;
        this.O = null;
        this.P = hh8Var;
        this.Q = null;
        this.R = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = cuaVar;
        this.Y = n6bVar;
        this.Z = false;
        this.a0 = b0.getAndIncrement();
    }

    public AdOverlayInfoParcel(sy8 sy8Var, hjd hjdVar, u29 u29Var, kha khaVar, boolean z, int i, hh8 hh8Var, cua cuaVar, n6b n6bVar) {
        this.a = null;
        this.b = sy8Var;
        this.c = hjdVar;
        this.d = khaVar;
        this.S = null;
        this.e = null;
        this.I = null;
        this.J = z;
        this.K = null;
        this.L = u29Var;
        this.M = i;
        this.N = 2;
        this.O = null;
        this.P = hh8Var;
        this.Q = null;
        this.R = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = cuaVar;
        this.Y = n6bVar;
        this.Z = false;
        this.a0 = b0.getAndIncrement();
    }

    public AdOverlayInfoParcel(sy8 sy8Var, bha bhaVar, p2a p2aVar, q2a q2aVar, u29 u29Var, kha khaVar, boolean z, int i, String str, hh8 hh8Var, cua cuaVar, n6b n6bVar, boolean z2) {
        this.a = null;
        this.b = sy8Var;
        this.c = bhaVar;
        this.d = khaVar;
        this.S = p2aVar;
        this.e = q2aVar;
        this.I = null;
        this.J = z;
        this.K = null;
        this.L = u29Var;
        this.M = i;
        this.N = 3;
        this.O = str;
        this.P = hh8Var;
        this.Q = null;
        this.R = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = cuaVar;
        this.Y = n6bVar;
        this.Z = z2;
        this.a0 = b0.getAndIncrement();
    }

    public AdOverlayInfoParcel(t9a t9aVar, sy8 sy8Var, hjd hjdVar, u29 u29Var, hh8 hh8Var, kha khaVar, cua cuaVar, String str) {
        this.a = t9aVar;
        this.b = sy8Var;
        this.c = hjdVar;
        this.d = khaVar;
        this.S = null;
        this.e = null;
        this.I = null;
        this.J = false;
        this.K = null;
        this.L = u29Var;
        this.M = -1;
        this.N = 4;
        this.O = null;
        this.P = hh8Var;
        this.Q = null;
        this.R = null;
        this.T = str;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = cuaVar;
        this.Y = null;
        this.Z = false;
        this.a0 = b0.getAndIncrement();
    }

    public AdOverlayInfoParcel(kha khaVar, hh8 hh8Var, String str, String str2, m8a m8aVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = khaVar;
        this.S = null;
        this.e = null;
        this.I = null;
        this.J = false;
        this.K = null;
        this.L = null;
        this.M = 14;
        this.N = 5;
        this.O = null;
        this.P = hh8Var;
        this.Q = null;
        this.R = null;
        this.T = str;
        this.U = str2;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = m8aVar;
        this.Z = false;
        this.a0 = b0.getAndIncrement();
    }

    public AdOverlayInfoParcel(sua suaVar, zga zgaVar, int i, hh8 hh8Var, String str, h5d h5dVar, String str2, String str3, String str4, era eraVar, n6b n6bVar, String str5) {
        this.a = null;
        this.b = null;
        this.c = suaVar;
        this.d = zgaVar;
        this.S = null;
        this.e = null;
        this.J = false;
        if (((Boolean) kq9.e.c.a(ly9.p1)).booleanValue()) {
            this.I = null;
            this.K = null;
        } else {
            this.I = str2;
            this.K = str3;
        }
        this.L = null;
        this.M = i;
        this.N = 1;
        this.O = null;
        this.P = hh8Var;
        this.Q = str;
        this.R = h5dVar;
        this.T = str5;
        this.U = null;
        this.V = str4;
        this.W = eraVar;
        this.X = null;
        this.Y = n6bVar;
        this.Z = false;
        this.a0 = b0.getAndIncrement();
    }

    public AdOverlayInfoParcel(n3b n3bVar, zga zgaVar, hh8 hh8Var) {
        this.c = n3bVar;
        this.d = zgaVar;
        this.M = 1;
        this.P = hh8Var;
        this.a = null;
        this.b = null;
        this.S = null;
        this.e = null;
        this.I = null;
        this.J = false;
        this.K = null;
        this.L = null;
        this.N = 1;
        this.O = null;
        this.Q = null;
        this.R = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = false;
        this.a0 = b0.getAndIncrement();
    }
}
