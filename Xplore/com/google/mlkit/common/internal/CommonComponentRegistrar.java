package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.du0;
import defpackage.eu0;
import defpackage.fac;
import defpackage.ffd;
import defpackage.gq0;
import defpackage.icd;
import defpackage.ie9;
import defpackage.j15;
import defpackage.j72;
import defpackage.l15;
import defpackage.lc2;
import defpackage.n27;
import defpackage.og6;
import defpackage.pg6;
import defpackage.q15;
import defpackage.q6d;
import defpackage.t63;
import defpackage.tk9;
import defpackage.tqb;
import defpackage.vt1;
import defpackage.yo0;
import defpackage.zf9;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        eu0 eu0Var = n27.b;
        du0 du0VarB = eu0.b(q15.class);
        du0VarB.a(vt1.b(j15.class));
        du0VarB.J = t63.O;
        eu0 eu0VarB = du0VarB.b();
        du0 du0VarB2 = eu0.b(l15.class);
        du0VarB2.J = q6d.U;
        eu0 eu0VarB2 = du0VarB2.b();
        du0 du0VarB3 = eu0.b(pg6.class);
        du0VarB3.a(new vt1(2, 0, og6.class));
        du0VarB3.J = ffd.Q;
        eu0 eu0VarB3 = du0VarB3.b();
        du0 du0VarB4 = eu0.b(lc2.class);
        du0VarB4.a(new vt1(1, 1, l15.class));
        du0VarB4.J = gq0.O;
        eu0 eu0VarB4 = du0VarB4.b();
        du0 du0VarB5 = eu0.b(yo0.class);
        du0VarB5.J = j72.f0;
        eu0 eu0VarB5 = du0VarB5.b();
        du0 du0VarB6 = eu0.b(gq0.class);
        du0VarB6.a(vt1.b(yo0.class));
        du0VarB6.J = q6d.V;
        eu0 eu0VarB6 = du0VarB6.b();
        du0 du0VarB7 = eu0.b(tqb.class);
        du0VarB7.a(vt1.b(j15.class));
        du0VarB7.J = j72.g0;
        eu0 eu0VarB7 = du0VarB7.b();
        du0 du0VarB8 = eu0.b(og6.class);
        du0VarB8.c = 1;
        du0VarB8.a(new vt1(1, 1, tqb.class));
        du0VarB8.J = icd.T;
        eu0 eu0VarB8 = du0VarB8.b();
        ie9 ie9Var = zf9.e;
        Object[] objArr = {eu0Var, eu0VarB, eu0VarB2, eu0VarB3, eu0VarB4, eu0VarB5, eu0VarB6, eu0VarB7, eu0VarB8};
        fac.d(objArr, 9);
        return new tk9(objArr, 9);
    }
}
