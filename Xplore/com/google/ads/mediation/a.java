package com.google.ads.mediation;

import android.os.RemoteException;
import defpackage.ada;
import defpackage.d1b;
import defpackage.fx4;
import defpackage.gi4;
import defpackage.i5a;
import defpackage.j39;
import defpackage.k6a;
import defpackage.q7a;
import defpackage.t4a;
import defpackage.ul3;
import defpackage.vl3;
import defpackage.wq9;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class a extends vl3 {
    public final AbstractAdViewAdapter g;
    public final fx4 h;

    public a(AbstractAdViewAdapter abstractAdViewAdapter, fx4 fx4Var) {
        this.g = abstractAdViewAdapter;
        this.h = fx4Var;
    }

    @Override // defpackage.b52
    public final void e(gi4 gi4Var) {
        ((ada) this.h).o(gi4Var);
    }

    @Override // defpackage.b52
    public final void f(Object obj) {
        ul3 ul3Var = (ul3) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.g;
        abstractAdViewAdapter.mInterstitialAd = ul3Var;
        fx4 fx4Var = this.h;
        j39 j39Var = new j39(abstractAdViewAdapter, 10, fx4Var);
        t4a t4aVar = (t4a) ul3Var;
        t4aVar.getClass();
        try {
            i5a i5aVar = t4aVar.b;
            if (i5aVar != null) {
                i5aVar.q3(new wq9(j39Var));
            }
        } catch (RemoteException e) {
            d1b.l("#007 Could not call remote method.", e);
        }
        ada adaVar = (ada) fx4Var;
        adaVar.getClass();
        q7a.e("#008 Must be called on the main UI thread.");
        d1b.d("Adapter called onAdLoaded.");
        try {
            ((k6a) adaVar.b).f();
        } catch (RemoteException e2) {
            d1b.l("#007 Could not call remote method.", e2);
        }
    }
}
