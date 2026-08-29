package com.lonelycatgames.Xplore.sync;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lonelycatgames.Xplore.App;
import defpackage.a63;
import defpackage.b81;
import defpackage.d81;
import defpackage.jb1;
import defpackage.kab;
import defpackage.kj1;
import defpackage.mp7;
import defpackage.n1c;
import defpackage.oh4;
import defpackage.ph4;
import defpackage.t01;
import defpackage.um4;
import defpackage.un2;
import defpackage.xr0;
import defpackage.y02;
import defpackage.yo1;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/lonelycatgames/Xplore/sync/SyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "ctx", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SyncWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d81 d81Var) {
        mp7 mp7Var;
        if (d81Var instanceof mp7) {
            mp7Var = (mp7) d81Var;
            int i = mp7Var.I;
            if ((i & Integer.MIN_VALUE) != 0) {
                mp7Var.I = i - Integer.MIN_VALUE;
            } else {
                mp7Var = new mp7(this, d81Var);
            }
        }
        Object objG = mp7Var.d;
        int i2 = mp7Var.I;
        if (i2 == 0) {
            n1c.j(objG);
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            App app = (App) applicationContext;
            List<Uri> triggeredContentUris = getTriggeredContentUris();
            triggeredContentUris.getClass();
            if (!triggeredContentUris.isEmpty()) {
                Handler handler = App.M0;
                List<Uri> triggeredContentUris2 = getTriggeredContentUris();
                triggeredContentUris2.getClass();
                Log.i("X-plore", "SyncWorker uri ".concat(xr0.F(triggeredContentUris2, null, null, null, null, 63)));
                return new oh4();
            }
            kj1 inputData = getInputData();
            inputData.getClass();
            Object obj = inputData.a.get("id");
            long jLongValue = ((Number) (obj instanceof Long ? obj : -1L)).longValue();
            yo1 yo1Var = y02.a;
            a63 a63Var = um4.a;
            t01 t01Var = new t01(app, jLongValue, this, (b81) null);
            mp7Var.I = 1;
            objG = kab.g(a63Var, t01Var, mp7Var);
            jb1 jb1Var = jb1.a;
            if (objG == jb1Var) {
                return jb1Var;
            }
        } else {
            if (i2 != 1) {
                un2.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n1c.j(objG);
        }
        ph4 ph4Var = (ph4) objG;
        Handler handler2 = App.M0;
        Log.i("X-plore", "Sync completed");
        return ph4Var;
    }
}
