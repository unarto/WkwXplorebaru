package com.lonelycatgames.Xplore.ops.copy;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.Browser;
import com.lonelycatgames.Xplore.R;
import defpackage.bf5;
import defpackage.hm3;
import defpackage.jp7;
import defpackage.q31;
import defpackage.t81;
import defpackage.th;
import defpackage.ue5;
import defpackage.un2;
import defpackage.ve6;
import defpackage.x94;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class CopyMoveService extends jp7 {
    public static final /* synthetic */ int e = 0;
    public ue5 c;
    public x94 d;

    @Override // defpackage.jp7, android.app.Service
    public final void onCreate() {
        super.onCreate();
        ue5 ue5Var = new ue5(a(), "copy");
        ue5Var.f(2, true);
        ue5Var.l = false;
        ue5Var.m = true;
        ue5Var.i(1000, 0, false);
        PendingIntent pendingIntentC = th.c(a(), ve6.a.b(Browser.class), new q31(13), 2);
        ue5Var.g = pendingIntentC;
        ue5Var.a(0, a().getText(R.string.show), pendingIntentC);
        PendingIntent pendingIntentB = b();
        ue5Var.a(R.drawable.ic_close, a().getText(R.string.cancel), pendingIntentB);
        Notification notification = ue5Var.B;
        notification.deleteIntent = pendingIntentB;
        notification.icon = R.drawable.op_copy_notify;
        this.c = ue5Var;
        if (a().Q != null) {
            un2.j("Multiple copying tasks");
        } else {
            t81 t81Var = a().R;
            this.d = t81Var != null ? t81Var.e : null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        bf5 bf5Var = this.b;
        if (bf5Var == null) {
            hm3.l("nm");
            throw null;
        }
        bf5Var.a(1);
        if (hm3.b(a().Q, this)) {
            a().Q = null;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("moving", false);
            ue5 ue5Var = this.c;
            if (ue5Var == null) {
                hm3.l("notifyBuild");
                throw null;
            }
            ue5Var.B.icon = booleanExtra ? R.drawable.op_move : R.drawable.op_copy;
            ue5Var.e(getText(booleanExtra ? R.string.moving_ : R.string.copying_));
            String action = intent.getAction();
            if (action == null) {
                a().Q = this;
                App appA = a();
                ue5 ue5Var2 = this.c;
                if (ue5Var2 != null) {
                    appA.Z(1, ue5Var2);
                    return 1;
                }
                hm3.l("notifyBuild");
                throw null;
            }
            if (action.hashCode() == -1367724422 && action.equals("cancel")) {
                Handler handler = App.M0;
                Log.i("X-plore", "Cancel copying");
                t81 t81Var = a().R;
                if (t81Var != null) {
                    t81Var.d();
                    return 1;
                }
            }
        }
        return 1;
    }
}
