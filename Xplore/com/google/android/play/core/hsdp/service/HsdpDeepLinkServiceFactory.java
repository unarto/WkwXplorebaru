package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.material.bottomappbar.LRu.EvrtLNVeHVJd;
import defpackage.agd;
import defpackage.e;
import defpackage.ew3;
import defpackage.ic9;
import defpackage.jbd;
import defpackage.jt4;
import defpackage.mjb;
import defpackage.nqb;
import defpackage.q93;
import defpackage.y0b;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class HsdpDeepLinkServiceFactory {
    private static final String HPOA_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hpoa.service.HpoaService";
    private static final String HPOA_SERVICE_CLASS_NAME_FOR_TESTING = "com.google.android.play.core.hsdp.testapp.FakeHpoaService";
    private static final String HSDP_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hsdp.service.HsdpService";

    private HsdpDeepLinkServiceFactory() {
    }

    public static q93 create(Context context) {
        return createInternal(context, false, true);
    }

    private static Intent createHpoaServiceIntent(Context context, boolean z) {
        return z ? new Intent().setClassName(context.getPackageName(), HPOA_SERVICE_CLASS_NAME_FOR_TESTING) : new Intent().setClassName("com.android.vending", HPOA_SERVICE_CLASS_NAME);
    }

    public static Intent createHsdpServiceIntent() {
        return new Intent().setClassName("com.android.vending", HSDP_SERVICE_CLASS_NAME);
    }

    private static q93 createInternal(Context context, boolean z, boolean z2) {
        if (!z2 && !(context instanceof Activity)) {
            e.k(EvrtLNVeHVJd.ITprdpeZAXy);
            return null;
        }
        if (z && !(context instanceof Activity)) {
            e.k("Context must be an Activity when enabling loading panel.");
            return null;
        }
        boolean z3 = false;
        boolean z4 = ActivityManager.isRunningInTestHarness() || (Build.VERSION.SDK_INT >= 29 && ActivityManager.isRunningInUserTestHarness());
        nqb nqbVarG = jbd.g(new ew3(9, context, z4));
        nqb nqbVarG2 = jbd.g(new ic9(context));
        if (z && (context instanceof Activity)) {
            z3 = true;
        }
        mjb mjbVar = context instanceof Activity ? new mjb((Activity) context) : null;
        jt4 jt4Var = new jt4();
        jt4Var.h = null;
        jt4Var.d = context;
        jt4Var.e = nqbVarG;
        jt4Var.f = nqbVarG2;
        jt4Var.a = z4;
        jt4Var.b = z2;
        jt4Var.c = z3;
        jt4Var.g = mjbVar;
        return jt4Var;
    }

    public static /* synthetic */ y0b lambda$createInternal$0(Context context, boolean z) {
        return new agd(createHpoaServiceIntent(context, z), (Activity) context);
    }

    public static q93 create(Activity activity, boolean z) {
        return create(activity, z, false);
    }

    public static q93 create(Activity activity, boolean z, boolean z2) {
        return createInternal(activity, z, z2);
    }

    public static q93 create(Activity activity) {
        return create(activity, false);
    }
}
