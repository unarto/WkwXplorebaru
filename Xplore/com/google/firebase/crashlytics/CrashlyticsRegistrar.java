package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ba;
import defpackage.ca6;
import defpackage.du0;
import defpackage.eu0;
import defpackage.gc1;
import defpackage.go2;
import defpackage.j20;
import defpackage.kn2;
import defpackage.ln2;
import defpackage.mo2;
import defpackage.n80;
import defpackage.oo2;
import defpackage.pb;
import defpackage.sn2;
import defpackage.v2d;
import defpackage.vt1;
import defpackage.wy6;
import defpackage.xe4;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final ca6 a = new ca6(j20.class, ExecutorService.class);
    public final ca6 b = new ca6(n80.class, ExecutorService.class);
    public final ca6 c = new ca6(xe4.class, ExecutorService.class);

    static {
        Map map = oo2.b;
        wy6 wy6Var = wy6.a;
        if (map.containsKey(wy6Var)) {
            Log.d("FirebaseSessions", "Dependency " + wy6Var + " already added.");
            return;
        }
        map.put(wy6Var, new mo2(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + wy6Var + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        du0 du0VarB = eu0.b(ln2.class);
        du0VarB.a = "fire-cls";
        du0VarB.a(vt1.b(kn2.class));
        du0VarB.a(vt1.b(sn2.class));
        du0VarB.a(new vt1(this.a, 1, 0));
        du0VarB.a(new vt1(this.b, 1, 0));
        du0VarB.a(new vt1(this.c, 1, 0));
        du0VarB.a(new vt1(0, 2, gc1.class));
        du0VarB.a(new vt1(0, 2, pb.class));
        du0VarB.a(new vt1(0, 2, go2.class));
        du0VarB.J = new ba(6, this);
        du0VarB.c(2);
        return Arrays.asList(du0VarB.b(), v2d.a("fire-cls", "20.1.0"));
    }
}
