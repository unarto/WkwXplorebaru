package com.lonelycatgames.Xplore;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.provider.DocumentsContract;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.work.impl.utils.siN.VjDVzYb;
import com.lonelycatgames.Xplore.Browser;
import com.lonelycatgames.Xplore.ImgViewer.ImageViewer;
import com.lonelycatgames.Xplore.Music.MusicPlayerUi;
import com.lonelycatgames.Xplore.ops.copy.CopyMoveService;
import com.lonelycatgames.Xplore.utils.Dolores;
import com.lonelycatgames.Xplore.video.VideoPlayer;
import defpackage.a87;
import defpackage.ac0;
import defpackage.ad0;
import defpackage.ad6;
import defpackage.aj4;
import defpackage.aw0;
import defpackage.ax0;
import defpackage.b10;
import defpackage.b52;
import defpackage.b81;
import defpackage.bd0;
import defpackage.bd8;
import defpackage.bf5;
import defpackage.byc;
import defpackage.c30;
import defpackage.cd6;
import defpackage.ce0;
import defpackage.cs0;
import defpackage.cz1;
import defpackage.d1;
import defpackage.d44;
import defpackage.d60;
import defpackage.d84;
import defpackage.dl2;
import defpackage.du5;
import defpackage.dyc;
import defpackage.e;
import defpackage.e1;
import defpackage.e1d;
import defpackage.e2d;
import defpackage.e57;
import defpackage.ea4;
import defpackage.ec;
import defpackage.ec0;
import defpackage.ed3;
import defpackage.ed6;
import defpackage.ej5;
import defpackage.es5;
import defpackage.ey0;
import defpackage.f27;
import defpackage.f2c;
import defpackage.f62;
import defpackage.fc0;
import defpackage.fwc;
import defpackage.ga0;
import defpackage.ga4;
import defpackage.gc0;
import defpackage.gj5;
import defpackage.gs0;
import defpackage.gw0;
import defpackage.h60;
import defpackage.hc0;
import defpackage.he4;
import defpackage.hi;
import defpackage.hk;
import defpackage.hm3;
import defpackage.hr;
import defpackage.hx5;
import defpackage.hy2;
import defpackage.i1;
import defpackage.i40;
import defpackage.i41;
import defpackage.ib1;
import defpackage.ic0;
import defpackage.il1;
import defpackage.il5;
import defpackage.is;
import defpackage.j30;
import defpackage.j62;
import defpackage.j72;
import defpackage.jb4;
import defpackage.jc0;
import defpackage.je5;
import defpackage.jg2;
import defpackage.jj7;
import defpackage.jq4;
import defpackage.jt5;
import defpackage.jxc;
import defpackage.jz7;
import defpackage.k2b;
import defpackage.k39;
import defpackage.k5d;
import defpackage.k8;
import defpackage.k85;
import defpackage.kab;
import defpackage.kc0;
import defpackage.kc6;
import defpackage.kh2;
import defpackage.kl2;
import defpackage.ku0;
import defpackage.ky2;
import defpackage.l83;
import defpackage.la;
import defpackage.lc0;
import defpackage.lg3;
import defpackage.m0;
import defpackage.m60;
import defpackage.mc0;
import defpackage.mg4;
import defpackage.n1c;
import defpackage.n20;
import defpackage.nc0;
import defpackage.ne8;
import defpackage.ng4;
import defpackage.ni;
import defpackage.nn;
import defpackage.o60;
import defpackage.og4;
import defpackage.ok2;
import defpackage.ok3;
import defpackage.oo1;
import defpackage.pb0;
import defpackage.pc0;
import defpackage.pg;
import defpackage.pg7;
import defpackage.pp0;
import defpackage.pp7;
import defpackage.pwc;
import defpackage.q6d;
import defpackage.q8;
import defpackage.qa0;
import defpackage.qb0;
import defpackage.qc0;
import defpackage.qf;
import defpackage.qp9;
import defpackage.qq5;
import defpackage.qsb;
import defpackage.qx0;
import defpackage.qy1;
import defpackage.r2;
import defpackage.r20;
import defpackage.r22;
import defpackage.ra4;
import defpackage.re0;
import defpackage.rf3;
import defpackage.rk5;
import defpackage.rl6;
import defpackage.rpa;
import defpackage.rqb;
import defpackage.rs5;
import defpackage.s8;
import defpackage.sb0;
import defpackage.se8;
import defpackage.sfc;
import defpackage.sp1;
import defpackage.su5;
import defpackage.su8;
import defpackage.t15;
import defpackage.t4a;
import defpackage.t81;
import defpackage.taa;
import defpackage.th;
import defpackage.tl6;
import defpackage.tn;
import defpackage.tq4;
import defpackage.tqb;
import defpackage.tv0;
import defpackage.tx2;
import defpackage.u80;
import defpackage.u95;
import defpackage.uc0;
import defpackage.uc4;
import defpackage.v0d;
import defpackage.v1;
import defpackage.vb0;
import defpackage.vc7;
import defpackage.ve5;
import defpackage.vk2;
import defpackage.vs0;
import defpackage.vu5;
import defpackage.vx8;
import defpackage.w1;
import defpackage.w15;
import defpackage.w7c;
import defpackage.wi7;
import defpackage.ws0;
import defpackage.wx2;
import defpackage.wy0;
import defpackage.x2d;
import defpackage.x94;
import defpackage.xb0;
import defpackage.xr0;
import defpackage.xxa;
import defpackage.y02;
import defpackage.yc;
import defpackage.yi5;
import defpackage.yl8;
import defpackage.yo1;
import defpackage.yu0;
import defpackage.yv3;
import defpackage.yzc;
import defpackage.z71;
import defpackage.z9d;
import defpackage.za1;
import defpackage.zb0;
import defpackage.zc0;
import defpackage.zcd;
import defpackage.zd2;
import defpackage.zr5;
import defpackage.zs5;
import defpackage.zv0;
import defpackage.zz2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class Browser extends j30 implements ib1, nn {
    public static final long U0;
    public static final float[] V0;
    public static final es5[] W0;
    public pg7 A0;
    public boolean B0;
    public final vu5 C0;
    public du5 D0;
    public hy2 E0;
    public boolean F0;
    public final pb0 G0;
    public final vu5 H0;
    public rk5 I0;
    public int J0;
    public final pb0 K0;
    public ec0 L0;
    public pg7 M0;
    public boolean N0;
    public final vu5 O0;
    public final vu5 P0;
    public final pp7 Q0;
    public final s8 R0;
    public int S0;
    public pg7 T0;
    public final /* synthetic */ z71 d0 = v0d.c();
    public AudioManager e0;
    public bd0 f0;
    public pp0 g0;
    public boolean h0;
    public qf i0;
    public final vu5 j0;
    public int k0;
    public int l0;
    public float m0;
    public float n0;
    public final su5 o0;
    public ey0 p0;
    public og4 q0;
    public final pp7 r0;
    public final vu5 s0;
    public long t0;
    public gs0 u0;
    public gs0 v0;
    public w15 w0;
    public float x0;
    public boolean y0;
    public boolean z0;

    static {
        tqb tqbVar = f62.b;
        U0 = z9d.h(2, j62.SECONDS);
        V0 = new float[]{1.0f, 1.1f, 0.8f, 1.3f, 0.75f};
        W0 = new es5[]{new es5(Integer.valueOf(R.string.text), "text"), new es5(Integer.valueOf(R.string.image), "image"), new es5(Integer.valueOf(R.string.video), "video"), new es5(Integer.valueOf(R.string.audio), "audio"), new es5(Integer.valueOf(R.string.mime_all), "*")};
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [pb0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [pb0] */
    public Browser() {
        Boolean bool = Boolean.FALSE;
        this.j0 = yzc.c(bool);
        this.m0 = 0.0f;
        this.n0 = 0.0f;
        final int i = 0;
        this.o0 = new su5(0);
        this.r0 = new pp7(new v1(this, 11));
        this.s0 = yzc.c(null);
        this.t0 = gs0.l;
        this.w0 = t15.a;
        this.C0 = yzc.c(bool);
        this.G0 = new Runnable(this) { // from class: pb0
            public final /* synthetic */ Browser b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                rk5 rk5Var;
                int i2 = i;
                Browser browser = this.b;
                switch (i2) {
                    case 0:
                        float[] fArr = Browser.V0;
                        for (jt5 jt5Var : browser.b0().b) {
                            vc7 vc7Var = jt5Var.k;
                            int i3 = 0;
                            while (i3 < vc7Var.size()) {
                                int i4 = i3 + 1;
                                ng4 ng4Var = (ng4) vc7Var.get(i3);
                                if (ng4Var.I == 0 && (ng4Var instanceof qy1) && (ng4Var.J instanceof ml3)) {
                                    jt5.j0(jt5Var, (qy1) ng4Var, false, null, 60);
                                }
                                i3 = i4;
                            }
                        }
                        break;
                    default:
                        if (browser.J0 == 4 && (rk5Var = browser.I0) != null) {
                            browser.n0(rk5Var, 4, true);
                            break;
                        }
                        break;
                }
            }
        };
        this.H0 = yzc.c(bool);
        final int i2 = 1;
        this.K0 = new Runnable(this) { // from class: pb0
            public final /* synthetic */ Browser b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                rk5 rk5Var;
                int i22 = i2;
                Browser browser = this.b;
                switch (i22) {
                    case 0:
                        float[] fArr = Browser.V0;
                        for (jt5 jt5Var : browser.b0().b) {
                            vc7 vc7Var = jt5Var.k;
                            int i3 = 0;
                            while (i3 < vc7Var.size()) {
                                int i4 = i3 + 1;
                                ng4 ng4Var = (ng4) vc7Var.get(i3);
                                if (ng4Var.I == 0 && (ng4Var instanceof qy1) && (ng4Var.J instanceof ml3)) {
                                    jt5.j0(jt5Var, (qy1) ng4Var, false, null, 60);
                                }
                                i3 = i4;
                            }
                        }
                        break;
                    default:
                        if (browser.J0 == 4 && (rk5Var = browser.I0) != null) {
                            browser.n0(rk5Var, 4, true);
                            break;
                        }
                        break;
                }
            }
        };
        this.O0 = yzc.c(null);
        this.P0 = yzc.c(bool);
        int i3 = 2;
        this.Q0 = new pp7(new v1(this, i3));
        this.R0 = o(new qb0(this), new q8(i3));
    }

    public static void R(Browser browser, int i, Integer num, String str, wx2 wx2Var, String str2, wx2 wx2Var2, int i2) {
        int i3 = 0;
        int i4 = (i2 & 1) != 0 ? 0 : i;
        b81 b81Var = null;
        String str3 = (i2 & 4) != 0 ? null : str;
        wx2 wx2Var3 = (i2 & 8) != 0 ? null : wx2Var;
        String str4 = (i2 & 16) != 0 ? null : str2;
        boolean z = (i2 & 32) == 0;
        if (str3 == null) {
            str3 = "";
        }
        ea4 ea4Var = new ea4(browser.b0().q, i4 != 0 ? Integer.valueOf(i4) : null, num, uc4.i(str3), new mc0(wx2Var3, b81Var, i3), null, z, false, false, null, null, 0, null, wx2Var2, 16288);
        if (str4 != null) {
            ea4Var.t(str4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int V(qy1 qy1Var, long j) {
        qy1 qy1Var2;
        ok2 ok2Var;
        int iV;
        File file;
        String[] list;
        vk2 vk2Var;
        dl2 dl2Var = qy1Var.J;
        ng4 ng4Var = null;
        try {
            qy1Var2 = qy1Var;
            try {
                vk2Var = new vk2(qy1Var2, null, null, false, false, 62);
            } catch (ok2 e) {
                e = e;
            }
            try {
                dl2Var.getClass();
                dl2Var.Z(vk2Var);
                iV = 0;
                for (ng4 ng4Var2 : vk2Var.j) {
                    try {
                        if ((ng4Var2 instanceof qy1) && hm3.b(ng4Var2.J, dl2Var)) {
                            iV += V((qy1) ng4Var2, j);
                        } else if (hm3.b(ng4Var2.Z(), ".nomedia")) {
                            ng4Var = ng4Var2;
                        } else {
                            String strT = ng4Var2.T();
                            if (!(ng4Var2 instanceof f27)) {
                                Handler handler = App.M0;
                            } else if (ng4Var2.i() > j) {
                            }
                            if (dl2Var.H(ng4Var2, false)) {
                                Handler handler2 = App.M0;
                                Log.i("X-plore", "Deleted file in trash: " + strT);
                                iV++;
                            } else {
                                Handler handler3 = App.M0;
                                Log.e("X-plore", "Failed to delete in trash: " + strT);
                            }
                        }
                    } catch (ok2 e2) {
                        ok2Var = e2;
                        Handler handler4 = App.M0;
                        qp9.c("Can't list folder", ok2Var);
                    }
                }
            } catch (ok2 e3) {
                e = e3;
                ok2Var = e;
                iV = 0;
                Handler handler42 = App.M0;
                qp9.c("Can't list folder", ok2Var);
                String strT2 = qy1Var2.T();
                file = new File(strT2);
                list = file.list();
                if (ng4Var != null) {
                    q6d q6dVar = dl2.b;
                    dl2Var.H(ng4Var, false);
                    list = file.list();
                }
                if (list == null) {
                }
                q6d q6dVar2 = dl2.b;
                if (dl2Var.H(qy1Var2, false)) {
                }
            }
        } catch (ok2 e4) {
            e = e4;
            qy1Var2 = qy1Var;
        }
        String strT22 = qy1Var2.T();
        file = new File(strT22);
        list = file.list();
        if (ng4Var != null && list != null && list.length == 1) {
            q6d q6dVar3 = dl2.b;
            dl2Var.H(ng4Var, false);
            list = file.list();
        }
        if ((list == null && list.length != 0) || !new File(qy1Var2.T()).exists()) {
            return iV;
        }
        q6d q6dVar22 = dl2.b;
        if (dl2Var.H(qy1Var2, false)) {
            return iV;
        }
        Handler handler5 = App.M0;
        Log.i("X-plore", "Deleted empty trash folder: ".concat(strT22));
        return iV + 1;
    }

    public static final void e0(jb4 jb4Var, Browser browser, Object[] objArr) {
        for (Object obj : objArr) {
            if (obj instanceof rk5) {
                if (!((List) browser.w().C().d).contains(obj) && obj != r22.f) {
                    rk5 rk5Var = (rk5) obj;
                    jb4.k(jb4Var, Integer.valueOf(rk5Var.b), Integer.valueOf(rk5Var.a), 0, new d1(browser, 13, rk5Var), 4);
                }
            } else if (obj instanceof ic0) {
                jb4.o(jb4Var, Integer.valueOf(R.string.more), null, new r2((ic0) obj, 14, browser), 6);
            } else if (obj instanceof jc0) {
                jc0 jc0Var = (jc0) obj;
                if (jc0Var.a()) {
                    jb4.k(jb4Var, Integer.valueOf(jc0Var.b), Integer.valueOf(jc0Var.a), 0, new pg(7, jc0Var), 4).c = jc0Var.c;
                }
            } else if (obj != null) {
                throw new je5(0);
            }
        }
    }

    public static final void g0(Browser browser, Uri uri, bd0 bd0Var, String str, jt5 jt5Var) {
        jt5.q0(jt5Var, tv0.x(browser.w().getString(R.string.cloud_storage), "/*"), false, new sb0(jt5Var, uri, bd0Var, browser, str, 0), 6);
    }

    public static void m0(Browser browser) {
        if (browser.L0 != null) {
            return;
        }
        d60 d60Var = d60.a;
        if (d60.b()) {
            browser.L0 = new ec0(browser);
        }
    }

    public static void u0(Browser browser, CharSequence charSequence) {
        browser.getClass();
        browser.w().j0(browser, charSequence, true);
    }

    public static /* synthetic */ void x0(Browser browser, Intent intent, String str, ng4 ng4Var, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            ng4Var = null;
        }
        browser.w0(intent, str, ng4Var, -1);
    }

    @Override // defpackage.j30
    public final void E(zr5 zr5Var, tx2 tx2Var) {
        zr5Var.getClass();
        this.F0 = true;
        super.E(zr5Var, new v1(this, 3));
    }

    @Override // defpackage.j30
    public final void F(CharSequence charSequence) {
        this.s0.setValue(charSequence.toString());
    }

    public void N(zz2 zz2Var) {
        wx2 wx2Var;
        zz2Var.X(2143362493);
        Object objL = zz2Var.L();
        wx2 wx2Var2 = null;
        j72 j72Var = gw0.a;
        if (objL == j72Var) {
            objL = yzc.c(null);
            zz2Var.g0(objL);
        }
        u95 u95Var = (u95) objL;
        if (a0()) {
            zz2Var.X(-366615432);
            boolean zH = zz2Var.h(this);
            Object objL2 = zz2Var.L();
            if (zH || objL2 == j72Var) {
                objL2 = new r2(this, 15, u95Var);
                zz2Var.g0(objL2);
            }
            wx2Var = (wx2) objL2;
            zz2Var.p(false);
        } else {
            zz2Var.X(-366443104);
            zz2Var.p(false);
            wx2Var = null;
        }
        yu0 yu0VarG = jxc.g(2145547221, new o60(u95Var, 1), zz2Var);
        if (((Boolean) this.j0.getValue()).booleanValue()) {
            zz2Var.X(-366275176);
            boolean zH2 = zz2Var.h(this);
            Object objL3 = zz2Var.L();
            if (zH2 || objL3 == j72Var) {
                objL3 = new w1(this, 5);
                zz2Var.g0(objL3);
            }
            wx2Var2 = (wx2) objL3;
            zz2Var.p(false);
        } else {
            zz2Var.X(-366225856);
            zz2Var.p(false);
        }
        w7c.c(wx2Var, yu0VarG, wx2Var2, zz2Var, 48);
        zz2Var.p(false);
    }

    public void O(w15 w15Var, zz2 zz2Var, int i) {
        zz2 zz2Var2;
        w15Var.getClass();
        zz2Var.X(-347796521);
        int i2 = 0;
        if (x().E) {
            zz2Var.X(-1744892930);
            P(w15Var, zz2Var, i & 126);
            zz2Var.p(false);
            zz2Var2 = zz2Var;
        } else {
            zz2Var.X(-1744834650);
            int iH = b0().e.h();
            boolean zH = zz2Var.h(this);
            Object objL = zz2Var.L();
            if (zH || objL == gw0.a) {
                objL = new v1(this, 9);
                zz2Var.g0(objL);
            }
            zz2Var2 = zz2Var;
            rpa.a(iH, (tx2) objL, w15Var, this.x0, b0().g().D().J() || x().F, jxc.g(1100708400, new vb0(this, i2), zz2Var), zz2Var2, ((i << 6) & 896) | 196608);
            zz2Var2.p(false);
        }
        zz2Var2.p(false);
    }

    public final void P(w15 w15Var, zz2 zz2Var, int i) {
        int i2;
        zz2Var.Y(29902167);
        if ((i & 6) == 0) {
            i2 = (zz2Var.f(w15Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zz2Var.h(this) ? 32 : 16;
        }
        int i3 = 1;
        if (zz2Var.O(i2 & 1, (i2 & 19) != 18)) {
            tl6 tl6VarA = rl6.a(b52.a, j72.N, zz2Var, 0);
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
            tq4.g(zv0.f, zz2Var, tl6VarA);
            tq4.g(zv0.e, zz2Var, hx5VarL);
            tq4.g(zv0.g, zz2Var, Integer.valueOf(iHashCode));
            tq4.f(zz2Var, zv0.h);
            tq4.g(zv0.d, zz2Var, w15VarH);
            w15 w15VarB = a87.b(a87.n(t15.a, this.m0), 1.0f);
            b0().b[0].h(w15VarB, zz2Var, 64);
            qf qfVar = this.i0;
            if (qfVar == null) {
                hm3.l("buttonsBar");
                throw null;
            }
            qfVar.a(0, zz2Var);
            if (x().E) {
                zz2Var.X(1996001095);
                zz2Var.p(false);
            } else {
                zz2Var.X(1995934786);
                b0().b[1].h(w15VarB, zz2Var, 64);
                zz2Var.p(false);
            }
            zz2Var.p(true);
        } else {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new hk(this, w15Var, i, i3);
        }
    }

    public final void Q(int i) {
        if (!x().E || i == 0) {
            boolean z = b0().e.h() != i;
            b0().f(i);
            q0(true);
            if (z) {
                pp0 pp0VarY = Y();
                if (pp0VarY.d()) {
                    pp0VarY.k();
                } else if (pp0VarY.c) {
                    pp0VarY.f();
                }
                gc0 gc0VarZ = Z();
                if (gc0VarZ != null) {
                    gc0VarZ.b();
                }
            }
        }
    }

    public boolean S(ng4 ng4Var) {
        return true;
    }

    public boolean T(rk5 rk5Var) {
        rk5Var.getClass();
        return true;
    }

    public final void U() {
        if (w().k().a.h("auto_update", true)) {
            e57 e57Var = d60.d;
            PackageManager packageManager = getPackageManager();
            packageManager.getClass();
            String packageName = getPackageName();
            packageName.getClass();
            String initiatingPackageName = Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager.getInstallerPackageName(packageName);
            e57Var.getClass();
            if (hm3.b(initiatingPackageName, "com.android.vending")) {
                try {
                    Object value = this.Q0.getValue();
                    value.getClass();
                    ((rqb) value).a().b(new qb0(this));
                    return;
                } catch (Exception e) {
                    Handler handler = App.M0;
                    qp9.c("Failed to check for update", e);
                    return;
                }
            }
            if (((int) ((w().b0 & Long.MAX_VALUE) % 100)) > w().Z.g) {
                return;
            }
            int i = w().Z.e;
            String strD = k2b.d(i);
            String str = "X-plore-" + strD + ".apk";
            w();
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            externalStoragePublicDirectory.getClass();
            boolean z = false;
            boolean z2 = i <= 44910;
            he4 he4Var = w().L0;
            yo1 yo1Var = y02.a;
            kab.d(he4Var, oo1.c, null, new tn(externalStoragePublicDirectory, str, z2, null, 1), 2);
            if (z2 || ((int) w().l().i("update_offer_version", 0L)) == i) {
                return;
            }
            File file = new File(externalStoragePublicDirectory, str);
            try {
                su8 su8Var = new su8(file);
                try {
                    boolean z3 = !su8Var.c.values().isEmpty();
                    taa.m(su8Var, null);
                    z = z3;
                } finally {
                }
            } catch (Exception unused) {
            }
            if (z) {
                l0(file, i);
                return;
            }
            String strL = w().Z.f;
            if (strL == null) {
                strL = tv0.l("https://github.com/mice777/X-plore-releases/releases/download/update/", strD, ".apk");
            }
            String str2 = strL;
            if (this.T0 != null) {
                return;
            }
            this.T0 = kab.d(w().L0, null, null, new pc0(this, file, i, str2, (b81) null), 3);
        }
    }

    public final void W(boolean z) {
        ad0 ad0Var = b0().o;
        if (ad0Var != null) {
            if (z && ad0Var.a()) {
                new gj5(this, ad0Var);
            } else {
                Handler handler = App.M0;
                ad0Var.delete();
            }
            b0().o = null;
        }
    }

    public vx8 X() {
        return new vx8(w());
    }

    public final pp0 Y() {
        pp0 pp0Var = this.g0;
        if (pp0Var != null) {
            return pp0Var;
        }
        hm3.l("clipboard");
        throw null;
    }

    public final gc0 Z() {
        return (gc0) this.O0.getValue();
    }

    public boolean a0() {
        return true;
    }

    public final bd0 b0() {
        bd0 bd0Var = this.f0;
        if (bd0Var != null) {
            return bd0Var;
        }
        hm3.l("state");
        throw null;
    }

    public final ey0 c0() {
        ey0 ey0Var = this.p0;
        if (ey0Var != null) {
            return ey0Var;
        }
        hm3.l("thumbnailCache");
        throw null;
    }

    @Override // defpackage.nn
    public final void d() {
        this.j0.setValue(Boolean.valueOf(w().A0 != null));
    }

    public final void d0() {
        qf qfVar = this.i0;
        if (qfVar != null) {
            qfVar.g();
        } else {
            hm3.l("buttonsBar");
            throw null;
        }
    }

    @Override // defpackage.mu0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ec0 ec0Var;
        keyEvent.getClass();
        if (keyEvent.getAction() == 1 && (ec0Var = this.L0) != null) {
            ec0Var.d();
        }
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 61 || !((Map) w().u().c).containsKey(Integer.valueOf(keyEvent.getKeyCode()))) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onKeyDown(keyEvent.getKeyCode(), keyEvent);
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ec0 ec0Var;
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if ((action == 1 || action == 6) && (ec0Var = this.L0) != null) {
            ec0Var.d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void h0(int i) {
        int i2 = i | x().z;
        if (i2 == 15) {
            String[] strArr = se8.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > x().A + 604800000) {
                x().A = jCurrentTimeMillis;
                il1 il1VarL = w().l();
                String[] strArr2 = il1.d;
                il1VarL.u("rating_time", jCurrentTimeMillis, null);
                kab.d(this, null, null, new kc0(this, null, 1), 3);
                i2 = 0;
            }
        }
        if (x().z != i2) {
            x().z = i2;
            w().l().t(i2, "rating_functions");
        }
    }

    public final void i0() {
        d60 d60Var = d60.a;
        if (d60.b()) {
            if (!this.N0) {
                this.N0 = true;
                kab.d(x2d.e(this), null, null, new qc0(this, null), 3);
            }
            la laVar = la.a;
            if (la.h != null) {
                return;
            }
            la.c(this);
        }
    }

    public final void j0() {
        if (this.M0 != null) {
            return;
        }
        d60 d60Var = d60.a;
        if (d60.b() && this.L0 == null) {
            long j = x().B + 129600000;
            String[] strArr = se8.a;
            long jCurrentTimeMillis = j - System.currentTimeMillis();
            b81 b81Var = null;
            if (jCurrentTimeMillis < 0) {
                la laVar = la.a;
                this.M0 = kab.d(this, null, null, new kc0(this, b81Var, 2), 3);
            } else {
                la laVar2 = la.a;
                this.M0 = kab.d(this, null, null, new nc0(jCurrentTimeMillis, this, null), 3);
            }
        }
    }

    public final void k0() {
        d60 d60Var = d60.a;
        if (d60.b()) {
            la laVar = la.a;
            if (la.e) {
                yl8 yl8Var = la.h;
                la.h = null;
                la.c(this);
                if (yl8Var != null) {
                    App app = la.b;
                    if (app == null) {
                        hm3.l("app");
                        throw null;
                    }
                    app.r0("Ads", "item_name", "interstitial.show");
                    try {
                        ((t4a) yl8Var.a).b(this);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public final void l0(File file, int i) {
        i41 i41VarE = b0().q.E(Integer.valueOf(R.drawable.op_apk_as_zip), Integer.valueOf(R.string.update_available), file.getName(), new e1(12));
        x94.p(i41VarE, Integer.valueOf(R.string.install), new r2(this, 13, file), 2);
        i41VarE.J = new u80(this, i, 1);
    }

    @Override // defpackage.mu0
    public final Object m() {
        if (this.f0 == null) {
            return null;
        }
        return new hc0(b0());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(rk5 rk5Var, int i, boolean z) {
        jt5 jt5VarG = b0().g();
        jt5 jt5VarH = b0().h();
        if (jt5VarG.l.isEmpty()) {
            ng4 ng4Var = (ng4) xr0.C(jt5VarG.e.h(), jt5VarG.k);
            if (ng4Var == null) {
                ng4Var = jt5VarG.y;
            }
            if (rk5Var.c(jt5VarG, jt5VarH, ng4Var)) {
                rk5Var.h(jt5VarG, ng4Var, jt5VarH, new yi5(null, z));
                App appW = w();
                Bundle bundle = new Bundle();
                bundle.putString("item_name", yv3.b(i));
                bundle.putInt("item_id", i);
                if (z) {
                }
                appW.q0("KeyPress", bundle);
            }
        } else if (rk5Var.d(jt5VarG, jt5VarH, jt5VarG.l)) {
            rk5Var.g(jt5VarG, jt5VarH, jt5VarG.J(), new yi5(null, z));
            App appW2 = w();
            Bundle bundle2 = new Bundle();
            bundle2.putString("item_name", yv3.b(i));
            bundle2.putInt("item_id", i);
            if (z) {
                bundle2.putBoolean("Alt", true);
            }
            appW2.q0("KeyPress", bundle2);
        }
        this.I0 = null;
    }

    public final void o0(String str) {
        str.getClass();
        b10 b10VarS = w().s();
        ((LinkedHashMap) b10VarS.d).remove(str);
        ((LinkedHashMap) b10VarS.e).remove(str);
        for (jt5 jt5Var : b0().b) {
            jt5Var.i0(true);
        }
    }

    @Override // defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        boolean z = i2 == -1;
        if (i == 1) {
            if (z) {
                ArrayList arrayList = hr.h;
                synchronized (arrayList) {
                    arrayList.clear();
                }
                B();
                return;
            }
            return;
        }
        String strF = null;
        if (i == 2) {
            ad0 ad0Var = b0().o;
            if (ad0Var != null && ad0Var.a()) {
                W(true);
            }
            w().o0 = null;
            k0();
            return;
        }
        if (i == 6) {
            if (!z || intent == null || intent.getData() == null) {
                return;
            }
            try {
                lg3 lg3Var = lg3.f;
                Uri data2 = intent.getData();
                if (data2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                lg3Var.getClass();
                lg3.y(this, data2);
                return;
            } catch (Exception e) {
                v0(e);
                return;
            }
        }
        if (i == 8) {
            du5 du5Var = this.D0;
            if (du5Var != null) {
                this.D0 = null;
                if (i2 == -1) {
                    if (intent == null || (data = intent.getData()) == null) {
                        strF = "No uri returned";
                    } else if (!hm3.b(data.getAuthority(), "com.paragon_software.documentproviderserver.documents")) {
                        du5Var.v0(this);
                        strF = "You should choose 'Paragon file system' entry";
                    } else if (hm3.b(DocumentsContract.getTreeDocumentId(data), "root")) {
                        getContentResolver().takePersistableUriPermission(data, 3);
                    } else {
                        du5Var.v0(this);
                        strF = "You should choose top level entry";
                    }
                }
                if (strF != null) {
                    App app = du5Var.a;
                    Handler handler = App.M0;
                    app.k0(strF, false);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 12;
        if (i != 12) {
            if (i == 17) {
                hy2 hy2Var = this.E0;
                if (hy2Var == null) {
                    Handler handler2 = App.M0;
                    return;
                } else {
                    this.E0 = null;
                    hy2Var.F(Boolean.valueOf(i2 == -1), intent);
                    return;
                }
            }
            if (i != 18) {
                super.onActivityResult(i, i2, intent);
                return;
            } else {
                if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
                    return;
                }
                aj4 aj4Var = aj4.k;
                k5d.l(w());
                B();
                return;
            }
        }
        if (i2 != -1) {
            if (i2 != 0) {
                strF = ve5.j(i2, "Unknown result: ");
            }
        } else if (intent != null) {
            Uri data3 = intent.getData();
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Set<String> setKeySet = extras.keySet();
                setKeySet.getClass();
                strF = xr0.F(setKeySet, null, null, null, new i1(i3, extras), 31);
            }
            strF = "Data: " + data3 + "\nExtras: " + strF;
        } else {
            strF = "No intent returned";
        }
        if (strF != null) {
            w().k0(strF, true);
        }
    }

    @Override // defpackage.mu0, android.app.Activity
    public final void onBackPressed() {
        jt5 jt5VarG = b0().g();
        if (jt5VarG.D().J()) {
            jt5VarG.D().I();
            return;
        }
        if (Z() != null) {
            gc0 gc0VarZ = Z();
            if (gc0VarZ != null) {
                gc0VarZ.b();
                return;
            }
            return;
        }
        if (Y().d()) {
            Y().h();
            return;
        }
        if (!jt5VarG.l.isEmpty()) {
            jt5VarG.r();
            return;
        }
        if (!x().H || !getClass().equals(Browser.class)) {
            w().j0 = 0L;
            super.onBackPressed();
        } else {
            if (this.A0 == null) {
                this.A0 = kab.d(this, null, null, new kc0(this, null, 3), 3);
                return;
            }
            try {
                w().j0 = 0L;
                super.onBackPressed();
            } catch (IllegalStateException e) {
                Handler handler = App.M0;
                qp9.d(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0543  */
    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        boolean z;
        int iIntValue;
        bd0 bd0Var;
        jt5 jt5Var;
        boolean z2;
        es5 es5Var;
        int i;
        boolean z3;
        Browser browser = this;
        super.onCreate(bundle);
        boolean zL = browser.w().L();
        if (!zL) {
            browser.getWindow().setBackgroundDrawable(new ColorDrawable(-8152164));
        }
        App appW = browser.w();
        Resources resources = browser.getResources();
        resources.getClass();
        appW.a(resources, true);
        zcd.c(browser.w());
        new bf5(browser.w()).a(1);
        Object systemService = browser.w().getSystemService("audio");
        systemService.getClass();
        browser.e0 = (AudioManager) systemService;
        float[] fArr = V0;
        int[] iArr = new int[fArr.length];
        boolean z4 = false;
        try {
            int iL = pwc.l(zL ? ra4.k : ra4.l);
            zd2 zd2Var = zd2.j;
            if (zd2Var != null) {
                int i2 = zL ? zd2Var.d : zd2Var.e;
                if (i2 != 0) {
                    iL = i2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = z3;
            } else {
                z = false;
            }
            float[] fArr2 = new float[3];
            Color.colorToHSV(iL, fArr2);
            float f = fArr2[2];
            int length = fArr.length;
            int i3 = 0;
            while (i3 < length) {
                boolean z5 = (!zL || i3 == 2 || i3 == 5) ? false : true;
                float f2 = (z5 ? 1.0f - f : f) * fArr[i3];
                if (z5) {
                    f2 = 1.0f - f2;
                }
                fArr2[2] = f2;
                iArr[i3] = Color.HSVToColor(fArr2);
                i3++;
            }
            browser.C();
            browser.w0 = hm3.d(t15.a, pwc.b(iArr[0]), sfc.a);
            browser.h0 = !browser.w().b && browser.getResources().getBoolean(R.bool.show_toolbar);
            Resources resources2 = browser.getResources();
            if (browser.x().E) {
                iIntValue = 2;
            } else {
                int i4 = (int) browser.w().l().i(resources2.getConfiguration().orientation == 2 ? "layout_landscape" : "layout_portrait", 3L);
                Integer numValueOf = Integer.valueOf(i4);
                if (i4 == 3) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : resources2.getInteger(R.integer.pane_scroll_mode);
            }
            browser.k0 = iIntValue;
            browser.j0.setValue(Boolean.valueOf(browser.w().A0 != null));
            byte[] bArrB = Dolores.b.b(browser).b(se8.b("5WsShvtRQKl9NfK+Gz3x4w", false));
            int iC = Dolores.Companion.c(bArrB, 3) | (Dolores.Companion.c(bArrB, 0) << 24) | (Dolores.Companion.c(bArrB, 1) << 16) | (Dolores.Companion.c(bArrB, 2) << 8);
            int iCompare = Boolean.compare((browser.w().b0 ^ 9168936853145160926L) == 5154996431070293374L, false) + (iC >>> 24);
            for (int i5 = 0; i5 < 5; i5++) {
                iCompare |= Integer.rotateLeft(iCompare, 1 << i5);
            }
            browser.t0 = pwc.b((iC & 16777215) | (1056964608 & iCompare));
            ku0 ku0Var = (ku0) browser.getLastNonConfigurationInstance();
            Object obj = ku0Var != null ? ku0Var.a : null;
            hc0 hc0Var = obj instanceof hc0 ? (hc0) obj : null;
            if (hc0Var != null) {
                bd0Var = hc0Var.a;
            } else {
                t81 t81Var = browser.w().R;
                if (t81Var != null) {
                    bd0Var = t81Var.d;
                } else {
                    ed3 ed3Var = browser.w().o0;
                    rf3 rf3Var = ed3Var instanceof rf3 ? (rf3) ed3Var : null;
                    bd0Var = (rf3Var == null || (jt5Var = rf3Var.d) == null) ? null : jt5Var.c;
                }
            }
            if (bd0Var != null) {
                bd0Var.p++;
                browser.f0 = bd0Var;
                z2 = true;
            } else {
                browser.f0 = new bd0(browser.w());
                z2 = false;
            }
            browser.p0 = new ey0(browser.w(), browser.w().x(), browser.b0().k);
            browser.q0 = new og4(browser.w(), browser, browser.c0(), iArr[3], iArr[0]);
            bd0 bd0VarB0 = browser.b0();
            WindowManager windowManager = browser.getWindowManager();
            if (Build.VERSION.SDK_INT >= 30) {
                Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
                bounds.getClass();
                es5Var = new es5(Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
            } else {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                es5Var = new es5(Integer.valueOf(point.x), Integer.valueOf(point.y));
            }
            bd0.t = (((Number) es5Var.b).intValue() + ((Number) es5Var.a).intValue()) / 3;
            bd0VarB0.c = browser.X();
            hc0 hc0Var2 = hc0Var;
            boolean z6 = z2;
            bd0VarB0.d = new m0(1, browser, Browser.class, "canAddPaneRootEntry", "canAddPaneRootEntry(Lcom/lonelycatgames/Xplore/ListEntry/ListEntry;)Z", 0, 6);
            browser.w().o0 = null;
            browser.g0 = new pp0(browser);
            if (z) {
                browser.u0 = new gs0(pwc.b(iArr[2]));
                browser.v0 = new gs0(pwc.b(iArr[1]));
            }
            for (jt5 jt5Var2 : browser.b0().b) {
                jt5Var2.getClass();
                jt5Var2.j = browser;
                jt5Var2.v = new b10(jt5Var2);
            }
            browser.x0 = browser.getResources().getDimensionPixelSize(R.dimen.pane_swap_drag_dist);
            browser.i0 = new qf(browser);
            int i6 = browser.getResources().getDisplayMetrics().widthPixels;
            qf qfVar = browser.i0;
            if (qfVar == null) {
                hm3.l("buttonsBar");
                throw null;
            }
            int dimensionPixelSize = browser.getResources().getDimensionPixelSize(R.dimen.button_width) * qfVar.a;
            browser.n0 = byc.e(browser.w(), dimensionPixelSize);
            int i7 = browser.k0;
            browser.l0 = i7 != 0 ? i7 != 1 ? i6 - dimensionPixelSize : i6 / 2 : (i6 - dimensionPixelSize) / 2;
            browser.m0 = byc.e(browser.w(), browser.l0);
            jt5[] jt5VarArr = browser.b0().b;
            int length2 = jt5VarArr.length;
            int i8 = 0;
            while (i8 < length2) {
                jt5 jt5Var3 = jt5VarArr[i8];
                bd0 bd0Var2 = jt5Var3.c;
                qy1 qy1Var = jt5Var3.o;
                App app = jt5Var3.a;
                bd0Var2.i.getClass();
                vc7 vc7Var = jt5Var3.k;
                if (vc7Var.isEmpty()) {
                    int i9 = jt5Var3.b;
                    aj4 aj4Var = aj4.k;
                    for (kl2 kl2Var : k5d.k()) {
                        if (kl2Var.f && !kl2Var.e && (!kl2Var.d() || app.k().j != qx0.b)) {
                            jt5Var3.q(kl2Var, z4);
                        }
                    }
                    ArrayList arrayList = bd8.e;
                    if (arrayList != null) {
                        jt5Var3.o(vc7Var.size(), arrayList);
                    }
                    wy0 wy0Var = jt5Var3.p;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = wy0Var.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        jg2.g.getClass();
                        qy1 qy1VarF = jg2.F(jt5Var3, str, str2);
                        if (qy1VarF != null) {
                            arrayList2.add(qy1VarF);
                        }
                    }
                    cs0.q(vc7Var, xr0.Y(arrayList2, app.v()));
                    for (rs5 rs5Var : jt5Var3.M) {
                        if (app.l().h(rs5Var.g.b + "show" + rs5Var.a, i9 == rs5Var.f) && rs5Var.a()) {
                            ((wx2) rs5Var.c).a(Integer.valueOf(vc7Var.size()));
                        }
                    }
                    Iterator it2 = k39.c(app, i9).iterator();
                    while (it2.hasNext()) {
                        jt5Var3.j((zs5) it2.next(), vc7Var.size());
                    }
                    vc7Var.add(new re0(app, R.drawable.le_show, R.string.show, 0, null, new d84(22), 56));
                }
                jt5Var3.x0();
                qy1 qy1Var2 = jt5Var3.y;
                if (qy1Var2 != qy1Var) {
                    qy1Var2.getClass();
                    jt5Var3.y = qy1Var;
                    jt5Var3.o0(qy1Var2);
                }
                i8++;
                z4 = false;
            }
            browser.f0(browser.getIntent(), z6);
            browser.w().B0.add(browser);
            il1 il1VarL = browser.w().l();
            String[] strArr = il1.d;
            int i10 = (int) il1VarL.i("last_trash_clean_day", 0L);
            if (browser.w().M() && Debug.isDebuggerConnected()) {
                i10 = 0;
                i = 5;
            } else {
                i = 60;
            }
            String[] strArr2 = se8.a;
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
            if (iCurrentTimeMillis != i10) {
                kab.d(browser, y02.a, null, new uc0(i, browser, iCurrentTimeMillis, (b81) null), 2);
            }
            ArrayList arrayList3 = new ArrayList();
            List listH = fwc.h("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE");
            boolean zH = browser.w().l().h("useFingerToStart", false);
            if (zH && new m60(browser.w(), "appStart").c == null) {
                zH = false;
            }
            String strG = browser.w().l().g("startupPassword", null);
            if (strG == null || strG.length() <= 0) {
                strG = null;
            }
            r20 r20Var = browser.b0().h;
            if (r20Var != null) {
                r20Var.H(browser);
            }
            if (strG != null || zH) {
                App appW2 = browser.w();
                if (appW2.j0 == 0 || ((int) ((System.currentTimeMillis() - appW2.j0) / 1000)) >= 15) {
                    lc0 lc0Var = new lc0(zH, strG, browser, browser.w());
                    int i11 = strG != null ? 1 : 0;
                    if (zH) {
                        i11 |= 2;
                    }
                    int i12 = i11;
                    browser.H0.setValue(Boolean.TRUE);
                    m60.g(lc0Var, this, R.drawable.lock, browser.getString(zH ? R.string.use_fingerprint : R.string.enter_password_), i12, null, 16);
                    browser = this;
                } else {
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 30 && !Environment.isExternalStorageManager()) {
                        try {
                            Uri uri = Uri.parse("package:" + browser.w().getPackageName());
                            uri.getClass();
                            browser.J(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", uri), 18);
                        } catch (Exception e) {
                            if (!browser.w().b) {
                                App appW3 = browser.w();
                                appW3.j0(appW3, se8.k(e), true);
                            } else if (browser.checkSelfPermission((String) xr0.z(listH)) != 0) {
                                cs0.q(arrayList3, listH);
                            }
                        }
                    } else if (i13 <= 29 && browser.checkSelfPermission((String) xr0.z(listH)) != 0) {
                        cs0.q(arrayList3, listH);
                    } else if (i13 >= 33 && browser.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                        try {
                            browser.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 2);
                        } catch (Exception e2) {
                            browser.v0(e2);
                        }
                    } else if (i13 >= 37 && browser.checkSelfPermission("android.permission.ACCESS_LOCAL_NETWORK") != 0) {
                        try {
                            browser.requestPermissions(new String[]{"android.permission.ACCESS_LOCAL_NETWORK"}, 4);
                        } catch (Exception e3) {
                            browser.v0(e3);
                        }
                    } else if (hc0Var2 == null && !browser.w().l().h("demoShown", false)) {
                        kab.d(browser, null, null, new nc0(browser, null), 3);
                        il1.w(browser.w().l(), "demoShown", true);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                try {
                    browser.requestPermissions((String[]) arrayList3.toArray(new String[0]), 1);
                } catch (Exception e4) {
                    browser.v0(e4);
                }
            }
            d60 d60Var = d60.a;
            browser.C0.setValue(Boolean.valueOf(d60.l()));
        } catch (Exception e5) {
            Handler handler = App.M0;
            qp9.d(e5);
            browser.w().e(e5);
            browser.w().k0("Startup failed due to system error", false);
            browser.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jv2, android.app.Activity
    public final void onDestroy() {
        gc0 gc0VarZ;
        CopyMoveService copyMoveService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        boolean zIsTerminated3;
        super.onDestroy();
        pg7 pg7Var = this.A0;
        if (pg7Var != null) {
            pg7Var.d(null);
        }
        w().B0.remove(this);
        AutoCloseable autoCloseable = this.L0;
        TimeUnit timeUnit = TimeUnit.DAYS;
        boolean z = false;
        if (autoCloseable != null) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    sp1.l();
                    return;
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated3 = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z2 = false;
                    while (!zIsTerminated3) {
                        try {
                            zIsTerminated3 = executorService.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused) {
                            if (!z2) {
                                executorService.shutdownNow();
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f0 != null) {
            for (jt5 jt5Var : b0().b) {
                boolean zIsFinishing = isFinishing();
                ListIterator listIterator = jt5Var.k.listIterator();
                while (true) {
                    l83 l83Var = (l83) listIterator;
                    if (!l83Var.hasNext()) {
                        break;
                    }
                    ng4 ng4Var = (ng4) l83Var.next();
                    ne8 ne8Var = ng4Var instanceof ne8 ? (ne8) ng4Var : null;
                    if (zIsFinishing) {
                        ng4Var.B();
                        if (ne8Var != null) {
                            ne8Var.M0();
                        }
                    } else if (ne8Var != null) {
                        ne8Var.J0();
                    }
                }
                AutoCloseable autoCloseable2 = jt5Var.O;
                if (autoCloseable2 != null) {
                    if (autoCloseable2 instanceof AutoCloseable) {
                        autoCloseable2.close();
                    } else {
                        if (!(autoCloseable2 instanceof ExecutorService)) {
                            sp1.l();
                            return;
                        }
                        ExecutorService executorService2 = (ExecutorService) autoCloseable2;
                        if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                            executorService2.shutdown();
                            boolean z3 = false;
                            while (!zIsTerminated2) {
                                try {
                                    zIsTerminated2 = executorService2.awaitTermination(1L, timeUnit);
                                } catch (InterruptedException unused2) {
                                    if (!z3) {
                                        executorService2.shutdownNow();
                                        z3 = true;
                                    }
                                }
                            }
                            if (z3) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }
                jt5Var.O = null;
            }
            if (isFinishing()) {
                b0().j();
            }
        }
        t81 t81Var = w().R;
        if (t81Var != null && (copyMoveService = w().Q) != null) {
            x94 x94Var = t81Var.e;
            if (x94Var != null) {
                x94Var.i();
            }
            t81Var.e = null;
            x94 x94Var2 = copyMoveService.d;
            if (x94Var2 != 0) {
                if (x94Var2 instanceof AutoCloseable) {
                    x94Var2.i();
                } else {
                    if (!(x94Var2 instanceof ExecutorService)) {
                        sp1.l();
                        return;
                    }
                    ExecutorService executorService3 = (ExecutorService) x94Var2;
                    if (executorService3 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService3.isTerminated())) {
                        executorService3.shutdown();
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService3.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused3) {
                                if (!z) {
                                    executorService3.shutdownNow();
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
            copyMoveService.d = null;
        }
        if (!isFinishing() && (gc0VarZ = Z()) != null) {
            gc0VarZ.b();
        }
        n1c.b(this.d0.b, null);
    }

    @Override // defpackage.j30, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        rk5 rk5Var;
        keyEvent.getClass();
        if (i == 4) {
            th.r(300, this.K0);
        } else if (i == 24 || i == 25) {
            AudioManager audioManager = this.e0;
            if (audioManager == null) {
                hm3.l("audioManager");
                throw null;
            }
            if (audioManager.isMusicActive()) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        if (Z() == null) {
            if (keyEvent.getRepeatCount() == 0) {
                rk5 rk5Var2 = (rk5) ((Map) w().u().c).get(Integer.valueOf(i));
                this.I0 = rk5Var2;
                this.J0 = rk5Var2 == null ? 0 : i;
            }
            if (this.J0 == i) {
                if (keyEvent.isLongPress() && (rk5Var = this.I0) != null) {
                    n0(rk5Var, i, true);
                }
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i == 4) {
            Handler handler = th.a;
            pb0 pb0Var = this.K0;
            pb0Var.getClass();
            th.a.removeCallbacks(pb0Var);
        } else if ((i == 24 || i == 25) && w().A0 != null) {
            return super.onKeyUp(i, keyEvent);
        }
        if (this.J0 != i) {
            this.J0 = 0;
            return super.onKeyUp(i, keyEvent);
        }
        rk5 rk5Var = this.I0;
        if (rk5Var != null) {
            n0(rk5Var, i, false);
        }
        this.J0 = 0;
        return true;
    }

    @Override // defpackage.j30, defpackage.mu0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        f0(intent, false);
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f0 != null) {
            bd0 bd0VarB0 = b0();
            zc0 zc0Var = bd0VarB0.n;
            if (zc0Var.b) {
                zc0Var.run();
            }
            bd0VarB0.a.n().e.remove(bd0VarB0);
            for (jt5 jt5Var : b0().b) {
                zc0 zc0Var2 = jt5Var.Q;
                if (zc0Var2 != null && zc0Var2.b) {
                    th.a.removeCallbacks(zc0Var2);
                    zc0Var2.run();
                }
            }
            this.y0 = true;
        }
        App appW = w();
        synchronized (appW) {
            if (appW.D0 == this) {
                appW.D0 = null;
            }
        }
        w().y().x();
        b10 b10VarS = w().s();
        synchronized (b10VarS) {
            ((LinkedHashMap) b10VarS.d).clear();
            ((LinkedHashMap) b10VarS.e).clear();
        }
        ey0 ey0VarC0 = c0();
        LinkedHashSet linkedHashSet = (LinkedHashSet) ey0VarC0.K;
        if (!linkedHashSet.isEmpty()) {
            Iterator it = new ArrayList(linkedHashSet).iterator();
            it.getClass();
            while (it.hasNext()) {
                ((jz7) it.next()).a();
            }
        }
        ((IdentityHashMap) ey0VarC0.I).clear();
        String[] strArr = FileContentProvider.d;
        n20.m(w(), kh2.K);
        App.M0.removeCallbacks(this.G0);
        pg7 pg7Var = this.M0;
        if (pg7Var != null) {
            pg7Var.d(null);
        }
        this.M0 = null;
    }

    @Override // defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (i == 1) {
            if (iArr[0] != 0) {
                w().k0("Internal memory won't be shown. Restart and allow access.", true);
                return;
            }
            aj4 aj4Var = aj4.k;
            k5d.l(w());
            B();
            return;
        }
        if (i == 2) {
            if (iArr[0] != 0) {
                Handler handler = App.M0;
            }
        } else if (i == 4 && iArr[0] != 0) {
            Handler handler2 = App.M0;
        }
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onResume() {
        App appW = w();
        synchronized (appW) {
            appW.D0 = this;
        }
        d0();
        d60 d60Var = d60.a;
        this.C0.setValue(Boolean.valueOf(d60.l()));
        super.onResume();
        String[] strArr = FileContentProvider.d;
        n20.m(w(), kh2.K);
        if (this.f0 != null) {
            bd0 bd0VarB0 = b0();
            bd0VarB0.a.n().e.add(bd0VarB0);
            for (jt5 jt5Var : b0().b) {
                int i = jt5Var.b;
                jt5Var.l0();
                App app = jt5Var.a;
                boolean zO = app.O();
                qy1 qy1Var = jt5Var.K;
                b81 b81Var = null;
                if (!zO) {
                    if (qy1Var != null) {
                        jt5Var.g0(qy1Var);
                    }
                    jt5Var.K = null;
                } else if (qy1Var == null) {
                    if (jt5Var.a.l().h(i + "showParagon", i == 0) && app.O()) {
                        jt5Var.m(jt5Var.G());
                    }
                }
                jt5Var.d0();
                if (jt5Var.R != -1) {
                    int iE = jt5Var.E();
                    cd6 cd6Var = new cd6();
                    cd6Var.a = -1;
                    int i2 = jt5Var.R;
                    if (i2 < iE) {
                        cd6Var.a = i2;
                    } else {
                        int iH = jt5Var.H();
                        int i3 = jt5Var.R;
                        if (i3 > iH) {
                            cd6Var.a = i3;
                        }
                    }
                    if (cd6Var.a != -1) {
                        kab.d(x2d.e(jt5Var.B()), null, null, new cz1(jt5Var, cd6Var, b81Var, 28), 3);
                    }
                    jt5Var.R = -1;
                }
                if (this.y0) {
                    jt5Var.i0(false);
                }
            }
        }
        j0();
        if (this.z0) {
            this.z0 = false;
            k0();
        }
    }

    @Override // defpackage.jv2, android.app.Activity
    public void onStart() {
        super.onStart();
        j30.z(this);
        zcd.c(w());
        d60 d60Var = d60.a;
        d60.k = this;
        if (d60.b()) {
            i0();
        } else {
            p0();
        }
        w().g0(this);
        if (this.f0 != null) {
            Intent intent = getIntent();
            if (intent == null || intent.getAction() == null || hm3.b(intent.getAction(), "android.intent.action.MAIN")) {
                W(true);
            }
            b0().g = false;
        }
        long j = w().B().getLong("scc", 0L);
        String[] strArr = se8.a;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (jCurrentTimeMillis > j || jCurrentTimeMillis + 1728000 < j) {
            kab.d(x2d.e(this), null, null, new kc0(this, null, 5), 3);
        }
        U();
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onStop() {
        super.onStop();
        d60 d60Var = d60.a;
        if (d60.k == this) {
            d60.k = null;
        }
        App appW = w();
        if (appW.i0 == this) {
            appW.g0(null);
            bd8 bd8Var = bd8.a;
            try {
                ec ecVar = bd8.d;
                if (ecVar != null) {
                    appW.unregisterReceiver(ecVar);
                }
                bd8.d = null;
            } catch (Exception unused) {
            }
            if (appW.j0 != 0) {
                String[] strArr = se8.a;
                appW.j0 = System.currentTimeMillis();
            }
        }
        if (isChangingConfigurations()) {
            return;
        }
        pp0 pp0VarY = Y();
        if (pp0VarY.c().isEmpty()) {
            pp0VarY.j(false);
        } else {
            pp0VarY.h();
        }
        pp0VarY.a.q0(true);
    }

    public final void p0() {
        boolean zIsTerminated;
        if (this.N0) {
            this.N0 = false;
            for (jt5 jt5Var : b0().b) {
                AutoCloseable autoCloseable = jt5Var.O;
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else {
                        if (!(autoCloseable instanceof ExecutorService)) {
                            sp1.l();
                            return;
                        }
                        ExecutorService executorService = (ExecutorService) autoCloseable;
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
                jt5Var.O = null;
                jt5Var.P.setValue(null);
            }
            ec0 ec0Var = this.L0;
            if (ec0Var != null) {
                ec0Var.c();
            }
            this.L0 = null;
        }
        b0();
    }

    @Override // defpackage.ib1
    public final za1 q() {
        return this.d0.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[LOOP:3: B:21:0x007c->B:23:0x0082, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q0(boolean z) {
        Iterator it;
        int iNextInt;
        qf qfVar = this.i0;
        if (qfVar == null) {
            hm3.l("buttonsBar");
            throw null;
        }
        vc7 vc7Var = (vc7) qfVar.e;
        ListIterator listIterator = ((vc7) qfVar.d).listIterator();
        while (true) {
            l83 l83Var = (l83) listIterator;
            if (!l83Var.hasNext()) {
                break;
            } else {
                ((ac0) l83Var.next()).b(z);
            }
        }
        List list = (List) ((Browser) qfVar.f).w().C().d;
        if (vc7Var.size() == list.size()) {
            Iterable iterableE = fwc.e(list);
            if (!(iterableE instanceof Collection) || !((Collection) iterableE).isEmpty()) {
                Iterator it2 = iterableE.iterator();
                do {
                    ok3 ok3Var = (ok3) it2;
                    if (!ok3Var.c) {
                        break;
                    } else {
                        iNextInt = ok3Var.nextInt();
                    }
                } while (hm3.b(((ac0) vc7Var.get(iNextInt)).d, list.get(iNextInt)));
                vc7Var.clear();
                it = list.iterator();
                while (it.hasNext()) {
                    vc7Var.add(new ac0(qfVar, (rk5) it.next()));
                }
            }
        } else {
            vc7Var.clear();
            it = list.iterator();
            while (it.hasNext()) {
            }
        }
        ListIterator listIterator2 = vc7Var.listIterator();
        while (true) {
            l83 l83Var2 = (l83) listIterator2;
            if (!l83Var2.hasNext()) {
                return;
            } else {
                ((ac0) l83Var2.next()).b(z);
            }
        }
    }

    @Override // defpackage.j30
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        wx2 wx2Var;
        zz2 zz2Var2 = zz2Var;
        zz2Var2.X(-1322894321);
        w15 w15Var = uc4.b;
        w15 w15VarI = f2c.i(w15Var, qq5Var);
        jq4 jq4VarC = ga0.c(j72.b, false);
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
        hi hiVar = zv0.f;
        tq4.g(hiVar, zz2Var2, jq4VarC);
        hi hiVar2 = zv0.e;
        tq4.g(hiVar2, zz2Var2, hx5VarL);
        Integer numValueOf = Integer.valueOf(iHashCode);
        hi hiVar3 = zv0.g;
        tq4.g(hiVar3, zz2Var2, numValueOf);
        yc ycVar = zv0.h;
        tq4.f(zz2Var2, ycVar);
        hi hiVar4 = zv0.d;
        tq4.g(hiVar4, zz2Var2, w15VarH);
        ws0 ws0VarA = vs0.a(b52.c, j72.Q, zz2Var2, 0);
        int iHashCode2 = Long.hashCode(zz2Var2.T);
        hx5 hx5VarL2 = zz2Var2.l();
        w15 w15VarH2 = dyc.h(zz2Var2, w15Var);
        zz2Var2.a0();
        if (zz2Var2.S) {
            zz2Var2.k(ax0Var);
        } else {
            zz2Var2.j0();
        }
        tq4.g(hiVar, zz2Var2, ws0VarA);
        tq4.g(hiVar2, zz2Var2, hx5VarL2);
        tv0.s(iHashCode2, zz2Var2, hiVar3, zz2Var2, ycVar);
        tq4.g(hiVar4, zz2Var2, w15VarH2);
        boolean z = this.h0;
        j72 j72Var = gw0.a;
        int i2 = 1;
        if (z) {
            zz2Var2.X(1424368984);
            CharSequence title = getTitle();
            boolean zH = zz2Var2.h(this);
            Object objL = zz2Var2.L();
            if (zH || objL == j72Var) {
                objL = new v1(this, 4);
                zz2Var2.g0(objL);
            }
            tx2 tx2Var = (tx2) objL;
            yu0 yu0VarG = jxc.g(1011712139, new c30(i2, this), zz2Var2);
            if (a0()) {
                zz2Var2.X(1426054640);
                boolean zH2 = zz2Var2.h(this);
                Object objL2 = zz2Var2.L();
                if (zH2 || objL2 == j72Var) {
                    objL2 = new w1(this, 2);
                    zz2Var2.g0(objL2);
                }
                wx2Var = (wx2) objL2;
                zz2Var2.p(false);
            } else {
                zz2Var2.X(1427259082);
                zz2Var2.p(false);
                wx2Var = null;
            }
            e2d.a(title, null, 0L, tx2Var, yu0VarG, null, false, wx2Var, zz2Var, 24576, 102);
            zz2Var2 = zz2Var;
            zz2Var2.p(false);
        } else {
            zz2Var2.X(1427281775);
            zz2Var2.p(false);
        }
        if (((Boolean) this.H0.getValue()).booleanValue()) {
            zz2Var2.X(1427562511);
            zz2Var2.p(false);
        } else {
            zz2Var2.X(1427326105);
            O(uc4.a.e(new d44(1.0f, true)).e(this.w0), zz2Var2, i & 112);
            pp0 pp0VarY = Y();
            int i3 = pp0.K;
            uc4.c(pp0VarY, zz2Var2, 8);
            zz2Var2.p(false);
        }
        zz2Var2.p(true);
        ga0.a(hm3.d(qa0.a.a(a87.k(t15.a, 2.0f, 1.0f), j72.K), this.t0, sfc.a), zz2Var2, 0);
        if (((Boolean) this.P0.getValue()).booleanValue()) {
            zz2Var2.X(773964658);
            Integer numValueOf2 = Integer.valueOf(R.string.update_available);
            Integer numValueOf3 = Integer.valueOf(R.string.restart);
            boolean zH3 = zz2Var2.h(this);
            Object objL3 = zz2Var2.L();
            if (zH3 || objL3 == j72Var) {
                objL3 = new v1(this, 5);
                zz2Var2.g0(objL3);
            }
            e1d.a(numValueOf2, null, null, 0L, numValueOf3, (tx2) objL3, zz2Var2, 3078, 10);
            zz2Var2.p(false);
        } else {
            zz2Var2.X(774177907);
            String str = (String) this.s0.getValue();
            tqb tqbVar = f62.b;
            f62 f62Var = new f62(z9d.h(10, j62.SECONDS));
            boolean zH4 = zz2Var2.h(this);
            Object objL4 = zz2Var2.L();
            if (zH4 || objL4 == j72Var) {
                objL4 = new v1(this, 6);
                zz2Var2.g0(objL4);
            }
            e1d.a(str, null, f62Var, 0L, null, (tx2) objL4, zz2Var2, 6, 26);
            zz2Var2.p(false);
        }
        zz2Var2.p(true);
        zz2Var2.p(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(Intent intent) {
        String type;
        ActivityInfo activityInfo;
        int i;
        il1 il1Var = x().a;
        String[] strArr = il1.d;
        boolean zH = il1Var.h("openAsNewTask", false);
        if (zH) {
            intent.addFlags(268435456);
        }
        w();
        App.h(intent);
        if (zH) {
            try {
                i = b0().o == null ? 0 : 2;
            } catch (Exception unused) {
                ComponentName component = intent.getComponent();
                if (component != null && (type = intent.getType()) != null) {
                    PackageManager packageManager = getPackageManager();
                    packageManager.getClass();
                    try {
                        activityInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getActivityInfo(component, PackageManager.ComponentInfoFlags.of(0L)) : packageManager.getActivityInfo(component, 0);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        activityInfo = null;
                    }
                    if (activityInfo != null) {
                        intent.setDataAndType(intent.getData(), "*/*");
                        try {
                            startActivity(intent);
                            return;
                        } catch (Exception e) {
                            Handler handler = App.M0;
                            qp9.d(e);
                            intent.setDataAndType(intent.getData(), "*/*");
                            x0(this, intent, null, null, 14);
                            return;
                        }
                    }
                    if (w().l().b(type)) {
                        String type2 = intent.getType();
                        if (type2 != null) {
                            o0(type2);
                        }
                        intent.setComponent(null);
                        r0(intent);
                        return;
                    }
                }
                intent.setDataAndType(intent.getData(), "*/*");
                x0(this, intent, null, null, 14);
                return;
            }
        }
        J(intent, i);
        if (zH) {
            this.z0 = true;
        }
        String type3 = intent.getType();
        if (type3 != null) {
            w().r0("view_item", "content_type", type3);
        }
    }

    public final void s0(jt5 jt5Var, ng4 ng4Var, Intent intent) {
        qy1 qy1Var;
        jt5Var.getClass();
        ng4Var.getClass();
        ComponentName component = intent.getComponent();
        String className = component != null ? component.getClassName() : null;
        if (component != null && hm3.b(component.getPackageName(), getPackageName())) {
            if (hm3.b(className, ImageViewer.class.getName())) {
                String strY = ng4Var.Y();
                if (hm3.b(strY != null ? jj7.f0(strY, '/') : null, "image")) {
                    dl2 dl2Var = ng4Var.J;
                    vc7 vc7Var = jt5Var.k;
                    int size = vc7Var.size();
                    int iIndexOf = vc7Var.indexOf(ng4Var);
                    while (iIndexOf > 0 && ((ng4) vc7Var.get(iIndexOf - 1)).I == ng4Var.I) {
                        iIndexOf--;
                    }
                    mg4 mg4Var = new mg4(jt5Var, dl2Var.a);
                    if (iIndexOf >= 0) {
                        while (iIndexOf < size) {
                            ng4 ng4Var2 = (ng4) vc7Var.get(iIndexOf);
                            if (ng4Var2.I != ng4Var.I) {
                                break;
                            }
                            int i = ImageViewer.d1;
                            if (xxa.e(ng4Var2)) {
                                ArrayList arrayList = mg4Var.c;
                                if (ng4Var2 == ng4Var) {
                                    mg4Var.o(arrayList.size());
                                }
                                arrayList.add(ng4Var2);
                            }
                            iIndexOf++;
                        }
                    }
                    dl2Var.a.o0 = mg4Var;
                }
            } else if (hm3.b(className, MusicPlayerUi.class.getName())) {
                App appW = w();
                List listG = fwc.g(ng4Var);
                Handler handler = App.M0;
                appW.J(listG, true);
                intent.putExtra("connect_to_player", true);
            }
        }
        w().c();
        if (w().o0 == null) {
            boolean z = ng4Var.b0() instanceof i40;
            if (hm3.b(className, VideoPlayer.class.getName()) || hm3.b(className, MusicPlayerUi.class.getName())) {
                intent.setDataAndType(ng4Var.N(), intent.getType()).getClass();
            } else if (ng4Var.B0()) {
                try {
                    String type = intent.getType();
                    int[] iArr = wi7.L;
                    wi7 wi7VarA = k85.a(ng4Var, type);
                    w().P = wi7VarA;
                    Uri uri = Uri.parse(wi7VarA.d());
                    uri.getClass();
                    intent.setDataAndType(uri, type).getClass();
                } catch (IOException unused) {
                    this.s0.setValue("Can't stream file: ".concat(ng4Var.T()).toString());
                }
            } else if (!z && !ng4Var.l0()) {
                new ej5(this, intent, ng4Var, new w1(this, 3));
                return;
            } else if (!hm3.b(intent.getScheme(), "content")) {
                intent.setDataAndType(ng4Var.N(), intent.getType());
            }
            String strY2 = ng4Var.Y();
            if (hm3.b(strY2 != null ? jj7.f0(strY2, '/') : null, "text") && !intent.hasExtra("com.lonelycatgames.Xplore.contentUri") && (qy1Var = ng4Var.L) != null && qy1Var.J.i(qy1Var)) {
                intent.putExtra("com.lonelycatgames.Xplore.contentUri", ng4Var.N());
            }
        }
        if (intent.getComponent() != null) {
            ng4Var.T();
            r0(intent);
            return;
        }
        PackageManager packageManager = w().getPackageManager();
        packageManager.getClass();
        if (ce0.B(packageManager, intent, 131072).size() != 1) {
            x0(this, intent, ng4Var.a0(), ng4Var, 8);
        } else {
            ng4Var.T();
            r0(intent);
        }
    }

    public final void v0(Exception exc) {
        this.s0.setValue(se8.k(exc).toString());
    }

    public final void w0(final Intent intent, final String str, final ng4 ng4Var, int i) {
        Object next;
        ed6 ed6Var = new ed6();
        List listJ = il5.j(w(), intent, 131072);
        ComponentName componentNameC = w().l().c(str, true);
        if (componentNameC != null) {
            List list = listJ;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                k8 k8Var = (k8) next;
                k8Var.getClass();
                ActivityInfo activityInfo = k8Var.a;
                if (new ComponentName(activityInfo.packageName, activityInfo.name).equals(componentNameC)) {
                    break;
                }
            }
            k8 k8Var2 = (k8) next;
            if (k8Var2 != null) {
                listJ = xr0.P(fwc.g(k8Var2), xr0.L(list, k8Var2));
            }
        }
        ed6Var.a = listJ;
        int i2 = 0;
        if (listJ.isEmpty()) {
            qsb qsbVar = b0().q;
            es5[] es5VarArr = W0;
            ArrayList arrayList = new ArrayList(es5VarArr.length);
            int length = es5VarArr.length;
            while (i2 < length) {
                arrayList.add(Integer.valueOf(((Number) es5VarArr[i2].a).intValue()));
                i2++;
            }
            x94.n(qsb.D(qsbVar, arrayList, Integer.valueOf(R.drawable.op_open_by_system), Integer.valueOf(R.string.open_as), null, new ni(intent, this, str, ng4Var, 2), 8), null, new e1(13), 3);
            return;
        }
        cd6 cd6Var = new cd6();
        cd6Var.a = i;
        final vu5 vu5VarC = yzc.c(Boolean.FALSE);
        final ad6 ad6Var = new ad6();
        il1 il1Var = x().a;
        String[] strArr = il1.d;
        ad6Var.a = il1Var.h("openAsNewTask", false);
        ga4 ga4Var = new ga4(b0().q, (List) ed6Var.a, null, Integer.valueOf(i == -1 ? R.string.open_with_ : R.string.open_as), null, new yu0(1900397259, new xb0(str, i2, vu5VarC), true), new yu0(723498847, new ky2() { // from class: yb0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [rb0] */
            @Override // defpackage.ky2
            public final Object I(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int i3;
                final ga4 ga4Var2 = (ga4) obj;
                final k8 k8Var3 = (k8) obj2;
                w15 w15Var = (w15) obj3;
                zz2 zz2Var = (zz2) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                float[] fArr = Browser.V0;
                k8Var3.getClass();
                w15Var.getClass();
                if ((iIntValue & 6) == 0) {
                    i3 = ((iIntValue & 8) == 0 ? zz2Var.f(ga4Var2) : zz2Var.h(ga4Var2) ? 4 : 2) | iIntValue;
                } else {
                    i3 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i3 |= (iIntValue & 64) == 0 ? zz2Var.f(k8Var3) : zz2Var.h(k8Var3) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i3 |= zz2Var.f(w15Var) ? 256 : 128;
                }
                if (zz2Var.O(i3 & 1, (i3 & 1171) != 1170)) {
                    final String str2 = str;
                    final Intent intent2 = intent;
                    final ad6 ad6Var2 = ad6Var;
                    final Browser browser = this;
                    final ng4 ng4Var2 = ng4Var;
                    final vu5 vu5Var = vu5VarC;
                    k8Var3.a(w15Var, new tx2() { // from class: rb0
                        @Override // defpackage.tx2
                        public final Object d() {
                            float[] fArr2 = Browser.V0;
                            ga4Var2.i();
                            ActivityInfo activityInfo2 = k8Var3.a;
                            ComponentName componentName = new ComponentName(activityInfo2.packageName, activityInfo2.name);
                            String str3 = str2;
                            Browser browser2 = browser;
                            if (str3 != null) {
                                int i4 = 7;
                                browser2.w().l().q(new g71("*".concat(str3), i4, new ComponentName(componentName.getPackageName(), componentName.getClassName())));
                                if (((Boolean) vu5Var.getValue()).booleanValue()) {
                                    browser2.w().l().q(new g71(str3, i4, componentName));
                                    browser2.o0(str3);
                                }
                            }
                            Intent intent3 = intent2;
                            intent3.setComponent(componentName);
                            ad6 ad6Var3 = ad6Var2;
                            if (ad6Var3.a) {
                                intent3.addFlags(268435456);
                                browser2.z0 = true;
                            }
                            ng4 ng4Var3 = ng4Var2;
                            if (ng4Var3 == null || !hm3.b(componentName.getPackageName(), browser2.getPackageName())) {
                                browser2.K(intent3, ad6Var3.a ? 0 : 2);
                            } else {
                                browser2.s0(browser2.b0().g(), ng4Var3, intent3);
                            }
                            return sa8.a;
                        }
                    }, zz2Var, ((i3 >> 6) & 14) | 512 | ((i3 << 3) & 896));
                } else {
                    zz2Var.R();
                }
                return sa8.a;
            }
        }, true), 116);
        ga4Var.O = new zb0(ad6Var, cd6Var, intent, this, ed6Var, ga4Var, 0);
        ga4Var.N = false;
    }

    @Override // defpackage.j30
    public final qsb y() {
        return b0().q;
    }

    public final void y0(Intent intent, hy2 hy2Var) {
        intent.getClass();
        this.E0 = hy2Var;
        J(intent, 17);
    }

    public final void z0() {
        if (x().E) {
            Handler handler = App.M0;
            Log.e("X-plore", "swapPanes called in single pane mode");
        }
        Q(1 - b0().e.h());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(Intent intent, boolean z) {
        String strSubstring;
        int iH;
        boolean booleanExtra;
        boolean z2;
        Uri data;
        boolean z3;
        boolean z4;
        il1 il1Var;
        String action;
        String stringExtra;
        String strF;
        int iHashCode;
        String stringExtra2;
        ed6 ed6Var = new ed6();
        bd0 bd0VarB0 = b0();
        jt5[] jt5VarArr = bd0VarB0.b;
        su5 su5Var = bd0VarB0.e;
        if (intent == null || (action = intent.getAction()) == null) {
            strSubstring = null;
            iH = -1;
            booleanExtra = false;
        } else {
            int iHashCode2 = action.hashCode();
            if (iHashCode2 != -1173171990) {
                if (iHashCode2 != -836592640) {
                    if (iHashCode2 == 1764089131 && action.equals("askDonation") && !this.F0 && (stringExtra2 = intent.getStringExtra("paidFunc")) != null) {
                        E(zr5.valueOf(stringExtra2), null);
                    }
                } else if (action.equals("org.openintents.action.VIEW_DIRECTORY")) {
                    Uri data2 = intent.getData();
                    if (data2 == null) {
                        try {
                            stringExtra = intent.getStringExtra("shortcut");
                        } catch (Exception e) {
                            e = e;
                            iH = -1;
                        }
                        if (stringExtra != null) {
                            iH = Integer.parseInt(jj7.i0(1, stringExtra));
                            try {
                            } catch (Exception e2) {
                                e = e2;
                                Handler handler = App.M0;
                                qp9.d(e);
                            }
                            if (x().E) {
                                strSubstring = null;
                                iH = 0;
                            } else {
                                strSubstring = (iH < 0 || iH >= 2) ? null : stringExtra.substring(2);
                            }
                            booleanExtra = false;
                        } else {
                            String stringExtra3 = intent.getStringExtra("goToPath");
                            if (stringExtra3 != null) {
                                ed6Var.a = stringExtra3;
                            }
                        }
                    } else if (th.n(data2) && data2.getPath() != null) {
                        this.B0 = true;
                        strSubstring = th.l(data2);
                        booleanExtra = intent.getBooleanExtra("openStandalone", false);
                        if (!booleanExtra && !new File(strSubstring).isDirectory()) {
                            Map map = i40.h;
                            if (is.g(intent.getType(), i40.i) || ((strF = se8.f(strSubstring)) != null && ((iHashCode = strF.hashCode()) == 1827 ? strF.equals("7z") : iHashCode == 104987 ? strF.equals("jar") : !(iHashCode == 112675 ? !strF.equals("rar") : !(iHashCode == 120609 && strF.equals("zip")))))) {
                                booleanExtra = true;
                            }
                        }
                        if (booleanExtra) {
                            iH = 0;
                        } else {
                            strSubstring = strSubstring.concat(VjDVzYb.XkCMINjF);
                            iH = -1;
                        }
                    } else if (hm3.b(data2.getScheme(), "content")) {
                        this.B0 = true;
                        ContentResolver contentResolver = getContentResolver();
                        contentResolver.getClass();
                        Long lI = th.i(contentResolver, data2);
                        long jLongValue = lI != null ? lI.longValue() : -1L;
                        ContentResolver contentResolver2 = getContentResolver();
                        contentResolver2.getClass();
                        try {
                            new fc0(this, bd0VarB0, data2, th.g(contentResolver2, data2), jLongValue);
                            strSubstring = "";
                            booleanExtra = true;
                            iH = 0;
                        } catch (Exception e3) {
                            iH = -1;
                            booleanExtra = false;
                            this.s0.setValue(se8.k(e3).toString());
                            strSubstring = null;
                        }
                    }
                }
                strSubstring = null;
                iH = -1;
                booleanExtra = false;
            } else if (!action.equals("android.intent.action.VIEW")) {
            }
        }
        if (z) {
            z2 = false;
            for (int i = 0; i < 2; i++) {
                jt5 jt5Var = jt5VarArr[i];
                qy1 qy1Var = jt5Var.y;
                qy1Var.getClass();
                jt5Var.o0(qy1Var);
            }
        } else {
            il1 il1VarL = w().l();
            boolean zH = il1VarL.h("rememberLastPath", true);
            su5Var.i(zH ? (int) il1VarL.i("activePane", 0L) : 0);
            if (strSubstring != null || ed6Var.a != null) {
                if (iH == -1) {
                    iH = su5Var.h();
                } else {
                    su5Var.i(iH);
                }
            }
            int i2 = 0;
            for (int i3 = 2; i2 < i3; i3 = 2) {
                jt5 jt5Var2 = jt5VarArr[i2];
                if (!zH) {
                    jt5Var2.u(null);
                }
                String strG = zH ? il1VarL.g("pane_path" + i2, null) : null;
                boolean z5 = strSubstring != null && i2 == iH;
                if (z5) {
                    strG = strSubstring;
                    z3 = true;
                } else {
                    Object obj = ed6Var.a;
                    if (obj != null && i2 == iH) {
                        strG = (String) obj;
                    }
                    z3 = false;
                }
                if (strG == null) {
                    z4 = booleanExtra;
                    il1Var = il1VarL;
                    ListIterator listIterator = jt5Var2.k.listIterator();
                    while (true) {
                        l83 l83Var = (l83) listIterator;
                        if (l83Var.hasNext()) {
                            ng4 ng4Var = (ng4) l83Var.next();
                            if (ng4Var instanceof qy1) {
                                jt5Var2.o0((qy1) ng4Var);
                                break;
                            }
                        }
                    }
                } else if (z5 && booleanExtra) {
                    z4 = booleanExtra;
                    il1Var = il1VarL;
                    jt5Var2.a0(strG, null, intent != null ? intent.getType() : null, true);
                } else {
                    z4 = booleanExtra;
                    il1Var = il1VarL;
                    jt5Var2.p0(strG, z5, z3, false, new h60(this, ed6Var, intent));
                }
                i2++;
                il1VarL = il1Var;
                booleanExtra = z4;
            }
            if (zH || iH != -1) {
                z2 = false;
            } else {
                z2 = false;
                Q(0);
            }
        }
        int iH2 = su5Var.h();
        su5Var.i(-1);
        bd0VarB0.f(iH2);
        t81 t81Var = w().R;
        if (t81Var != null) {
            if (intent == null) {
                e.k("Required value was null.");
                return;
            } else if (intent.getBooleanExtra("showDialog", z2)) {
                intent.removeExtra("showDialog");
                t81Var.H(this);
            } else if (t81Var.z && t81Var.e == null) {
                t81Var.H(this);
            }
        }
        if (intent != null && hm3.b(intent.getAction(), "android.intent.action.VIEW") && (data = intent.getData()) != null && hm3.b(data.getScheme(), "xplore") && hm3.b(data.getAuthority(), "app")) {
            String queryParameter = data.getQueryParameter("state");
            if (queryParameter == null) {
                queryParameter = new Uri.Builder().encodedQuery(data.getFragment()).build().getQueryParameter("state");
            }
            if (queryParameter != null) {
                g0(this, data, bd0VarB0, queryParameter, bd0VarB0.g());
            }
        }
    }
}
