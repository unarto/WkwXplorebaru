package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.b58;
import defpackage.ca6;
import defpackage.du0;
import defpackage.e58;
import defpackage.eu0;
import defpackage.jw7;
import defpackage.ou0;
import defpackage.ud4;
import defpackage.v2d;
import defpackage.vt1;
import defpackage.z48;
import defpackage.zf0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b58 lambda$getComponents$0(ou0 ou0Var) {
        e58.b((Context) ou0Var.a(Context.class));
        return e58.a().c(zf0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b58 lambda$getComponents$1(ou0 ou0Var) {
        e58.b((Context) ou0Var.a(Context.class));
        return e58.a().c(zf0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b58 lambda$getComponents$2(ou0 ou0Var) {
        e58.b((Context) ou0Var.a(Context.class));
        return e58.a().c(zf0.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eu0> getComponents() {
        du0 du0VarB = eu0.b(b58.class);
        du0VarB.a = LIBRARY_NAME;
        du0VarB.a(vt1.b(Context.class));
        du0VarB.J = new jw7(5);
        eu0 eu0VarB = du0VarB.b();
        du0 du0VarA = eu0.a(new ca6(ud4.class, b58.class));
        du0VarA.a(vt1.b(Context.class));
        du0VarA.J = new jw7(6);
        eu0 eu0VarB2 = du0VarA.b();
        du0 du0VarA2 = eu0.a(new ca6(z48.class, b58.class));
        du0VarA2.a(vt1.b(Context.class));
        du0VarA2.J = new jw7(7);
        return Arrays.asList(eu0VarB, eu0VarB2, du0VarA2.b(), v2d.a(LIBRARY_NAME, "19.0.0"));
    }
}
