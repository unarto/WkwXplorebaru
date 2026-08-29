package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import defpackage.a3a;
import defpackage.a7a;
import defpackage.ao9;
import defpackage.ceb;
import defpackage.d1b;
import defpackage.dq9;
import defpackage.dx4;
import defpackage.eob;
import defpackage.fx4;
import defpackage.g1b;
import defpackage.h9;
import defpackage.hx4;
import defpackage.i5a;
import defpackage.i9;
import defpackage.k1b;
import defpackage.kec;
import defpackage.kp9;
import defpackage.kq9;
import defpackage.l2a;
import defpackage.l9;
import defpackage.ly9;
import defpackage.m2a;
import defpackage.m9;
import defpackage.n2a;
import defpackage.ri3;
import defpackage.t0b;
import defpackage.t4a;
import defpackage.th8;
import defpackage.tz9;
import defpackage.u5b;
import defpackage.ul3;
import defpackage.uqb;
import defpackage.va5;
import defpackage.w0a;
import defpackage.wa5;
import defpackage.y8;
import defpackage.ya5;
import defpackage.z8;
import defpackage.zh8;
import defpackage.zw4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private z8 adLoader;
    protected m9 mAdView;
    protected ul3 mInterstitialAd;

    public i9 buildAdRequest(Context context, zw4 zw4Var, Bundle bundle, Bundle bundle2) {
        h9 h9Var = new h9(1);
        ri3 ri3Var = (ri3) h9Var.b;
        Set setD = zw4Var.d();
        if (setD != null) {
            Iterator it = setD.iterator();
            while (it.hasNext()) {
                ((HashSet) ri3Var.e).add((String) it.next());
            }
        }
        if (zw4Var.c()) {
            ceb cebVar = ao9.g.a;
            ((HashSet) ri3Var.g).add(ceb.c(context));
        }
        if (zw4Var.a() != -1) {
            ri3Var.c = zw4Var.a() != 1 ? 0 : 1;
        }
        ri3Var.d = zw4Var.b();
        h9Var.k2(buildExtrasBundle(bundle, bundle2));
        return new i9(h9Var);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public ul3 getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public k1b getVideoController() {
        k1b k1bVar;
        m9 m9Var = this.mAdView;
        if (m9Var == null) {
            return null;
        }
        th8 th8Var = m9Var.a.c;
        synchronized (th8Var.a) {
            k1bVar = th8Var.b;
        }
        return k1bVar;
    }

    public y8 newAdLoader(Context context, String str) {
        return new y8(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.ax4, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        m9 m9Var = this.mAdView;
        if (m9Var != null) {
            m9Var.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        ul3 ul3Var = this.mInterstitialAd;
        if (ul3Var != null) {
            try {
                i5a i5aVar = ((t4a) ul3Var).b;
                if (i5aVar != null) {
                    i5aVar.r0(z);
                }
            } catch (RemoteException e) {
                d1b.l("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.ax4, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        m9 m9Var = this.mAdView;
        if (m9Var != null) {
            ly9.a(m9Var.getContext());
            if (((Boolean) tz9.g.g()).booleanValue()) {
                if (((Boolean) kq9.e.c.a(ly9.Ac)).booleanValue()) {
                    kp9.b.execute(new t0b(m9Var, 0));
                    return;
                }
            }
            u5b u5bVar = m9Var.a;
            u5bVar.getClass();
            try {
                i5a i5aVar = u5bVar.i;
                if (i5aVar != null) {
                    i5aVar.a();
                }
            } catch (RemoteException e) {
                d1b.l("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.ax4, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        m9 m9Var = this.mAdView;
        if (m9Var != null) {
            ly9.a(m9Var.getContext());
            if (((Boolean) tz9.h.g()).booleanValue()) {
                if (((Boolean) kq9.e.c.a(ly9.yc)).booleanValue()) {
                    kp9.b.execute(new t0b(m9Var, 1));
                    return;
                }
            }
            u5b u5bVar = m9Var.a;
            u5bVar.getClass();
            try {
                i5a i5aVar = u5bVar.i;
                if (i5aVar != null) {
                    i5aVar.b();
                }
            } catch (RemoteException e) {
                d1b.l("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, dx4 dx4Var, Bundle bundle, l9 l9Var, zw4 zw4Var, Bundle bundle2) {
        m9 m9Var = new m9(context);
        this.mAdView = m9Var;
        m9Var.setAdSize(new l9(l9Var.a, l9Var.b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new dq9(this, dx4Var));
        this.mAdView.b(buildAdRequest(context, zw4Var, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, fx4 fx4Var, Bundle bundle, zw4 zw4Var, Bundle bundle2) {
        ul3.a(context, getAdUnitId(bundle), buildAdRequest(context, zw4Var, bundle2, bundle), new a(this, fx4Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void requestNativeAd(Context context, hx4 hx4Var, Bundle bundle, ya5 ya5Var, Bundle bundle2) {
        wa5 wa5Var;
        va5 va5Var;
        g1b g1bVar = new g1b(this, hx4Var);
        y8 y8VarNewAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        y8VarNewAdLoader.getClass();
        a3a a3aVar = y8VarNewAdLoader.b;
        try {
            a3aVar.U4(new uqb(g1bVar));
        } catch (RemoteException e) {
            d1b.j("Failed to set AdListener.", e);
        }
        a7a a7aVar = (a7a) ya5Var;
        a7aVar.getClass();
        wa5 wa5Var2 = new wa5();
        w0a w0aVar = a7aVar.d;
        if (w0aVar == null) {
            wa5Var = new wa5(wa5Var2);
        } else {
            int i = w0aVar.a;
            if (i == 2) {
                wa5Var2.e = w0aVar.e;
                wa5Var2.a = w0aVar.b;
                wa5Var2.b = w0aVar.c;
                wa5Var2.d = w0aVar.d;
                wa5Var = new wa5(wa5Var2);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        wa5Var2.g = w0aVar.J;
                        wa5Var2.c = w0aVar.K;
                    }
                    wa5Var2.a = w0aVar.b;
                    wa5Var2.b = w0aVar.c;
                    wa5Var2.d = w0aVar.d;
                    wa5Var = new wa5(wa5Var2);
                }
                eob eobVar = w0aVar.I;
                if (eobVar != null) {
                    wa5Var2.f = new zh8(eobVar);
                }
                wa5Var2.e = w0aVar.e;
                wa5Var2.a = w0aVar.b;
                wa5Var2.b = w0aVar.c;
                wa5Var2.d = w0aVar.d;
                wa5Var = new wa5(wa5Var2);
            }
        }
        try {
            a3aVar.a3(new w0a(wa5Var));
        } catch (RemoteException e2) {
            d1b.j("Failed to specify native ad options", e2);
        }
        a7a a7aVar2 = (a7a) ya5Var;
        HashMap map = a7aVar2.g;
        ArrayList arrayList = a7aVar2.e;
        w0a w0aVar2 = a7aVar2.d;
        va5 va5Var2 = new va5();
        if (w0aVar2 == null) {
            va5Var = new va5(va5Var2);
        } else {
            int i2 = w0aVar2.a;
            if (i2 == 2) {
                va5Var2.d = w0aVar2.e;
                va5Var2.a = w0aVar2.b;
                va5Var2.c = w0aVar2.d;
                va5Var = new va5(va5Var2);
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        va5Var2.f = w0aVar2.J;
                        va5Var2.b = w0aVar2.K;
                        int i3 = w0aVar2.L;
                        va5Var2.g = w0aVar2.M;
                        va5Var2.h = i3;
                        int i4 = w0aVar2.N;
                        if (i4 != 0) {
                            int i5 = i4 != 2 ? i4 == 1 ? 2 : 1 : 3;
                            va5Var2.i = i5;
                        }
                    }
                    va5Var2.a = w0aVar2.b;
                    va5Var2.c = w0aVar2.d;
                    va5Var = new va5(va5Var2);
                }
                eob eobVar2 = w0aVar2.I;
                if (eobVar2 != null) {
                    va5Var2.e = new zh8(eobVar2);
                }
                va5Var2.d = w0aVar2.e;
                va5Var2.a = w0aVar2.b;
                va5Var2.c = w0aVar2.d;
                va5Var = new va5(va5Var2);
            }
        }
        y8VarNewAdLoader.b(va5Var);
        if (arrayList.contains("6")) {
            try {
                a3aVar.e2(new n2a(0, g1bVar));
            } catch (RemoteException e3) {
                d1b.j("Failed to add google native ad listener", e3);
            }
        }
        if (arrayList.contains("3")) {
            for (String str : map.keySet()) {
                l2a l2aVar = null;
                g1b g1bVar2 = true != ((Boolean) map.get(str)).booleanValue() ? null : g1bVar;
                kec kecVar = new kec(g1bVar, g1bVar2);
                try {
                    m2a m2aVar = new m2a(kecVar);
                    if (g1bVar2 != null) {
                        l2aVar = new l2a(kecVar);
                    }
                    a3aVar.d4(str, m2aVar, l2aVar);
                } catch (RemoteException e4) {
                    d1b.j("Failed to add custom template ad listener", e4);
                }
            }
        }
        z8 z8VarA = y8VarNewAdLoader.a();
        this.adLoader = z8VarA;
        z8VarA.a(buildAdRequest(context, ya5Var, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        ul3 ul3Var = this.mInterstitialAd;
        if (ul3Var != null) {
            ul3Var.b(null);
        }
    }
}
