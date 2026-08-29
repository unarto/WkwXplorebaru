package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.EX.nfosBL;
import defpackage.jz0;
import defpackage.q23;
import defpackage.q7a;
import defpackage.u23;
import defpackage.u37;
import defpackage.yu4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int b = 0;
    public int a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                u23 u23VarD = u23.d(this);
                if (i2 == -1) {
                    u37 u37Var = u23VarD.Q;
                    u37Var.sendMessage(u37Var.obtainMessage(3));
                } else if (i2 == 0) {
                    u23VarD.h(new jz0(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent != null) {
                try {
                    googleApiActivity = this;
                    try {
                        googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        googleApiActivity.a = 1;
                    } catch (ActivityNotFoundException e) {
                        e = e;
                        ActivityNotFoundException activityNotFoundException = e;
                        if (extras.getBoolean("notify_manager", true)) {
                            u23.d(googleApiActivity).h(new jz0(22, null, null), googleApiActivity.getIntent().getIntExtra(nfosBL.jAQIUCI, -1));
                        } else {
                            String string = pendingIntent.toString();
                            String strP = yu4.p(new StringBuilder(string.length() + 36), "Activity not found while launching ", string, ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                strP = strP.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", strP, activityNotFoundException);
                        }
                        googleApiActivity.a = 1;
                        googleApiActivity.finish();
                    } catch (IntentSender.SendIntentException e2) {
                        e = e2;
                        Log.e("GoogleApiActivity", nfosBL.NWjsAzqA, e);
                        googleApiActivity.finish();
                    }
                } catch (ActivityNotFoundException e3) {
                    e = e3;
                    googleApiActivity = this;
                } catch (IntentSender.SendIntentException e4) {
                    e = e4;
                    googleApiActivity = this;
                }
            } else {
                q7a.i(num);
                q23.e.c(this, num.intValue(), this);
                this.a = 1;
            }
        }
    }
}
