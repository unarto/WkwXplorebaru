package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import defpackage.ada;
import defpackage.d1b;
import defpackage.fx4;
import defpackage.hh8;
import defpackage.jaa;
import defpackage.k6a;
import defpackage.kq9;
import defpackage.lmd;
import defpackage.ly9;
import defpackage.ml;
import defpackage.nz2;
import defpackage.q7a;
import defpackage.t9a;
import defpackage.wda;
import defpackage.xkd;
import defpackage.y7a;
import defpackage.yy9;
import defpackage.zw4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class zzbym implements MediationInterstitialAdapter {
    public Activity a;
    public fx4 b;
    public Uri c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        d1b.d("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        d1b.d("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        d1b.d("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, fx4 fx4Var, Bundle bundle, zw4 zw4Var, Bundle bundle2) {
        this.b = fx4Var;
        if (fx4Var == null) {
            d1b.i("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            d1b.i("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((ada) this.b).h();
            return;
        }
        if (!yy9.a(context)) {
            d1b.i("Default browser does not support custom tabs. Bailing out.");
            ((ada) this.b).h();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            d1b.i("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((ada) this.b).h();
            return;
        }
        this.a = (Activity) context;
        this.c = Uri.parse(string);
        ada adaVar = (ada) this.b;
        adaVar.getClass();
        q7a.e("#008 Must be called on the main UI thread.");
        d1b.d("Adapter called onAdLoaded.");
        try {
            ((k6a) adaVar.b).f();
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        jaa jaaVarA = new ml(2, false).a();
        ((Intent) jaaVarA.b).setData(this.c);
        xkd.l.post(new nz2(this, new AdOverlayInfoParcel(new t9a((Intent) jaaVarA.b, null), null, new y7a(this), null, new hh8(0, 0, false), null, null, ""), false, 20));
        wda wdaVar = lmd.B.h.m;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (wdaVar.a) {
            try {
                if (wdaVar.c == 3) {
                    if (wdaVar.b + ((Long) kq9.e.c.a(ly9.R6)).longValue() <= jCurrentTimeMillis) {
                        wdaVar.c = 1;
                    }
                }
            } finally {
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (wdaVar.a) {
            try {
                if (wdaVar.c != 2) {
                    return;
                }
                wdaVar.c = 3;
                if (wdaVar.c == 3) {
                    wdaVar.b = jCurrentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
