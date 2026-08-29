package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.b20;
import defpackage.eh7;
import defpackage.em;
import defpackage.ic2;
import defpackage.j56;
import defpackage.sp1;
import defpackage.sr8;
import defpackage.tv0;
import defpackage.u68;
import defpackage.un2;
import defpackage.w9b;
import defpackage.wr8;
import defpackage.x4d;
import defpackage.yd;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements ic2 {
    public static final String e = b20.o("SystemJobService");
    public wr8 a;
    public final HashMap b = new HashMap();
    public final w9b c = new w9b(24, (byte) 0);
    public u68 d;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        un2.j(tv0.l("Cannot invoke ", str, " on a background thread"));
    }

    public static sr8 c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new sr8(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.ic2
    public final void b(sr8 sr8Var, boolean z) {
        a("onExecuted");
        b20.h().b(e, sr8Var.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.b.remove(sr8Var);
        this.c.l(sr8Var);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            wr8 wr8VarC = wr8.c(getApplicationContext());
            this.a = wr8VarC;
            j56 j56Var = wr8VarC.f;
            this.d = new u68(j56Var, wr8VarC.d);
            j56Var.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                b20.h().p(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                sp1.h("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        wr8 wr8Var = this.a;
        if (wr8Var != null) {
            j56 j56Var = wr8Var.f;
            synchronized (j56Var.k) {
                j56Var.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        wr8 wr8Var = this.a;
        String str = e;
        if (wr8Var == null) {
            b20.h().b(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        sr8 sr8VarC = c(jobParameters);
        if (sr8VarC == null) {
            b20.h().f(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.b;
        if (map.containsKey(sr8VarC)) {
            b20.h().b(str, "Job is already being executed by SystemJobService: " + sr8VarC);
            return false;
        }
        b20.h().b(str, "onStartJob for " + sr8VarC);
        map.put(sr8VarC, jobParameters);
        x4d x4dVar = new x4d(13);
        if (jobParameters.getTriggeredContentUris() != null) {
            x4dVar.c = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            x4dVar.b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            x4dVar.d = em.h(jobParameters);
        }
        this.d.n(this.c.p(sr8VarC), x4dVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.a == null) {
            b20.h().b(e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        sr8 sr8VarC = c(jobParameters);
        if (sr8VarC == null) {
            b20.h().f(e, "WorkSpec id not found!");
            return false;
        }
        b20.h().b(e, "onStopJob for " + sr8VarC);
        this.b.remove(sr8VarC);
        eh7 eh7VarL = this.c.l(sr8VarC);
        if (eh7VarL != null) {
            int iE = Build.VERSION.SDK_INT >= 31 ? yd.e(jobParameters) : -512;
            u68 u68Var = this.d;
            u68Var.getClass();
            u68Var.o(eh7VarL, iE);
        }
        j56 j56Var = this.a.f;
        String str = sr8VarC.a;
        synchronized (j56Var.k) {
            zContains = j56Var.i.contains(str);
        }
        return !zContains;
    }
}
