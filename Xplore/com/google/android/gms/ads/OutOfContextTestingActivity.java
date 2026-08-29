package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.android.billingclient.api.YN.mcrmCulfyzf;
import com.lonelycatgames.Xplore.R;
import defpackage.a6a;
import defpackage.ao9;
import defpackage.d49;
import defpackage.gxa;
import defpackage.hm9;
import defpackage.rg5;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hm9 hm9Var = ao9.g.b;
        a6a a6aVar = new a6a();
        hm9Var.getClass();
        gxa gxaVar = (gxa) new d49(hm9Var, this, a6aVar).d(this, false);
        if (gxaVar == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra(mcrmCulfyzf.ysHFHDqOQX);
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            gxaVar.g2(stringExtra, new rg5(this), new rg5(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
