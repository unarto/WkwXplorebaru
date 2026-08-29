package com.lonelycatgames.Xplore.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import android.media.aA.rOIT;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.FileContentProvider;
import com.lonelycatgames.Xplore.R;
import defpackage.a16;
import defpackage.a87;
import defpackage.ai8;
import defpackage.aq8;
import defpackage.av7;
import defpackage.aw0;
import defpackage.ax0;
import defpackage.b52;
import defpackage.b81;
import defpackage.bi8;
import defpackage.bq8;
import defpackage.c32;
import defpackage.ck9;
import defpackage.cr4;
import defpackage.cs6;
import defpackage.d44;
import defpackage.d60;
import defpackage.d66;
import defpackage.dr4;
import defpackage.dyc;
import defpackage.ei8;
import defpackage.es5;
import defpackage.f2c;
import defpackage.fi8;
import defpackage.ga0;
import defpackage.gi3;
import defpackage.gs0;
import defpackage.gw0;
import defpackage.hi;
import defpackage.hm3;
import defpackage.hx5;
import defpackage.ii8;
import defpackage.il1;
import defpackage.j23;
import defpackage.j30;
import defpackage.j72;
import defpackage.jb4;
import defpackage.jh2;
import defpackage.jq4;
import defpackage.jw7;
import defpackage.jxc;
import defpackage.kab;
import defpackage.kc6;
import defpackage.kh7;
import defpackage.mc6;
import defpackage.md2;
import defpackage.mr;
import defpackage.n0a;
import defpackage.n20;
import defpackage.ng4;
import defpackage.np9;
import defpackage.oh8;
import defpackage.ok0;
import defpackage.ozc;
import defpackage.p83;
import defpackage.pc1;
import defpackage.pg7;
import defpackage.psc;
import defpackage.q50;
import defpackage.qa0;
import defpackage.qi8;
import defpackage.qk3;
import defpackage.qp9;
import defpackage.qq5;
import defpackage.qsb;
import defpackage.r13;
import defpackage.r84;
import defpackage.rl6;
import defpackage.ru5;
import defpackage.s50;
import defpackage.s84;
import defpackage.se8;
import defpackage.sfc;
import defpackage.t15;
import defpackage.td2;
import defpackage.th;
import defpackage.tl6;
import defpackage.tq4;
import defpackage.tv0;
import defpackage.tx2;
import defpackage.uc4;
import defpackage.uc5;
import defpackage.ui;
import defpackage.ui8;
import defpackage.uy9;
import defpackage.vc7;
import defpackage.vi8;
import defpackage.vj1;
import defpackage.vs0;
import defpackage.vu5;
import defpackage.w15;
import defpackage.w36;
import defpackage.w9b;
import defpackage.ws0;
import defpackage.ww7;
import defpackage.wx2;
import defpackage.x2d;
import defpackage.xc5;
import defpackage.xc8;
import defpackage.xpa;
import defpackage.xs0;
import defpackage.yc;
import defpackage.yyc;
import defpackage.yzc;
import defpackage.z55;
import defpackage.zr5;
import defpackage.zv0;
import defpackage.zx9;
import defpackage.zz2;
import java.lang.reflect.InvocationTargetException;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoPlayer extends j30 {
    public static final j23[] J0 = {new j23("utf-8", "UTF-8", false), new j23("Western (8859-1)", "ISO-8859-1", false), new j23("Central/Eastern European (Windows-1250)", "windows-1250", false), new j23("Central/Eastern European (8859-2)", "ISO-8859-2", false), new j23("Western European 8859-15", "ISO-8859-15", false), new j23("Cyrillic (Windows-1251)", "windows-1251", false), new j23("Latin/Cyrillic (8859-5)", "ISO-8859-5", false), new j23("Russian/Cyrillic (koi8-r)", "KOI8-R", false), new j23("Turkish (8859-9)", "ISO-8859-9", false), new j23("Baltic (Windows-1257)", "windows-1257", false), new j23("Baltic (8859-13)", "ISO-8859-13", false), new j23("Greek (8859-7)", "ISO-8859-7", false), new j23("North European (ISO-8859-4)", "ISO-8859-4", false), new j23("Traditional Chinese (Big 5)", "Big5", false), new j23("Simplified Chinese (GBK)", "GBK", false), new j23("Japanese (Shift-JIS)", "Shift_JIS", false), new j23("Korean (euc-kr)", "EUC-KR", false), new j23("Japanese (iso-2022-jp)", "ISO-2022-JP", false), new j23("Simplified Chinese (GB 2312)", "HZ-GB-2312", false), new j23("Hebrew (8859-8)", "ISO-8859-8", false)};
    public static final Integer[] K0 = {50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150};
    public int A0;
    public final StringBuilder B0;
    public final Formatter C0;
    public fi8 D0;
    public boolean E0;
    public pg7 F0;
    public final vu5 G0;
    public final vi8 H0;
    public jb4 I0;
    public td2 d0;
    public int e0;
    public boolean f0;
    public ui8 g0;
    public xc5 h0;
    public fi8 i0;
    public qi8 j0;
    public ii8 k0;
    public int l0;
    public int m0;
    public final vu5 n0;
    public int o0;
    public AudioManager p0;
    public SurfaceView q0;
    public final ru5 r0;
    public final qsb s0;
    public String t0;
    public final vu5 u0;
    public final vu5 v0;
    public pg7 w0;
    public boolean x0;
    public ng4 y0;
    public final boolean z0;

    public VideoPlayer() {
        Boolean bool = Boolean.FALSE;
        this.n0 = yzc.c(bool);
        this.r0 = new ru5(0.0f);
        this.s0 = new qsb(10);
        this.t0 = "";
        this.u0 = yzc.c(bool);
        this.v0 = yzc.c(Boolean.TRUE);
        this.z0 = true;
        this.A0 = 100;
        StringBuilder sb = new StringBuilder();
        this.B0 = sb;
        this.C0 = new Formatter(sb, Locale.getDefault());
        this.G0 = yzc.c(bool);
        this.H0 = new vi8(this, th.a, 0);
    }

    @Override // defpackage.j30
    public final boolean A() {
        return this.z0;
    }

    public final void N(int i, zz2 zz2Var) {
        int i2;
        kc6 kc6VarR;
        bi8 bi8Var;
        zz2Var.Y(-1746541101);
        if ((i & 6) == 0) {
            i2 = (zz2Var.h(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        int i4 = 1;
        if (zz2Var.O(i2 & 1, (i2 & 3) != 2)) {
            kh7 kh7VarB = ui.b(((Boolean) this.u0.getValue()).booleanValue() ? 1.0f : 0.0f, ck9.j(250, 0, null, 6), null, zz2Var, 48, 28);
            if (((Number) kh7VarB.getValue()).floatValue() <= 0.0f) {
                kc6VarR = zz2Var.r();
                if (kc6VarR != null) {
                    bi8Var = new bi8(this, i, i3);
                    kc6VarR.d = bi8Var;
                }
                return;
            }
            w15 w15Var = uc4.b;
            boolean zF = zz2Var.f(kh7VarB);
            Object objL = zz2Var.L();
            if (zF || objL == gw0.a) {
                objL = new av7(kh7VarB, 1);
                zz2Var.g0(objL);
            }
            w15 w15VarC = xpa.c(w15Var, (wx2) objL);
            jq4 jq4VarC = ga0.c(j72.I, false);
            int iHashCode = Long.hashCode(zz2Var.T);
            hx5 hx5VarL = zz2Var.l();
            w15 w15VarH = dyc.h(zz2Var, w15VarC);
            aw0.j.getClass();
            tx2 tx2Var = zv0.b;
            zz2Var.a0();
            if (zz2Var.S) {
                zz2Var.k(tx2Var);
            } else {
                zz2Var.j0();
            }
            tq4.g(zv0.f, zz2Var, jq4VarC);
            tq4.g(zv0.e, zz2Var, hx5VarL);
            tq4.g(zv0.g, zz2Var, Integer.valueOf(iHashCode));
            tq4.f(zz2Var, zv0.h);
            tq4.g(zv0.d, zz2Var, w15VarH);
            d66.a(a87.j(t15.a, 40.0f), 0L, 0.0f, 0L, 0, 0.0f, zz2Var, 6, 62);
            zz2Var.p(true);
        } else {
            zz2Var.R();
        }
        kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            bi8Var = new bi8(this, i, i4);
            kc6VarR.d = bi8Var;
        }
    }

    public final void O(int i, zz2 zz2Var) {
        int i2;
        kc6 kc6VarR;
        bi8 bi8Var;
        zz2Var.Y(-1574143185);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (zz2Var.h(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!zz2Var.O(i2 & 1, (i2 & 3) != 2)) {
            zz2Var.R();
        } else {
            if (!((Boolean) this.v0.getValue()).booleanValue()) {
                kc6VarR = zz2Var.r();
                if (kc6VarR != null) {
                    bi8Var = new bi8(this, i, i3);
                    kc6VarR.d = bi8Var;
                }
                return;
            }
            ga0.a(hm3.d(uc4.b, gs0.b, sfc.a), zz2Var, 0);
        }
        kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            bi8Var = new bi8(this, i, 3);
            kc6VarR.d = bi8Var;
        }
    }

    public final void P(int i) {
        float fPow;
        ui8 ui8Var = this.g0;
        if (ui8Var == null) {
            return;
        }
        if (ui8Var.C) {
            fPow = 0.0f;
        } else {
            fPow = i <= this.l0 ? 1.0f : (float) Math.pow(1.0d + ((double) ((i - r1) / this.m0)), 2.0d);
        }
        dr4 dr4Var = ui8Var.y;
        if (dr4Var != null) {
            dr4Var.J.n(new cr4(dr4Var, fPow, null));
        }
    }

    public final void Q(int i) {
        AudioManager audioManager;
        int iMin = Math.min(i, this.l0);
        try {
            audioManager = this.p0;
        } catch (SecurityException unused) {
        }
        if (audioManager == null) {
            hm3.l("audioManager");
            throw null;
        }
        if (audioManager.getStreamVolume(3) != iMin) {
            AudioManager audioManager2 = this.p0;
            if (audioManager2 == null) {
                hm3.l("audioManager");
                throw null;
            }
            audioManager2.setStreamVolume(3, iMin, 0);
        }
        P(i);
        g0(i);
    }

    public final boolean R() {
        cs6 cs6Var;
        ui8 ui8Var = this.g0;
        return (ui8Var == null || (cs6Var = ui8Var.x) == null || !cs6Var.c()) ? false : true;
    }

    public final void S() {
        float f = (this.A0 * 1.3f) / 100.0f;
        td2 td2Var = this.d0;
        if (td2Var != null) {
            td2Var.setTextSize(f * 0.03f);
        } else {
            hm3.l("subtitleLayout");
            throw null;
        }
    }

    public final void T() {
        if (Z()) {
            if (a0()) {
                c0();
            } else {
                j0();
            }
            qi8 qi8Var = this.j0;
            if (qi8Var == null) {
                hm3.l("mediaControllerProcessor");
                throw null;
            }
            qi8Var.v();
            qi8 qi8Var2 = this.j0;
            if (qi8Var2 != null) {
                qi8Var2.t();
            } else {
                hm3.l("mediaControllerProcessor");
                throw null;
            }
        }
    }

    public final String U(long j) {
        int i;
        int i2 = (((int) (j / 1000)) + 500) / 1000;
        if (i2 >= 3600) {
            i = i2 / 3600;
            i2 -= i * 3600;
        } else {
            i = 0;
        }
        int i3 = i2 / 60;
        int i4 = i2 - (i3 * 60);
        this.B0.setLength(0);
        Formatter formatter = this.C0;
        if (i > 0) {
            formatter.format("%d:%02d:%02d", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4));
        } else {
            formatter.format("%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4));
        }
        String string = formatter.toString();
        string.getClass();
        return string;
    }

    public final String V(String str) {
        SQLiteDatabase sQLiteDatabaseY = Y();
        if (sQLiteDatabaseY != null) {
            try {
                Cursor cursorQuery = sQLiteDatabaseY.query("configuration", new String[]{"value"}, "name=?", new String[]{str}, null, null, null);
                try {
                    String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                    cursorQuery.close();
                    return string;
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final int W() {
        return (int) (X() / 1000);
    }

    public final long X() {
        ui8 ui8Var = this.g0;
        if (ui8Var == null) {
            return 0L;
        }
        Long l = ui8Var.k;
        if (l != null) {
            return l.longValue();
        }
        long j = ui8Var.i;
        return ui8Var.h != -1 ? Math.min(j, ui8Var.h) : j;
    }

    public final SQLiteDatabase Y() {
        try {
            xc5 xc5Var = this.h0;
            if (xc5Var != null) {
                return xc5Var.getWritableDatabase();
            }
            hm3.l("dbHelper");
            throw null;
        } catch (Throwable unused) {
            xc5 xc5Var2 = this.h0;
            if (xc5Var2 == null) {
                hm3.l("dbHelper");
                throw null;
            }
            xc5Var2.close();
            try {
                SQLiteDatabase.deleteDatabase(getDatabasePath("ExoPlayer.db"));
            } catch (NullPointerException e) {
                Handler handler = App.M0;
                qp9.d(e);
            }
            try {
                xc5 xc5Var3 = this.h0;
                if (xc5Var3 != null) {
                    return xc5Var3.getWritableDatabase();
                }
                hm3.l("dbHelper");
                throw null;
            } catch (Throwable th) {
                Handler handler2 = App.M0;
                qp9.d(th);
                return null;
            }
        }
    }

    public final boolean Z() {
        return this.g0 != null;
    }

    public final boolean a0() {
        ui8 ui8Var = this.g0;
        return ui8Var != null && ui8Var.u;
    }

    public final void b0(qk3 qk3Var, tx2 tx2Var) {
        jb4 jb4Var = new jb4(true, new mc6(this, 27, tx2Var), qk3Var, null, false, new ei8(this, 1), 241);
        this.I0 = jb4Var;
        qsb qsbVar = this.s0;
        qsbVar.getClass();
        ((vc7) qsbVar.b).add(jb4Var);
    }

    public final void c0() {
        ui8 ui8Var = this.g0;
        if (ui8Var != null) {
            ui8Var.p(false);
        }
        pg7 pg7Var = this.F0;
        if (pg7Var != null) {
            pg7Var.d(null);
        }
        qi8 qi8Var = this.j0;
        if (qi8Var == null) {
            hm3.l("mediaControllerProcessor");
            throw null;
        }
        qi8Var.v();
        qi8 qi8Var2 = this.j0;
        if (qi8Var2 == null) {
            hm3.l("mediaControllerProcessor");
            throw null;
        }
        qi8Var2.t();
        qi8 qi8Var3 = this.j0;
        if (qi8Var3 == null) {
            hm3.l("mediaControllerProcessor");
            throw null;
        }
        qi8Var3.t();
        f0();
    }

    public final void d0(int i) {
        long j = ((long) i) * 1000;
        ui8 ui8Var = this.g0;
        if (ui8Var != null) {
            ui8Var.o(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0214  */
    @Override // defpackage.mu0, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        boolean z = false;
        boolean z2 = keyEvent.getAction() == 0;
        if (keyEvent.getRepeatCount() == 0 && z2) {
            z = true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 4) {
            if (keyCode == 62) {
                if (z) {
                    T();
                    return true;
                }
            } else if (keyCode == 66) {
                if (z) {
                    ii8 ii8Var = this.k0;
                    if (ii8Var == null) {
                        hm3.l("keysControllerProcessor");
                        throw null;
                    }
                    ii8Var.n();
                    ii8 ii8Var2 = this.k0;
                    if (ii8Var2 == null) {
                        hm3.l("keysControllerProcessor");
                        throw null;
                    }
                    VideoPlayer videoPlayer = ii8Var2.n;
                    if (videoPlayer.Z()) {
                        if (videoPlayer.a0()) {
                            videoPlayer.c0();
                        } else {
                            videoPlayer.j0();
                        }
                        ii8Var2.n();
                        return true;
                    }
                }
            } else if (keyCode != 79) {
                if (keyCode != 126) {
                    if (keyCode == 164) {
                        k0();
                        return true;
                    }
                    if (keyCode != 85) {
                        if (keyCode != 86) {
                            if (keyCode != 89) {
                                if (keyCode != 90) {
                                    switch (keyCode) {
                                        case 19:
                                            if (z) {
                                                ii8 ii8Var3 = this.k0;
                                                if (ii8Var3 == null) {
                                                    hm3.l("keysControllerProcessor");
                                                    throw null;
                                                }
                                                ii8Var3.n();
                                                ii8 ii8Var4 = this.k0;
                                                if (ii8Var4 == null) {
                                                    hm3.l("keysControllerProcessor");
                                                    throw null;
                                                }
                                                ii8Var4.a();
                                                ii8Var4.n.b0(qk3.e, new a16(27, ii8Var4));
                                                return true;
                                            }
                                            break;
                                        case 20:
                                            if (z) {
                                                ii8 ii8Var5 = this.k0;
                                                if (ii8Var5 != null) {
                                                    ii8Var5.n();
                                                    return true;
                                                }
                                                hm3.l("keysControllerProcessor");
                                                throw null;
                                            }
                                            break;
                                        case zx9.zzm /* 21 */:
                                            if (z2) {
                                                ii8 ii8Var6 = this.k0;
                                                if (ii8Var6 == null) {
                                                    hm3.l("keysControllerProcessor");
                                                    throw null;
                                                }
                                                ii8Var6.n();
                                                ii8 ii8Var7 = this.k0;
                                                if (ii8Var7 == null) {
                                                    hm3.l("keysControllerProcessor");
                                                    throw null;
                                                }
                                                int repeatCount = keyEvent.getRepeatCount();
                                                VideoPlayer videoPlayer2 = ii8Var7.n;
                                                if (videoPlayer2.R()) {
                                                    String[] strArr = se8.a;
                                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                                    if (repeatCount == 0) {
                                                        ii8Var7.i = jCurrentTimeMillis;
                                                        ii8Var7.k = jCurrentTimeMillis;
                                                        ii8Var7.m = 2000;
                                                        videoPlayer2.d0(videoPlayer2.W() - 5000);
                                                        ii8Var7.o();
                                                        ii8Var7.n();
                                                        return true;
                                                    }
                                                    if (jCurrentTimeMillis - ii8Var7.i >= 1000 && jCurrentTimeMillis - ii8Var7.k >= 1000) {
                                                        videoPlayer2.d0(videoPlayer2.W() - ii8Var7.m);
                                                        ii8Var7.o();
                                                        ii8Var7.n();
                                                        ii8Var7.k = jCurrentTimeMillis;
                                                        int i = ii8Var7.m * 2;
                                                        ii8Var7.m = i <= 120000 ? i : 120000;
                                                        return true;
                                                    }
                                                }
                                            }
                                            break;
                                        case 22:
                                            if (z2) {
                                                ii8 ii8Var8 = this.k0;
                                                if (ii8Var8 == null) {
                                                    hm3.l("keysControllerProcessor");
                                                    throw null;
                                                }
                                                ii8Var8.n();
                                                ii8 ii8Var9 = this.k0;
                                                if (ii8Var9 == null) {
                                                    hm3.l("keysControllerProcessor");
                                                    throw null;
                                                }
                                                int repeatCount2 = keyEvent.getRepeatCount();
                                                VideoPlayer videoPlayer3 = ii8Var9.n;
                                                if (videoPlayer3.R()) {
                                                    String[] strArr2 = se8.a;
                                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                    if (repeatCount2 == 0) {
                                                        ii8Var9.j = jCurrentTimeMillis2;
                                                        ii8Var9.l = jCurrentTimeMillis2;
                                                        ii8Var9.m = 2000;
                                                        videoPlayer3.d0(videoPlayer3.W() + 15000);
                                                        ii8Var9.o();
                                                        ii8Var9.n();
                                                        return true;
                                                    }
                                                    if (jCurrentTimeMillis2 - ii8Var9.j >= 1000 && jCurrentTimeMillis2 - ii8Var9.l >= 1000) {
                                                        int iW = videoPlayer3.W() + ii8Var9.m;
                                                        Handler handler = App.M0;
                                                        Log.i("X-plore", "wantSeek: " + iW);
                                                        videoPlayer3.d0(iW);
                                                        ii8Var9.o();
                                                        ii8Var9.n();
                                                        ii8Var9.l = jCurrentTimeMillis2;
                                                        int i2 = ii8Var9.m * 2;
                                                        ii8Var9.m = i2 <= 120000 ? i2 : 120000;
                                                        return true;
                                                    }
                                                }
                                            }
                                            break;
                                        case 23:
                                            break;
                                        case 24:
                                        case 25:
                                            if (z2) {
                                                fi8 fi8Var = this.i0;
                                                if (fi8Var == null) {
                                                    hm3.l("volumeBarProcessor");
                                                    throw null;
                                                }
                                                int iH = fi8Var.l.h();
                                                int i3 = keyCode == 24 ? iH + 1 : iH - 1;
                                                fi8 fi8Var2 = this.i0;
                                                if (fi8Var2 != null) {
                                                    fi8Var2.m(i3);
                                                    return true;
                                                }
                                                hm3.l("volumeBarProcessor");
                                                throw null;
                                            }
                                            break;
                                        default:
                                            return super.dispatchKeyEvent(keyEvent);
                                    }
                                } else if (z2) {
                                    qi8 qi8Var = this.j0;
                                    if (qi8Var != null) {
                                        qi8.s(qi8Var, 15);
                                        return true;
                                    }
                                    hm3.l("mediaControllerProcessor");
                                    throw null;
                                }
                            } else if (z2) {
                                qi8 qi8Var2 = this.j0;
                                if (qi8Var2 != null) {
                                    qi8.s(qi8Var2, -5);
                                    return true;
                                }
                                hm3.l("mediaControllerProcessor");
                                throw null;
                            }
                        } else if (z && a0()) {
                            c0();
                            return true;
                        }
                    }
                } else if (z && !a0()) {
                    j0();
                    return true;
                }
            }
        } else if (z) {
            onBackPressed();
        }
        return true;
    }

    public final void e0(String str, String str2) {
        SQLiteDatabase sQLiteDatabaseY = Y();
        if (sQLiteDatabaseY != null) {
            ContentValues contentValuesD = yyc.d(new es5("name", str), new es5("value", str2));
            if (sQLiteDatabaseY.update("configuration", contentValuesD, "name=?", new String[]{str}) == 0) {
                sQLiteDatabaseY.insert("configuration", null, contentValuesD);
            }
        }
    }

    public final void f0() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.flags;
        int i2 = a0() ? i | 128 : i & (-129);
        if (attributes.flags != i2) {
            attributes.flags = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        c0();
        super.finish();
    }

    public final void g0(int i) {
        int i2;
        ui8 ui8Var = this.g0;
        if (ui8Var == null || !ui8Var.C) {
            int i3 = this.l0;
            i2 = i >= i3 ? R.drawable.exo_player_volume_max : i >= i3 / 2 ? R.drawable.exo_player_volume_medium : R.drawable.exo_player_volume_min;
        } else {
            i2 = R.drawable.exo_player_volume_mute;
        }
        fi8 fi8Var = this.i0;
        if (fi8Var != null) {
            fi8Var.m.i(i2);
        } else {
            hm3.l("volumeBarProcessor");
            throw null;
        }
    }

    public final void h0() {
        ui8 ui8Var = this.g0;
        if (ui8Var != null) {
            ui8Var.p(true);
        }
        qi8 qi8Var = this.j0;
        b81 b81Var = null;
        if (qi8Var == null) {
            hm3.l("mediaControllerProcessor");
            throw null;
        }
        qi8Var.v();
        pg7 pg7Var = this.F0;
        if (pg7Var != null) {
            pg7Var.d(null);
        }
        this.F0 = kab.d(x2d.e(this), null, null, new ww7(this, b81Var, 5), 3);
        f0();
    }

    public final void i0() {
        if (this.o0 == 2) {
            Window window = getWindow();
            r13 r13Var = new r13(getWindow().getDecorView());
            int i = Build.VERSION.SDK_INT;
            n0a bq8Var = i >= 35 ? new bq8(window, r13Var, 1) : i >= 30 ? new aq8(window, r13Var, 1) : new aq8(window, r13Var, 0);
            bq8Var.g();
            bq8Var.e();
        }
    }

    public final void j0() {
        if (!a0()) {
            long jX = X();
            ui8 ui8Var = this.g0;
            if (jX == (ui8Var != null ? ui8Var.h : 0L)) {
                d0(0);
            }
        }
        h0();
    }

    public final void k0() {
        ui8 ui8Var = this.g0;
        if (ui8Var != null) {
            ui8Var.C = !ui8Var.C;
            fi8 fi8Var = this.i0;
            if (fi8Var != null) {
                Q(fi8Var.l.h());
            } else {
                hm3.l("volumeBarProcessor");
                throw null;
            }
        }
    }

    public final void l0(int i) {
        ui8 ui8Var;
        SQLiteDatabase sQLiteDatabaseY = Y();
        if (sQLiteDatabaseY == null || (ui8Var = this.g0) == null) {
            return;
        }
        String str = this.t0;
        md2 md2Var = ui8Var.z;
        if (md2Var == null) {
            hm3.l("externalSubsRenderer");
            throw null;
        }
        String[] strArr = se8.a;
        ContentValues contentValuesD = yyc.d(new es5("last_played", Long.valueOf(System.currentTimeMillis() / 1000)), new es5("play_seconds", Integer.valueOf(ui8Var.B)), new es5("subtitles_coding", ui8Var.D), new es5("subtitles_delay", Integer.valueOf(md2Var.I)), new es5("subtitles_file", md2Var.J));
        if (i >= 0) {
            contentValuesD.put("position", Integer.valueOf(i));
        }
        Cursor cursorQuery = sQLiteDatabaseY.query("movies", new String[]{"_id"}, "url=?", new String[]{str}, null, null, null);
        try {
            if (cursorQuery.moveToFirst()) {
                sQLiteDatabaseY.update("movies", contentValuesD, "_id=" + cursorQuery.getLong(0), null);
            } else {
                contentValuesD.put("url", str);
                sQLiteDatabaseY.insert("movies", null, contentValuesD);
                int i2 = xc5.b;
                np9.k(sQLiteDatabaseY);
            }
            cursorQuery.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                psc.d(cursorQuery, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f0();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    @Override // defpackage.mu0, android.app.Activity, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        int i = this.o0;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.n0.setValue(Boolean.valueOf(i2 == 2));
            this.o0 = configuration.orientation;
            jb4 jb4Var = this.I0;
            if (jb4Var != null) {
                jb4Var.d();
            }
            fi8 fi8Var = this.D0;
            int iH = fi8Var != null ? fi8Var.l.h() : 0;
            fi8 fi8Var2 = this.i0;
            if (fi8Var2 == null) {
                hm3.l("volumeBarProcessor");
                throw null;
            }
            int iH2 = fi8Var2.l.h();
            fi8 fi8Var3 = this.i0;
            if (fi8Var3 == null) {
                hm3.l("volumeBarProcessor");
                throw null;
            }
            fi8Var3.o(iH2);
            g0(iH2);
            fi8 fi8Var4 = this.i0;
            if (fi8Var4 == null) {
                hm3.l("volumeBarProcessor");
                throw null;
            }
            fi8Var4.c();
            if (a0()) {
                qi8 qi8Var = this.j0;
                if (qi8Var == null) {
                    hm3.l("mediaControllerProcessor");
                    throw null;
                }
                if (qi8Var.q.o0 != 1) {
                    if (qi8Var == null) {
                        hm3.l("mediaControllerProcessor");
                        throw null;
                    }
                    qi8Var.c();
                }
            } else {
                qi8 qi8Var2 = this.j0;
                if (qi8Var2 == null) {
                    hm3.l("mediaControllerProcessor");
                    throw null;
                }
                qi8Var2.t();
            }
            fi8 fi8Var5 = this.D0;
            if (fi8Var5 != null) {
                fi8Var5.o(iH);
                fi8Var5.c();
            }
        }
    }

    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        vj1 xc8Var;
        super.onCreate(bundle);
        this.n0.setValue(Boolean.valueOf(getResources().getConfiguration().orientation == 2));
        uy9.e(getWindow(), false);
        Object systemService = w().getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        this.p0 = audioManager;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        this.l0 = streamMaxVolume;
        this.m0 = streamMaxVolume / 2;
        this.o0 = getResources().getConfiguration().orientation;
        this.e0 = getRequestedOrientation();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        this.h0 = new xc5(applicationContext, "ExoPlayer.db", null, 9, 2);
        this.d0 = new td2(this);
        this.q0 = new SurfaceView(this);
        C();
        if (!w().b) {
            this.D0 = new fi8(this, 0);
        }
        this.i0 = new fi8(this, 1);
        this.j0 = new qi8(this);
        this.k0 = new ii8(this);
        if (Z()) {
            qi8 qi8Var = this.j0;
            if (qi8Var == null) {
                hm3.l("mediaControllerProcessor");
                throw null;
            }
            VideoPlayer videoPlayer = qi8Var.q;
            ui8 ui8Var = videoPlayer.g0;
            long j = ui8Var != null ? ui8Var.h : 0L;
            qi8Var.l = j;
            qi8Var.e.setValue(videoPlayer.U(j));
            qi8Var.u(videoPlayer.X());
            qi8 qi8Var2 = this.j0;
            if (qi8Var2 == null) {
                hm3.l("mediaControllerProcessor");
                throw null;
            }
            qi8Var2.v();
            ii8 ii8Var = this.k0;
            if (ii8Var == null) {
                hm3.l("keysControllerProcessor");
                throw null;
            }
            VideoPlayer videoPlayer2 = ii8Var.n;
            ui8 ui8Var2 = videoPlayer2.g0;
            long j2 = ui8Var2 != null ? ui8Var2.h : 0L;
            ii8Var.h = j2;
            ii8Var.g.setValue(videoPlayer2.U(j2));
            ii8Var.o();
            ii8 ii8Var2 = this.k0;
            if (ii8Var2 == null) {
                hm3.l("keysControllerProcessor");
                throw null;
            }
            ii8Var2.o();
        }
        ok0 ok0Var = new ok0(1073741824, 1, -16777216);
        td2 td2Var = this.d0;
        if (td2Var == null) {
            hm3.l("subtitleLayout");
            throw null;
        }
        td2Var.setStyle(ok0Var);
        S();
        App appW = w();
        Resources resources = getResources();
        resources.getClass();
        appW.a(resources, false);
        il1 il1VarL = w().l();
        Boolean boolValueOf = il1VarL.g("video_rotation_lock", null) != null ? Boolean.valueOf(il1VarL.h("video_rotation_lock", false)) : null;
        if (boolValueOf != null) {
            this.f0 = boolValueOf.booleanValue();
        } else {
            try {
                if (Settings.System.getInt(getContentResolver(), "accelerometer_rotation") == 0) {
                    this.f0 = true;
                }
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
        boolean z = this.f0;
        if (z) {
            setRequestedOrientation(z ? ((Boolean) this.n0.getValue()).booleanValue() ? 6 : 7 : this.e0);
        }
        fi8 fi8Var = this.D0;
        if (fi8Var != null) {
            fi8Var.n();
        }
        i0();
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null) {
            if (this.g0 == null) {
                try {
                    Uri data2 = getIntent().getData();
                    if (data2 != null) {
                        String[] strArr = FileContentProvider.d;
                        ContentResolver contentResolver = getContentResolver();
                        contentResolver.getClass();
                        ng4 ng4VarL = n20.l(contentResolver, data2);
                        if (ng4VarL != null) {
                            this.y0 = ng4VarL;
                            xc8Var = new jh2(ng4VarL);
                        } else {
                            xc8Var = new xc8(w(), data2);
                        }
                    } else {
                        jw7.n();
                        xc8Var = null;
                    }
                    String strV = V("subtitlesCoding");
                    if (strV == null) {
                        strV = J0[0].b;
                    }
                    String strV2 = V("subtitlesSize");
                    int i = strV2 != null ? Integer.parseInt(strV2) : 100;
                    this.A0 = i;
                    if (i != 100) {
                        S();
                    }
                    try {
                        String string = data.toString();
                        string.getClass();
                        this.t0 = string;
                        SurfaceView surfaceView = this.q0;
                        if (surfaceView == null) {
                            hm3.l("surfaceView");
                            throw null;
                        }
                        ui8 ui8Var3 = new ui8(xc8Var, this, surfaceView.getHolder(), new w9b(1, this));
                        ui8Var3.D = strV;
                        this.g0 = ui8Var3;
                        SQLiteDatabase sQLiteDatabaseY = Y();
                        if (sQLiteDatabaseY != null) {
                            Cursor cursorQuery = sQLiteDatabaseY.query("movies", new String[]{"position", "play_seconds", "subtitles_coding", "subtitles_delay", "subtitles_file"}, "url=?", new String[]{data.toString()}, null, null, null);
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    int i2 = cursorQuery.getInt(0);
                                    ui8Var3.B = cursorQuery.getInt(1);
                                    String string2 = cursorQuery.getString(2);
                                    if (string2 != null) {
                                        ui8Var3.D = string2;
                                    }
                                    md2 md2Var = ui8Var3.z;
                                    if (md2Var == null) {
                                        hm3.l("externalSubsRenderer");
                                        throw null;
                                    }
                                    md2Var.I = cursorQuery.getInt(3);
                                    md2Var.J = cursorQuery.getString(4);
                                    if (i2 != 0) {
                                        d0(Math.max(0, i2 - 3000));
                                    }
                                }
                                cursorQuery.close();
                            } finally {
                            }
                        }
                    } catch (Exception e) {
                        w().j0(this, se8.k(e), false);
                        finish();
                    }
                    h0();
                } catch (Exception e2) {
                    Handler handler = App.M0;
                    qp9.d(e2);
                }
            } else {
                h0();
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                onRestoreInstanceState(extras);
            }
        }
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (!isFinishing() || this.g0 == null) {
            return;
        }
        pg7 pg7Var = this.F0;
        if (pg7Var != null) {
            pg7Var.d(null);
        }
        ui8 ui8Var = this.g0;
        if (ui8Var != null) {
            ui8Var.k();
        }
        this.g0 = null;
        this.u0.setValue(Boolean.FALSE);
        pg7 pg7Var2 = this.w0;
        if (pg7Var2 != null) {
            pg7Var2.d(null);
        }
        this.w0 = null;
    }

    @Override // defpackage.j30, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.j30, defpackage.mu0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (this.g0 != null) {
            pg7 pg7Var = this.F0;
            if (pg7Var != null) {
                pg7Var.d(null);
            }
            ui8 ui8Var = this.g0;
            if (ui8Var != null) {
                ui8Var.k();
            }
            this.g0 = null;
            this.u0.setValue(Boolean.FALSE);
            pg7 pg7Var2 = this.w0;
            if (pg7Var2 != null) {
                pg7Var2.d(null);
            }
            this.w0 = null;
        }
        setIntent(intent);
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onPause() throws IllegalAccessException, InvocationTargetException {
        rOIT.VSM.invoke(null, this);
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onResume() {
        super.onResume();
        getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.H0);
        AudioManager audioManager = this.p0;
        if (audioManager == null) {
            hm3.l("audioManager");
            throw null;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume < this.l0) {
            fi8 fi8Var = this.i0;
            if (fi8Var == null) {
                hm3.l("volumeBarProcessor");
                throw null;
            }
            fi8Var.o(streamVolume);
            g0(streamVolume);
            P(streamVolume);
        }
        vu5 vu5Var = this.G0;
        if (((Boolean) vu5Var.getValue()).booleanValue()) {
            d60 d60Var = d60.a;
            if (d60.k(zr5.d)) {
                return;
            }
            vu5Var.setValue(Boolean.FALSE);
            this.x0 = false;
        }
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        d60 d60Var = d60.a;
        this.x0 = d60.k(zr5.d);
        fi8 fi8Var = this.i0;
        if (fi8Var == null) {
            hm3.l("volumeBarProcessor");
            throw null;
        }
        fi8Var.c();
        fi8 fi8Var2 = this.D0;
        if (fi8Var2 != null) {
            fi8Var2.c();
        }
        if (this.g0 != null && this.E0) {
            long jX = X();
            ui8 ui8Var = this.g0;
            if (ui8Var != null) {
                ui8Var.o(jX);
            }
            h0();
        }
        if (!a0() || (window = getWindow()) == null || (decorView = window.getDecorView()) == null || !decorView.isInTouchMode()) {
            return;
        }
        qi8 qi8Var = this.j0;
        if (qi8Var != null) {
            qi8Var.t();
        } else {
            hm3.l("mediaControllerProcessor");
            throw null;
        }
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onStop() {
        long jMin;
        super.onStop();
        boolean zA0 = a0();
        this.E0 = zA0;
        if (zA0) {
            c0();
        }
        ui8 ui8Var = this.g0;
        if (ui8Var != null) {
            int i = (int) (ui8Var.h / 1000);
            Long l = ui8Var.k;
            if (l != null) {
                jMin = l.longValue();
            } else {
                jMin = ui8Var.i;
                if (ui8Var.h != -1) {
                    jMin = Math.min(jMin, ui8Var.h);
                }
            }
            int i2 = (int) (jMin / 1000);
            if (Math.abs(i2 - i) <= 1000) {
                i2 = 0;
            }
            l0(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0464  */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.j30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        int i2;
        int i3;
        zz2 zz2Var2;
        int i4;
        float f;
        Object obj;
        qi8 qi8Var;
        ?? r14;
        boolean z;
        zz2 zz2Var3;
        int i5;
        float f2;
        ?? r4;
        zz2 zz2Var4 = zz2Var;
        q50 q50Var = j72.R;
        q50 q50Var2 = j72.Q;
        zz2Var4.Y(921527580);
        if ((i & 6) == 0) {
            i2 = i | (zz2Var4.f(qq5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zz2Var4.h(this) ? 32 : 16;
        }
        if (zz2Var4.O(i2 & 1, (i2 & 19) != 18)) {
            w15 w15Var = uc4.b;
            w15 w15VarI = f2c.i(w15Var, qq5Var);
            s50 s50Var = j72.b;
            jq4 jq4VarC = ga0.c(s50Var, false);
            int iHashCode = Long.hashCode(zz2Var4.T);
            hx5 hx5VarL = zz2Var4.l();
            w15 w15VarH = dyc.h(zz2Var4, w15VarI);
            aw0.j.getClass();
            ax0 ax0Var = zv0.b;
            zz2Var4.a0();
            if (zz2Var4.S) {
                zz2Var4.k(ax0Var);
            } else {
                zz2Var4.j0();
            }
            hi hiVar = zv0.f;
            tq4.g(hiVar, zz2Var4, jq4VarC);
            hi hiVar2 = zv0.e;
            tq4.g(hiVar2, zz2Var4, hx5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            hi hiVar3 = zv0.g;
            tq4.g(hiVar3, zz2Var4, numValueOf);
            yc ycVar = zv0.h;
            tq4.f(zz2Var4, ycVar);
            hi hiVar4 = zv0.d;
            tq4.g(hiVar4, zz2Var4, w15VarH);
            boolean zH = zz2Var4.h(this);
            Object objL = zz2Var4.L();
            int i6 = i2;
            Object obj2 = gw0.a;
            if (zH || objL == obj2) {
                objL = new ai8(this, 2);
                zz2Var4.g0(objL);
            }
            w15 w15VarB = z55.b(w15Var, null, null, false, null, (tx2) objL, 28);
            jq4 jq4VarC2 = ga0.c(s50Var, false);
            int iHashCode2 = Long.hashCode(zz2Var4.T);
            hx5 hx5VarL2 = zz2Var4.l();
            w15 w15VarH2 = dyc.h(zz2Var4, w15VarB);
            zz2Var4.a0();
            if (zz2Var4.S) {
                zz2Var4.k(ax0Var);
            } else {
                zz2Var4.j0();
            }
            tq4.g(hiVar, zz2Var4, jq4VarC2);
            tq4.g(hiVar2, zz2Var4, hx5VarL2);
            tv0.s(iHashCode2, zz2Var4, hiVar3, zz2Var4, ycVar);
            tq4.g(hiVar4, zz2Var4, w15VarH2);
            n0a.a(this.r0.h(), 384, jxc.g(-934646467, new uc5(22, this), zz2Var4), zz2Var4, w15Var);
            int i7 = (i6 >> 3) & 14;
            O(i7, zz2Var4);
            N(i7, zz2Var4);
            boolean zBooleanValue = ((Boolean) this.n0.getValue()).booleanValue();
            t15 t15Var = t15.a;
            mr mrVar = b52.c;
            if (zBooleanValue) {
                zz2Var4.X(-2005803453);
                tl6 tl6VarA = rl6.a(b52.a, j72.N, zz2Var4, 0);
                int iHashCode3 = Long.hashCode(zz2Var4.T);
                hx5 hx5VarL3 = zz2Var4.l();
                w15 w15VarH3 = dyc.h(zz2Var4, w15Var);
                zz2Var4.a0();
                if (zz2Var4.S) {
                    zz2Var4.k(ax0Var);
                } else {
                    zz2Var4.j0();
                }
                tq4.g(hiVar, zz2Var4, tl6VarA);
                tq4.g(hiVar2, zz2Var4, hx5VarL3);
                tv0.s(iHashCode3, zz2Var4, hiVar3, zz2Var4, ycVar);
                tq4.g(hiVar4, zz2Var4, w15VarH3);
                fi8 fi8Var = this.D0;
                if (fi8Var == null) {
                    zz2Var4.X(119304016);
                    zz2Var4.p(false);
                    f2 = 1.0f;
                } else {
                    zz2Var4.X(419490513);
                    f2 = 1.0f;
                    fi8Var.l(a87.b(t15Var, 1.0f), zz2Var4, 6);
                    zz2Var4.p(false);
                }
                oh8 oh8Var = new oh8(j72.P);
                if (f2 <= 0.0d) {
                    gi3.a("invalid weight; must be greater than zero");
                }
                w15 w15VarE = oh8Var.e(new d44(f2 <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                ws0 ws0VarA = vs0.a(mrVar, q50Var2, zz2Var4, 0);
                int iHashCode4 = Long.hashCode(zz2Var4.T);
                hx5 hx5VarL4 = zz2Var4.l();
                w15 w15VarH4 = dyc.h(zz2Var4, w15VarE);
                zz2Var4.a0();
                if (zz2Var4.S) {
                    zz2Var4.k(ax0Var);
                } else {
                    zz2Var4.j0();
                }
                tq4.g(hiVar, zz2Var4, ws0VarA);
                tq4.g(hiVar2, zz2Var4, hx5VarL4);
                tv0.s(iHashCode4, zz2Var4, hiVar3, zz2Var4, ycVar);
                tq4.g(hiVar4, zz2Var4, w15VarH4);
                boolean zH2 = zz2Var4.h(this);
                Object objL2 = zz2Var4.L();
                if (zH2 || objL2 == obj2) {
                    objL2 = new ei8(this, 3);
                    zz2Var4.g0(objL2);
                }
                obj = obj2;
                pc1.b((wx2) objL2, f2c.n(new p83(q50Var), 0.0f, 0.0f, 0.0f, ((r84) zz2Var4.j(s84.a)).a.d, 7), null, zz2Var4, 0, 4);
                qi8 qi8Var2 = this.j0;
                if (qi8Var2 == null) {
                    hm3.l("mediaControllerProcessor");
                    throw null;
                }
                if (qi8Var2.e()) {
                    zz2Var4.X(465675700);
                    qi8 qi8Var3 = this.j0;
                    if (qi8Var3 == null) {
                        hm3.l("mediaControllerProcessor");
                        throw null;
                    }
                    r4 = 0;
                    qi8Var3.m(uc4.a, zz2Var4, 0);
                    zz2Var4.p(false);
                } else {
                    r4 = 0;
                    zz2Var4.X(465786215);
                    zz2Var4.p(false);
                }
                ii8 ii8Var = this.k0;
                if (ii8Var == null) {
                    hm3.l("keysControllerProcessor");
                    throw null;
                }
                if (ii8Var.e()) {
                    zz2Var4.X(465856213);
                    ii8 ii8Var2 = this.k0;
                    if (ii8Var2 == 0) {
                        hm3.l("keysControllerProcessor");
                        throw null;
                    }
                    ii8Var2.l(uc4.a, zz2Var4, r4);
                    zz2Var4.p(r4);
                } else {
                    zz2Var4.X(465965767);
                    zz2Var4.p(r4);
                }
                zz2Var4.p(true);
                fi8 fi8Var2 = this.i0;
                if (fi8Var2 == null) {
                    hm3.l("volumeBarProcessor");
                    throw null;
                }
                fi8Var2.l(a87.b(t15Var, 1.0f), zz2Var4, 6);
                zz2Var4.p(true);
                zz2Var4.p(r4);
                z = true;
            } else {
                zz2Var4.X(-2004731256);
                ws0 ws0VarA2 = vs0.a(mrVar, q50Var2, zz2Var4, 0);
                int iHashCode5 = Long.hashCode(zz2Var4.T);
                hx5 hx5VarL5 = zz2Var4.l();
                w15 w15VarH5 = dyc.h(zz2Var4, w15Var);
                zz2Var4.a0();
                if (zz2Var4.S) {
                    zz2Var4.k(ax0Var);
                } else {
                    zz2Var4.j0();
                }
                tq4.g(hiVar, zz2Var4, ws0VarA2);
                tq4.g(hiVar2, zz2Var4, hx5VarL5);
                tv0.s(iHashCode5, zz2Var4, hiVar3, zz2Var4, ycVar);
                tq4.g(hiVar4, zz2Var4, w15VarH5);
                w15 w15Var2 = uc4.a;
                w15 w15VarA = xs0.a(w15Var2, 1.0f);
                jq4 jq4VarC3 = ga0.c(s50Var, false);
                int iHashCode6 = Long.hashCode(zz2Var4.T);
                hx5 hx5VarL6 = zz2Var4.l();
                w15 w15VarH6 = dyc.h(zz2Var4, w15VarA);
                zz2Var4.a0();
                if (zz2Var4.S) {
                    zz2Var4.k(ax0Var);
                } else {
                    zz2Var4.j0();
                }
                tq4.g(hiVar, zz2Var4, jq4VarC3);
                tq4.g(hiVar2, zz2Var4, hx5VarL6);
                tv0.s(iHashCode6, zz2Var4, hiVar3, zz2Var4, ycVar);
                tq4.g(hiVar4, zz2Var4, w15VarH6);
                fi8 fi8Var3 = this.D0;
                qa0 qa0Var = qa0.a;
                if (fi8Var3 == null) {
                    zz2Var4.X(-135821483);
                    i4 = 0;
                    zz2Var4.p(false);
                    f = 1.0f;
                } else {
                    i4 = 0;
                    zz2Var4.X(-1944043988);
                    f = 1.0f;
                    fi8Var3.l(qa0Var.a(a87.b(t15Var, 1.0f), s50Var), zz2Var4, 0);
                    zz2Var4.p(false);
                }
                fi8 fi8Var4 = this.i0;
                if (fi8Var4 == null) {
                    hm3.l("volumeBarProcessor");
                    throw null;
                }
                fi8Var4.l(qa0Var.a(a87.b(t15Var, f), j72.d), zz2Var4, i4);
                zz2Var4.p(true);
                boolean zH3 = zz2Var4.h(this);
                Object objL3 = zz2Var4.L();
                if (zH3) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (objL3 == obj) {
                    }
                    pc1.b((wx2) objL3, f2c.n(new p83(q50Var), 0.0f, 0.0f, 0.0f, ((r84) zz2Var4.j(s84.a)).a.d, 7), null, zz2Var4, 0, 4);
                    qi8Var = this.j0;
                    if (qi8Var != null) {
                        hm3.l("mediaControllerProcessor");
                        throw null;
                    }
                    if (qi8Var.e()) {
                        zz2Var4.X(272599873);
                        qi8 qi8Var4 = this.j0;
                        if (qi8Var4 == null) {
                            hm3.l("mediaControllerProcessor");
                            throw null;
                        }
                        r14 = 0;
                        qi8Var4.m(w15Var2, zz2Var4, 0);
                        zz2Var4.p(false);
                    } else {
                        r14 = 0;
                        zz2Var4.X(272702700);
                        zz2Var4.p(false);
                    }
                    ii8 ii8Var3 = this.k0;
                    if (ii8Var3 == null) {
                        hm3.l("keysControllerProcessor");
                        throw null;
                    }
                    if (ii8Var3.e()) {
                        zz2Var4.X(272768482);
                        ii8 ii8Var4 = this.k0;
                        if (ii8Var4 == 0) {
                            hm3.l("keysControllerProcessor");
                            throw null;
                        }
                        ii8Var4.l(w15Var2, zz2Var4, r14);
                        zz2Var4.p(r14);
                    } else {
                        zz2Var4.X(272870348);
                        zz2Var4.p(r14);
                    }
                    z = true;
                    zz2Var4.p(true);
                    zz2Var4.p(r14);
                }
                objL3 = new ei8(this, 4);
                zz2Var4.g0(objL3);
                pc1.b((wx2) objL3, f2c.n(new p83(q50Var), 0.0f, 0.0f, 0.0f, ((r84) zz2Var4.j(s84.a)).a.d, 7), null, zz2Var4, 0, 4);
                qi8Var = this.j0;
                if (qi8Var != null) {
                }
            }
            zz2Var4.p(z);
            if (((Boolean) this.G0.getValue()).booleanValue()) {
                zz2Var4.X(-1154308125);
                Integer numValueOf2 = Integer.valueOf(R.drawable.op_donate);
                w15 w15VarJ = a87.j(f2c.j(t15Var, 10.0f), 56.0f);
                c32 c32Var = new c32(10.0f);
                boolean zH4 = zz2Var4.h(this);
                Object objL4 = zz2Var4.L();
                if (zH4 || objL4 == obj) {
                    i5 = 0;
                    objL4 = new ai8(this, i5);
                    zz2Var4.g0(objL4);
                } else {
                    i5 = 0;
                }
                i3 = i;
                ozc.a(numValueOf2, w15VarJ, null, c32Var, null, false, false, null, null, null, null, (tx2) objL4, zz2Var, 3120, 0, 2036);
                zz2 zz2Var5 = zz2Var;
                zz2Var5.p(i5);
                zz2Var3 = zz2Var5;
            } else {
                i3 = i;
                zz2Var4.X(-1154053460);
                zz2Var4.p(false);
                zz2Var3 = zz2Var4;
            }
            zz2Var3.p(true);
            zz2Var2 = zz2Var3;
        } else {
            i3 = i;
            zz2Var4.R();
            zz2Var2 = zz2Var4;
        }
        kc6 kc6VarR = zz2Var2.r();
        if (kc6VarR != null) {
            kc6VarR.d = new w36(this, qq5Var, i3, 7);
        }
    }

    @Override // defpackage.j30
    public final qsb y() {
        return this.s0;
    }
}
