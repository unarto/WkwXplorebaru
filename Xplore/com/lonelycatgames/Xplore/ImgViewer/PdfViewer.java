package com.lonelycatgames.Xplore.ImgViewer;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.lonelycatgames.Xplore.App;
import defpackage.b81;
import defpackage.ed3;
import defpackage.es5;
import defpackage.fb4;
import defpackage.hm3;
import defpackage.il1;
import defpackage.kab;
import defpackage.ot5;
import defpackage.qp9;
import defpackage.sd4;
import defpackage.se8;
import defpackage.u1;
import defpackage.uw5;
import defpackage.x2d;
import defpackage.xr0;
import defpackage.yyc;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class PdfViewer extends ImageViewer {
    public static final /* synthetic */ int h1 = 0;
    public String e1;
    public final boolean f1 = true;
    public uw5 g1;

    @Override // com.lonelycatgames.Xplore.ImgViewer.ImageViewer
    public final boolean d0() {
        uw5 uw5Var = this.g1;
        if (uw5Var != null) {
            return ((Map) uw5Var.O.getValue()) != null;
        }
        hm3.l("pdfCursor");
        throw null;
    }

    @Override // com.lonelycatgames.Xplore.ImgViewer.ImageViewer
    public final boolean e0() {
        return this.f1;
    }

    @Override // com.lonelycatgames.Xplore.ImgViewer.ImageViewer
    public final void g0(ed3 ed3Var) {
        uw5 uw5Var;
        Uri data;
        Intent intent = getIntent();
        b81 b81Var = null;
        if (intent == null || (data = intent.getData()) == null) {
            uw5Var = null;
        } else {
            try {
                if (data.getScheme() == null) {
                    data = data.buildUpon().scheme("file").build();
                    data.getClass();
                }
                String string = data.toString();
                string.getClass();
                this.e1 = string;
                try {
                    uw5Var = new uw5(w(), data);
                    il1.m(w().l(), string, new String[]{"page", "password"}, new fb4(17, uw5Var));
                } catch (SecurityException e) {
                    Handler handler = App.M0;
                    qp9.d(e);
                    w().k0(se8.k(e), false);
                    finish();
                    return;
                }
            } catch (Exception e2) {
                App appW = w();
                String strK = se8.k(e2);
                Handler handler2 = App.M0;
                appW.k0(strK, false);
                uw5Var = null;
            }
        }
        if (uw5Var == null) {
            finish();
        } else {
            this.g1 = uw5Var;
            kab.d(x2d.e(this), null, null, new ot5(this, b81Var, 1), 3);
        }
    }

    @Override // com.lonelycatgames.Xplore.ImgViewer.ImageViewer, defpackage.jv2, android.app.Activity
    public final void onPause() {
        super.onPause();
        uw5 uw5Var = this.g1;
        if (uw5Var == null) {
            hm3.l("pdfCursor");
            throw null;
        }
        String str = this.e1;
        if (str != null) {
            int i = uw5Var.a;
            if (i <= 0 && uw5Var.M.length() <= 0) {
                w().l().o("pdf", "url", str);
                return;
            }
            ContentValues contentValuesD = yyc.d(new es5("url", str), new es5("page", Integer.valueOf(i)));
            il1 il1VarL = w().l();
            String[] strArr = il1.d;
            il1VarL.a("pdf", "url", str, contentValuesD, 10);
        }
    }

    @Override // com.lonelycatgames.Xplore.ImgViewer.ImageViewer
    public final void w0() {
        uw5 uw5Var = this.g1;
        if (uw5Var == null) {
            hm3.l("pdfCursor");
            throw null;
        }
        Map map = (Map) uw5Var.O.getValue();
        if (map == null) {
            return;
        }
        new u1(xr0.F(map.entrySet(), "\n", null, null, new sd4(26), 30), this.p0, 1);
    }
}
