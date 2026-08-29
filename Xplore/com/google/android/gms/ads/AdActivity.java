package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.wsN.bEPuzF;
import com.lonelycatgames.Xplore.ops.copy.Ww.EQvrnCmT;
import defpackage.ao9;
import defpackage.d1b;
import defpackage.hm9;
import defpackage.m19;
import defpackage.rg5;
import defpackage.s8a;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class AdActivity extends Activity {
    public s8a a;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                s8aVar.N4(i, i2, intent);
            }
        } catch (Exception e) {
            d1b.l("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                if (!s8aVar.b()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            s8a s8aVar2 = this.a;
            if (s8aVar2 != null) {
                s8aVar2.j();
            }
        } catch (RemoteException e2) {
            d1b.l("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                s8aVar.s0(new rg5(configuration));
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d1b.d("AdActivity onCreate");
        hm9 hm9Var = ao9.g.b;
        hm9Var.getClass();
        m19 m19Var = new m19(hm9Var, this);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            d1b.f("useClientJar flag not found in activity intent extras.");
        }
        s8a s8aVar = (s8a) m19Var.d(this, booleanExtra);
        this.a = s8aVar;
        if (s8aVar == null) {
            d1b.l("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            s8aVar.M0(bundle);
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        d1b.d("AdActivity onDestroy");
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                s8aVar.g0();
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                s8aVar.T1(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        d1b.d("AdActivity onRestart");
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                s8aVar.d();
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        d1b.d("AdActivity onResume");
        super.onResume();
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                s8aVar.f();
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                s8aVar.k2(bundle);
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStop() {
        d1b.d("AdActivity onStop");
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                s8aVar.E();
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                s8aVar.a();
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        s8a s8aVar = this.a;
        if (s8aVar != null) {
            try {
                s8aVar.T0();
            } catch (RemoteException e) {
                d1b.l("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        d1b.d(bEPuzF.tNQ);
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                s8aVar.h();
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        d1b.d(EQvrnCmT.acQJJ);
        try {
            s8a s8aVar = this.a;
            if (s8aVar != null) {
                s8aVar.i();
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        s8a s8aVar = this.a;
        if (s8aVar != null) {
            try {
                s8aVar.T0();
            } catch (RemoteException e) {
                d1b.l("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        s8a s8aVar = this.a;
        if (s8aVar != null) {
            try {
                s8aVar.T0();
            } catch (RemoteException e) {
                d1b.l("#007 Could not call remote method.", e);
            }
        }
    }
}
