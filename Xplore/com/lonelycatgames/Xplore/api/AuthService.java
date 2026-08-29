package com.lonelycatgames.Xplore.api;

import android.content.Intent;
import android.os.IBinder;
import defpackage.hm3;
import defpackage.ue4;
import defpackage.x2d;
import defpackage.z5;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class AuthService extends ue4 {
    public z5 b;

    @Override // defpackage.ue4, android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        super.onBind(intent);
        z5 z5Var = this.b;
        if (z5Var != null) {
            return z5Var.getIBinder();
        }
        hm3.l("auth");
        throw null;
    }

    @Override // defpackage.ue4, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = new z5(this, x2d.e(this));
    }
}
