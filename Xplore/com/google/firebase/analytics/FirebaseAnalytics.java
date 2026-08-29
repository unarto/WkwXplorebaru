package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import defpackage.idb;
import defpackage.kn2;
import defpackage.ksa;
import defpackage.lqa;
import defpackage.ps4;
import defpackage.q7a;
import defpackage.rn2;
import defpackage.s6d;
import defpackage.sn2;
import defpackage.uo4;
import defpackage.woa;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final idb a;

    public FirebaseAnalytics(idb idbVar) {
        q7a.i(idbVar);
        this.a = idbVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(idb.e(context, null));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public static s6d getScionFrontendApiImplementation(Context context, Bundle bundle) {
        idb idbVarE = idb.e(context, bundle);
        if (idbVarE == null) {
            return null;
        }
        return new woa(idbVarE);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = rn2.l;
            return (String) uo4.c(((rn2) kn2.c().b(sn2.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ps4.e(e);
            return null;
        } catch (ExecutionException e2) {
            ps4.e(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        lqa lqaVarB = lqa.b(activity);
        idb idbVar = this.a;
        idbVar.getClass();
        idbVar.c(new ksa(idbVar, lqaVarB, str, str2));
    }
}
