package com.lonelycatgames.Xplore.sync;

import android.content.Intent;
import android.os.Bundle;
import com.lonelycatgames.Xplore.ui.GetContent;
import defpackage.b22;
import defpackage.dl2;
import defpackage.du5;
import defpackage.fwc;
import defpackage.h24;
import defpackage.jt5;
import defpackage.m07;
import defpackage.ml3;
import defpackage.ng4;
import defpackage.oq;
import defpackage.pq;
import defpackage.qq0;
import defpackage.rj2;
import defpackage.vx8;
import defpackage.xo4;
import defpackage.xr0;
import defpackage.yw2;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class FileSyncLocationPicker extends GetContent {
    public static final /* synthetic */ int h1 = 0;

    @Override // com.lonelycatgames.Xplore.ui.GetContent, defpackage.vc0
    public final boolean A0(dl2 dl2Var) {
        dl2Var.getClass();
        if (dl2Var instanceof b22) {
            return false;
        }
        return (dl2Var instanceof qq0) || (dl2Var instanceof h24) || (dl2Var instanceof yw2) || (dl2Var instanceof pq) || (dl2Var instanceof du5) || (dl2Var instanceof m07) || (dl2Var instanceof ml3);
    }

    @Override // com.lonelycatgames.Xplore.ui.GetContent, defpackage.vc0
    public final void B0() {
        ng4 ng4Var;
        List listC0 = C0();
        if (listC0 == null || (ng4Var = (ng4) xr0.W(listC0)) == null) {
            return;
        }
        setResult(-1, new Intent().setData(ng4Var.J.U(ng4Var)));
        finish();
    }

    @Override // com.lonelycatgames.Xplore.ui.GetContent
    public final List C0() {
        jt5 jt5VarG = b0().g();
        LinkedHashSet linkedHashSet = jt5VarG.l;
        if (linkedHashSet.size() <= 1) {
            Object obj = (xo4) xr0.V(linkedHashSet);
            if (obj == null) {
                obj = jt5VarG.y;
            }
            obj.getClass();
            ng4 ng4Var = (ng4) obj;
            if (!ng4Var.m0()) {
                ng4Var = null;
            }
            if (ng4Var != null && !(ng4Var instanceof oq)) {
                return fwc.g(ng4Var);
            }
        }
        return null;
    }

    @Override // com.lonelycatgames.Xplore.ui.GetContent, com.lonelycatgames.Xplore.Browser
    public final vx8 X() {
        return new rj2(w());
    }

    @Override // com.lonelycatgames.Xplore.ui.GetContent, com.lonelycatgames.Xplore.Browser, defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f1 = true;
        super.onCreate(bundle);
    }
}
