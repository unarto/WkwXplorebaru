package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import defpackage.a6a;
import defpackage.ao9;
import defpackage.d1b;
import defpackage.hm9;
import defpackage.m8a;
import defpackage.v99;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            hm9 hm9Var = ao9.g.b;
            a6a a6aVar = new a6a();
            hm9Var.getClass();
            ((m8a) new v99(hm9Var, this, a6aVar).d(this, false)).q0(intent);
        } catch (RemoteException e) {
            d1b.f("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
