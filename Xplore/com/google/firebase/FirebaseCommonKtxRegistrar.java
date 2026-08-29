package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.bb1;
import defpackage.ca6;
import defpackage.da8;
import defpackage.du0;
import defpackage.eu0;
import defpackage.ffd;
import defpackage.fwc;
import defpackage.icd;
import defpackage.j20;
import defpackage.n80;
import defpackage.q6d;
import defpackage.tqb;
import defpackage.vt1;
import defpackage.xe4;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Leu0;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<eu0> getComponents() {
        du0 du0VarA = eu0.a(new ca6(j20.class, bb1.class));
        du0VarA.a(new vt1(new ca6(j20.class, Executor.class), 1, 0));
        du0VarA.J = tqb.d;
        eu0 eu0VarB = du0VarA.b();
        du0 du0VarA2 = eu0.a(new ca6(xe4.class, bb1.class));
        du0VarA2.a(new vt1(new ca6(xe4.class, Executor.class), 1, 0));
        du0VarA2.J = q6d.e;
        eu0 eu0VarB2 = du0VarA2.b();
        du0 du0VarA3 = eu0.a(new ca6(n80.class, bb1.class));
        du0VarA3.a(new vt1(new ca6(n80.class, Executor.class), 1, 0));
        du0VarA3.J = icd.e;
        eu0 eu0VarB3 = du0VarA3.b();
        du0 du0VarA4 = eu0.a(new ca6(da8.class, bb1.class));
        du0VarA4.a(new vt1(new ca6(da8.class, Executor.class), 1, 0));
        du0VarA4.J = ffd.e;
        return fwc.h(eu0VarB, eu0VarB2, eu0VarB3, du0VarA4.b());
    }
}
