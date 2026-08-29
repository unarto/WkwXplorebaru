package com.lonelycatgames.Xplore;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import defpackage.pg;
import defpackage.pp7;
import defpackage.qp9;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends ContentProvider {
    public static final boolean b;
    public final pp7 a = new pp7(new pg(14, this));

    static {
        b = Build.VERSION.SDK_INT != 29;
    }

    public final App a() {
        Context context = getContext();
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return (App) applicationContext;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Handler handler = App.M0;
        qp9.f();
        return true;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }
}
