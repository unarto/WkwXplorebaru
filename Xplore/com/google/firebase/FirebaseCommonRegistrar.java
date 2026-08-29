package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.android.material.sidesheet.CaOA.XMpxi;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ca6;
import defpackage.du0;
import defpackage.e;
import defpackage.eu0;
import defpackage.ho1;
import defpackage.j20;
import defpackage.jo1;
import defpackage.kn2;
import defpackage.kz;
import defpackage.mp1;
import defpackage.o14;
import defpackage.sp1;
import defpackage.t63;
import defpackage.u63;
import defpackage.v2d;
import defpackage.v63;
import defpackage.vt1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        du0 du0VarB = eu0.b(mp1.class);
        du0VarB.a(new vt1(2, 0, kz.class));
        du0VarB.J = new e(29);
        arrayList.add(du0VarB.b());
        ca6 ca6Var = new ca6(j20.class, Executor.class);
        du0 du0Var = new du0(jo1.class, u63.class, v63.class);
        du0Var.a(vt1.b(Context.class));
        du0Var.a(vt1.b(kn2.class));
        du0Var.a(new vt1(2, 0, t63.class));
        du0Var.a(new vt1(1, 1, mp1.class));
        du0Var.a(new vt1(ca6Var, 1, 0));
        du0Var.J = new ho1(ca6Var, 0);
        arrayList.add(du0Var.b());
        arrayList.add(v2d.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(v2d.a("fire-core", "22.2.0"));
        arrayList.add(v2d.a("device-name", a(Build.PRODUCT)));
        arrayList.add(v2d.a("device-model", a(Build.DEVICE)));
        arrayList.add(v2d.a("device-brand", a(Build.BRAND)));
        arrayList.add(v2d.d("android-target-sdk", new sp1(25)));
        arrayList.add(v2d.d(XMpxi.CmvOCiB, new sp1(26)));
        arrayList.add(v2d.d("android-platform", new sp1(27)));
        arrayList.add(v2d.d("android-installer", new sp1(28)));
        try {
            string = o14.e.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(v2d.a("kotlin", string));
        }
        return arrayList;
    }
}
