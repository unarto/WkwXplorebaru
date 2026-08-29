package com.lonelycatgames.Xplore.FileSystem.wifi;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.util.Log;
import com.amazon.device.iap.internal.a.ns.SFLvitRFwnxtcs;
import com.lonelycatgames.Xplore.App;
import defpackage.il1;
import defpackage.kxa;
import defpackage.s96;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class WifiStarterJob extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        jobParameters.getClass();
        Handler handler = App.M0;
        Log.i("X-plore", "WifiStarterJob stop");
        Application application = getApplication();
        application.getClass();
        ((App) application).c0();
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        long jA;
        jobParameters.getClass();
        Handler handler = App.M0;
        Log.i("X-plore", "WifiStarterJob.onStartJob");
        Application application = getApplication();
        application.getClass();
        App app = (App) application;
        il1 il1VarL = app.l();
        String[] strArr = il1.d;
        boolean zH = il1VarL.h("wifi_share_auto_start", false);
        boolean zH2 = app.l().h("ftp_share_auto_start", false);
        if (!zH && !zH2) {
            return false;
        }
        s96 s96VarD = kxa.d(app);
        if (s96VarD != null) {
            jA = s96VarD.a();
        } else {
            jA = 0;
        }
        if (((int) jA) != 0) {
            if (zH) {
                Log.i("X-plore", SFLvitRFwnxtcs.MgoGZGdzsYOQQGb);
                App.n0(app, true, 2);
            }
            if (zH2) {
                Log.i("X-plore", "Start FTP share");
                app.l0(true);
            }
        }
        return true;
    }
}
