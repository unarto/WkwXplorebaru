package com.lonelycatgames.Xplore.ImgViewer;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.display.DisplayManager;
import android.media.aA.rOIT;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.window.reflection.tV.cgKo;
import com.google.android.gms.measurement.api.Uan.bD.NLFulsVnkNPUjZ;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.ImgViewer.ImageViewer;
import com.lonelycatgames.Xplore.R;
import defpackage.ae3;
import defpackage.b25;
import defpackage.b5c;
import defpackage.b81;
import defpackage.ba;
import defpackage.be3;
import defpackage.bl5;
import defpackage.c30;
import defpackage.cd3;
import defpackage.ci;
import defpackage.cq4;
import defpackage.dd3;
import defpackage.dt9;
import defpackage.e11;
import defpackage.e2;
import defpackage.ed3;
import defpackage.ezc;
import defpackage.f11;
import defpackage.f2c;
import defpackage.f32;
import defpackage.f62;
import defpackage.fwc;
import defpackage.gw0;
import defpackage.ha;
import defpackage.he3;
import defpackage.hg1;
import defpackage.hm3;
import defpackage.hy2;
import defpackage.i41;
import defpackage.il1;
import defpackage.is;
import defpackage.iwa;
import defpackage.iwc;
import defpackage.j15;
import defpackage.j30;
import defpackage.j62;
import defpackage.j72;
import defpackage.jj7;
import defpackage.jya;
import defpackage.kab;
import defpackage.kc2;
import defpackage.kc6;
import defpackage.kl1;
import defpackage.l1;
import defpackage.lf;
import defpackage.lf2;
import defpackage.lg2;
import defpackage.lod;
import defpackage.m0;
import defpackage.n72;
import defpackage.ng4;
import defpackage.nu3;
import defpackage.o23;
import defpackage.of2;
import defpackage.of3;
import defpackage.os7;
import defpackage.pe3;
import defpackage.pf2;
import defpackage.pg4;
import defpackage.pg7;
import defpackage.pl;
import defpackage.q7a;
import defpackage.qe3;
import defpackage.qp9;
import defpackage.qq5;
import defpackage.qsb;
import defpackage.re8;
import defpackage.rf3;
import defpackage.ru5;
import defpackage.se3;
import defpackage.se8;
import defpackage.su5;
import defpackage.t15;
import defpackage.tf2;
import defpackage.th;
import defpackage.tm;
import defpackage.tqb;
import defpackage.tt5;
import defpackage.tu5;
import defpackage.tx2;
import defpackage.u68;
import defpackage.u9a;
import defpackage.ue3;
import defpackage.uh2;
import defpackage.un2;
import defpackage.uo4;
import defpackage.vd;
import defpackage.ve3;
import defpackage.vh2;
import defpackage.vu5;
import defpackage.vw8;
import defpackage.w15;
import defpackage.wf0;
import defpackage.wo4;
import defpackage.wx2;
import defpackage.x2d;
import defpackage.x42;
import defpackage.x94;
import defpackage.xe3;
import defpackage.yr0;
import defpackage.yzc;
import defpackage.z9d;
import defpackage.zd3;
import defpackage.zi3;
import defpackage.zs1;
import defpackage.zx9;
import defpackage.zz2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class ImageViewer extends j30 {
    public static final long c1;
    public static final /* synthetic */ int d1 = 0;
    public final ru5 A0;
    public final vu5 B0;
    public final vu5 C0;
    public final tu5 D0;
    public boolean E0;
    public boolean F0;
    public final vu5 G0;
    public final vu5 H0;
    public boolean I0;
    public pe3 J0;
    public pe3 K0;
    public pe3 L0;
    public final kc2 M0;
    public final ve3 N0;
    public final PointF O0;
    public final PointF P0;
    public int Q0;
    public int R0;
    public of2 S0;
    public pg7 T0;
    public e2 U0;
    public final Rect V0;
    public final Paint W0;
    public final l1 X0;
    public tt5 Y0;
    public final vu5 Z0;
    public se3 a1;
    public x42 b1;
    public final tu5 d0 = new tu5(0);
    public final Paint e0;
    public final RectF f0;
    public int g0;
    public GestureDetector h0;
    public int i0;
    public int j0;
    public int k0;
    public Point l0;
    public Bitmap.Config m0;
    public float n0;
    public ed3 o0;
    public final qsb p0;
    public DisplayManager q0;
    public boolean r0;
    public final vu5 s0;
    public final vu5 t0;
    public final vu5 u0;
    public final vu5 v0;
    public final ru5 w0;
    public final ru5 x0;
    public final vu5 y0;
    public final vu5 z0;

    static {
        tqb tqbVar = f62.b;
        c1 = z9d.h(15, j62.MINUTES);
    }

    public ImageViewer() {
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        paint.setColor(-14671840);
        this.e0 = paint;
        this.f0 = new RectF();
        this.n0 = 1.0f;
        this.p0 = new qsb(10);
        this.s0 = yzc.c(null);
        this.t0 = yzc.c(null);
        Boolean bool = Boolean.FALSE;
        this.u0 = yzc.c(bool);
        this.v0 = yzc.c(bool);
        this.w0 = new ru5(0.0f);
        this.x0 = new ru5(0.0f);
        this.y0 = yzc.c(bool);
        this.z0 = yzc.c(bool);
        this.A0 = new ru5(-1.0f);
        this.B0 = yzc.c(null);
        this.C0 = yzc.c(Boolean.TRUE);
        this.D0 = new tu5(0L);
        this.E0 = true;
        this.F0 = true;
        this.G0 = yzc.c(null);
        this.H0 = yzc.c(null);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 12, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(30), new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.M0 = new kc2(threadPoolExecutor);
        this.N0 = new ve3(this);
        this.O0 = new PointF();
        this.P0 = new PointF();
        this.Q0 = -1;
        this.R0 = -1;
        this.V0 = new Rect();
        this.W0 = new Paint();
        this.X0 = new l1(1, this);
        this.Z0 = yzc.c(bool);
    }

    public static final void U(ImageViewer imageViewer, String str, ed3 ed3Var, int i, boolean z) {
        pe3 pe3Var;
        boolean z2 = false;
        if (!z) {
            App appW = imageViewer.w();
            String strK = re8.k(imageViewer.getString(R.string.cant_delete_file), " ", str);
            Handler handler = App.M0;
            appW.k0(strK, false);
            return;
        }
        if (imageViewer.K0 != null) {
            r4.c--;
        }
        if (ed3Var.getCount() == 0) {
            imageViewer.finish();
            return;
        }
        xe3 xe3VarC0 = imageViewer.c0();
        if (xe3VarC0 != null) {
            su5 su5Var = xe3VarC0.b;
            SparseArray sparseArray = xe3VarC0.g;
            ue3 ue3Var = (ue3) sparseArray.get(i);
            if (ue3Var != null) {
                ue3Var.a();
            }
            sparseArray.remove(i);
            ArrayList arrayList = xe3VarC0.c;
            if (i >= 0 && i < arrayList.size()) {
                arrayList.remove(i);
                su5Var.i(su5Var.h() - 1);
                su5Var.h();
            }
        }
        if (ed3Var.getCount() == 0 || ed3Var.a == ed3Var.getCount()) {
            ed3Var.p();
            pe3Var = imageViewer.L0;
            imageViewer.J0 = pe3Var;
            imageViewer.L0 = null;
        } else {
            pe3Var = imageViewer.K0;
            imageViewer.J0 = pe3Var;
            imageViewer.K0 = null;
            z2 = true;
        }
        if (pe3Var == null) {
            pe3Var = new pe3(imageViewer, ed3Var);
            pe3Var.n();
            imageViewer.J0 = pe3Var;
        }
        pe3Var.k();
        imageViewer.U0 = null;
        imageViewer.q0(true);
        if (!pe3Var.e() && pe3Var.t == null) {
            pe3Var.a();
        } else if (z2) {
            imageViewer.j0();
        } else {
            imageViewer.k0();
        }
        imageViewer.A0();
        imageViewer.t0();
    }

    public static final void V(ed3 ed3Var, ImageViewer imageViewer, boolean z) {
        if (!z) {
            App appW = imageViewer.w();
            String strK = re8.k(imageViewer.getString(R.string.err_cant_rename), " ", ed3Var.k());
            Handler handler = App.M0;
            appW.k0(strK, false);
            return;
        }
        j30.I(imageViewer, R.string.ok);
        if (imageViewer.J0 != null) {
            pe3 pe3Var = new pe3(imageViewer, ed3Var);
            pe3Var.k();
            pe3Var.a();
        }
    }

    public static void p0(ImageViewer imageViewer, boolean z, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 250;
        }
        pe3 pe3Var = imageViewer.J0;
        imageViewer.o0(z, i, pe3Var != null ? pe3Var.q : null, true);
    }

    @Override // defpackage.j30
    public final boolean A() {
        return true;
    }

    public final void A0() {
        Matrix matrix;
        pe3 pe3Var = this.J0;
        if (pe3Var == null) {
            return;
        }
        RectF rectF = pe3Var.k;
        Matrix matrix2 = pe3Var.q;
        float fMapRadius = matrix2.mapRadius(1.0f);
        if (fMapRadius < pe3Var.n) {
            matrix = new Matrix();
            float[] fArr = {rectF.width() / 2.0f, rectF.height() / 2.0f};
            matrix.setTranslate(-fArr[0], -fArr[1]);
            matrix2.mapPoints(fArr);
            float f = pe3Var.n;
            matrix.postScale(f, f);
            matrix.postTranslate(fArr[0], fArr[1]);
            pe3Var.q(matrix, false);
            O(pe3Var, matrix, 133);
        } else if (fMapRadius > pe3Var.o) {
            Matrix matrix3 = new Matrix(matrix2);
            u0(matrix3, pe3Var.o / fMapRadius);
            matrix = matrix3;
        } else {
            matrix = null;
        }
        if (matrix != null) {
            pe3Var.q(matrix, false);
            O(pe3Var, matrix, 133);
        } else {
            Matrix matrix4 = new Matrix(matrix2);
            if (pe3Var.q(matrix4, false) != 0) {
                O(pe3Var, matrix4, 333);
            }
        }
    }

    public final void B0(PointF pointF) {
        pe3 pe3Var = this.J0;
        if (pe3Var == null) {
            return;
        }
        Matrix matrix = pe3Var.q;
        this.Q0 = -1;
        RectF rectFC = pe3Var.c(matrix);
        Matrix matrix2 = new Matrix();
        RectF rectF = this.f0;
        float fWidth = rectF.width() * 0.75f;
        float fHeight = rectF.height() * 0.75f;
        if (rectFC.width() < fWidth && rectFC.height() < fHeight) {
            pe3Var.l(matrix2);
        } else if (rectFC.width() < fWidth || rectFC.height() < fHeight) {
            PointF pointFJ = pe3Var.j(pointF);
            ImageViewer imageViewer = pe3Var.x;
            float fHeight2 = imageViewer.f0.height();
            RectF rectF2 = pe3Var.k;
            float fMax = Math.max(fHeight2 / rectF2.height(), imageViewer.f0.width() / rectF2.width());
            matrix2.reset();
            matrix2.preTranslate(-pointFJ.x, -pointFJ.y);
            matrix2.postScale(fMax, fMax);
            matrix2.postTranslate(pointF.x, pointF.y);
            pe3Var.q(matrix2, false);
            if (pe3Var.o < fMax) {
                pe3Var.o = fMax;
            }
            if (matrix2.mapRadius(1.0f) / pe3Var.n < 1.3f) {
                pe3Var.m(matrix2, pointF);
            }
        } else if (matrix.mapRadius(1.0f) < pe3Var.m * 4.0f * 0.6f) {
            pe3Var.m(matrix2, pointF);
        } else {
            pe3Var.l(matrix2);
        }
        O(pe3Var, matrix2, 333);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[PHI: r3
      0x001f: PHI (r3v2 float) = (r3v0 float), (r3v1 float) binds: [B:10:0x001d, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0(boolean z) {
        pe3 pe3Var = this.J0;
        if (pe3Var == null) {
            return;
        }
        Matrix matrix = pe3Var.q;
        this.U0 = null;
        float f = !z ? 0.625f : 1.6f;
        float fMapRadius = matrix.mapRadius(1.0f) * f;
        float f2 = pe3Var.n;
        if (fMapRadius < f2) {
            f *= f2 / fMapRadius;
        } else {
            f2 = pe3Var.o;
            if (fMapRadius > f2) {
            }
        }
        Matrix matrix2 = new Matrix(matrix);
        u0(matrix2, f);
        pe3Var.q(matrix2, false);
        O(pe3Var, matrix2, 133);
    }

    public final void D0(pe3 pe3Var, RectF rectF, int i, n72 n72Var) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, this.f0, Matrix.ScaleToFit.CENTER);
        float fMapRadius = matrix.mapRadius(1.0f);
        float f = pe3Var.o;
        if (fMapRadius > f) {
            u0(matrix, f / fMapRadius);
        } else {
            float f2 = pe3Var.n;
            if (fMapRadius < f2) {
                u0(matrix, f2 / fMapRadius);
            }
        }
        pe3Var.q(matrix, false);
        O(pe3Var, matrix, i).N = n72Var != null ? new c30(8, n72Var) : null;
    }

    public final void N(long j, zz2 zz2Var, int i) {
        int i2;
        zz2Var.Y(-853536976);
        if ((i & 6) == 0) {
            i2 = (zz2Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (zz2Var.O(i2 & 1, (i2 & 3) != 2)) {
            View view = (View) zz2Var.j(vd.f);
            Long lValueOf = Long.valueOf(j);
            boolean zH = zz2Var.h(view) | ((i2 & 14) == 4);
            Object objL = zz2Var.L();
            if (zH || objL == gw0.a) {
                ci ciVar = new ci(j, view, (b81) null, 1);
                zz2Var.g0(ciVar);
                objL = ciVar;
            }
            dt9.c((hy2) objL, zz2Var, lValueOf);
        } else {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new vh2(i, 1, j, this);
        }
    }

    public final qe3 O(pe3 pe3Var, Matrix matrix, int i) {
        qe3 qe3Var = new qe3(this, pe3Var, pe3Var.q, matrix, i);
        this.U0 = qe3Var;
        t0();
        return qe3Var;
    }

    public final void P() {
        se3 se3Var = this.a1;
        if (se3Var != null) {
            se3Var.b();
        }
        this.a1 = null;
        this.a1 = new se3(this);
        pe3 pe3Var = this.J0;
        if (pe3Var != null && pe3Var != null) {
            Matrix matrix = new Matrix();
            pe3Var.l(matrix);
            O(pe3Var, matrix, 333);
        }
        v0(false);
        if (a0().h("slideshowRandom", false)) {
            ed3 ed3Var = this.o0;
            rf3 rf3Var = ed3Var instanceof rf3 ? (rf3) ed3Var : null;
            if (rf3Var != null) {
                int i = rf3Var.a;
                ArrayList arrayList = rf3Var.c;
                ng4 ng4Var = (ng4) arrayList.get(i);
                Collections.shuffle(arrayList);
                int iIndexOf = arrayList.indexOf(ng4Var);
                if (i != iIndexOf) {
                    arrayList.set(iIndexOf, arrayList.get(i));
                    arrayList.set(i, ng4Var);
                }
                pe3 pe3Var2 = this.L0;
                if (pe3Var2 != null) {
                    pe3Var2.i();
                }
                this.L0 = null;
                pe3 pe3Var3 = this.K0;
                if (pe3Var3 != null) {
                    pe3Var3.i();
                }
                this.K0 = null;
            }
        }
    }

    public final boolean Q() {
        ed3 ed3Var = this.o0;
        if (ed3Var == null) {
            return false;
        }
        int count = ed3Var.getCount();
        return ed3Var.a != count + (-1) || count == 0;
    }

    public final boolean R() {
        ed3 ed3Var = this.o0;
        if (ed3Var != null) {
            return ed3Var.a != 0 || ed3Var.getCount() == 0;
        }
        return false;
    }

    public final void S() {
        ed3 ed3Var = this.o0;
        if (ed3Var == null || this.J0 == null || ed3Var.c() == 0) {
            return;
        }
        String strK = ed3Var.k();
        if (strK == null) {
            Uri uriL = ed3Var.l();
            String path = uriL != null ? uriL.getPath() : null;
            if (path == null) {
                path = "";
            }
            String[] strArr = se8.a;
            strK = jj7.d0('/', path, path);
        }
        i41 i41VarF = qsb.F(this.p0, Integer.valueOf(R.string.q_are_you_sure_), Integer.valueOf(R.drawable.op_delete), Integer.valueOf(R.string.delete), null, 8);
        i41VarF.t(strK);
        x94.p(i41VarF, Integer.valueOf(R.string.yes), new be3(0, this, ed3Var, strK), 2);
        x94.n(i41VarF, Integer.valueOf(R.string.no), new kl1(24), 2);
    }

    public final RectF T(Bitmap bitmap, RectF rectF, n72 n72Var) {
        Bitmap bitmapCreateScaledBitmap;
        of2 of2Var = this.S0;
        if (of2Var != null) {
            try {
                if (bitmap.getWidth() > 1024 || bitmap.getHeight() > 1024) {
                    float fMax = 1024.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
                    int iE = cq4.e(bitmap.getWidth() * fMax);
                    if (iE < 1) {
                        iE = 1;
                    }
                    int iE2 = cq4.e(bitmap.getHeight() * fMax);
                    if (iE2 < 1) {
                        iE2 = 1;
                    }
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iE, iE2, true);
                } else {
                    bitmapCreateScaledBitmap = bitmap;
                }
                bitmapCreateScaledBitmap.getClass();
                Bitmap bitmapCopy = bitmapCreateScaledBitmap.getConfig() == Bitmap.Config.HARDWARE ? bitmapCreateScaledBitmap.copy(Bitmap.Config.ARGB_8888, false) : bitmapCreateScaledBitmap;
                int width = bitmapCopy.getWidth();
                int height = bitmapCopy.getHeight();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                zi3 zi3Var = new zi3(bitmapCopy);
                zi3.a(-1, 1, bitmapCopy.getHeight(), bitmapCopy.getWidth(), bitmapCopy.getAllocationByteCount(), jElapsedRealtime);
                List list = (List) uo4.b(of2Var.k(zi3Var));
                if (bitmapCopy != bitmapCreateScaledBitmap) {
                    bitmapCopy.recycle();
                }
                if (bitmapCreateScaledBitmap != bitmap) {
                    bitmapCreateScaledBitmap.recycle();
                }
                if (!list.isEmpty()) {
                    float fWidth = rectF.width() / width;
                    float fHeight = rectF.height() / height;
                    RectF rectF2 = new RectF(Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((lf2) it.next()).a.getClass();
                        RectF rectF3 = new RectF(r6.left * fWidth, r6.top * fHeight, r6.right * fWidth, r6.bottom * fHeight);
                        if (n72Var != null) {
                            ((ArrayList) n72Var.d).add(new RectF(rectF3));
                        }
                        rectF2.union(rectF3);
                    }
                    rectF2.inset((-rectF2.width()) * 0.3f, (-rectF2.height()) * 0.3f);
                    rectF2.intersect(rectF);
                    return rectF2;
                }
            } catch (Exception e) {
                Handler handler = App.M0;
                e.getMessage();
                return null;
            }
        }
        return null;
    }

    public final void W(Canvas canvas, hy2 hy2Var) {
        int iSave;
        pe3 pe3Var = this.J0;
        if (pe3Var != null) {
            if (pe3Var.d()) {
                int i = this.g0;
                if (i == 1) {
                    canvas.drawColor(-16777216);
                } else if (i == 2) {
                    canvas.drawColor(-1);
                } else if (i != 3) {
                    int i2 = this.k0;
                    Rect rect = this.V0;
                    rect.set(0, 0, i2, i2);
                    int i3 = -13619152;
                    int i4 = -11513776;
                    while (true) {
                        int i5 = i3;
                        int i6 = i4;
                        while (rect.left < canvas.getWidth()) {
                            Paint paint = this.W0;
                            paint.setColor(i5);
                            canvas.drawRect(rect, paint);
                            rect.offset(i2, 0);
                            int i7 = i6;
                            i6 = i5;
                            i5 = i7;
                        }
                        rect.left = 0;
                        rect.right = i2;
                        rect.offset(0, i2);
                        if (rect.top >= canvas.getHeight()) {
                            break;
                        }
                        int i8 = i4;
                        i4 = i3;
                        i3 = i8;
                    }
                } else {
                    canvas.drawColor(-8355712);
                }
            }
            hy2Var.F(pe3Var, canvas);
            pe3 pe3Var2 = this.K0;
            if (pe3Var2 != null) {
                float fY = Y();
                float fWidth = this.f0.width();
                Matrix matrix = pe3Var2.q;
                if (fY < fWidth) {
                    float f = fY - pe3Var2.c(matrix).left;
                    iSave = canvas.save();
                    canvas.translate(f, 0.0f);
                    try {
                        hy2Var.F(pe3Var2, canvas);
                    } finally {
                    }
                } else {
                    pe3Var2.l(matrix);
                }
            }
            pe3 pe3Var3 = this.L0;
            if (pe3Var3 != null) {
                float fZ = Z();
                Matrix matrix2 = pe3Var3.q;
                if (fZ <= 0.0f) {
                    pe3Var3.l(matrix2);
                    return;
                }
                float f2 = fZ - pe3Var3.c(matrix2).right;
                iSave = canvas.save();
                canvas.translate(f2, 0.0f);
                try {
                    hy2Var.F(pe3Var3, canvas);
                } finally {
                }
            }
        }
    }

    public final void X(boolean z, boolean z2) {
        y0(z);
        final ru5 ru5Var = z ? this.w0 : this.x0;
        int i = !z2 ? 500 : 125;
        ru5Var.i(1.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: de3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = ImageViewer.d1;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                ru5Var.i(((Float) animatedValue).floatValue());
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final float Y() {
        pe3 pe3Var = this.J0;
        pe3Var.getClass();
        RectF rectFC = pe3Var.c(pe3Var.q);
        float f = rectFC.right + this.i0;
        float fWidth = rectFC.width();
        RectF rectF = this.f0;
        return fWidth < rectF.width() ? ((rectF.width() - rectFC.width()) / 2.0f) + f : f;
    }

    public final float Z() {
        pe3 pe3Var = this.J0;
        pe3Var.getClass();
        RectF rectFC = pe3Var.c(pe3Var.q);
        float f = rectFC.left - this.i0;
        float fWidth = rectFC.width();
        RectF rectF = this.f0;
        return fWidth < rectF.width() ? f - ((rectF.width() - rectFC.width()) / 2.0f) : f;
    }

    public final il1 a0() {
        return w().l();
    }

    public final boolean b0() {
        return ((Boolean) this.C0.getValue()).booleanValue();
    }

    public final xe3 c0() {
        return (xe3) this.G0.getValue();
    }

    public boolean d0() {
        return false;
    }

    public boolean e0() {
        return false;
    }

    public final Point f0() {
        RectF rectF = this.f0;
        return new Point(cq4.e(rectF.width()), cq4.e(rectF.height()));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g0(ed3 ed3Var) {
        ImageViewer imageViewer;
        boolean booleanExtra;
        ed3 ed3Var2;
        ed3 ed3Var3;
        ed3 ed3Var4;
        xe3 xe3VarC0;
        su5 su5Var;
        Uri data;
        ed3 ed3Var5;
        Uri data2;
        String scheme;
        int iHashCode;
        this.o0 = ed3Var;
        Intent intent = getIntent();
        b81 b81Var = null;
        if (intent != null) {
            booleanExtra = intent.getBooleanExtra("start_slideshow", false);
            if (this.o0 != null || (data2 = intent.getData()) == null || ((scheme = data2.getScheme()) != null && ((iHashCode = scheme.hashCode()) == 3143036 ? !scheme.equals("file") : !(iHashCode == 951530617 && scheme.equals("content"))))) {
                imageViewer = this;
            } else {
                if ((Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("uri_0", Parcelable.class) : intent.getParcelableExtra("uri_0")) != null) {
                    this.o0 = new dd3(w(), intent);
                    imageViewer = this;
                } else {
                    try {
                        imageViewer = this;
                        try {
                            kab.d(x2d.e(this), null, null, new lf(new pg4(w(), data2), imageViewer, data2, b81Var, 11), 3);
                            return;
                        } catch (Exception unused) {
                            Handler handler = App.M0;
                            data2.toString();
                            if (imageViewer.o0 != null) {
                            }
                            ed3Var2 = imageViewer.o0;
                            if (ed3Var2 != null) {
                                imageViewer.G0.setValue(new xe3(ed3Var5, imageViewer, ed3Var5.getCount()));
                            }
                            ed3Var3 = imageViewer.o0;
                            if (ed3Var3 != null) {
                                imageViewer.o0 = null;
                            }
                            if (intent != null) {
                            }
                            ed3Var4 = imageViewer.o0;
                            if (ed3Var4 != null) {
                            }
                            imageViewer.q0(false);
                            xe3VarC0 = imageViewer.c0();
                            if (xe3VarC0 != null) {
                                ed3 ed3Var6 = imageViewer.o0;
                                su5Var.i(134217728 | (ed3Var6 != null ? ed3Var6.a : 0));
                            }
                            if (booleanExtra) {
                            }
                        }
                    } catch (Exception unused2) {
                        imageViewer = this;
                    }
                }
            }
        } else {
            imageViewer = this;
            booleanExtra = false;
        }
        if (imageViewer.o0 != null) {
            imageViewer.setIntent(null);
            intent = null;
        }
        ed3Var2 = imageViewer.o0;
        if (ed3Var2 != null && ed3Var2.e() && (ed3Var5 = imageViewer.o0) != null) {
            imageViewer.G0.setValue(new xe3(ed3Var5, imageViewer, ed3Var5.getCount()));
        }
        ed3Var3 = imageViewer.o0;
        if (ed3Var3 != null && ed3Var3.getCount() == 0) {
            imageViewer.o0 = null;
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("filename");
            if (stringExtra != null) {
                data = Uri.parse("file://".concat(stringExtra));
                data.getClass();
            } else {
                data = intent.getData();
            }
            if (data != null) {
                String stringExtra2 = intent.getStringExtra("title");
                if (stringExtra2 == null) {
                    ContentResolver contentResolver = imageViewer.getContentResolver();
                    contentResolver.getClass();
                    stringExtra2 = th.g(contentResolver, data);
                }
                imageViewer.J0 = new pe3(imageViewer, data, stringExtra2, 0);
            }
            pe3 pe3Var = imageViewer.J0;
            if (pe3Var != null) {
                pe3Var.k();
            }
        }
        ed3Var4 = imageViewer.o0;
        if (ed3Var4 != null) {
            if (imageViewer.J0 == null && ed3Var4.getCount() != 0 && ed3Var4.a != ed3Var4.getCount()) {
                pe3 pe3Var2 = new pe3(imageViewer, ed3Var4);
                imageViewer.J0 = pe3Var2;
                pe3Var2.k();
            }
            if (imageViewer.Q()) {
                ed3Var4.o(ed3Var4.a + 1);
                imageViewer.K0 = new pe3(imageViewer, ed3Var4);
                ed3Var4.p();
            }
            if (imageViewer.R()) {
                ed3Var4.p();
                imageViewer.L0 = new pe3(imageViewer, ed3Var4);
                ed3Var4.o(ed3Var4.a + 1);
            }
        }
        imageViewer.q0(false);
        xe3VarC0 = imageViewer.c0();
        if (xe3VarC0 != null && (su5Var = xe3VarC0.d) != null) {
            ed3 ed3Var62 = imageViewer.o0;
            su5Var.i(134217728 | (ed3Var62 != null ? ed3Var62.a : 0));
        }
        if (booleanExtra) {
            return;
        }
        imageViewer.P();
    }

    public final boolean h0(MotionEvent motionEvent, boolean z) {
        RectF rectF = this.f0;
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fMin = (Math.min(fWidth, fHeight) * 0.8f) / 2.0f;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float f = fHeight / 2.0f;
        if (y < f - fMin || y > f + fMin) {
            return false;
        }
        return z ? x < fMin : x > fWidth - fMin;
    }

    public final void i0() {
        pe3 pe3Var = this.J0;
        if (pe3Var != null) {
            pe3Var.n();
            pe3Var.a();
        }
        pe3 pe3Var2 = this.K0;
        if (pe3Var2 != null) {
            pe3Var2.i();
            pe3Var2.n();
        }
        pe3 pe3Var3 = this.L0;
        if (pe3Var3 != null) {
            pe3Var3.i();
            pe3Var3.n();
        }
    }

    public final boolean j0() {
        ed3 ed3Var = this.o0;
        if (ed3Var == null) {
            return false;
        }
        pe3 pe3Var = this.K0;
        if ((pe3Var != null && pe3Var.e()) || !Q()) {
            return false;
        }
        if (this.K0 == null) {
            ed3Var.o(ed3Var.a + 1);
            pe3 pe3Var2 = new pe3(this, ed3Var);
            pe3Var2.n();
            this.K0 = pe3Var2;
            ed3Var.p();
        }
        pe3 pe3Var3 = this.K0;
        if (pe3Var3 != null) {
            pe3Var3.a();
        }
        return true;
    }

    public final void k0() {
        ed3 ed3Var = this.o0;
        if (ed3Var == null) {
            return;
        }
        pe3 pe3Var = this.L0;
        if ((pe3Var == null || !pe3Var.e()) && R()) {
            if (pe3Var == null) {
                ed3Var.p();
                pe3 pe3Var2 = new pe3(this, ed3Var);
                pe3Var2.n();
                this.L0 = pe3Var2;
                ed3Var.o(ed3Var.a + 1);
            }
            pe3 pe3Var3 = this.L0;
            if (pe3Var3 != null) {
                pe3Var3.a();
            }
        }
    }

    public final void l0() {
        boolean z;
        List<pe3> listH = fwc.h(this.J0, this.L0, this.K0);
        if ((listH instanceof Collection) && listH.isEmpty()) {
            z = false;
        } else {
            for (pe3 pe3Var : listH) {
                if (pe3Var != null) {
                    z = true;
                    if (pe3Var.h) {
                        break;
                    }
                }
            }
            z = false;
        }
        if (this.I0 != z) {
            this.I0 = z;
            getWindow().setColorMode(z ? 2 : 0);
        }
    }

    public final void m0() {
        se3 se3Var = this.a1;
        if (se3Var != null) {
            se3Var.a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(pe3 pe3Var, int i) {
        float f;
        float f2;
        float f3;
        Matrix matrix = pe3Var.q;
        RectF rectFC = pe3Var.c(matrix);
        float fWidth = rectFC.width();
        RectF rectF = this.f0;
        float fWidth2 = fWidth - rectF.width();
        float fHeight = rectFC.height() - rectF.height();
        switch (i) {
            case 19:
                if (fHeight > 0.0f) {
                    f3 = fHeight / 10.0f;
                    f2 = f3;
                    f = 0.0f;
                    if (f == 0.0f || f2 != 0.0f) {
                        this.U0 = null;
                        matrix.postTranslate(f, f2);
                        pe3Var.q(matrix, false);
                        t0();
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                this.U0 = null;
                matrix.postTranslate(f, f2);
                pe3Var.q(matrix, false);
                t0();
                break;
            case 20:
                if (fHeight > 0.0f) {
                    f3 = (-fHeight) / 10.0f;
                    f2 = f3;
                    f = 0.0f;
                    if (f == 0.0f) {
                    }
                    this.U0 = null;
                    matrix.postTranslate(f, f2);
                    pe3Var.q(matrix, false);
                    t0();
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                this.U0 = null;
                matrix.postTranslate(f, f2);
                pe3Var.q(matrix, false);
                t0();
                break;
            case zx9.zzm /* 21 */:
                if (rectFC.left + 1.0f <= 0.0f) {
                    if (fWidth2 > 0.0f) {
                        f = fWidth2 / 10.0f;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        this.U0 = null;
                        matrix.postTranslate(f, f2);
                        pe3Var.q(matrix, false);
                        t0();
                    }
                    f = 0.0f;
                    f2 = 0.0f;
                    if (f == 0.0f) {
                    }
                    this.U0 = null;
                    matrix.postTranslate(f, f2);
                    pe3Var.q(matrix, false);
                    t0();
                } else {
                    p0(this, false, 0, 6);
                    m0();
                }
                break;
            case 22:
                if (rectFC.right - 1.0f >= rectF.width()) {
                    if (fWidth2 > 0.0f) {
                        f = (-fWidth2) / 10.0f;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        this.U0 = null;
                        matrix.postTranslate(f, f2);
                        pe3Var.q(matrix, false);
                        t0();
                    }
                    f = 0.0f;
                    f2 = 0.0f;
                    if (f == 0.0f) {
                    }
                    this.U0 = null;
                    matrix.postTranslate(f, f2);
                    pe3Var.q(matrix, false);
                    t0();
                } else {
                    p0(this, true, 0, 6);
                    m0();
                }
                break;
            default:
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                this.U0 = null;
                matrix.postTranslate(f, f2);
                pe3Var.q(matrix, false);
                t0();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(boolean z, int i, Matrix matrix, boolean z2) {
        float fWidth;
        Bitmap bitmapCreateBitmap;
        x42 x42Var;
        Bitmap bitmap;
        boolean z3 = i == 0;
        RectF rectF = this.f0;
        if (!z3) {
            int iWidth = (int) rectF.width();
            int iHeight = (int) rectF.height();
            if (iWidth <= 0 || iHeight <= 0 || this.Y0 != null) {
                bitmapCreateBitmap = null;
                x42Var = this.b1;
                if (x42Var != null) {
                    ImageViewer imageViewer = (ImageViewer) x42Var.e;
                    if (hm3.b(imageViewer.b1, x42Var)) {
                        imageViewer.b1 = null;
                    }
                }
                if (bitmapCreateBitmap != null) {
                    this.b1 = new x42(this, bitmapCreateBitmap, i);
                }
            } else {
                try {
                    ArrayList arrayListY = is.y(new pe3[]{this.J0, this.L0, this.K0});
                    int iH = uo4.h(yr0.o(arrayListY, 10));
                    if (iH < 16) {
                        iH = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                    for (Object obj : arrayListY) {
                        pe3 pe3Var = (pe3) obj;
                        Object obj2 = pe3Var.f;
                        if (obj2 == null) {
                            obj2 = pe3Var.g;
                        }
                        BitmapDrawable bitmapDrawable = obj2 instanceof BitmapDrawable ? (BitmapDrawable) obj2 : null;
                        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                            try {
                                Bitmap bitmapCopy = bitmap.getConfig() == Bitmap.Config.HARDWARE ? bitmap.copy(pe3Var.d() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565, false) : null;
                                linkedHashMap.put(obj, bitmapCopy);
                            } catch (Throwable unused) {
                                bitmapCreateBitmap = null;
                            }
                        }
                        linkedHashMap.put(obj, bitmapCopy);
                    }
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.RGB_565);
                        bitmapCreateBitmap.getClass();
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        W(canvas, new hg1(linkedHashMap, 11, this));
                        x42 x42Var2 = this.b1;
                        if (x42Var2 != null) {
                            x42Var2.b(canvas);
                        }
                    } finally {
                        for (Bitmap bitmap2 : linkedHashMap.values()) {
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                x42Var = this.b1;
                if (x42Var != null) {
                }
                if (bitmapCreateBitmap != null) {
                }
            }
        }
        if (this.o0 == null) {
            return;
        }
        if (!(z && Q()) && (z || !R())) {
            return;
        }
        this.U0 = null;
        pe3 pe3Var2 = this.J0;
        if (z) {
            if (pe3Var2 == null || !z3) {
                fWidth = 0.0f;
            } else {
                fWidth = pe3Var2.c(pe3Var2.q).right + this.i0;
                pe3 pe3Var3 = this.K0;
                if (pe3Var3 != null && pe3Var3.t == null) {
                    fWidth += rectF.left - pe3Var3.c(pe3Var3.q).left;
                }
            }
            pe3 pe3Var4 = this.L0;
            if (pe3Var4 != null) {
                pe3Var4.i();
            }
            this.L0 = this.J0;
            this.J0 = this.K0;
            this.K0 = null;
            ed3 ed3Var = this.o0;
            if (ed3Var != null) {
                ed3Var.o(ed3Var.a + 1);
            }
        } else {
            if (pe3Var2 == null || !z3) {
                fWidth = 0.0f;
            } else {
                fWidth = (pe3Var2.c(pe3Var2.q).left - this.i0) - rectF.width();
                pe3 pe3Var5 = this.L0;
                if (pe3Var5 != null && pe3Var5.t == null) {
                    fWidth -= pe3Var5.c(pe3Var5.q).right - rectF.right;
                }
            }
            pe3 pe3Var6 = this.K0;
            if (pe3Var6 != null) {
                pe3Var6.i();
            }
            this.K0 = this.J0;
            this.J0 = this.L0;
            this.L0 = null;
            ed3 ed3Var2 = this.o0;
            if (ed3Var2 != null) {
                ed3Var2.p();
            }
        }
        q0(z2);
        pe3 pe3Var7 = this.J0;
        if (pe3Var7 == null) {
            ed3 ed3Var3 = this.o0;
            ed3Var3.getClass();
            pe3Var7 = new pe3(this, ed3Var3);
            pe3Var7.n();
            this.J0 = pe3Var7;
        }
        Matrix matrix2 = pe3Var7.q;
        pe3Var7.k();
        if (e0() && matrix != null) {
            matrix2.set(matrix);
        }
        if (!pe3Var7.e() && pe3Var7.t == null) {
            pe3Var7.a();
        } else if (z) {
            j0();
        } else {
            k0();
        }
        t0();
        if (z3) {
            matrix2.postTranslate(fWidth, 0.0f);
        }
        A0();
    }

    @Override // defpackage.mu0, android.app.Activity
    public final void onBackPressed() {
        if (this.Y0 != null) {
            x0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ImageViewer imageViewer;
        lod lodVarC;
        Bitmap.Config config;
        super.onCreate(bundle);
        j30.z(this);
        Handler handler = App.M0;
        int i = 2;
        if (qp9.e(this)) {
            try {
                pf2 pf2Var = new pf2();
                u9a u9aVar = (u9a) j15.c().a(u9a.class);
                u9aVar.getClass();
                of2 of2Var = new of2((b5c) u9aVar.a.d1(pf2Var), u9aVar.b, pf2Var);
                imageViewer = this;
                vw8 vw8Var = new vw8(imageViewer, this, vw8.Q, pl.f, o23.c);
                int i2 = 1;
                bl5[] bl5VarArr = {of2Var};
                q7a.j(bl5VarArr[0], "Requested API must not be null.");
                tm tmVarB = tm.b(Arrays.asList(bl5VarArr), false);
                if (tmVarB.a.isEmpty()) {
                    lodVarC = uo4.f(new b25(0, true));
                } else {
                    wf0 wf0VarF = wf0.f();
                    wf0VarF.d = new lg2[]{ezc.a};
                    wf0VarF.a = 27301;
                    wf0VarF.b = false;
                    wf0VarF.c = new u68(vw8Var, i, tmVarB);
                    lodVarC = vw8Var.c(0, wf0VarF.e());
                }
                ba baVar = new ba(11, new be3(i2, imageViewer, of2Var, vw8Var));
                lodVarC.getClass();
                lodVarC.f(os7.a, baVar);
                lodVarC.d(new un2(18));
            } catch (Exception e) {
                imageViewer = this;
                Handler handler2 = App.M0;
                e.getMessage();
            }
        } else {
            imageViewer = this;
        }
        imageViewer.getWindow().addFlags(1024);
        Object systemService = imageViewer.getSystemService("display");
        systemService.getClass();
        imageViewer.q0 = (DisplayManager) systemService;
        final View decorView = imageViewer.getWindow().getDecorView();
        decorView.getClass();
        decorView.setSystemUiVisibility(7943);
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: ee3
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i3) {
                int i4 = ImageViewer.d1;
                if ((i3 & 1) == 0) {
                    decorView.setSystemUiVisibility(7943);
                }
            }
        });
        imageViewer.C();
        imageViewer.C0.setValue(Boolean.valueOf(imageViewer.a0().h("showGallery", imageViewer.b0())));
        imageViewer.g0 = (int) imageViewer.a0().i("transparentBackground", imageViewer.g0);
        imageViewer.E0 = imageViewer.a0().h("panoramaAutoStart", imageViewer.E0);
        imageViewer.F0 = imageViewer.a0().h("panoramaUseSensor", imageViewer.E0);
        imageViewer.r0 = imageViewer.a0().h("showImageName", imageViewer.r0);
        Object systemService2 = imageViewer.getSystemService("activity");
        systemService2.getClass();
        ActivityManager activityManager = (ActivityManager) systemService2;
        if (activityManager.getMemoryClass() >= 256) {
            imageViewer.n0 = 2.0f;
            config = Bitmap.Config.ARGB_8888;
        } else if (activityManager.getMemoryClass() >= 128) {
            imageViewer.n0 = 1.5f;
            config = Bitmap.Config.RGB_565;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        imageViewer.m0 = config;
        imageViewer.i0 = th.d(imageViewer, 80.0f);
        imageViewer.k0 = th.d(imageViewer, 50.0f);
        int iD = (th.d(imageViewer, of3.d) + th.d(imageViewer, of3.c) + th.d(imageViewer, of3.b)) * 2;
        long j = of3.a;
        imageViewer.l0 = new Point(cq4.e((th.d(imageViewer, f32.b(j)) - iD) * 1.5f), cq4.e((th.d(imageViewer, f32.a(j)) - iD) * 1.5f));
        imageViewer.h0 = new GestureDetector(imageViewer, new he3(imageViewer));
        imageViewer.g0(imageViewer.w().o0);
        imageViewer.w().o0 = null;
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        rOIT.dcZPjWCPcZQi.invoke(null, this);
    }

    @Override // android.app.Activity
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!se8.o(motionEvent.getSource(), 2) || motionEvent.getAction() != 8) {
            return false;
        }
        if (motionEvent.getAxisValue(9) < 0.0f) {
            X(false, false);
            p0(this, true, 0, 6);
            m0();
        } else {
            X(true, false);
            p0(this, false, 0, 6);
            m0();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0106, code lost:
    
        if (r10 == 82) goto L107;
     */
    @Override // defpackage.j30, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        se3 se3Var;
        uh2 uh2VarA;
        keyEvent.getClass();
        tt5 tt5Var = this.Y0;
        if (tt5Var != null) {
            zd3 zd3Var = tt5Var.I;
            if (i == 51) {
                tt5Var.Y = !tt5Var.Y;
                tt5Var.e();
                return true;
            }
            switch (i) {
                case 19:
                case 20:
                    tt5Var.k(jya.b((Math.min(50, Math.max(5, keyEvent.getRepeatCount())) * 0.1f * (i != 19 ? 1 : -1)) + tt5Var.W, -80.0f, 80.0f));
                    tt5Var.c0 = true;
                    zd3Var.d();
                    break;
                case zx9.zzm /* 21 */:
                case 22:
                    tt5Var.i((Math.min(50, Math.max(5, keyEvent.getRepeatCount())) * 0.1f * (i != 21 ? 1 : -1)) + tt5Var.V);
                    tt5Var.c0 = true;
                    zd3Var.d();
                    break;
            }
            return true;
        }
        if (this.J0 != null) {
            boolean z = keyEvent.getRepeatCount() != 0;
            if (i == w().u().e(zs1.f)) {
                S();
                return true;
            }
            if (i != w().u().e(wo4.f)) {
                if (i == 23 || i == 96 || i == 66) {
                    if (!b0() && !z) {
                        RectF rectF = this.f0;
                        B0(new PointF(rectF.centerX(), rectF.centerY()));
                    }
                } else if (i == 62) {
                    if (!z && (se3Var = this.a1) != null) {
                        se3Var.c();
                        return true;
                    }
                } else {
                    if (i == 25 || i == 42) {
                        X(false, false);
                        p0(this, true, 0, 6);
                        m0();
                        return true;
                    }
                    if (i == 24 || i == 44) {
                        X(true, false);
                        p0(this, false, 0, 6);
                        m0();
                        return true;
                    }
                    if (i == 21 || i == 22) {
                        pe3 pe3Var = this.J0;
                        if (pe3Var != null) {
                            n0(pe3Var, i);
                            return true;
                        }
                    } else if (i == 19 || i == 20) {
                        pe3 pe3Var2 = this.J0;
                        if (pe3Var2 != null) {
                            if (pe3Var2.q.mapRadius(1.0f) > pe3Var2.m + 1.0E-4f) {
                                n0(pe3Var2, i);
                                return true;
                            }
                            if (i == 19) {
                                this.Z0.setValue(Boolean.TRUE);
                                return true;
                            }
                            v0(!b0());
                            return true;
                        }
                    } else {
                        if (i == 81) {
                            C0(true);
                            return true;
                        }
                        if (i == 69) {
                            C0(false);
                            return true;
                        }
                    }
                }
                return true;
            }
            ed3 ed3Var = this.o0;
            if (ed3Var != null && (uh2VarA = ed3Var.a(ed3Var.a)) != null) {
                ed3Var.n(!uh2VarA.O);
                z0();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (this.J0 != null) {
            if (i != 24 && i != 25) {
                if (i == 82) {
                    this.Z0.setValue(Boolean.TRUE);
                }
            }
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.jv2, android.app.Activity
    public void onPause() {
        SparseArray sparseArray;
        super.onPause();
        xe3 xe3VarC0 = c0();
        if (xe3VarC0 != null) {
            synchronized (xe3VarC0) {
                try {
                    int size = xe3VarC0.g.size();
                    int i = 0;
                    while (true) {
                        sparseArray = xe3VarC0.g;
                        if (i >= size) {
                            break;
                        }
                        ((ue3) sparseArray.valueAt(i)).a();
                        i++;
                    }
                    sparseArray.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        tt5 tt5Var = this.Y0;
        if (tt5Var != null) {
            tt5Var.d();
        }
        DisplayManager displayManager = this.q0;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.N0);
        } else {
            hm3.l("displayManager");
            throw null;
        }
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onResume() throws IllegalAccessException, InvocationTargetException {
        NLFulsVnkNPUjZ.vcxHIWeyqoUpL.invoke(null, this);
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onStop() throws IllegalAccessException, InvocationTargetException {
        NLFulsVnkNPUjZ.HID.invoke(null, this);
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.D0.i(System.currentTimeMillis());
    }

    public final void q0(boolean z) {
        xe3 xe3VarC0;
        su5 su5Var;
        if (b0()) {
            ed3 ed3Var = this.o0;
            int i = ed3Var != null ? ed3Var.a : 0;
            if (z && (xe3VarC0 = c0()) != null && (su5Var = xe3VarC0.d) != null) {
                su5Var.i(i);
            }
        }
        r0();
        z0();
        l0();
    }

    public final void r0() {
        String str;
        String strK = null;
        if (this.r0) {
            pe3 pe3Var = this.J0;
            if (pe3Var == null || (str = pe3Var.b) == null) {
                ed3 ed3Var = this.o0;
                if (ed3Var != null) {
                    strK = ed3Var.k();
                }
            } else {
                strK = str;
            }
        }
        this.H0.setValue(strK);
    }

    public final void s0() {
        pe3 pe3Var = this.L0;
        if (pe3Var != null) {
            pe3Var.i();
        }
        this.L0 = null;
        pe3 pe3Var2 = this.K0;
        if (pe3Var2 != null) {
            pe3Var2.i();
        }
        this.K0 = null;
        pe3 pe3Var3 = this.J0;
        if (pe3Var3 != null) {
            pe3Var3.i();
        }
        this.J0 = null;
    }

    public final void t0() {
        tu5 tu5Var = this.d0;
        tu5Var.i(tu5Var.h() + 1);
        tu5Var.h();
    }

    public final void u0(Matrix matrix, float f) {
        RectF rectF = this.f0;
        float fWidth = rectF.width() * 0.5f;
        float fHeight = rectF.height() * 0.5f;
        matrix.postTranslate(-fWidth, -fHeight);
        matrix.postScale(f, f);
        matrix.postTranslate(fWidth, fHeight);
    }

    public final void v0(boolean z) {
        ed3 ed3Var;
        xe3 xe3VarC0;
        su5 su5Var;
        if (b0() != z) {
            this.C0.setValue(Boolean.valueOf(z));
            il1.w(a0(), "showGallery", z);
            if (!z || (ed3Var = this.o0) == null || (xe3VarC0 = c0()) == null || (su5Var = xe3VarC0.d) == null) {
                return;
            }
            su5Var.i(ed3Var.a | 134217728);
        }
    }

    public void w0() {
    }

    public final void x0() {
        SurfaceHolder holder;
        vu5 vu5Var = this.B0;
        SurfaceView surfaceView = (SurfaceView) vu5Var.getValue();
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.removeCallback(this.X0);
        }
        vu5Var.setValue(null);
        tt5 tt5Var = this.Y0;
        if (tt5Var != null) {
            tt5Var.close();
        }
        this.Y0 = null;
        t0();
    }

    @Override // defpackage.j30
    public final qsb y() {
        return this.p0;
    }

    public final void y0(boolean z) {
        if (z) {
            this.y0.setValue(Boolean.valueOf(R()));
        } else {
            this.z0.setValue(Boolean.valueOf(Q()));
        }
    }

    public final void z0() {
        ed3 ed3Var = this.o0;
        if (ed3Var == null || !ed3Var.t()) {
            return;
        }
        uh2 uh2VarA = ed3Var.a(ed3Var.a);
        boolean z = false;
        if (uh2VarA != null && uh2VarA.O) {
            z = true;
        }
        this.v0.setValue(Boolean.valueOf(z));
        xe3 xe3VarC0 = c0();
        if (xe3VarC0 != null) {
            xe3VarC0.a(ed3Var.a, z);
        }
    }

    @Override // defpackage.j30
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        zz2Var.X(-200386538);
        N(this.D0.h(), zz2Var, i & 112);
        w15 w15VarI = f2c.i(t15.a, qq5Var);
        Object objL = zz2Var.L();
        j72 j72Var = gw0.a;
        if (objL == j72Var) {
            objL = tf2.a0;
            zz2Var.g0(objL);
        }
        w15 w15VarG = iwa.g(w15VarI, (wx2) objL);
        Object objL2 = zz2Var.L();
        if (objL2 == j72Var) {
            objL2 = tf2.b0;
            zz2Var.g0(objL2);
        }
        w15 w15VarF = iwa.f(w15VarG, (wx2) objL2);
        Object objL3 = zz2Var.L();
        if (objL3 == j72Var) {
            objL3 = tf2.c0;
            zz2Var.g0(objL3);
        }
        w15 w15VarG2 = iwc.g(w15VarF, (wx2) objL3);
        xe3 xe3VarC0 = c0();
        boolean zB0 = b0();
        boolean zH = zz2Var.h(this);
        Object objL4 = zz2Var.L();
        if (zH || objL4 == j72Var) {
            ha haVar = new ha(0, this, ImageViewer.class, "zoomToInterestingPoint", cgKo.yGjJTJjakqR, 0, 25);
            zz2Var.g0(haVar);
            objL4 = haVar;
        }
        nu3 nu3Var = (nu3) objL4;
        long jH = this.d0.h();
        boolean zH2 = zz2Var.h(this);
        Object objL5 = zz2Var.L();
        if (zH2 || objL5 == j72Var) {
            m0 m0Var = new m0(1, this, ImageViewer.class, "draw", "draw(Landroid/graphics/Canvas;)V", 0, 15);
            zz2Var.g0(m0Var);
            objL5 = m0Var;
        }
        nu3 nu3Var2 = (nu3) objL5;
        boolean zH3 = zz2Var.h(this);
        Object objL6 = zz2Var.L();
        if (zH3 || objL6 == j72Var) {
            m0 m0Var2 = new m0(1, this, ImageViewer.class, "onImageViewTouchEvent", "onImageViewTouchEvent(Landroid/view/MotionEvent;)V", 0, 16);
            zz2Var.g0(m0Var2);
            objL6 = m0Var2;
        }
        nu3 nu3Var3 = (nu3) objL6;
        f11 f11Var = this.o0 instanceof cd3 ? e11.b : e11.a;
        int i2 = 1;
        boolean z = !w().b;
        String str = (String) this.H0.getValue();
        boolean zH4 = zz2Var.h(this);
        Object objL7 = zz2Var.L();
        int i3 = 0;
        if (zH4 || objL7 == j72Var) {
            objL7 = new zd3(this, i3);
            zz2Var.g0(objL7);
        }
        tx2 tx2Var = (tx2) objL7;
        boolean zH5 = zz2Var.h(this);
        Object objL8 = zz2Var.L();
        if (zH5 || objL8 == j72Var) {
            objL8 = new zd3(this, i2);
            zz2Var.g0(objL8);
        }
        tx2 tx2Var2 = (tx2) objL8;
        tx2 tx2Var3 = (tx2) nu3Var;
        wx2 wx2Var = (wx2) nu3Var2;
        boolean zH6 = zz2Var.h(this);
        Object objL9 = zz2Var.L();
        if (zH6 || objL9 == j72Var) {
            objL9 = new ae3(this, i3);
            zz2Var.g0(objL9);
        }
        wx2 wx2Var2 = (wx2) objL9;
        wx2 wx2Var3 = (wx2) nu3Var3;
        boolean zH7 = zz2Var.h(this);
        Object objL10 = zz2Var.L();
        if (zH7 || objL10 == j72Var) {
            objL10 = new ae3(this, i2);
            zz2Var.g0(objL10);
        }
        of3.h(w15VarG2, xe3VarC0, this.Z0, this.s0, this.t0, this.u0, this.v0, zB0, this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, tx2Var, tx2Var2, tx2Var3, jH, z, wx2Var, wx2Var2, wx2Var3, f11Var, str, (wx2) objL10, zz2Var, 0);
        zz2Var.p(false);
    }
}
