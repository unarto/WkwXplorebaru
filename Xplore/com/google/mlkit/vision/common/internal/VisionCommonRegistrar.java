package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.a65;
import defpackage.bnd;
import defpackage.du0;
import defpackage.e;
import defpackage.eu0;
import defpackage.icd;
import defpackage.mbd;
import defpackage.ve5;
import defpackage.vt1;
import defpackage.wfd;
import defpackage.z55;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        du0 du0VarB = eu0.b(a65.class);
        du0VarB.a(new vt1(2, 0, z55.class));
        du0VarB.J = icd.S;
        Object[] objArr = {du0VarB.b()};
        for (int i = 0; i < 1; i++) {
            mbd mbdVar = wfd.e;
            if (objArr[i] == null) {
                e.f(ve5.j(i, "at index "));
                return null;
            }
        }
        mbd mbdVar2 = wfd.e;
        return new bnd(objArr, 1);
    }
}
