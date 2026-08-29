package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ada;
import defpackage.b10;
import defpackage.b58;
import defpackage.bb1;
import defpackage.ca6;
import defpackage.du0;
import defpackage.eu0;
import defpackage.fl6;
import defpackage.fwc;
import defpackage.ij1;
import defpackage.io2;
import defpackage.j20;
import defpackage.jaa;
import defpackage.k1a;
import defpackage.kec;
import defpackage.kn2;
import defpackage.ko2;
import defpackage.lo2;
import defpackage.mj2;
import defpackage.n0a;
import defpackage.n80;
import defpackage.n96;
import defpackage.ou0;
import defpackage.p96;
import defpackage.po2;
import defpackage.qsb;
import defpackage.r13;
import defpackage.sn2;
import defpackage.tu4;
import defpackage.un2;
import defpackage.usb;
import defpackage.ux6;
import defpackage.v2d;
import defpackage.vj3;
import defpackage.vt1;
import defpackage.w22;
import defpackage.za1;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Leu0;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "po2", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final po2 Companion = new po2();
    private static final ca6 appContext = ca6.a(Context.class);
    private static final ca6 firebaseApp = ca6.a(kn2.class);
    private static final ca6 firebaseInstallationsApi = ca6.a(sn2.class);
    private static final ca6 backgroundDispatcher = new ca6(j20.class, bb1.class);
    private static final ca6 blockingDispatcher = new ca6(n80.class, bb1.class);
    private static final ca6 transportFactory = ca6.a(b58.class);
    private static final ca6 firebaseSessionsComponent = ca6.a(ko2.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final io2 getComponents$lambda$0(ou0 ou0Var) {
        return (io2) ((ij1) ((ko2) ou0Var.t(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ko2 getComponents$lambda$1(ou0 ou0Var) {
        Object objT = ou0Var.t(appContext);
        objT.getClass();
        Object objT2 = ou0Var.t(backgroundDispatcher);
        objT2.getClass();
        Object objT3 = ou0Var.t(blockingDispatcher);
        objT3.getClass();
        Object objT4 = ou0Var.t(firebaseApp);
        objT4.getClass();
        Object objT5 = ou0Var.t(firebaseInstallationsApi);
        objT5.getClass();
        p96 p96VarS = ou0Var.s(transportFactory);
        p96VarS.getClass();
        ij1 ij1Var = new ij1();
        ij1Var.a = vj3.a((kn2) objT4);
        vj3 vj3VarA = vj3.a((Context) objT);
        ij1Var.b = vj3VarA;
        ij1Var.c = w22.a(new r13(16, vj3VarA));
        ij1Var.d = w22.a(n0a.a);
        ij1Var.e = vj3.a((sn2) objT5);
        ij1Var.f = w22.a(new qsb(8, ij1Var.a));
        vj3 vj3VarA2 = vj3.a((za1) objT3);
        ij1Var.g = vj3VarA2;
        ij1Var.h = w22.a(new lo2(ij1Var.f, vj3VarA2));
        ij1Var.i = vj3.a((za1) objT2);
        int i = 11;
        int i2 = 23;
        ij1Var.j = w22.a(new jaa(ij1Var.c, i2, w22.a(new b10(ij1Var.d, ij1Var.e, ij1Var.f, ij1Var.h, w22.a(new ada(i, ij1Var.i, ij1Var.d, w22.a(new lo2(ij1Var.b, (n96) ij1Var.g)))), 18))));
        n96 n96VarA = w22.a(k1a.a);
        ij1Var.k = n96VarA;
        ij1Var.l = w22.a(new tu4(ij1Var.d, 26, n96VarA));
        ij1Var.m = w22.a(new b10(ij1Var.a, ij1Var.e, ij1Var.j, w22.a(new usb(12, vj3.a(p96VarS))), ij1Var.i, 20));
        int i3 = 5;
        ij1Var.n = w22.a(new kec(i3, ij1Var.b, ij1Var.g, w22.a(new usb(20, ij1Var.l))));
        n96 n96VarA2 = w22.a(new mj2(ij1Var.j, ij1Var.l, ij1Var.m, ij1Var.d, ij1Var.n, w22.a(new tu4(ij1Var.b, i2, ij1Var.k)), ij1Var.i, 3));
        ij1Var.o = n96VarA2;
        ij1Var.p = w22.a(new ux6(ij1Var.a, ij1Var.j, ij1Var.i, w22.a(new fl6(18, n96VarA2)), 13));
        return ij1Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eu0> getComponents() {
        du0 du0VarB = eu0.b(io2.class);
        du0VarB.a = LIBRARY_NAME;
        du0VarB.a(vt1.a(firebaseSessionsComponent));
        du0VarB.J = new un2(4);
        du0VarB.c(2);
        eu0 eu0VarB = du0VarB.b();
        du0 du0VarB2 = eu0.b(ko2.class);
        du0VarB2.a = "fire-sessions-component";
        du0VarB2.a(vt1.a(appContext));
        du0VarB2.a(vt1.a(backgroundDispatcher));
        du0VarB2.a(vt1.a(blockingDispatcher));
        du0VarB2.a(vt1.a(firebaseApp));
        du0VarB2.a(vt1.a(firebaseInstallationsApi));
        du0VarB2.a(new vt1(transportFactory, 1, 1));
        du0VarB2.J = new un2(5);
        return fwc.h(eu0VarB, du0VarB2.b(), v2d.a(LIBRARY_NAME, "3.0.7"));
    }
}
