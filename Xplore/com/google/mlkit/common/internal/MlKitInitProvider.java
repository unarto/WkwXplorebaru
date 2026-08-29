package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import defpackage.bj3;
import defpackage.c63;
import defpackage.e;
import defpackage.eu0;
import defpackage.j15;
import defpackage.os7;
import defpackage.q7a;
import defpackage.tu0;
import defpackage.vx8;
import defpackage.wu0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class MlKitInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        q7a.k("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.", !providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"));
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            Log.i("MlKitInitProvider", "No context available. Manually call MlKit.initialize(), otherwise ML Kit will not be functional.");
            return false;
        }
        synchronized (j15.b) {
            q7a.k("MlKitContext is already initialized", j15.c == null);
            j15 j15Var = new j15();
            j15.c = j15Var;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListN = new bj3(context, new vx8(8, MlKitComponentDiscoveryService.class), false).n();
            c63 c63Var = os7.a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            e eVar = tu0.i;
            arrayList.addAll(arrayListN);
            arrayList2.add(eu0.c(context, Context.class, new Class[0]));
            arrayList2.add(eu0.c(j15Var, j15.class, new Class[0]));
            wu0 wu0Var = new wu0(c63Var, arrayList, arrayList2, eVar);
            j15Var.a = wu0Var;
            wu0Var.o(true);
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
