package com.lonelycatgames.Xplore.ui;

import defpackage.aw0;
import defpackage.ax0;
import defpackage.b52;
import defpackage.d44;
import defpackage.dyc;
import defpackage.gw0;
import defpackage.ha;
import defpackage.hk;
import defpackage.hx5;
import defpackage.j72;
import defpackage.jt5;
import defpackage.kc6;
import defpackage.kz8;
import defpackage.ng4;
import defpackage.nu3;
import defpackage.o24;
import defpackage.t24;
import defpackage.tq4;
import defpackage.tx2;
import defpackage.uc4;
import defpackage.vc0;
import defpackage.vs0;
import defpackage.w15;
import defpackage.ws0;
import defpackage.xo4;
import defpackage.xr0;
import defpackage.y2b;
import defpackage.zv0;
import defpackage.zz2;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class LauncherShortcut extends vc0 {
    public static final /* synthetic */ int Y0 = 0;

    @Override // defpackage.vc0
    public final void B0() {
        Object objC0 = C0();
        if (objC0 != null) {
            t24 t24Var = t24.g;
            o24 o24Var = new o24(this, 0, this);
            t24Var.getClass();
            t24.F(this, (ng4) objC0, o24Var);
        }
    }

    public final xo4 C0() {
        jt5 jt5VarG = b0().g();
        int size = jt5VarG.l.size();
        if (size == 0) {
            return jt5VarG.y;
        }
        if (size != 1) {
            return null;
        }
        return (xo4) xr0.y(jt5VarG.l);
    }

    @Override // com.lonelycatgames.Xplore.Browser
    public final void O(w15 w15Var, zz2 zz2Var, int i) {
        int i2;
        w15Var.getClass();
        zz2Var.Y(-336375665);
        if ((i & 6) == 0) {
            i2 = (zz2Var.f(w15Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? zz2Var.f(this) : zz2Var.h(this) ? 32 : 16;
        }
        boolean z = false;
        if (zz2Var.O(i2 & 1, (i2 & 19) != 18)) {
            ws0 ws0VarA = vs0.a(b52.c, j72.Q, zz2Var, 0);
            int iHashCode = Long.hashCode(zz2Var.T);
            hx5 hx5VarL = zz2Var.l();
            w15 w15VarH = dyc.h(zz2Var, w15Var);
            aw0.j.getClass();
            ax0 ax0Var = zv0.b;
            zz2Var.a0();
            if (zz2Var.S) {
                zz2Var.k(ax0Var);
            } else {
                zz2Var.j0();
            }
            tq4.g(zv0.f, zz2Var, ws0VarA);
            tq4.g(zv0.e, zz2Var, hx5VarL);
            tq4.g(zv0.g, zz2Var, Integer.valueOf(iHashCode));
            tq4.f(zz2Var, zv0.h);
            tq4.g(zv0.d, zz2Var, w15VarH);
            int i3 = i2 & 112;
            super.O(uc4.a.e(new d44(1.0f, true)), zz2Var, 64 | i3);
            boolean zBooleanValue = ((Boolean) this.X0.getValue()).booleanValue();
            if (i3 == 32 || ((i2 & 64) != 0 && zz2Var.h(this))) {
                z = true;
            }
            Object objL = zz2Var.L();
            if (z || objL == gw0.a) {
                objL = new ha(0, this, LauncherShortcut.class, "onButtonClick", "onButtonClick()V", 0, 26);
                zz2Var.g0(objL);
            }
            nu3 nu3Var = (nu3) objL;
            if (w().b) {
                nu3Var = null;
            }
            y2b.a(zBooleanValue, (tx2) nu3Var, kz8.a, zz2Var, 384);
            zz2Var.p(true);
        } else {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new hk(this, w15Var, i, 15);
        }
    }

    @Override // com.lonelycatgames.Xplore.Browser
    public final void q0(boolean z) {
        super.q0(z);
        this.X0.setValue(Boolean.valueOf(C0() != null));
    }
}
