package androidx.work;

import android.content.Context;
import defpackage.b20;
import defpackage.di3;
import defpackage.hm9;
import defpackage.icd;
import defpackage.wr8;
import defpackage.yr8;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements di3 {
    public static final String a = b20.o("WrkMgrInitializer");

    @Override // defpackage.di3
    public final Object create(Context context) {
        b20.h().b(a, "Initializing WorkManager with default configuration.");
        hm9 hm9Var = new hm9(new icd(22));
        context.getClass();
        synchronized (wr8.m) {
            try {
                wr8 wr8Var = wr8.k;
                if (wr8Var != null && wr8.l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (wr8Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    wr8 wr8VarC = wr8.l;
                    if (wr8VarC == null) {
                        wr8VarC = yr8.c(applicationContext, hm9Var);
                        wr8.l = wr8VarC;
                    }
                    wr8.k = wr8VarC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wr8.c(context);
    }

    @Override // defpackage.di3
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
