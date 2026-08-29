package com.android.billingclient.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.gh1;
import defpackage.i9a;
import defpackage.j5b;
import defpackage.l5d;
import defpackage.o28;
import defpackage.s1d;
import defpackage.t2d;
import defpackage.u5d;
import defpackage.w50;
import defpackage.x50;
import defpackage.y2d;
import defpackage.ypa;
import defpackage.yu4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public boolean I;
    public j5b J;
    public o28 K;
    public ResultReceiver a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;

    public static int a(Intent intent, int i) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            return i == 5 ? 139 : 1;
        }
        if (i == -1) {
            return 113;
        }
        if (i == 0) {
            return 114;
        }
        if (i != 3) {
            return i != 4 ? 117 : 116;
        }
        return 115;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent b(int i, long j, boolean z) {
        x50 x50Var;
        Intent intentC = c();
        s1d s1dVar = s1d.BROADCAST_ACTION_UNSPECIFIED;
        if (z) {
            j5b j5bVar = this.J;
            if (j5bVar != null && (x50Var = j5bVar.a) != null) {
                intentC.putExtra("RESPONSE_CODE", x50Var.a);
                intentC.putExtra("DEBUG_MESSAGE", x50Var.c);
            } else if (j5bVar != null && !j5bVar.b) {
                intentC.putExtra("RESPONSE_CODE", 3);
                intentC.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
                w50 w50VarA = x50.a();
                w50VarA.a = 3;
                w50VarA.c = "Play Store is blocked.";
                intentC.putExtra("FAILURE_LOGGING_PAYLOAD", ypa.b(142, 2, w50VarA.a(), null, s1dVar).b());
            }
        } else {
            intentC.putExtra("RESPONSE_CODE", 6);
            intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            w50 w50VarA2 = x50.a();
            w50VarA2.a = 6;
            w50VarA2.c = "An internal error occurred.";
            intentC.putExtra("FAILURE_LOGGING_PAYLOAD", ypa.b(i, 2, w50VarA2.a(), null, s1dVar).b());
        }
        intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentC.putExtra("billingClientTransactionId", j);
        intentC.putExtra("wasServiceAutoReconnected", this.I);
        return intentC;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        j5b j5bVar;
        boolean z;
        Intent intentC;
        int i3;
        ResultReceiver resultReceiver;
        super.onActivityResult(i, i2, intent);
        if (i != 100) {
            if (i != 110) {
                if (i == 101) {
                    int i4 = i9a.a;
                    if (intent == null) {
                        i9a.h("ProxyBillingActivity", "Got null intent!");
                        intent = null;
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras == null) {
                            i9a.h("ProxyBillingActivity", "Unexpected null bundle received!");
                        } else {
                            i3 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                            resultReceiver = this.a;
                            if (resultReceiver != null) {
                                resultReceiver.send(i3, intent == null ? null : intent.getExtras());
                            }
                        }
                    }
                    i3 = 0;
                    resultReceiver = this.a;
                    if (resultReceiver != null) {
                    }
                } else {
                    i9a.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
                }
                this.b = false;
                j5bVar = this.J;
                if (j5bVar != null) {
                    j5bVar.a = null;
                }
                finish();
            }
            z = intent != null;
        } else if (intent == null) {
        }
        int i5 = i9a.e(intent, "ProxyBillingActivity").a;
        int i6 = -1;
        if (i2 != -1) {
            i9a.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i5);
            i6 = i2;
            if (true == z) {
                i9a.h("ProxyBillingActivity", "Got null data with resultCode " + i6 + "!");
            } else if (intent.getExtras() == null) {
                i9a.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (yu4.b(a(intent, i6), 1)) {
                intentC = b(a(intent, i6), this.e, intent == null);
            } else {
                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent2;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.e);
                intentC.putExtra("wasServiceAutoReconnected", this.I);
            }
            if (i == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else {
            if (i5 != 0) {
                i2 = -1;
                i9a.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i5);
                i6 = i2;
            }
            if (true == z) {
            }
            if (yu4.b(a(intent, i6), 1)) {
            }
            if (i == 110) {
            }
            sendBroadcast(intentC);
        }
        this.b = false;
        j5bVar = this.J;
        if (j5bVar != null) {
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int i;
        PendingIntent pendingIntent;
        ProxyBillingActivity proxyBillingActivity;
        IntentSender.SendIntentException sendIntentException;
        ResultReceiver resultReceiver;
        int i2;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (!(bundle == null ? getIntent() == null ? false : getIntent().hasExtra("IN_APP_MESSAGE_INTENT") : bundle.containsKey("in_app_message_result_receiver"))) {
            try {
                i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                i9a.i("ProxyBillingActivity", "Failed to get package info for current package.", e);
                i = -1;
            }
            if (this.K == null) {
                Context applicationContext = getApplicationContext();
                t2d t2dVarZ = y2d.z();
                t2dVarZ.g(getPackageName());
                t2dVarZ.h();
                t2dVarZ.d(i);
                t2dVarZ.c(Build.VERSION.SDK_INT);
                t2dVarZ.f();
                this.K = new o28(applicationContext, (y2d) t2dVarZ.a());
            }
            synchronized (this) {
                try {
                    this.J = new j5b(this.K);
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                    intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                    gh1.j(this, this.J, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", 2);
                } catch (NoSuchMethodError | RuntimeException e2) {
                    this.J = null;
                    boolean z = e2 instanceof NoSuchMethodError;
                    o28 o28Var = this.K;
                    if (z) {
                        l5d l5dVarP = u5d.p();
                        l5dVarP.b();
                        u5d.q((u5d) l5dVarP.b, 2);
                        o28Var.Q((u5d) l5dVarP.a());
                    } else {
                        l5d l5dVarP2 = u5d.p();
                        l5dVarP2.b();
                        u5d.q((u5d) l5dVarP2.b, 1);
                        o28Var.Q((u5d) l5dVarP2.a());
                    }
                    i9a.i("ProxyBillingActivity", "Failed to register receiver.", e2);
                }
            }
        }
        if (bundle != null) {
            i9a.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.I = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        i9a.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.c = true;
                this.d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.I = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.b = true;
            i2 = Build.VERSION.SDK_INT;
        } catch (IntentSender.SendIntentException e3) {
            e = e3;
            proxyBillingActivity = this;
        }
        try {
        } catch (IntentSender.SendIntentException e4) {
            sendIntentException = e4;
            proxyBillingActivity = this;
            i9a.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", sendIntentException);
            resultReceiver = proxyBillingActivity.a;
            if (resultReceiver == null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentB = proxyBillingActivity.b(137, proxyBillingActivity.e, false);
                if (proxyBillingActivity.c) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                proxyBillingActivity.sendBroadcast(intentB);
            }
            proxyBillingActivity.b = false;
            proxyBillingActivity.finish();
            return;
        }
        try {
            if (i2 >= 36) {
                bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
            } else {
                if (i2 < 34) {
                    bundle2 = null;
                    proxyBillingActivity = this;
                    proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.d, new Intent(), 0, 0, 0, bundle2);
                    return;
                }
                bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
            }
            proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.d, new Intent(), 0, 0, 0, bundle2);
            return;
        } catch (IntentSender.SendIntentException e5) {
            e = e5;
            sendIntentException = e;
            i9a.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", sendIntentException);
            resultReceiver = proxyBillingActivity.a;
            if (resultReceiver == null) {
            }
            proxyBillingActivity.b = false;
            proxyBillingActivity.finish();
            return;
        }
        bundle2 = bundle3;
        proxyBillingActivity = this;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        x50 x50Var;
        super.onDestroy();
        j5b j5bVar = this.J;
        if (j5bVar != null) {
            x50Var = j5bVar.a;
            try {
                unregisterReceiver(j5bVar);
            } catch (RuntimeException e) {
                i9a.i("ProxyBillingActivity", "Failed to unregister receiver.", e);
            }
        } else {
            x50Var = null;
        }
        if (isFinishing() && this.b) {
            Intent intentC = c();
            if (x50Var != null) {
                intentC.putExtra("RESPONSE_CODE", x50Var.a);
                intentC.putExtra("DEBUG_MESSAGE", x50Var.c);
            } else {
                intentC.putExtra("RESPONSE_CODE", 1);
                intentC.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.c) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.d;
            if (i == 110 || i == 100) {
                intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentC.putExtra("billingClientTransactionId", this.e);
            }
            sendBroadcast(intentC);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.c);
        bundle.putInt("activity_code", this.d);
        bundle.putLong("billingClientTransactionId", this.e);
        bundle.putBoolean("wasServiceAutoReconnected", this.I);
    }
}
