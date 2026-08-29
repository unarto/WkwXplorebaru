package com.google.android.datatransport.cct;

import android.content.Context;
import defpackage.a58;
import defpackage.hl0;
import defpackage.sd1;
import defpackage.yy;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public a58 create(sd1 sd1Var) {
        Context context = ((yy) sd1Var).a;
        yy yyVar = (yy) sd1Var;
        return new hl0(context, yyVar.b, yyVar.c);
    }
}
