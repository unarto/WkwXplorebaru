package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.d56;
import defpackage.di3;
import defpackage.e56;
import defpackage.ee4;
import defpackage.ie4;
import defpackage.je4;
import defpackage.mu;
import defpackage.un2;
import defpackage.y82;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Ldi3;", "Lne4;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements di3 {
    @Override // defpackage.di3
    public final Object create(Context context) {
        context.getClass();
        mu muVarU = mu.u(context);
        muVarU.getClass();
        if (!((HashSet) muVarU.c).contains(ProcessLifecycleInitializer.class)) {
            un2.j("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!je4.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new ie4());
        }
        e56 e56Var = e56.L;
        e56Var.getClass();
        e56Var.e = new Handler();
        e56Var.I.d(ee4.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new d56(e56Var));
        return e56Var;
    }

    @Override // defpackage.di3
    public final List dependencies() {
        return y82.a;
    }
}
