package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.du0;
import defpackage.e;
import defpackage.eu0;
import defpackage.ou0;
import defpackage.pb;
import defpackage.v2d;
import defpackage.v5;
import defpackage.vt1;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v5 lambda$getComponents$0(ou0 ou0Var) {
        return new v5((Context) ou0Var.a(Context.class), ou0Var.f(pb.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eu0> getComponents() {
        du0 du0VarB = eu0.b(v5.class);
        du0VarB.a = LIBRARY_NAME;
        du0VarB.a(vt1.b(Context.class));
        du0VarB.a(new vt1(0, 1, pb.class));
        du0VarB.J = new e(1);
        return Arrays.asList(du0VarB.b(), v2d.a(LIBRARY_NAME, "21.1.1"));
    }
}
