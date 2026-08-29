package com.lonelycatgames.Xplore.FileSystem;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import com.lonelycatgames.Xplore.R;
import defpackage.a16;
import defpackage.ax6;
import defpackage.ba;
import defpackage.es5;
import defpackage.fwc;
import defpackage.j30;
import defpackage.k2d;
import defpackage.kc6;
import defpackage.oi7;
import defpackage.q8;
import defpackage.qq5;
import defpackage.qsb;
import defpackage.s8;
import defpackage.se8;
import defpackage.w36;
import defpackage.zk4;
import defpackage.zz2;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class StorageFrameworkFileSystem$GetTreeUriActivity extends j30 {
    public static final /* synthetic */ int g0 = 0;
    public boolean d0;
    public final qsb e0 = new qsb(10);
    public final s8 f0 = o(new ba(29, this), new q8(1));

    public final void N() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        if (!this.d0) {
            intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        }
        intent.putExtra("android.provider.extra.INITIAL_URI", DocumentsContract.buildDocumentUri("com.android.externalstorage.documents", getIntent().getStringExtra("uuid") + ":" + getIntent().getStringExtra("path")));
        try {
            this.f0.d(intent, null);
        } catch (ActivityNotFoundException e) {
            w().k0(se8.k(e), true);
            finish();
        }
    }

    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (oi7.t) {
            Intent intent = getIntent();
            intent.getClass();
            StorageVolume storageVolume = (StorageVolume) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("volume", StorageVolume.class) : (StorageVolume) intent.getParcelableExtra("volume"));
            if (storageVolume != null) {
                Intent intentCreateAccessIntent = storageVolume.createAccessIntent(null);
                if (intentCreateAccessIntent != null) {
                    try {
                        this.f0.d(intentCreateAccessIntent, null);
                        return;
                    } catch (ActivityNotFoundException e) {
                        w().k0(se8.k(e), true);
                        finish();
                        return;
                    }
                }
                return;
            }
        }
        C();
        boolean booleanExtra = getIntent().getBooleanExtra("is_primary", false);
        this.d0 = booleanExtra;
        k2d.m(this.e0, Integer.valueOf(booleanExtra ? R.string.access_to_storage : R.string.write_to_ext_card), fwc.h(new es5(Integer.valueOf(R.string.write_to_ext_card_info), Integer.valueOf(R.drawable.storage_framework_1)), new es5(Integer.valueOf(R.string.write_to_ext_card_info1), Integer.valueOf(R.drawable.storage_framework_2)), new es5(Integer.valueOf(R.string.write_to_ext_card_info2), Integer.valueOf(R.drawable.storage_framework_3)), new es5(Integer.valueOf(R.string.write_to_ext_card_info3), Integer.valueOf(R.drawable.storage_framework_4))), Integer.valueOf(R.string.write_to_ext_card_info4), new a16(17, this), new ax6(this), new zk4(0, this, StorageFrameworkFileSystem$GetTreeUriActivity.class, "startPick", "startPick()V", 0, 12));
    }

    @Override // defpackage.j30
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        zz2Var.Y(87585039);
        int i2 = i & 1;
        if (!zz2Var.O(i2, i2 != 0)) {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new w36(this, qq5Var, i, 2);
        }
    }

    @Override // defpackage.j30
    public final qsb y() {
        return this.e0;
    }
}
