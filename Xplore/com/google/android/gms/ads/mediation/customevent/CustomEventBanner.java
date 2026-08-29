package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import defpackage.bh1;
import defpackage.ch1;
import defpackage.l9;
import defpackage.zw4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventBanner extends bh1 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, ch1 ch1Var, String str, l9 l9Var, zw4 zw4Var, Bundle bundle);
}
