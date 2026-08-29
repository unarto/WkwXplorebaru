package com.lonelycatgames.Xplore.ui;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.Xrg.wxHQoDKQlsBDg;
import com.google.maps.android.compose.utils.attribution.njD.VUd.OwOi;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.FileContentProvider;
import defpackage.a87;
import defpackage.ad6;
import defpackage.ae7;
import defpackage.aj4;
import defpackage.b81;
import defpackage.ca;
import defpackage.cu7;
import defpackage.cx0;
import defpackage.cz1;
import defpackage.dd6;
import defpackage.dk;
import defpackage.dl2;
import defpackage.dt2;
import defpackage.dt9;
import defpackage.du2;
import defpackage.ei6;
import defpackage.es5;
import defpackage.eu2;
import defpackage.f2c;
import defpackage.fk;
import defpackage.fu2;
import defpackage.ga0;
import defpackage.gs0;
import defpackage.gu2;
import defpackage.gw0;
import defpackage.hk;
import defpackage.hm3;
import defpackage.ht2;
import defpackage.hy2;
import defpackage.is;
import defpackage.iu2;
import defpackage.iw7;
import defpackage.j1d;
import defpackage.j30;
import defpackage.j72;
import defpackage.jxc;
import defpackage.k5d;
import defpackage.k73;
import defpackage.kab;
import defpackage.kc2;
import defpackage.kc6;
import defpackage.ku0;
import defpackage.l40;
import defpackage.mj4;
import defpackage.n20;
import defpackage.ng4;
import defpackage.o1;
import defpackage.pg7;
import defpackage.pk3;
import defpackage.q6d;
import defpackage.q73;
import defpackage.qj7;
import defpackage.qp9;
import defpackage.qq5;
import defpackage.qt1;
import defpackage.qx7;
import defpackage.r73;
import defpackage.r84;
import defpackage.s84;
import defpackage.se8;
import defpackage.sfc;
import defpackage.su5;
import defpackage.t15;
import defpackage.th;
import defpackage.u07;
import defpackage.uc4;
import defpackage.uh2;
import defpackage.v73;
import defpackage.w74;
import defpackage.w9d;
import defpackage.x2d;
import defpackage.xc7;
import defpackage.zz2;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class HexViewer extends j30 {
    public static final fk p0 = new fk(" ");
    public final su5 d0 = new su5(0);
    public final su5 e0 = new su5(1);
    public int f0;
    public final kc2 g0;
    public r73 h0;
    public final ArrayDeque i0;
    public final xc7 j0;
    public final LinkedHashMap k0;
    public final w74 l0;
    public final w74 m0;
    public final w74 n0;
    public pg7 o0;

    public HexViewer() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        this.g0 = new kc2(executorServiceNewSingleThreadExecutor);
        this.i0 = new ArrayDeque();
        this.j0 = new xc7();
        this.k0 = new LinkedHashMap();
        this.l0 = new w74(0, 0);
        this.m0 = new w74(0, 0);
        this.n0 = new w74(0, 0);
    }

    public static final void N(long j, zz2 zz2Var) {
        ga0.a(hm3.d(a87.n(f2c.l(a87.b(t15.a, 1.0f), ((r84) zz2Var.j(s84.a)).a.d, 0.0f, 2), 1.0f), j, sfc.a), zz2Var, 0);
    }

    public static final void O(w74 w74Var, w74[] w74VarArr, zz2 zz2Var) {
        boolean zF = zz2Var.f(w74Var) | zz2Var.h(w74VarArr);
        Object objL = zz2Var.L();
        if (zF || objL == gw0.a) {
            objL = new cz1(w74Var, w74VarArr, (b81) null, 5);
            zz2Var.g0(objL);
        }
        dt9.c((hy2) objL, zz2Var, w74Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(long j, pk3 pk3Var) {
        q73 q73Var;
        long j2;
        q73 q73Var2;
        int i;
        int i2;
        int i3;
        HexViewer hexViewer = this;
        int iH = hexViewer.d0.h();
        if (iH == 0) {
            return;
        }
        ArrayDeque arrayDeque = hexViewer.i0;
        synchronized (arrayDeque) {
            try {
                Object obj = null;
                for (Object obj2 : arrayDeque) {
                    if (((q73) obj2).a == j) {
                        obj = obj2;
                    }
                }
                q73Var = (q73) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (q73Var == null) {
            return;
        }
        long j3 = iH;
        int length = (int) (((j + ((long) q73Var.b.length)) - 1) / j3);
        int iMax = Math.max((int) (j / j3), pk3Var.a);
        int iMin = Math.min(length, pk3Var.b);
        if (iMax > iMin) {
            return;
        }
        while (true) {
            if (!hexViewer.j0.containsKey(Integer.valueOf(iMax))) {
                long j4 = ((long) iMax) * j3;
                r73 r73Var = hexViewer.h0;
                if (r73Var == null) {
                    hm3.l("state");
                    throw null;
                }
                int iMin2 = (int) Math.min(j3, r73Var.f - j4);
                if (iMin2 <= 0 || j4 < j) {
                    j2 = j3;
                    q73Var2 = q73Var;
                    i = iMin;
                } else {
                    long j5 = iMin2;
                    long j6 = j4 + j5;
                    byte[] bArr = q73Var.b;
                    q73Var2 = q73Var;
                    if (j6 > j + ((long) bArr.length)) {
                        i = iMin;
                        j2 = j3;
                    } else {
                        long j7 = j4 - j;
                        byte[] bArrR = is.r(bArr, (int) j7, (int) (j7 + j5));
                        xc7 xc7Var = hexViewer.j0;
                        Integer numValueOf = Integer.valueOf(iMax);
                        r73 r73Var2 = hexViewer.h0;
                        if (r73Var2 == null) {
                            hm3.l("state");
                            throw null;
                        }
                        dk dkVar = new dk();
                        StringBuilder sb = new StringBuilder();
                        j2 = j3;
                        int i4 = 0;
                        while (i4 < iMin2) {
                            if (i4 > 0) {
                                sb.append(' ');
                            }
                            int i5 = i4;
                            byte[] bArr2 = bArrR;
                            sb.append(String.format(Locale.ROOT, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(bArr2[i5] & 255)}, 1)));
                            i4 = i5 + 1;
                            bArrR = bArr2;
                            j4 = j4;
                        }
                        byte[] bArr3 = bArrR;
                        long j8 = j4;
                        if (hexViewer.d0.h() - iMin2 > 0) {
                            sb.append(qj7.t((r2 * 3) - 1, " "));
                        }
                        dkVar.e(sb);
                        long j9 = r73Var2.d;
                        if (j9 > 0) {
                            long j10 = r73Var2.c - j8;
                            long j11 = j9 - j8;
                            if (j11 <= 0 || j10 >= j5) {
                                i2 = iMax;
                            } else {
                                i2 = iMax;
                                int iMax2 = (int) Math.max(j10, 0L);
                                int iMin3 = (int) Math.min(j11, j5);
                                dkVar.a(new ae7(gs0.b, 0L, (iu2) null, (du2) null, (eu2) null, (dt2) null, (String) null, 0L, (l40) null, (iw7) null, (mj4) null, gs0.j, (cu7) null, (u07) null, 63486), iMax2 * 3, (iMin3 * 3) - 1);
                            }
                            fk fkVarI = dkVar.i();
                            r73 r73Var3 = hexViewer.h0;
                            if (r73Var3 == null) {
                                hm3.l("state");
                                throw null;
                            }
                            dk dkVar2 = new dk();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i6 = 0; i6 < iMin2; i6++) {
                                char c = (char) bArr3[i6];
                                if (c < ' ' || c >= 128) {
                                    c = '.';
                                }
                                sb2.append(c);
                            }
                            int iH2 = hexViewer.d0.h() - iMin2;
                            if (iH2 > 0) {
                                sb2.append(qj7.t(iH2, " "));
                            }
                            dkVar2.e(sb2);
                            long j12 = r73Var3.d;
                            if (j12 > 0) {
                                long j13 = r73Var3.c - j8;
                                long j14 = j12 - j8;
                                if (j14 <= 0 || j13 >= j5) {
                                    i3 = iMin;
                                } else {
                                    i3 = iMin;
                                    dkVar2.a(new ae7(gs0.b, 0L, (iu2) null, (du2) null, (eu2) null, (dt2) null, (String) null, 0L, (l40) null, (iw7) null, (mj4) null, gs0.j, (cu7) null, (u07) null, 63486), (int) Math.max(j13, 0L), (int) Math.min(j14, j5));
                                }
                                xc7Var.put(numValueOf, new es5(fkVarI, dkVar2.i()));
                                i = i3;
                            }
                        }
                    }
                }
                i2 = iMax;
            }
            if (i2 == i) {
                return;
            }
            iMax = i2 + 1;
            iMin = i;
            q73Var = q73Var2;
            j3 = j2;
            hexViewer = this;
        }
    }

    public final void Q(float f, float f2, int i) {
        float f3 = 1.0f * f2;
        float f4 = f2 * 8.0f * 2.0f;
        int iMax = Math.max(1, (int) ((((i - (((8.0f * f) + f4) + f3)) - ((f4 + f3) * 2.0f)) - (f2 * 24.0f)) / ((3.0f * f) + f)));
        if (this.d0.h() != iMax) {
            T(iMax);
        }
    }

    public final void S(String str) {
        byte[] bArr;
        byte[] bArr2;
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        ad6 ad6Var = new ad6();
        ad6Var.a = true;
        r73 r73Var = this.h0;
        if (r73Var == null) {
            hm3.l("state");
            throw null;
        }
        if (r73Var.b) {
            String strV = qj7.v(lowerCase, " ", "");
            if (strV.length() == 0) {
                return;
            }
            if ((strV.length() & 1) != 0) {
                strV = "0".concat(strV);
            }
            int length = strV.length() / 2;
            bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (Character.digit(strV.charAt(i2 + 1), 16) | (Character.digit(strV.charAt(i2), 16) << 4));
            }
            ad6Var.a = false;
        } else {
            int length2 = lowerCase.length();
            bArr = new byte[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                char cCharAt = lowerCase.charAt(i3);
                bArr[i3] = (' ' > cCharAt || cCharAt >= 128) ? (byte) -1 : (byte) cCharAt;
            }
        }
        byte[] bArr3 = bArr;
        int iH = this.d0.h();
        w74 w74Var = this.l0;
        long j = iH;
        long jH = ((long) w74Var.h()) * j;
        long size = ((long) (w74Var.j().k.size() + w74Var.h())) * j;
        dd6 dd6Var = new dd6();
        dd6Var.a = jH;
        r73 r73Var2 = this.h0;
        if (r73Var2 == null) {
            hm3.l("state");
            throw null;
        }
        long j2 = r73Var2.d;
        if (j2 != 0) {
            bArr2 = bArr3;
            long j3 = r73Var2.c;
            if (j3 < size && j2 > jH) {
                dd6Var.a = j3 + 1;
            }
        } else {
            bArr2 = bArr3;
        }
        pg7 pg7Var = this.o0;
        if (pg7Var != null) {
            pg7Var.d(null);
        }
        this.o0 = kab.d(x2d.e(this), null, null, new v73(this, bArr2, jH, size, iH, str, dd6Var, ad6Var, null), 3);
    }

    public final void T(int i) {
        this.j0.clear();
        r73 r73Var = this.h0;
        b81 b81Var = null;
        if (r73Var == null) {
            hm3.l("state");
            throw null;
        }
        long j = i;
        this.e0.i((int) Math.min(Math.max(((r73Var.f + j) - 1) / j, 1L), 2147483647L));
        this.d0.i(i);
        kab.d(x2d.e(this), null, null, new o1(this, ((i / 2) + this.f0) / i, b81Var, 3), 3);
    }

    @Override // defpackage.mu0
    public final Object m() {
        r73 r73Var = this.h0;
        if (r73Var != null) {
            return r73Var;
        }
        hm3.l("state");
        throw null;
    }

    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        r73 r73Var;
        Uri data;
        ng4 ng4VarL;
        super.onCreate(bundle);
        ku0 ku0Var = (ku0) getLastNonConfigurationInstance();
        r73 r73Var2 = (r73) (ku0Var != null ? ku0Var.a : null);
        if (r73Var2 == null) {
            Intent intent = getIntent();
            if (intent == null || (data = intent.getData()) == null) {
                w();
                aj4 aj4Var = aj4.k;
                r73Var = new r73(new uh2(k5d.j()));
            } else {
                if (th.n(data)) {
                    String strL = th.l(data);
                    q6d q6dVar = dl2.b;
                    ng4VarL = q6d.y(strL, true).A0(strL);
                } else {
                    String[] strArr = FileContentProvider.d;
                    ContentResolver contentResolver = getContentResolver();
                    contentResolver.getClass();
                    ng4VarL = n20.l(contentResolver, data);
                    if (ng4VarL == null || ng4VarL.S() == -1) {
                        w().k0("Can't start hex viewer", false);
                        finish();
                        return;
                    }
                }
                r73Var = new r73(ng4VarL);
            }
            r73Var2 = r73Var;
            int i = (int) w().l().i("hex_viewer_width", 0L);
            r73Var2.e = i != 0 ? Integer.valueOf(i) : null;
        }
        this.h0 = r73Var2;
        C();
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        OwOi.PqGfOi.invoke(null, this);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        this.f0 = bundle.getInt("address");
    }

    @Override // defpackage.mu0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putInt("address", this.d0.h() * this.l0.h());
    }

    @Override // defpackage.j30
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        int i2;
        int i3;
        zz2Var.Y(213229323);
        if ((i & 6) == 0) {
            i2 = i | (zz2Var.f(qq5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zz2Var.h(this) ? 32 : 16;
        }
        if (zz2Var.O(i2 & 1, (i2 & 19) != 18)) {
            Object objL = zz2Var.L();
            j72 j72Var = gw0.a;
            if (objL == j72Var) {
                List listAsList = Arrays.asList(new ei6(iu2.I, new gu2(new fu2[0])));
                listAsList.getClass();
                ht2 ht2Var = new ht2(listAsList);
                zz2Var.g0(ht2Var);
                objL = ht2Var;
            }
            dt2 dt2Var = (dt2) objL;
            Object objL2 = zz2Var.L();
            if (objL2 == j72Var) {
                qx7 qx7Var = new qx7(0L, w9d.d(13), null, dt2Var, w9d.d(0), null, null, 0, 0L, 16777053);
                zz2Var.g0(qx7Var);
                objL2 = qx7Var;
            }
            qx7 qx7Var2 = (qx7) objL2;
            w74 w74Var = this.n0;
            w74 w74Var2 = this.m0;
            w74 w74Var3 = this.l0;
            O(w74Var3, new w74[]{w74Var, w74Var2}, zz2Var);
            O(w74Var, new w74[]{w74Var3, w74Var2}, zz2Var);
            O(w74Var2, new w74[]{w74Var3, w74Var}, zz2Var);
            Integer numValueOf = Integer.valueOf(this.d0.h());
            boolean zH = zz2Var.h(this);
            Object objL3 = zz2Var.L();
            if (zH || objL3 == j72Var) {
                objL3 = new ca(this, null, 11);
                zz2Var.g0(objL3);
            }
            dt9.d(w74Var3, numValueOf, (hy2) objL3, zz2Var);
            qt1 qt1Var = (qt1) zz2Var.j(cx0.h);
            long jB = gs0.b(0.25f, uc4.e(zz2Var).q);
            i3 = i;
            j1d.a(f2c.i(uc4.b, qq5Var), null, 0L, 0L, 0.0f, null, null, jxc.g(-396852433, new k73(this, qt1Var, qx7Var2, gs0.b(0.5f, uc4.e(zz2Var).q), jB), zz2Var), zz2Var, 12582912, 126);
        } else {
            i3 = i;
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new hk(this, qq5Var, i3, 14);
        }
    }

    public final long R(byte[] bArr, long j, long j2, boolean z) {
        int length = bArr.length;
        long j3 = j2 - ((long) length);
        int iMax = Math.max(length * 2, 16);
        byte[] bArr2 = new byte[iMax];
        int i = length - 1;
        try {
            r73 r73Var = this.h0;
            if (r73Var == null) {
                hm3.l(wxHQoDKQlsBDg.vmNRKtfv);
                throw null;
            }
            long j4 = j;
            InputStream inputStreamU0 = r73Var.a.u0(j4);
            BufferedInputStream bufferedInputStream = inputStreamU0 instanceof BufferedInputStream ? (BufferedInputStream) inputStreamU0 : new BufferedInputStream(inputStreamU0, 8192);
            try {
                se8.u(bufferedInputStream, bArr2, i, 2);
                int i2 = i;
                while (j4 <= j3) {
                    int i3 = bufferedInputStream.read();
                    if (i3 == -1) {
                        break;
                    }
                    int i4 = i2 + 1;
                    bArr2[i2] = (byte) i3;
                    int i5 = i4 - length;
                    for (int i6 = 0; i6 < length; i6++) {
                        byte lowerCase = bArr2[i5 + i6];
                        if (z) {
                            lowerCase = (byte) Character.toLowerCase(lowerCase);
                        }
                        if (lowerCase != bArr[i6]) {
                            if (i4 == iMax) {
                                is.m(bArr2, 0, i4 - i, bArr2, i4);
                                i2 = i;
                            } else {
                                i2 = i4;
                            }
                            j4++;
                        }
                    }
                    bufferedInputStream.close();
                    return j4;
                }
                bufferedInputStream.close();
                return -1L;
            } finally {
            }
        } catch (Exception e) {
            Handler handler = App.M0;
            qp9.d(e);
            return -1L;
        }
    }
}
