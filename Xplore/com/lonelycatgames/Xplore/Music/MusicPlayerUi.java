package com.lonelycatgames.Xplore.Music;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.firebase.datatransport.htJQ.gilqCEUaaDMi;
import com.google.maps.android.compose.utils.attribution.njD.VUd.OwOi;
import com.lonelycatgames.Xplore.App;
import defpackage.a87;
import defpackage.aw0;
import defpackage.ax0;
import defpackage.b52;
import defpackage.b75;
import defpackage.dyc;
import defpackage.e2d;
import defpackage.f2c;
import defpackage.f75;
import defpackage.ff;
import defpackage.fwc;
import defpackage.fz1;
import defpackage.gw0;
import defpackage.h75;
import defpackage.hi;
import defpackage.hk;
import defpackage.hm3;
import defpackage.hx5;
import defpackage.il1;
import defpackage.iy2;
import defpackage.j30;
import defpackage.j72;
import defpackage.j85;
import defpackage.jb4;
import defpackage.jxc;
import defpackage.k75;
import defpackage.kc6;
import defpackage.l75;
import defpackage.m75;
import defpackage.mr;
import defpackage.n75;
import defpackage.pg7;
import defpackage.q50;
import defpackage.qq5;
import defpackage.qsb;
import defpackage.r84;
import defpackage.rg4;
import defpackage.rl6;
import defpackage.s75;
import defpackage.s84;
import defpackage.se8;
import defpackage.sp1;
import defpackage.su5;
import defpackage.t15;
import defpackage.t75;
import defpackage.th;
import defpackage.tl6;
import defpackage.tq4;
import defpackage.tv0;
import defpackage.tx2;
import defpackage.uc4;
import defpackage.ul6;
import defpackage.vc7;
import defpackage.vs0;
import defpackage.vu5;
import defpackage.w15;
import defpackage.ws0;
import defpackage.wx2;
import defpackage.xs0;
import defpackage.yc;
import defpackage.yu0;
import defpackage.yzc;
import defpackage.zv0;
import defpackage.zz2;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class MusicPlayerUi extends j30 {
    public static final List L0 = fwc.h(50, 75, 100, 125, 150, 175, 200);
    public final vu5 A0;
    public final s75 B0;
    public final t75 C0;
    public rg4 D0;
    public h75 E0;
    public final vc7 F0;
    public final su5 G0;
    public final su5 H0;
    public final LinkedHashSet I0;
    public pg7 J0;
    public pg7 K0;
    public Bitmap d0;
    public boolean f0;
    public final vu5 k0;
    public final su5 l0;
    public final su5 m0;
    public final vu5 n0;
    public final vu5 o0;
    public final vu5 p0;
    public final vu5 q0;
    public final vu5 r0;
    public final vu5 s0;
    public final vu5 t0;
    public final vu5 u0;
    public final vu5 v0;
    public final vu5 w0;
    public Bitmap x0;
    public jb4 y0;
    public final qsb z0;
    public final vu5 e0 = yzc.c(null);
    public final vu5 g0 = yzc.c("");
    public final vu5 h0 = yzc.c("");
    public final vu5 i0 = yzc.c("");
    public final su5 j0 = new su5(0);

    public MusicPlayerUi() {
        Boolean bool = Boolean.FALSE;
        this.k0 = yzc.c(bool);
        this.l0 = new su5(0);
        this.m0 = new su5(0);
        this.n0 = yzc.c("");
        this.o0 = yzc.c("");
        this.p0 = yzc.c("");
        this.q0 = yzc.c(bool);
        this.r0 = yzc.c("");
        this.s0 = yzc.c(bool);
        this.t0 = yzc.c(bool);
        Boolean bool2 = Boolean.TRUE;
        this.u0 = yzc.c(bool2);
        this.v0 = yzc.c(bool2);
        this.w0 = yzc.c(bool);
        this.z0 = new qsb(10);
        this.A0 = yzc.c(bool);
        this.B0 = new s75(this);
        this.C0 = new t75(this);
        this.F0 = new vc7();
        this.G0 = new su5(0);
        this.H0 = new su5(0);
        this.I0 = new LinkedHashSet();
    }

    public static final void Q(MusicPlayerUi musicPlayerUi, su5 su5Var) {
        h75 h75Var = musicPlayerUi.E0;
        if (h75Var != null) {
            h75Var.y(su5Var.h() * 60000);
        }
        musicPlayerUi.w().l().t(su5Var.h(), "music_sleep_timer");
        musicPlayerUi.U();
    }

    @Override // defpackage.j30
    public final boolean A() {
        return true;
    }

    public final void N(w15 w15Var, zz2 zz2Var, int i) {
        int i2;
        zz2Var.Y(1816161308);
        int i3 = 2;
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (zz2Var.f(w15Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zz2Var.h(this) ? 32 : 16;
        }
        int i5 = 1;
        if (zz2Var.O(i2 & 1, (i2 & 19) != 18)) {
            int i6 = i2;
            rg4 rg4Var = this.D0;
            if (rg4Var == null) {
                hm3.l("cp");
                throw null;
            }
            ff ffVar = (ff) this.e0.getValue();
            int iH = this.G0.h();
            int iH2 = this.H0.h();
            boolean zH = zz2Var.h(this);
            Object objL = zz2Var.L();
            j72 j72Var = gw0.a;
            if (zH || objL == j72Var) {
                objL = new m75(this, i4);
                zz2Var.g0(objL);
            }
            wx2 wx2Var = (wx2) objL;
            boolean zH2 = zz2Var.h(this);
            Object objL2 = zz2Var.L();
            if (zH2 || objL2 == j72Var) {
                objL2 = new m75(this, 5);
                zz2Var.g0(objL2);
            }
            wx2 wx2Var2 = (wx2) objL2;
            boolean zH3 = zz2Var.h(this);
            Object objL3 = zz2Var.L();
            if (zH3 || objL3 == j72Var) {
                objL3 = new n75(this, i5);
                zz2Var.g0(objL3);
            }
            iy2 iy2Var = (iy2) objL3;
            boolean zH4 = zz2Var.h(this);
            Object objL4 = zz2Var.L();
            if (zH4 || objL4 == j72Var) {
                objL4 = new k75(this, 10);
                zz2Var.g0(objL4);
            }
            j85.c(w15Var, rg4Var, this.F0, ffVar, iH, iH2, wx2Var, wx2Var2, iy2Var, (tx2) objL4, zz2Var, (i6 & 14) | (rg4.d << 3));
        } else {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new l75(this, w15Var, i, i3);
        }
    }

    public final void O(w15 w15Var, zz2 zz2Var, int i) {
        int i2;
        int i3;
        zz2Var.Y(-604900063);
        if ((i & 6) == 0) {
            i2 = i | (zz2Var.f(w15Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zz2Var.h(this) ? 32 : 16;
        }
        if (zz2Var.O(i2 & 1, (i2 & 19) != 18)) {
            int iH = this.l0.h();
            int iH2 = this.m0.h();
            String str = (String) this.n0.getValue();
            String str2 = (String) this.o0.getValue();
            String str3 = (String) this.p0.getValue();
            boolean zBooleanValue = ((Boolean) this.q0.getValue()).booleanValue();
            String str4 = (String) this.r0.getValue();
            boolean zBooleanValue2 = ((Boolean) this.s0.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) this.t0.getValue()).booleanValue();
            boolean zBooleanValue4 = ((Boolean) this.u0.getValue()).booleanValue();
            boolean zBooleanValue5 = ((Boolean) this.v0.getValue()).booleanValue();
            boolean zBooleanValue6 = ((Boolean) this.w0.getValue()).booleanValue();
            boolean zH = zz2Var.h(this);
            int i4 = i2;
            Object objL = zz2Var.L();
            j72 j72Var = gw0.a;
            if (zH || objL == j72Var) {
                i3 = iH;
                objL = new k75(this, 3);
                zz2Var.g0(objL);
            } else {
                i3 = iH;
            }
            tx2 tx2Var = (tx2) objL;
            boolean zH2 = zz2Var.h(this);
            Object objL2 = zz2Var.L();
            if (zH2 || objL2 == j72Var) {
                objL2 = new m75(this, 0);
                zz2Var.g0(objL2);
            }
            wx2 wx2Var = (wx2) objL2;
            boolean zH3 = zz2Var.h(this);
            Object objL3 = zz2Var.L();
            if (zH3 || objL3 == j72Var) {
                objL3 = new k75(this, 4);
                zz2Var.g0(objL3);
            }
            tx2 tx2Var2 = (tx2) objL3;
            boolean zH4 = zz2Var.h(this);
            Object objL4 = zz2Var.L();
            if (zH4 || objL4 == j72Var) {
                objL4 = new k75(this, 5);
                zz2Var.g0(objL4);
            }
            tx2 tx2Var3 = (tx2) objL4;
            boolean zH5 = zz2Var.h(this);
            Object objL5 = zz2Var.L();
            int i5 = 6;
            if (zH5 || objL5 == j72Var) {
                objL5 = new k75(this, i5);
                zz2Var.g0(objL5);
            }
            tx2 tx2Var4 = (tx2) objL5;
            boolean zH6 = zz2Var.h(this);
            Object objL6 = zz2Var.L();
            if (zH6 || objL6 == j72Var) {
                objL6 = new k75(this, 7);
                zz2Var.g0(objL6);
            }
            j85.f(i3, iH2, str, str2, str3, zBooleanValue, str4, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, w15Var, tx2Var, wx2Var, tx2Var2, tx2Var3, tx2Var4, (tx2) objL6, zz2Var, 0, (i4 << 6) & 896);
        } else {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new l75(this, w15Var, i, 1);
        }
    }

    public final void P(w15 w15Var, zz2 zz2Var, int i) {
        int i2;
        w15 w15Var2;
        zz2 zz2Var2;
        zz2Var.Y(-301612775);
        if ((i & 6) == 0) {
            i2 = (zz2Var.f(w15Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zz2Var.h(this) ? 32 : 16;
        }
        int i3 = 0;
        if (zz2Var.O(i2 & 1, (i2 & 19) != 18)) {
            String str = (String) this.g0.getValue();
            String str2 = (String) this.h0.getValue();
            String str3 = (String) this.i0.getValue();
            int iH = ((Boolean) this.k0.getValue()).booleanValue() ? this.j0.h() : -1;
            boolean zH = zz2Var.h(this);
            Object objL = zz2Var.L();
            if (zH || objL == gw0.a) {
                objL = new m75(this, 6);
                zz2Var.g0(objL);
            }
            w15Var2 = w15Var;
            zz2Var2 = zz2Var;
            j85.h(str, str2, str3, iH, w15Var2, (wx2) objL, zz2Var2, (i2 << 12) & 57344);
        } else {
            w15Var2 = w15Var;
            zz2Var2 = zz2Var;
            zz2Var2.R();
        }
        kc6 kc6VarR = zz2Var2.r();
        if (kc6VarR != null) {
            kc6VarR.d = new l75(this, w15Var2, i, i3);
        }
    }

    public final void R() {
        h75 h75Var = this.E0;
        if (h75Var != null && (!this.f0 || !h75Var.j())) {
            w().o0();
        }
        pg7 pg7Var = this.J0;
        if (pg7Var != null) {
            pg7Var.d(null);
        }
        this.J0 = null;
        finish();
    }

    public final void S() {
        h75 h75Var = this.E0;
        if (h75Var != null) {
            this.u0.setValue(Boolean.valueOf(h75Var.i()));
            this.v0.setValue(Boolean.valueOf(h75Var.h()));
        }
    }

    public final void T() {
        h75 h75Var = this.E0;
        if (h75Var == null || h75Var.k()) {
            return;
        }
        b75 b75Var = h75Var.j;
        int duration = (b75Var == null || b75Var.J.e) ? -1 : b75Var.c.getDuration();
        if (duration != -1) {
            this.m0.i(duration);
            this.o0.setValue(se8.r(duration));
        }
    }

    public final void U() {
        h75 h75Var = this.E0;
        int i = h75Var != null ? h75Var.t : 0;
        this.r0.setValue(i > 0 ? se8.r(i) : "");
    }

    @Override // defpackage.mu0, android.app.Activity
    public final void onBackPressed() {
        R();
        il1 il1VarL = w().l();
        String[] strArr = il1.d;
        if (il1VarL.h("music_stop_on_back", false)) {
            this.f0 = false;
            w().o0();
        }
        super.onBackPressed();
    }

    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InvocationTargetException {
        OwOi.VbhsnHAF.invoke(null, this, bundle);
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        gilqCEUaaDMi.VCUZcw.invoke(null, this);
    }

    @Override // defpackage.j30, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        h75 h75Var;
        keyEvent.getClass();
        if ((i != 44 && i != 85) || (h75Var = this.E0) == null) {
            return super.onKeyDown(i, keyEvent);
        }
        if (h75Var.j()) {
            h75Var.q();
            return true;
        }
        h75Var.u();
        return true;
    }

    @Override // defpackage.j30, defpackage.mu0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        int iHashCode;
        intent.getClass();
        boolean zHasExtra = intent.hasExtra("connect_to_player");
        h75 h75Var = this.E0;
        t75 t75Var = this.C0;
        if (!zHasExtra) {
            if (h75Var != null) {
                t75Var.getClass();
                h75Var.d.remove(t75Var);
            }
            Uri data = intent.getData();
            if (data != null) {
                h75 h75Var2 = w().A0;
                this.E0 = h75Var2;
                f75 f75Var = h75Var2 instanceof f75 ? (f75) h75Var2 : null;
                if (f75Var != null && !hm3.b(f75Var.w, data)) {
                    this.E0 = null;
                }
                if (this.E0 == null) {
                    App appW = w();
                    appW.o0();
                    String strZ = appW.z(se8.f(th.l(data)));
                    h75 f75Var2 = (strZ == null || ((iHashCode = strZ.hashCode()) == -1165508903 ? !strZ.equals("audio/x-scpls") : iHashCode == -432766831 ? !strZ.equals("audio/mpegurl") : !(iHashCode == 264230524 && strZ.equals("audio/x-mpegurl")))) ? new f75(appW, data) : new fz1(appW, data, strZ);
                    appW.i0(f75Var2);
                    this.E0 = f75Var2;
                    w().K();
                }
                this.f0 = true;
            }
        } else {
            if (hm3.b(h75Var, w().A0)) {
                return;
            }
            h75 h75Var3 = this.E0;
            if (h75Var3 != null) {
                t75Var.getClass();
                h75Var3.d.remove(t75Var);
            }
            this.E0 = w().A0;
            this.f0 = true;
        }
        h75 h75Var4 = this.E0;
        if (h75Var4 == null) {
            finish();
            return;
        }
        if (h75Var4.j()) {
            t75Var.b();
        } else {
            t75Var.g();
        }
        S();
        this.m0.i(0);
        T();
        boolean zG = h75Var4.g();
        this.w0.setValue(Boolean.valueOf(zG));
        this.k0.setValue(Boolean.valueOf(zG));
        this.q0.setValue(Boolean.FALSE);
        h75Var4.a(t75Var);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onStart() {
        h75 h75Var;
        super.onStart();
        if (this.E0 == null) {
            w().o0();
            finish();
        } else if (w().C0 == null && hm3.b(w().A0, this.E0)) {
            w().K();
        } else {
            if (this.f0 || (h75Var = this.E0) == null) {
                return;
            }
            h75Var.u();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jv2, android.app.Activity
    public final void onStop() {
        h75 h75Var;
        boolean zIsTerminated;
        super.onStop();
        jb4 jb4Var = this.y0;
        if (jb4Var != 0) {
            if (jb4Var instanceof AutoCloseable) {
                jb4Var.d();
            } else {
                if (!(jb4Var instanceof ExecutorService)) {
                    sp1.l();
                    return;
                }
                ExecutorService executorService = (ExecutorService) jb4Var;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        pg7 pg7Var = this.K0;
        if (pg7Var != null) {
            pg7Var.d(null);
        }
        this.K0 = null;
        if (this.f0 || (h75Var = this.E0) == null) {
            return;
        }
        h75Var.s();
    }

    @Override // defpackage.j30
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        int i2;
        MusicPlayerUi musicPlayerUi;
        w15 w15Var;
        int i3;
        boolean z;
        zz2Var.Y(-1936100762);
        if ((i & 6) == 0) {
            i2 = i | (zz2Var.f(qq5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zz2Var.h(this) ? 32 : 16;
        }
        int i4 = i2;
        if (zz2Var.O(i4 & 1, (i4 & 19) != 18)) {
            w15 w15Var2 = uc4.a;
            w15 w15VarI = f2c.i(w15Var2, qq5Var);
            q50 q50Var = j72.Q;
            mr mrVar = b52.c;
            ws0 ws0VarA = vs0.a(mrVar, q50Var, zz2Var, 0);
            int iHashCode = Long.hashCode(zz2Var.T);
            hx5 hx5VarL = zz2Var.l();
            w15 w15VarH = dyc.h(zz2Var, w15VarI);
            aw0.j.getClass();
            ax0 ax0Var = zv0.b;
            zz2Var.a0();
            if (zz2Var.S) {
                zz2Var.k(ax0Var);
            } else {
                zz2Var.j0();
            }
            hi hiVar = zv0.f;
            tq4.g(hiVar, zz2Var, ws0VarA);
            hi hiVar2 = zv0.e;
            tq4.g(hiVar2, zz2Var, hx5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            hi hiVar3 = zv0.g;
            tq4.g(hiVar3, zz2Var, numValueOf);
            yc ycVar = zv0.h;
            tq4.f(zz2Var, ycVar);
            hi hiVar4 = zv0.d;
            tq4.g(hiVar4, zz2Var, w15VarH);
            CharSequence title = getTitle();
            boolean zH = zz2Var.h(this);
            Object objL = zz2Var.L();
            j72 j72Var = gw0.a;
            if (zH || objL == j72Var) {
                w15Var = w15Var2;
                i3 = 0;
                objL = new k75(this, i3);
                zz2Var.g0(objL);
            } else {
                w15Var = w15Var2;
                i3 = 0;
            }
            tx2 tx2Var = (tx2) objL;
            yu0 yu0VarG = jxc.g(-2044824477, new n75(this, i3), zz2Var);
            boolean zH2 = zz2Var.h(this);
            Object objL2 = zz2Var.L();
            if (zH2 || objL2 == j72Var) {
                objL2 = new m75(this, 3);
                zz2Var.g0(objL2);
            }
            w15 w15Var3 = w15Var;
            e2d.a(title, null, 0L, tx2Var, yu0VarG, null, false, (wx2) objL2, zz2Var, 24576, 102);
            if (((r84) zz2Var.j(s84.a)).a.f) {
                zz2Var.X(1383875906);
                w15 w15VarA = xs0.a(w15Var3, 1.0f);
                tl6 tl6VarA = rl6.a(b52.a, j72.N, zz2Var, 0);
                int iHashCode2 = Long.hashCode(zz2Var.T);
                hx5 hx5VarL2 = zz2Var.l();
                w15 w15VarH2 = dyc.h(zz2Var, w15VarA);
                zz2Var.a0();
                if (zz2Var.S) {
                    zz2Var.k(ax0Var);
                } else {
                    zz2Var.j0();
                }
                tq4.g(hiVar, zz2Var, tl6VarA);
                tq4.g(hiVar2, zz2Var, hx5VarL2);
                tv0.s(iHashCode2, zz2Var, hiVar3, zz2Var, ycVar);
                tq4.g(hiVar4, zz2Var, w15VarH2);
                ul6 ul6Var = ul6.a;
                t15 t15Var = t15.a;
                w15 w15VarB = ul6.b(ul6Var, t15Var, 1.0f);
                ws0 ws0VarA2 = vs0.a(mrVar, q50Var, zz2Var, 0);
                int iHashCode3 = Long.hashCode(zz2Var.T);
                hx5 hx5VarL3 = zz2Var.l();
                w15 w15VarH3 = dyc.h(zz2Var, w15VarB);
                zz2Var.a0();
                if (zz2Var.S) {
                    zz2Var.k(ax0Var);
                } else {
                    zz2Var.j0();
                }
                tq4.g(hiVar, zz2Var, ws0VarA2);
                tq4.g(hiVar2, zz2Var, hx5VarL3);
                tv0.s(iHashCode3, zz2Var, hiVar3, zz2Var, ycVar);
                tq4.g(hiVar4, zz2Var, w15VarH3);
                int i5 = i4 & 112;
                musicPlayerUi = this;
                musicPlayerUi.P(w15Var3, zz2Var, i5);
                uc4.a(6, zz2Var);
                musicPlayerUi.O(w15Var3, zz2Var, i5);
                z = true;
                zz2Var.p(true);
                musicPlayerUi.N(a87.b(ul6.b(ul6Var, t15Var, 1.0f), 1.0f), zz2Var, i5);
                zz2Var.p(true);
                zz2Var.p(false);
            } else {
                z = true;
                musicPlayerUi = this;
                zz2Var.X(1384302404);
                int i6 = i4 & 112;
                musicPlayerUi.P(w15Var3, zz2Var, i6);
                musicPlayerUi.N(xs0.a(w15Var3, 1.0f), zz2Var, i6);
                musicPlayerUi.O(w15Var3, zz2Var, i6);
                zz2Var.p(false);
            }
            zz2Var.p(z);
        } else {
            musicPlayerUi = this;
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new hk(musicPlayerUi, qq5Var, i, 25);
        }
    }

    @Override // defpackage.j30
    public final qsb y() {
        return this.z0;
    }
}
