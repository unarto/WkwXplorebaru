package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import defpackage.h65;
import defpackage.idb;
import defpackage.k4d;
import defpackage.ndd;
import defpackage.nra;
import defpackage.q7a;
import defpackage.rgd;
import defpackage.s1b;
import defpackage.s2b;
import defpackage.uj9;
import defpackage.z0c;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements ndd {
    public uj9 a;

    @Override // defpackage.ndd
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ndd
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        uj9 uj9VarD = d();
        Service service = (Service) uj9VarD.b;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            q7a.i(string);
            rgd rgdVarX = rgd.x(service);
            z0c z0cVarB0 = rgdVarX.b0();
            h65 h65Var = rgdVarX.O.c;
            z0cVarB0.R.f(string, "Local AppMeasurementJobService called. action");
            rgdVarX.L1().s3(new s1b(24, uj9VarD, rgdVarX, new k4d(6, uj9VarD, z0cVarB0, jobParameters)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        q7a.i(string);
        idb idbVarE = idb.e(service, null);
        s2b s2bVar = new s2b(uj9VarD, 22, jobParameters);
        idbVarE.getClass();
        idbVarE.c(new nra(idbVarE, s2bVar, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    @Override // defpackage.ndd
    public final void b(Intent intent) {
    }
}
