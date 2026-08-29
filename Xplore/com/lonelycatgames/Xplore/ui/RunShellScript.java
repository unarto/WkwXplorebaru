package com.lonelycatgames.Xplore.ui;

import android.media.aA.rOIT;
import android.net.Uri;
import android.os.Bundle;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.R;
import defpackage.ey0;
import defpackage.h37;
import defpackage.j30;
import defpackage.jj7;
import defpackage.kab;
import defpackage.kc6;
import defpackage.ot5;
import defpackage.qj7;
import defpackage.qq5;
import defpackage.qsb;
import defpackage.se8;
import defpackage.th;
import defpackage.w36;
import defpackage.x2d;
import defpackage.zk4;
import defpackage.zz2;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class RunShellScript extends j30 {
    public static final /* synthetic */ int f0 = 0;
    public File d0;
    public final qsb e0 = new qsb(10);

    public final void N(String str) {
        String str2 = w().k().j.b() ? "su" : "sh";
        App appW = w();
        String[] strArr = se8.a;
        ey0 ey0Var = new ey0(this, appW, R.drawable.op_run_script, jj7.d0('/', str, str), new zk4(0, this, RunShellScript.class, "finish", "finish()V", 0, 8), 48);
        try {
            h37 h37Var = new h37(ey0Var, str2);
            ey0Var.e = h37Var;
            h37Var.a("sh \"" + qj7.v(str, "/storage/emulated/0/", "/sdcard/") + "\"\n");
        } catch (Exception e) {
            ey0.k(ey0Var, se8.k(e), 2);
            finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r0.equals("file") == false) goto L21;
     */
    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C();
        Uri data = getIntent().getData();
        if (data != null) {
            String scheme = data.getScheme();
            if (scheme != null) {
                int iHashCode = scheme.hashCode();
                if (iHashCode != 3143036) {
                    if (iHashCode == 951530617 && scheme.equals("content")) {
                        kab.d(x2d.e(this), null, null, new ot5(this, data, null, 6), 3);
                        return;
                    }
                }
            }
            N(th.l(data));
            return;
        }
        w().k0("Incompatible file type", false);
        finish();
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        rOIT.Fqc.invoke(null, this);
    }

    @Override // defpackage.j30
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        zz2Var.Y(119989335);
        int i2 = i & 1;
        if (!zz2Var.O(i2, i2 != 0)) {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new w36(this, qq5Var, i, 1);
        }
    }

    @Override // defpackage.j30
    public final qsb y() {
        return this.e0;
    }
}
