package com.lonelycatgames.Xplore.FileSystem.ftp;

import android.content.Intent;
import android.os.Bundle;
import com.lonelycatgames.Xplore.ui.GetContent;
import defpackage.dl2;
import defpackage.du5;
import defpackage.fwc;
import defpackage.jt5;
import defpackage.ml3;
import defpackage.ng4;
import defpackage.xo4;
import defpackage.xr0;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class FtpServerLocationPicker extends GetContent {
    @Override // com.lonelycatgames.Xplore.ui.GetContent, defpackage.vc0
    public final boolean A0(dl2 dl2Var) {
        dl2Var.getClass();
        int i = FtpShareServer.U;
        return (dl2Var instanceof du5) || (dl2Var instanceof ml3);
    }

    @Override // com.lonelycatgames.Xplore.ui.GetContent, defpackage.vc0
    public final void B0() {
        ng4 ng4Var;
        List listC0 = C0();
        if (listC0 == null || (ng4Var = (ng4) xr0.W(listC0)) == null) {
            return;
        }
        setResult(-1, new Intent().setData(ng4Var.f0()));
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
            if (ng4Var != null) {
                return fwc.g(ng4Var);
            }
        }
        return null;
    }

    @Override // com.lonelycatgames.Xplore.ui.GetContent, com.lonelycatgames.Xplore.Browser, defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f1 = true;
        super.onCreate(bundle);
    }
}
