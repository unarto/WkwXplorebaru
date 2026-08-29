package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import defpackage.e;
import defpackage.ee7;
import defpackage.ew3;
import defpackage.gi7;
import defpackage.gv6;
import defpackage.ii4;
import defpackage.ix8;
import defpackage.ji4;
import defpackage.jv2;
import defpackage.oc8;
import defpackage.r13;
import defpackage.rv8;
import defpackage.td1;
import defpackage.tt3;
import defpackage.un2;
import defpackage.ve6;
import defpackage.vx8;
import defpackage.wv2;
import defpackage.yj8;
import java.lang.reflect.Modifier;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends jv2 {
    public static boolean g0 = false;
    public boolean b0 = false;
    public SignInConfiguration c0;
    public boolean d0;
    public int e0;
    public Intent f0;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.b0) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                vx8 vx8VarT = vx8.t(this);
                GoogleSignInOptions googleSignInOptions = this.c0.b;
                synchronized (vx8VarT) {
                    ((gi7) vx8VarT.b).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.d0 = true;
                this.e0 = i2;
                this.f0 = intent;
                r();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                s(intExtra);
                return;
            }
        }
        s(8);
    }

    @Override // defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            s(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            s(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.c0 = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.d0 = z;
            if (z) {
                this.e0 = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.f0 = intent2;
                    r();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (g0) {
            setResult(0);
            s(12502);
            return;
        }
        g0 = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.c0);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.b0 = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            s(17);
        }
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        g0 = false;
    }

    @Override // defpackage.mu0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.d0);
        if (this.d0) {
            bundle.putInt("signInResultCode", this.e0);
            bundle.putParcelable("signInResultData", this.f0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r() {
        yj8 yj8VarE = e();
        wv2 wv2Var = ji4.d;
        yj8VarE.getClass();
        td1 td1Var = td1.b;
        td1Var.getClass();
        oc8 oc8Var = new oc8(yj8VarE, wv2Var, td1Var);
        tt3 tt3VarB = ve6.a.b(ji4.class);
        String strL = tt3VarB.l();
        if (strL == null) {
            e.k("Local and anonymous classes can not be ViewModels");
            return;
        }
        ji4 ji4Var = (ji4) oc8Var.k(tt3VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strL));
        r13 r13Var = new r13(29, this);
        boolean z = ji4Var.c;
        ee7 ee7Var = ji4Var.b;
        if (z) {
            un2.j("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            un2.j("initLoader must be called on the main thread");
            return;
        }
        ee7Var.getClass();
        ii4 ii4Var = (ii4) gv6.a(ee7Var, 0);
        if (ii4Var == null) {
            try {
                ji4Var.c = true;
                Set set = rv8.b;
                synchronized (set) {
                }
                ix8 ix8Var = new ix8(this, set);
                if (ix8.class.isMemberClass() && !Modifier.isStatic(ix8.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + ix8Var);
                }
                ii4 ii4Var2 = new ii4(ix8Var);
                ee7Var.b(0, ii4Var2);
                ji4Var.c = false;
                ew3 ew3Var = new ew3(ii4Var2.l, r13Var);
                ii4Var2.d(this, ew3Var);
                ew3 ew3Var2 = ii4Var2.n;
                if (ew3Var2 != null) {
                    ii4Var2.h(ew3Var2);
                }
                ii4Var2.m = this;
                ii4Var2.n = ew3Var;
            } catch (Throwable th) {
                ji4Var.c = false;
                throw th;
            }
        } else {
            ew3 ew3Var3 = new ew3(ii4Var.l, r13Var);
            ii4Var.d(this, ew3Var3);
            ew3 ew3Var4 = ii4Var.n;
            if (ew3Var4 != null) {
                ii4Var.h(ew3Var4);
            }
            ii4Var.m = this;
            ii4Var.n = ew3Var3;
        }
        g0 = false;
    }

    public final void s(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        g0 = false;
    }
}
