package com.lonelycatgames.Xplore.FileSystem;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import com.lonelycatgames.Xplore.App;
import defpackage.hk;
import defpackage.j30;
import defpackage.kc6;
import defpackage.qh1;
import defpackage.qq5;
import defpackage.se8;
import defpackage.tv0;
import defpackage.ve5;
import defpackage.zz2;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class CustomStorageFrameworkFileSystem$GetTreeUriActivity extends j30 {
    public static final /* synthetic */ int d0 = 0;

    public final Uri N() {
        Intent intent = getIntent();
        intent.getClass();
        return (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("uri", Uri.class) : (Uri) intent.getParcelableExtra("uri"));
    }

    public final void O() {
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
            intent.putExtra("android.provider.extra.INITIAL_URI", N());
            J(intent, 1);
        } catch (ActivityNotFoundException e) {
            w().k0(se8.k(e), true);
            finish();
        }
    }

    @Override // defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        qh1 qh1Var;
        String strK;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && (qh1Var = qh1.k) != null) {
            if (i2 != -1) {
                strK = ve5.j(i2, "Invalid result: ");
            } else {
                Uri data = intent != null ? intent.getData() : null;
                if (data == null) {
                    strK = "No uri returned";
                } else {
                    if (!data.equals(N())) {
                        App appW = w();
                        String strK2 = tv0.k("Select correct path: ", DocumentsContract.getTreeDocumentId(N()));
                        Handler handler = App.M0;
                        appW.k0(strK2, false);
                        O();
                        return;
                    }
                    qh1 qh1Var2 = qh1.k;
                    ContentResolver contentResolver = getContentResolver();
                    contentResolver.getClass();
                    try {
                        contentResolver.takePersistableUriPermission(data, 3);
                        strK = null;
                    } catch (Exception e) {
                        strK = se8.k(e);
                    }
                }
            }
            synchronized (qh1Var.j) {
                qh1Var.i = strK;
                qh1.k = null;
                Object obj = qh1Var.j;
                String[] strArr = se8.a;
                obj.notify();
            }
        }
        finish();
    }

    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O();
    }

    @Override // defpackage.j30
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        zz2Var.Y(-1723191249);
        int i2 = i & 1;
        if (!zz2Var.O(i2, i2 != 0)) {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new hk(this, qq5Var, i, 10);
        }
    }
}
