package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Lz.ZBitir;
import com.google.android.gms.measurement.api.Uan.ALMQWMUKkdzmOl;
import com.lonelycatgames.Xplore.R;
import defpackage.fjd;
import defpackage.oc8;
import defpackage.q99;
import defpackage.qsa;
import defpackage.un2;
import defpackage.wkd;
import defpackage.zn9;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class HsdpShimActivity extends Activity {
    public String a = null;
    public boolean b = false;

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i("HsdpShimActivity", "shim activity onAttachedToWindow");
        a(false);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.i("HsdpShimActivity", "shim activity onConfigurationChanged");
        a(true);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hsdp_shim_activity);
        Window window = getWindow();
        window.setLayout(-1, -1);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Log.i("HsdpShimActivity", "shim activity onDestroy");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("HsdpShimActivity", "shim activity onNewIntent");
        setIntent(intent);
        a(false);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        Log.i("HsdpShimActivity", "shim activity onPause");
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        Log.i("HsdpShimActivity", "shim activity onResume");
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        Log.i("HsdpShimActivity", "shim activity onStop");
    }

    public final void a(boolean z) {
        HashMap map;
        zn9 zn9Var;
        IBinder windowToken = getWindow().getDecorView().getWindowToken();
        if (windowToken != null) {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("target_package_name");
            if (stringExtra != null) {
                fjd fjdVarI = wkd.i(this, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
                if (!z && stringExtra.equals(this.a) && (zn9Var = (zn9) ((q99) fjdVarI).c.get(stringExtra)) != null && zn9Var.a == 2) {
                    if (Log.isLoggable("HsdpShimActivity", 4)) {
                        Log.i("HsdpShimActivity", "HSDP is already showing for " + stringExtra + ", ignore.");
                        return;
                    }
                    return;
                }
                this.a = stringExtra;
                this.b = false;
                String stringExtra2 = intent.getStringExtra("referrer");
                if (stringExtra2 != null) {
                    String stringExtra3 = intent.getStringExtra("deeplink_url");
                    if (stringExtra3 != null) {
                        boolean booleanExtra = intent.getBooleanExtra("auto_trigger", false);
                        Bundle bundleExtra = intent.getBundleExtra("extra_query_params_bundle");
                        if (bundleExtra != null) {
                            map = new HashMap();
                            for (String str : bundleExtra.keySet()) {
                                String string = bundleExtra.getString(str);
                                if (string == null) {
                                    string = "";
                                }
                                map.put(str, string);
                            }
                        } else {
                            map = null;
                        }
                        ((q99) fjdVarI).a(stringExtra, stringExtra3, windowToken, qsa.h(this, getResources().getConfiguration().screenWidthDp), qsa.i(this), booleanExtra, new oc8(this, stringExtra, stringExtra2, map, 14, false));
                        return;
                    }
                    un2.j("deeplinkUrl is null");
                    return;
                }
                un2.j("referrer is null");
                return;
            }
            un2.j("targetPackageName is null");
            return;
        }
        un2.j(ZBitir.ITaqamhYSspqI);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        Log.i(ALMQWMUKkdzmOl.nGVMVTIQ, "shim activity onStart");
    }
}
