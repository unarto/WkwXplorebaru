package com.lonelycatgames.Xplore.utils;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.lonelycatgames.Xplore.App;
import defpackage.bs;
import defpackage.hm3;
import defpackage.hx6;
import defpackage.jq3;
import defpackage.k85;
import defpackage.kab;
import defpackage.ng6;
import defpackage.oc0;
import defpackage.se8;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseMessage extends FirebaseMessagingService {
    public App K;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(ng6 ng6Var) {
        if (ng6Var.b == null) {
            Bundle bundle = ng6Var.a;
            bs bsVar = new bs(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        bsVar.put(str, str2);
                    }
                }
            }
            ng6Var.b = bsVar;
        }
        String str3 = (String) new HashMap(ng6Var.b).get("serverMessage");
        if (str3 == null) {
            Handler handler = App.M0;
            return;
        }
        try {
            jq3 jq3Var = se8.b;
            k85 k85Var = jq3Var.b;
            hx6 hx6Var = (hx6) jq3Var.b(hx6.Companion.serializer(), str3);
            App app = this.K;
            if (app == null) {
                hm3.l("app");
                throw null;
            }
            kab.d(app.L0, null, null, new oc0(this, hx6Var, ng6Var, null, 6), 3);
        } catch (Exception unused) {
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        str.getClass();
        Handler handler = App.M0;
        Log.i("X-plore", "FCM token: ".concat(str));
        App app = this.K;
        if (app != null) {
            app.U(str);
        } else {
            hm3.l("app");
            throw null;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(String str) {
        str.getClass();
        Handler handler = App.M0;
        Log.i("X-plore", "FCM token: ".concat(str));
        App app = this.K;
        if (app != null) {
            app.U(str);
        } else {
            hm3.l("app");
            throw null;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Application application = getApplication();
        application.getClass();
        this.K = (App) application;
    }
}
