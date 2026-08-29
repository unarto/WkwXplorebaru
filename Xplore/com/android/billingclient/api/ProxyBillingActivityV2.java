package com.android.billingclient.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import defpackage.i9a;
import defpackage.mu0;
import defpackage.p8;
import defpackage.pv9;
import defpackage.q8;
import defpackage.r13;
import defpackage.s8;
import defpackage.u7a;
import defpackage.zk3;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends mu0 {
    public s8 W;
    public s8 X;
    public s8 Y;
    public s8 Z;
    public s8 a0;
    public s8 b0;
    public ResultReceiver c0;
    public ResultReceiver d0;
    public ResultReceiver e0;
    public ResultReceiver f0;
    public ResultReceiver g0;
    public ResultReceiver h0;

    public static final r13 p() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            r13 r13Var = new r13(2, activityOptionsMakeBasic);
            if (i >= 34) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(3);
                return r13Var;
            }
            if (i >= 33) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityLaunchAllowed(true);
            }
            return r13Var;
        }
        if (i < 34) {
            return null;
        }
        ActivityOptions activityOptionsMakeBasic2 = ActivityOptions.makeBasic();
        r13 r13Var2 = new r13(2, activityOptionsMakeBasic2);
        if (i >= 34) {
            activityOptionsMakeBasic2.setPendingIntentBackgroundActivityStartMode(1);
            return r13Var2;
        }
        if (i >= 33) {
            activityOptionsMakeBasic2.setPendingIntentBackgroundActivityLaunchAllowed(true);
        }
        return r13Var2;
    }

    @Override // defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 0;
        this.W = o(new p8(this) { // from class: z2b
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            @Override // defpackage.p8
            public final void e(Object obj) {
                int i2 = i;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.b;
                o8 o8Var = (o8) obj;
                switch (i2) {
                    case 0:
                        Intent intent = o8Var.b;
                        int i3 = i9a.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.c0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i3, intent != null ? intent.getExtras() : null);
                        }
                        int i4 = o8Var.a;
                        if (i4 != -1 || i3 != 0) {
                            i9a.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = o8Var.b;
                        int i5 = i9a.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.g0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i5, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i6 = o8Var.a;
                        if (i6 != -1 || i5 != 0) {
                            i9a.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i6 + " and billing's responseCode: " + i5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new q8(2));
        this.X = o(new pv9(10, this), new q8(2));
        this.Y = o(new u7a(7, this), new q8(2));
        this.Z = o(new p8(this) { // from class: j4b
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            @Override // defpackage.p8
            public final void e(Object obj) {
                int i2 = i;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.b;
                o8 o8Var = (o8) obj;
                switch (i2) {
                    case 0:
                        Intent intent = o8Var.b;
                        int i3 = o8Var.a;
                        Bundle extras = intent != null ? intent.getExtras() : null;
                        if (i3 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            i9a.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i3);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i3);
                        }
                        int i4 = i9a.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.f0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i4, extras);
                        } else {
                            i9a.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i4 != 0) {
                            i9a.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i4);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = o8Var.b;
                        int i5 = i9a.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.h0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i5, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i6 = o8Var.a;
                        if (i6 != -1 || i5 != 0) {
                            i9a.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i6 + " and billing's responseCode: " + i5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new q8(2));
        final int i2 = 1;
        this.a0 = o(new p8(this) { // from class: z2b
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            @Override // defpackage.p8
            public final void e(Object obj) {
                int i22 = i2;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.b;
                o8 o8Var = (o8) obj;
                switch (i22) {
                    case 0:
                        Intent intent = o8Var.b;
                        int i3 = i9a.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.c0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i3, intent != null ? intent.getExtras() : null);
                        }
                        int i4 = o8Var.a;
                        if (i4 != -1 || i3 != 0) {
                            i9a.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i4 + " and billing's responseCode: " + i3);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = o8Var.b;
                        int i5 = i9a.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.g0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i5, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i6 = o8Var.a;
                        if (i6 != -1 || i5 != 0) {
                            i9a.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i6 + " and billing's responseCode: " + i5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new q8(2));
        this.b0 = o(new p8(this) { // from class: j4b
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            @Override // defpackage.p8
            public final void e(Object obj) {
                int i22 = i2;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.b;
                o8 o8Var = (o8) obj;
                switch (i22) {
                    case 0:
                        Intent intent = o8Var.b;
                        int i3 = o8Var.a;
                        Bundle extras = intent != null ? intent.getExtras() : null;
                        if (i3 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            i9a.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i3);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i3);
                        }
                        int i4 = i9a.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.f0;
                        if (resultReceiver != null) {
                            resultReceiver.send(i4, extras);
                        } else {
                            i9a.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i4 != 0) {
                            i9a.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i4);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = o8Var.b;
                        int i5 = i9a.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.h0;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i5, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i6 = o8Var.a;
                        if (i6 != -1 || i5 != 0) {
                            i9a.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i6 + " and billing's responseCode: " + i5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new q8(2));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.c0 = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.d0 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.e0 = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.f0 = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.g0 = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.h0 = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        i9a.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.c0 = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            s8 s8Var = this.W;
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            s8Var.d(new zk3(intentSender, null, 0, 0), p());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.d0 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            s8 s8Var2 = this.X;
            pendingIntent2.getClass();
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            intentSender2.getClass();
            s8Var2.d(new zk3(intentSender2, null, 0, 0), p());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.e0 = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            s8 s8Var3 = this.Y;
            pendingIntent3.getClass();
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            intentSender3.getClass();
            s8Var3.d(new zk3(intentSender3, null, 0, 0), p());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.f0 = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            s8 s8Var4 = this.Z;
            pendingIntent4.getClass();
            IntentSender intentSender4 = pendingIntent4.getIntentSender();
            intentSender4.getClass();
            s8Var4.d(new zk3(intentSender4, null, 0, 0), p());
            return;
        }
        if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.g0 = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            s8 s8Var5 = this.a0;
            pendingIntent5.getClass();
            IntentSender intentSender5 = pendingIntent5.getIntentSender();
            intentSender5.getClass();
            s8Var5.d(new zk3(intentSender5, null, 0, 0), p());
            return;
        }
        if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.h0 = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            s8 s8Var6 = this.b0;
            pendingIntent6.getClass();
            IntentSender intentSender6 = pendingIntent6.getIntentSender();
            intentSender6.getClass();
            s8Var6.d(new zk3(intentSender6, null, 0, 0), p());
        }
    }

    @Override // defpackage.mu0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.c0;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.d0;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.e0;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.f0;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.g0;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.h0;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
