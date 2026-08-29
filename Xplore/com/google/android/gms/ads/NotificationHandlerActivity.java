package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.a6a;
import defpackage.ao9;
import defpackage.d1b;
import defpackage.hm9;
import defpackage.m8a;
import defpackage.v99;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            hm9 hm9Var = ao9.g.b;
            a6a a6aVar = new a6a();
            hm9Var.getClass();
            m8a m8aVar = (m8a) new v99(hm9Var, this, a6aVar).d(this, false);
            if (m8aVar == null) {
                d1b.f("OfflineUtils is null");
            } else {
                m8aVar.q0(getIntent());
            }
        } catch (RemoteException e) {
            d1b.f("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
