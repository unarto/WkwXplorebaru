package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.au4;
import defpackage.d89;
import defpackage.e58;
import defpackage.f00;
import defpackage.v46;
import defpackage.x4d;
import defpackage.xd;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        e58.b(getApplicationContext());
        x4d x4dVarA = f00.a();
        x4dVarA.m(string);
        x4dVarA.d = v46.b(i);
        if (string2 != null) {
            x4dVarA.c = Base64.decode(string2, 0);
        }
        d89 d89Var = e58.a().d;
        ((Executor) d89Var.e).execute(new au4(d89Var, x4dVarA.d(), i2, new xd(this, 15, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
