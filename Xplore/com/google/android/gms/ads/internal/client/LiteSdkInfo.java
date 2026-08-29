package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.a6a;
import defpackage.c6a;
import defpackage.dla;
import defpackage.mdb;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class LiteSdkInfo extends dla {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // defpackage.ema
    public c6a getAdapterCreator() {
        return new a6a();
    }

    @Override // defpackage.ema
    public mdb getLiteSdkVersion() {
        return new mdb(ModuleDescriptor.MODULE_VERSION, "25.4.0", ModuleDescriptor.MODULE_VERSION);
    }
}
