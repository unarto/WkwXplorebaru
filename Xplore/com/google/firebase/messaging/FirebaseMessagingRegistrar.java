package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.b58;
import defpackage.ca6;
import defpackage.du0;
import defpackage.eu0;
import defpackage.ho1;
import defpackage.jw7;
import defpackage.kn2;
import defpackage.mp1;
import defpackage.ou0;
import defpackage.pk7;
import defpackage.sn2;
import defpackage.v2d;
import defpackage.v63;
import defpackage.vn2;
import defpackage.vt1;
import defpackage.z48;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(ca6 ca6Var, ou0 ou0Var) {
        kn2 kn2Var = (kn2) ou0Var.a(kn2.class);
        if (ou0Var.a(vn2.class) == null) {
            return new FirebaseMessaging(kn2Var, ou0Var.f(mp1.class), ou0Var.f(v63.class), (sn2) ou0Var.a(sn2.class), ou0Var.s(ca6Var), (pk7) ou0Var.a(pk7.class));
        }
        jw7.u();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eu0> getComponents() {
        ca6 ca6Var = new ca6(z48.class, b58.class);
        du0 du0VarB = eu0.b(FirebaseMessaging.class);
        du0VarB.a = LIBRARY_NAME;
        du0VarB.a(vt1.b(kn2.class));
        du0VarB.a(new vt1(0, 0, vn2.class));
        du0VarB.a(new vt1(0, 1, mp1.class));
        du0VarB.a(new vt1(0, 1, v63.class));
        du0VarB.a(vt1.b(sn2.class));
        du0VarB.a(new vt1(ca6Var, 0, 1));
        du0VarB.a(vt1.b(pk7.class));
        du0VarB.J = new ho1(ca6Var, 1);
        du0VarB.c(1);
        return Arrays.asList(du0VarB.b(), v2d.a(LIBRARY_NAME, "25.1.1"));
    }
}
