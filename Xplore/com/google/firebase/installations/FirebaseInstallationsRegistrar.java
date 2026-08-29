package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ca6;
import defpackage.cu0;
import defpackage.du0;
import defpackage.eu0;
import defpackage.j20;
import defpackage.kn2;
import defpackage.kv6;
import defpackage.n80;
import defpackage.ou0;
import defpackage.rn2;
import defpackage.sn2;
import defpackage.t63;
import defpackage.u63;
import defpackage.un2;
import defpackage.v2d;
import defpackage.vt1;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static sn2 lambda$getComponents$0(ou0 ou0Var) {
        return new rn2((kn2) ou0Var.a(kn2.class), ou0Var.f(u63.class), (ExecutorService) ou0Var.t(new ca6(j20.class, ExecutorService.class)), new kv6((Executor) ou0Var.t(new ca6(n80.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eu0> getComponents() {
        du0 du0VarB = eu0.b(sn2.class);
        du0VarB.a = LIBRARY_NAME;
        du0VarB.a(vt1.b(kn2.class));
        int i = 0;
        du0VarB.a(new vt1(0, 1, u63.class));
        du0VarB.a(new vt1(new ca6(j20.class, ExecutorService.class), 1, 0));
        du0VarB.a(new vt1(new ca6(n80.class, Executor.class), 1, 0));
        du0VarB.J = new un2(i);
        eu0 eu0VarB = du0VarB.b();
        t63 t63Var = new t63(i);
        du0 du0VarB2 = eu0.b(t63.class);
        du0VarB2.c = 1;
        du0VarB2.J = new cu0(i, t63Var);
        return Arrays.asList(eu0VarB, du0VarB2.b(), v2d.a(LIBRARY_NAME, "19.1.2"));
    }
}
