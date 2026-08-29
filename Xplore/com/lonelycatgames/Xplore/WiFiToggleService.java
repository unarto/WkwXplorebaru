package com.lonelycatgames.Xplore;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.firebase.datatransport.htJQ.gilqCEUaaDMi;
import defpackage.yu4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class WiFiToggleService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return (IBinder) gilqCEUaaDMi.jApvfspzYn.invoke(null, this, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onStartCommand(Intent intent, int i, int i2) {
        intent.getClass();
        Application application = getApplication();
        application.getClass();
        App app = (App) application;
        String action = intent.getAction();
        boolean z = true;
        if (action == null) {
            boolean zQ = app.Q();
            boolean z2 = !zQ;
            if (zQ) {
                app.p0();
            } else {
                App.n0(app, true, 2);
            }
            z = z2;
        } else {
            int iHashCode = action.hashCode();
            if (iHashCode != 3551) {
                if (iHashCode == 109935 && action.equals("off")) {
                    app.p0();
                    z = false;
                }
            } else if (action.equals("on")) {
                App.n0(app, true, 2);
            }
        }
        String strL = yu4.l("X-plore ", getString(R.string.wifi_server), " ", getString(z ? R.string.start : R.string.stop));
        Handler handler = App.M0;
        app.k0(strL, false);
        stopSelf();
        return 2;
    }
}
