package com.lonelycatgames.Xplore.api;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.lonelycatgames.Xplore.App;
import defpackage.aw0;
import defpackage.ax0;
import defpackage.b52;
import defpackage.ba;
import defpackage.c30;
import defpackage.dyc;
import defpackage.e2d;
import defpackage.f2c;
import defpackage.f30;
import defpackage.gw0;
import defpackage.ha;
import defpackage.hk;
import defpackage.hx5;
import defpackage.j1d;
import defpackage.j30;
import defpackage.j72;
import defpackage.jxc;
import defpackage.kc6;
import defpackage.kk4;
import defpackage.lk4;
import defpackage.mk4;
import defpackage.nu3;
import defpackage.pf;
import defpackage.q8;
import defpackage.qp9;
import defpackage.qq5;
import defpackage.qsb;
import defpackage.s8;
import defpackage.sk4;
import defpackage.su5;
import defpackage.tq4;
import defpackage.tx2;
import defpackage.uc4;
import defpackage.un2;
import defpackage.vk4;
import defpackage.vs0;
import defpackage.vu5;
import defpackage.w15;
import defpackage.ws0;
import defpackage.wx2;
import defpackage.yu0;
import defpackage.yzc;
import defpackage.zv0;
import defpackage.zz2;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class LoginActivity extends j30 {
    public static Long k0;
    public boolean e0;
    public AccountManager f0;
    public final s8 h0;
    public final s8 i0;
    public final qsb d0 = new qsb(10);
    public final vu5 g0 = yzc.c(null);
    public final su5 j0 = new su5(0);

    public LoginActivity() {
        int i = 2;
        this.h0 = o(new ba(13, this), new q8(i));
        this.i0 = o(new un2(27), new q8(i));
    }

    public final void N(int i, zz2 zz2Var) {
        int i2;
        zz2Var.Y(281364314);
        if ((i & 6) == 0) {
            i2 = (zz2Var.h(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (zz2Var.O(i2 & 1, (i2 & 3) != 2)) {
            j1d.a(uc4.b, null, 0L, 0L, 0.0f, null, null, jxc.g(-1451300938, new pf(27, this), zz2Var), zz2Var, 12582912, 126);
        } else {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new f30(this, i, 10);
        }
    }

    public final lk4 O() {
        return (lk4) this.g0.getValue();
    }

    public final void P(lk4 lk4Var) {
        this.g0.setValue(lk4Var);
    }

    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j30.z(this);
        Handler handler = App.M0;
        this.e0 = qp9.e(w());
        C();
        AccountManager accountManager = AccountManager.get(this);
        accountManager.getClass();
        this.f0 = accountManager;
        Intent intent = getIntent();
        intent.getClass();
        int i = Build.VERSION.SDK_INT;
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) (i >= 33 ? (Parcelable) intent.getParcelableExtra("accountAuthenticatorResponse", AccountAuthenticatorResponse.class) : (AccountAuthenticatorResponse) intent.getParcelableExtra("accountAuthenticatorResponse"));
        String action = getIntent().getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1173683121) {
                if (iHashCode == -610513958 && action.equals("com.lonelycatgames.LOGIN")) {
                    Intent intent2 = getIntent();
                    intent2.getClass();
                    Account account = (Account) (i >= 33 ? (Parcelable) intent2.getParcelableExtra("account", Account.class) : (Account) intent2.getParcelableExtra("account"));
                    if (account != null && accountAuthenticatorResponse != null) {
                        P(new mk4(this, account, accountAuthenticatorResponse));
                    }
                    if (O() == null) {
                        finish();
                        return;
                    }
                }
            } else if (action.equals("android.intent.action.EDIT")) {
                Intent intent3 = getIntent();
                intent3.getClass();
                Account account2 = (Account) (i >= 33 ? (Parcelable) intent3.getParcelableExtra("account", Account.class) : (Account) intent3.getParcelableExtra("account"));
                if (account2 != null) {
                    P(new sk4(this, account2));
                }
            }
        }
        if (O() == null) {
            P(new vk4(this, accountAuthenticatorResponse));
        }
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        lk4 lk4VarO = O();
        mk4 mk4Var = lk4VarO instanceof mk4 ? (mk4) lk4VarO : null;
        if (mk4Var == null || mk4Var.J) {
            return;
        }
        mk4Var.e.onError(4, "Canceled");
    }

    @Override // defpackage.j30
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        int i2;
        int i3;
        zz2 zz2Var2 = zz2Var;
        zz2Var2.Y(-903604613);
        if ((i & 6) == 0) {
            i2 = i | (zz2Var2.f(qq5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zz2Var2.h(this) ? 32 : 16;
        }
        int i4 = i2;
        int i5 = 1;
        if (zz2Var2.O(i4 & 1, (i4 & 19) != 18)) {
            w15 w15VarI = f2c.i(uc4.b, qq5Var);
            ws0 ws0VarA = vs0.a(b52.c, j72.Q, zz2Var2, 0);
            int iHashCode = Long.hashCode(zz2Var2.T);
            hx5 hx5VarL = zz2Var2.l();
            w15 w15VarH = dyc.h(zz2Var2, w15VarI);
            aw0.j.getClass();
            ax0 ax0Var = zv0.b;
            zz2Var2.a0();
            if (zz2Var2.S) {
                zz2Var2.k(ax0Var);
            } else {
                zz2Var2.j0();
            }
            tq4.g(zv0.f, zz2Var2, ws0VarA);
            tq4.g(zv0.e, zz2Var2, hx5VarL);
            tq4.g(zv0.g, zz2Var2, Integer.valueOf(iHashCode));
            tq4.f(zz2Var2, zv0.h);
            tq4.g(zv0.d, zz2Var2, w15VarH);
            lk4 lk4VarO = O();
            Integer numValueOf = lk4VarO != null ? Integer.valueOf(lk4VarO.c()) : null;
            boolean zH = zz2Var2.h(this);
            Object objL = zz2Var2.L();
            j72 j72Var = gw0.a;
            if (zH || objL == j72Var) {
                ha haVar = new ha(0, this, LoginActivity.class, "finish", "finish()V", 0, 29);
                zz2Var2.g0(haVar);
                objL = haVar;
            }
            tx2 tx2Var = (tx2) ((nu3) objL);
            yu0 yu0VarG = jxc.g(-1609862216, new c30(10, this), zz2Var2);
            boolean zH2 = zz2Var2.h(this);
            Object objL2 = zz2Var2.L();
            if (zH2 || objL2 == j72Var) {
                objL2 = new kk4(this, i5);
                zz2Var2.g0(objL2);
            }
            i3 = i;
            e2d.a(numValueOf, null, 0L, tx2Var, yu0VarG, null, false, (wx2) objL2, zz2Var, 24576, 102);
            zz2Var2 = zz2Var;
            N((i4 >> 3) & 14, zz2Var2);
            zz2Var2.p(true);
        } else {
            i3 = i;
            zz2Var2.R();
        }
        kc6 kc6VarR = zz2Var2.r();
        if (kc6VarR != null) {
            kc6VarR.d = new hk(this, qq5Var, i3, 20);
        }
    }

    @Override // defpackage.j30
    public final qsb y() {
        return this.d0;
    }
}
