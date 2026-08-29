package com.google.android.gms.ads.mediation.rtb;

import defpackage.bx4;
import defpackage.cx4;
import defpackage.ex4;
import defpackage.gx4;
import defpackage.ix4;
import defpackage.j67;
import defpackage.p9;
import defpackage.wl6;
import defpackage.yw4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public abstract class RtbAdapter extends p9 {
    public abstract void collectSignals(wl6 wl6Var, j67 j67Var);

    public void loadRtbAppOpenAd(bx4 bx4Var, yw4 yw4Var) {
        loadAppOpenAd(bx4Var, yw4Var);
    }

    public void loadRtbBannerAd(cx4 cx4Var, yw4 yw4Var) {
        loadBannerAd(cx4Var, yw4Var);
    }

    public void loadRtbInterstitialAd(ex4 ex4Var, yw4 yw4Var) {
        loadInterstitialAd(ex4Var, yw4Var);
    }

    @Deprecated
    public void loadRtbNativeAd(gx4 gx4Var, yw4 yw4Var) {
        loadNativeAd(gx4Var, yw4Var);
    }

    public void loadRtbNativeAdMapper(gx4 gx4Var, yw4 yw4Var) {
        loadNativeAdMapper(gx4Var, yw4Var);
    }

    public void loadRtbRewardedAd(ix4 ix4Var, yw4 yw4Var) {
        loadRewardedAd(ix4Var, yw4Var);
    }

    public void loadRtbRewardedInterstitialAd(ix4 ix4Var, yw4 yw4Var) {
        loadRewardedInterstitialAd(ix4Var, yw4Var);
    }
}
