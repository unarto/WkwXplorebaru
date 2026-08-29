package com.google.mlkit.vision.face.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.a1b;
import defpackage.du0;
import defpackage.e;
import defpackage.eu0;
import defpackage.icd;
import defpackage.j15;
import defpackage.jba;
import defpackage.l1a;
import defpackage.lc2;
import defpackage.nz9;
import defpackage.t63;
import defpackage.u9a;
import defpackage.ve5;
import defpackage.vt1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        du0 du0VarB = eu0.b(a1b.class);
        du0VarB.a(vt1.b(j15.class));
        du0VarB.J = icd.V;
        eu0 eu0VarB = du0VarB.b();
        du0 du0VarB2 = eu0.b(u9a.class);
        du0VarB2.a(vt1.b(a1b.class));
        du0VarB2.a(vt1.b(lc2.class));
        du0VarB2.J = t63.T;
        Object[] objArr = {eu0VarB, du0VarB2.b()};
        for (int i = 0; i < 2; i++) {
            nz9 nz9Var = l1a.e;
            if (objArr[i] == null) {
                e.f(ve5.j(i, "at index "));
                return null;
            }
        }
        nz9 nz9Var2 = l1a.e;
        return new jba(objArr, 2);
    }
}
