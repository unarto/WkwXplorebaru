package com.lonelycatgames.Xplore;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.media.aA.rOIT;
import android.os.Handler;
import android.os.IBinder;
import com.lonelycatgames.Xplore.FileSystem.ftp.FtpShareServer;
import defpackage.yu4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class FtpToggleService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return (IBinder) rOIT.nIiOlmV.invoke(null, this, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
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
            boolean zN = app.N();
            boolean z2 = !zN;
            if (zN) {
                FtpShareServer ftpShareServer = app.l0;
                if (ftpShareServer != null) {
                    ftpShareServer.stopSelf();
                }
            } else {
                app.l0(true);
            }
            z = z2;
        } else {
            int iHashCode = action.hashCode();
            if (iHashCode != 3551) {
                if (iHashCode == 109935 && action.equals("off")) {
                    FtpShareServer ftpShareServer2 = app.l0;
                    if (ftpShareServer2 != null) {
                        ftpShareServer2.stopSelf();
                    }
                    z = false;
                }
            } else if (action.equals("on")) {
                app.l0(true);
            }
        }
        String strL = yu4.l("X-plore ", getString(R.string.ftp_server), " ", getString(z ? R.string.start : R.string.stop));
        Handler handler = App.M0;
        app.k0(strL, false);
        stopSelf();
        return 2;
    }
}
