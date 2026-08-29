package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.a3a;
import defpackage.a6a;
import defpackage.bhb;
import defpackage.c6a;
import defpackage.cca;
import defpackage.chb;
import defpackage.cja;
import defpackage.cka;
import defpackage.ebd;
import defpackage.fia;
import defpackage.fla;
import defpackage.fna;
import defpackage.g6d;
import defpackage.gjd;
import defpackage.gxa;
import defpackage.h1a;
import defpackage.h2b;
import defpackage.hh8;
import defpackage.hib;
import defpackage.hnb;
import defpackage.i5a;
import defpackage.im4;
import defpackage.lab;
import defpackage.lwa;
import defpackage.m8a;
import defpackage.mja;
import defpackage.mwa;
import defpackage.n19;
import defpackage.n1b;
import defpackage.n2d;
import defpackage.n6b;
import defpackage.nab;
import defpackage.nc3;
import defpackage.nib;
import defpackage.nvc;
import defpackage.oda;
import defpackage.phb;
import defpackage.pvc;
import defpackage.rg5;
import defpackage.s8a;
import defpackage.sea;
import defpackage.st9;
import defpackage.t3a;
import defpackage.t3b;
import defpackage.tab;
import defpackage.tt9;
import defpackage.upa;
import defpackage.v69;
import defpackage.vcb;
import defpackage.wab;
import defpackage.ww8;
import defpackage.xg9;
import defpackage.yia;
import defpackage.zja;
import defpackage.zkd;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends st9 implements fia {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // defpackage.fia
    public final oda C3(nc3 nc3Var, c6a c6aVar, int i) {
        return (xg9) cja.a((Context) rg5.Y1(nc3Var), c6aVar, i).T.zzb();
    }

    @Override // defpackage.st9
    public final boolean K5(int i, Parcel parcel, Parcel parcel2) {
        t3a t3aVar = null;
        switch (i) {
            case 1:
                nc3 nc3VarG1 = rg5.G1(parcel.readStrongBinder());
                gjd gjdVar = (gjd) tt9.b(parcel, gjd.CREATOR);
                String string = parcel.readString();
                c6a c6aVarL5 = a6a.L5(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                tt9.f(parcel);
                i5a i5aVarS0 = S0(nc3VarG1, gjdVar, string, c6aVarL5, i2);
                parcel2.writeNoException();
                tt9.e(parcel2, i5aVarS0);
                return true;
            case 2:
                nc3 nc3VarG12 = rg5.G1(parcel.readStrongBinder());
                gjd gjdVar2 = (gjd) tt9.b(parcel, gjd.CREATOR);
                String string2 = parcel.readString();
                c6a c6aVarL52 = a6a.L5(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                tt9.f(parcel);
                i5a i5aVarL0 = L0(nc3VarG12, gjdVar2, string2, c6aVarL52, i3);
                parcel2.writeNoException();
                tt9.e(parcel2, i5aVarL0);
                return true;
            case 3:
                nc3 nc3VarG13 = rg5.G1(parcel.readStrongBinder());
                String string3 = parcel.readString();
                c6a c6aVarL53 = a6a.L5(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                tt9.f(parcel);
                a3a a3aVarV1 = V1(nc3VarG13, string3, c6aVarL53, i4);
                parcel2.writeNoException();
                tt9.e(parcel2, a3aVarV1);
                return true;
            case 4:
                rg5.G1(parcel.readStrongBinder());
                tt9.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                nc3 nc3VarG14 = rg5.G1(parcel.readStrongBinder());
                nc3 nc3VarG15 = rg5.G1(parcel.readStrongBinder());
                tt9.f(parcel);
                h1a h1aVarW0 = w0(nc3VarG14, nc3VarG15);
                parcel2.writeNoException();
                tt9.e(parcel2, h1aVarW0);
                return true;
            case 6:
                nc3 nc3VarG16 = rg5.G1(parcel.readStrongBinder());
                c6a c6aVarL54 = a6a.L5(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                tt9.f(parcel);
                Context context = (Context) rg5.Y1(nc3VarG16);
                cja cjaVar = cja.a(context, c6aVarL54, i5).b;
                context.getClass();
                nib nibVar = (nib) ((nvc) new ww8(cjaVar, context, (String) null).b).zzb();
                parcel2.writeNoException();
                tt9.e(parcel2, nibVar);
                return true;
            case 7:
                rg5.G1(parcel.readStrongBinder());
                tt9.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                nc3 nc3VarG17 = rg5.G1(parcel.readStrongBinder());
                tt9.f(parcel);
                s8a s8aVarZzf = zzf(nc3VarG17);
                parcel2.writeNoException();
                tt9.e(parcel2, s8aVarZzf);
                return true;
            case 9:
                nc3 nc3VarG18 = rg5.G1(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                tt9.f(parcel);
                fna fnaVarB3 = b3(nc3VarG18, i6);
                parcel2.writeNoException();
                tt9.e(parcel2, fnaVarB3);
                return true;
            case 10:
                nc3 nc3VarG19 = rg5.G1(parcel.readStrongBinder());
                gjd gjdVar3 = (gjd) tt9.b(parcel, gjd.CREATOR);
                String string4 = parcel.readString();
                int i7 = parcel.readInt();
                tt9.f(parcel);
                zkd zkdVar = new zkd((Context) rg5.Y1(nc3VarG19), gjdVar3, string4, new hh8(ModuleDescriptor.MODULE_VERSION, i7, 0, true, false));
                parcel2.writeNoException();
                tt9.e(parcel2, zkdVar);
                return true;
            case 11:
                nc3 nc3VarG110 = rg5.G1(parcel.readStrongBinder());
                nc3 nc3VarG111 = rg5.G1(parcel.readStrongBinder());
                nc3 nc3VarG112 = rg5.G1(parcel.readStrongBinder());
                tt9.f(parcel);
                lwa lwaVar = new lwa((View) rg5.Y1(nc3VarG110), (HashMap) rg5.Y1(nc3VarG111), (HashMap) rg5.Y1(nc3VarG112));
                parcel2.writeNoException();
                tt9.e(parcel2, lwaVar);
                return true;
            case 12:
                nc3 nc3VarG113 = rg5.G1(parcel.readStrongBinder());
                String string5 = parcel.readString();
                c6a c6aVarL55 = a6a.L5(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                tt9.f(parcel);
                cca ccaVarR2 = r2(nc3VarG113, string5, c6aVarL55, i8);
                parcel2.writeNoException();
                tt9.e(parcel2, ccaVarR2);
                return true;
            case 13:
                nc3 nc3VarG114 = rg5.G1(parcel.readStrongBinder());
                gjd gjdVar4 = (gjd) tt9.b(parcel, gjd.CREATOR);
                String string6 = parcel.readString();
                c6a c6aVarL56 = a6a.L5(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                tt9.f(parcel);
                i5a i5aVarQ2 = q2(nc3VarG114, gjdVar4, string6, c6aVarL56, i9);
                parcel2.writeNoException();
                tt9.e(parcel2, i5aVarQ2);
                return true;
            case 14:
                nc3 nc3VarG115 = rg5.G1(parcel.readStrongBinder());
                c6a c6aVarL57 = a6a.L5(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                tt9.f(parcel);
                oda odaVarC3 = C3(nc3VarG115, c6aVarL57, i10);
                parcel2.writeNoException();
                tt9.e(parcel2, odaVarC3);
                return true;
            case 15:
                nc3 nc3VarG116 = rg5.G1(parcel.readStrongBinder());
                c6a c6aVarL58 = a6a.L5(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                tt9.f(parcel);
                m8a m8aVarU2 = U2(nc3VarG116, c6aVarL58, i11);
                parcel2.writeNoException();
                tt9.e(parcel2, m8aVarU2);
                return true;
            case 16:
                nc3 nc3VarG117 = rg5.G1(parcel.readStrongBinder());
                c6a c6aVarL59 = a6a.L5(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    t3aVar = iInterfaceQueryLocalInterface instanceof t3a ? (t3a) iInterfaceQueryLocalInterface : new t3a(strongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 7);
                }
                tt9.f(parcel);
                Context context2 = (Context) rg5.Y1(nc3VarG117);
                cja cjaVar2 = cja.a(context2, c6aVarL59, i12).b;
                context2.getClass();
                t3aVar.getClass();
                h2b h2bVar = (h2b) new mja(cjaVar2, context2, t3aVar).e.zzb();
                parcel2.writeNoException();
                tt9.e(parcel2, h2bVar);
                return true;
            case 17:
                nc3 nc3VarG118 = rg5.G1(parcel.readStrongBinder());
                c6a c6aVarL510 = a6a.L5(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                tt9.f(parcel);
                gxa gxaVarZ1 = z1(nc3VarG118, c6aVarL510, i13);
                parcel2.writeNoException();
                tt9.e(parcel2, gxaVarZ1);
                return true;
            case 18:
                nc3 nc3VarG119 = rg5.G1(parcel.readStrongBinder());
                c6a c6aVarL511 = a6a.L5(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                tt9.f(parcel);
                sea seaVarL1 = l1(nc3VarG119, c6aVarL511, i14);
                parcel2.writeNoException();
                tt9.e(parcel2, seaVarL1);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.fia
    public final i5a L0(nc3 nc3Var, gjd gjdVar, String str, c6a c6aVar, int i) {
        Context context = (Context) rg5.Y1(nc3Var);
        cja cjaVar = cja.a(context, c6aVar, i).b;
        context.getClass();
        gjdVar.getClass();
        str.getClass();
        return (wab) ((nvc) new im4(cjaVar, context, str, gjdVar).b).zzb();
    }

    @Override // defpackage.fia
    public final i5a S0(nc3 nc3Var, gjd gjdVar, String str, c6a c6aVar, int i) {
        Context context = (Context) rg5.Y1(nc3Var);
        cja cjaVar = cja.a(context, c6aVar, i).b;
        context.getClass();
        gjdVar.getClass();
        str.getClass();
        pvc pvcVarA = pvc.a(context);
        pvc pvcVarA2 = pvc.a(gjdVar);
        nvc nvcVar = cjaVar.m;
        nvc nvcVarA = nvc.a(new cka(nvcVar, 27));
        chb chbVar = (chb) nvc.a(new upa(pvcVarA, cjaVar.c, pvcVarA2, cjaVar.J, nvcVarA, nvc.a(g6d.a), nvc.a(n2d.a))).zzb();
        tab tabVar = (tab) nvcVarA.zzb();
        hh8 hh8Var = cjaVar.a.a;
        ebd.f(hh8Var);
        return new nab(context, gjdVar, str, chbVar, tabVar, hh8Var, (n1b) nvcVar.zzb());
    }

    @Override // defpackage.fia
    public final m8a U2(nc3 nc3Var, c6a c6aVar, int i) {
        return (n6b) cja.a((Context) rg5.Y1(nc3Var), c6aVar, i).P.zzb();
    }

    @Override // defpackage.fia
    public final a3a V1(nc3 nc3Var, String str, c6a c6aVar, int i) {
        Context context = (Context) rg5.Y1(nc3Var);
        return new lab(cja.a(context, c6aVar, i), context, str);
    }

    @Override // defpackage.fia
    public final fna b3(nc3 nc3Var, int i) {
        return (zja) cja.a((Context) rg5.Y1(nc3Var), null, i).H.zzb();
    }

    @Override // defpackage.fia
    public final sea l1(nc3 nc3Var, c6a c6aVar, int i) {
        return (hnb) cja.a((Context) rg5.Y1(nc3Var), c6aVar, i).I.zzb();
    }

    @Override // defpackage.fia
    public final i5a q2(nc3 nc3Var, gjd gjdVar, String str, c6a c6aVar, int i) {
        Context context = (Context) rg5.Y1(nc3Var);
        cja cjaVar = cja.a(context, c6aVar, i).b;
        str.getClass();
        context.getClass();
        pvc pvcVarA = pvc.a(context);
        pvc pvcVarA2 = pvc.a(str);
        nvc nvcVar = cjaVar.L0;
        phb phbVar = new phb(pvcVarA, nvcVar, cjaVar.M0, 0);
        nvc nvcVarA = nvc.a(new vcb(nvcVar, 12));
        nvc nvcVar2 = cjaVar.c;
        pvc pvcVar = cjaVar.J;
        yia yiaVar = cjaVar.h;
        return (bhb) nvc.a(new upa(pvcVar, pvcVarA, pvcVarA2, nvc.a(new fla(pvcVarA, nvcVar2, pvcVar, phbVar, nvcVarA, yiaVar)), nvcVarA, yiaVar, cjaVar.m)).zzb();
    }

    @Override // defpackage.fia
    public final cca r2(nc3 nc3Var, String str, c6a c6aVar, int i) {
        Context context = (Context) rg5.Y1(nc3Var);
        cja cjaVar = cja.a(context, c6aVar, i).b;
        context.getClass();
        return (hib) ((nvc) new ww8(cjaVar, context, str).c).zzb();
    }

    @Override // defpackage.fia
    public final h1a w0(nc3 nc3Var, nc3 nc3Var2) {
        return new mwa((FrameLayout) rg5.Y1(nc3Var), (FrameLayout) rg5.Y1(nc3Var2));
    }

    @Override // defpackage.fia
    public final gxa z1(nc3 nc3Var, c6a c6aVar, int i) {
        return (t3b) cja.a((Context) rg5.Y1(nc3Var), c6aVar, i).B.zzb();
    }

    @Override // defpackage.fia
    public final s8a zzf(nc3 nc3Var) {
        Activity activity = (Activity) rg5.Y1(nc3Var);
        AdOverlayInfoParcel adOverlayInfoParcelB = AdOverlayInfoParcel.b(activity.getIntent());
        if (adOverlayInfoParcelB == null) {
            return new v69(activity, 4);
        }
        int i = adOverlayInfoParcelB.N;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new v69(activity, 4) : new v69(activity, 0) : new n19(activity, adOverlayInfoParcelB) : new v69(activity, 2) : new v69(activity, 1) : new v69(activity, 3);
    }
}
