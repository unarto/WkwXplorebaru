package com.lonelycatgames.Xplore;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import defpackage.yu4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class WiFiToggleActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Application application = getApplication();
        application.getClass();
        App app = (App) application;
        Handler handler = App.M0;
        boolean zQ = app.Q();
        if (zQ) {
            app.p0();
        } else {
            App.n0(app, false, 2);
        }
        app.j0(this, yu4.l("X-plore ", getString(R.string.wifi_server), " ", getString(!zQ ? R.string.start : R.string.stop)), false);
        finish();
    }
}
