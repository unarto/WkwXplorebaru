package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.client.hsdp.cxoJ.pJBIycHMDgrWi;
import defpackage.ay8;
import defpackage.br;
import defpackage.c9d;
import defpackage.fh;
import defpackage.fr8;
import defpackage.kjd;
import defpackage.lod;
import defpackage.mn;
import defpackage.ms7;
import defpackage.mu;
import defpackage.ng6;
import defpackage.q13;
import defpackage.qnd;
import defpackage.uo4;
import defpackage.ux6;
import defpackage.vl6;
import defpackage.w9b;
import defpackage.yl8;
import defpackage.yyc;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingService extends Service {
    public static final ArrayDeque J = new ArrayDeque(10);
    public vl6 I;
    public final ExecutorService a;
    public fr8 b;
    public final Object c;
    public int d;
    public int e;

    public FirebaseMessagingService() {
        ay8 ay8Var = new ay8("Firebase-Messaging-Intent-Handle", 2);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ay8Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new Object();
        this.e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            yyc.c(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    stopSelfResult(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(ng6 ng6Var) {
    }

    public void d(String str) {
    }

    public void e(String str) {
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        fr8 fr8Var;
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            fr8Var = this.b;
            if (fr8Var == null) {
                fr8Var = new fr8(new w9b(11, this));
                this.b = fr8Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return fr8Var;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) ux6.L().e).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        ms7 ms7Var = new ms7();
        this.a.execute(new fh(3, this, intent2, ms7Var));
        lod lodVar = ms7Var.a;
        if (lodVar.k()) {
            a(intent);
            return 2;
        }
        lodVar.c(new br(1), new mn(this, 6, intent));
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Intent intent) {
        String stringExtra;
        byte b;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                d(intent.getStringExtra("token"));
                return;
            }
            if ("com.google.firebase.messaging.FCM_REGISTERED".equals(action)) {
                e(intent.getStringExtra("token"));
                return;
            } else {
                if ("com.google.firebase.messaging.FCM_UNREGISTERED".equals(action)) {
                    intent.getStringExtra("token");
                    return;
                }
                Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
                return;
            }
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra2)) {
            stringExtra = intent.getStringExtra("message_type");
            if (stringExtra == null) {
                stringExtra = "gcm";
            }
            b = -1;
            switch (stringExtra.hashCode()) {
                case -2062414158:
                    if (stringExtra.equals("deleted_messages")) {
                        b = 0;
                    }
                    break;
                case 102161:
                    if (stringExtra.equals(pJBIycHMDgrWi.uThh)) {
                        b = 1;
                    }
                    break;
                case 814694033:
                    if (stringExtra.equals("send_error")) {
                        b = 2;
                    }
                    break;
                case 814800675:
                    if (stringExtra.equals("send_event")) {
                        b = 3;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    break;
                case 1:
                    c9d.e(intent);
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    extras.remove("androidx.content.wakelockid");
                    if (!yl8.C(extras)) {
                        c(new ng6(extras));
                    } else {
                        yl8 yl8Var = new yl8(extras);
                        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ay8("Firebase-Messaging-Network-Io", 2));
                        try {
                            if (!new mu(this, yl8Var, executorServiceNewSingleThreadExecutor).A()) {
                                executorServiceNewSingleThreadExecutor.shutdown();
                                if (c9d.g(intent)) {
                                    c9d.f("_nf", intent.getExtras());
                                }
                                c(new ng6(extras));
                            }
                        } finally {
                            executorServiceNewSingleThreadExecutor.shutdown();
                        }
                    }
                    break;
                case 2:
                    if (intent.getStringExtra("google.message_id") == null) {
                        intent.getStringExtra("message_id");
                    }
                    String stringExtra3 = intent.getStringExtra("error");
                    new q13(stringExtra3, 4);
                    if (stringExtra3 != null) {
                        stringExtra3.toLowerCase(Locale.US).getClass();
                    }
                    break;
                case 3:
                    intent.getStringExtra("google.message_id");
                    break;
                default:
                    Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                    break;
            }
        } else {
            ArrayDeque arrayDeque = J;
            if (!arrayDeque.contains(stringExtra2)) {
                if (arrayDeque.size() >= 10) {
                    arrayDeque.remove();
                }
                arrayDeque.add(stringExtra2);
                stringExtra = intent.getStringExtra("message_type");
                if (stringExtra == null) {
                }
                b = -1;
                switch (stringExtra.hashCode()) {
                    case -2062414158:
                        break;
                    case 102161:
                        break;
                    case 814694033:
                        break;
                    case 814800675:
                        break;
                }
                switch (b) {
                }
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
            }
        }
        vl6 vl6Var = this.I;
        if (vl6Var == null) {
            vl6Var = new vl6(getApplicationContext());
            this.I = vl6Var;
        }
        if (vl6Var.c.b() < 233700000) {
            uo4.e(new IOException("SERVICE_NOT_AVAILABLE"));
            return;
        }
        Bundle bundle = new Bundle();
        String stringExtra4 = intent.getStringExtra("google.message_id");
        if (stringExtra4 == null) {
            stringExtra4 = intent.getStringExtra("message_id");
        }
        bundle.putString("google.message_id", stringExtra4);
        Integer numValueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
        if (numValueOf != null) {
            bundle.putInt("google.product_id", numValueOf.intValue());
        }
        qnd qndVarG = qnd.G(vl6Var.b);
        synchronized (qndVarG) {
            i = qndVarG.b;
            qndVarG.b = i + 1;
        }
        qndVarG.P(new kjd(i, 3, bundle, 0));
    }
}
