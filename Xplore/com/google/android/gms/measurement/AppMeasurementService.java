package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Lz.UMpNAVOOSAbtUF;
import defpackage.coc;
import defpackage.f09;
import defpackage.lyc;
import defpackage.ndd;
import defpackage.ol8;
import defpackage.rgd;
import defpackage.s1b;
import defpackage.uj9;
import defpackage.z0c;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements ndd {
    public uj9 a;

    @Override // defpackage.ndd
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.ndd
    public final void b(Intent intent) {
        SparseArray sparseArray = ol8.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = ol8.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ndd
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final uj9 d() {
        uj9 uj9Var = this.a;
        if (uj9Var != null) {
            return uj9Var;
        }
        uj9 uj9Var2 = new uj9(24, this);
        this.a = uj9Var2;
        return uj9Var2;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        uj9 uj9VarD = d();
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) uj9VarD.b;
        z0c z0cVar = coc.l(service, null, null, null).I;
        coc.g(z0cVar);
        String action = intent.getAction();
        z0cVar.R.g(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        f09 f09Var = new f09(uj9VarD, i2, z0cVar, intent);
        rgd rgdVarX = rgd.x(service);
        rgdVarX.L1().s3(new s1b(24, uj9VarD, rgdVarX, f09Var));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        uj9 uj9VarD = d();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if (UMpNAVOOSAbtUF.FaujqLZIUuaRg.equals(action)) {
            return new lyc(rgd.x((Service) uj9VarD.b));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }
}
