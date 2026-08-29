package com.lonelycatgames.Xplore.ui;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import com.lonelycatgames.Xplore.App;
import defpackage.aw0;
import defpackage.ax0;
import defpackage.b52;
import defpackage.d44;
import defpackage.dl2;
import defpackage.dyc;
import defpackage.f27;
import defpackage.fwc;
import defpackage.gw0;
import defpackage.ha;
import defpackage.hx5;
import defpackage.i40;
import defpackage.j72;
import defpackage.jj7;
import defpackage.jt5;
import defpackage.jxc;
import defpackage.ml3;
import defpackage.ng4;
import defpackage.nu3;
import defpackage.p05;
import defpackage.pf;
import defpackage.qy1;
import defpackage.se8;
import defpackage.tq4;
import defpackage.tx2;
import defpackage.uc4;
import defpackage.vc0;
import defpackage.vs0;
import defpackage.vu5;
import defpackage.vx8;
import defpackage.w15;
import defpackage.w91;
import defpackage.ws0;
import defpackage.y2b;
import defpackage.yzc;
import defpackage.zv0;
import defpackage.zz2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public class GetContent extends vc0 {
    public static final /* synthetic */ int g1 = 0;
    public final vu5 Y0 = yzc.c(Boolean.TRUE);
    public String Z0;
    public String a1;
    public String b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;

    @Override // defpackage.vc0
    public boolean A0(dl2 dl2Var) {
        dl2Var.getClass();
        if (!this.c1 || (dl2Var instanceof ml3)) {
            return super.A0(dl2Var);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B0() {
        Uri uriBuild;
        String str;
        List<ng4> listC0 = C0();
        if (listC0 == null) {
            return;
        }
        Intent intent = new Intent();
        int i = 0;
        if (this.f1) {
            uriBuild = new Uri.Builder().scheme("file").path(((ng4) listC0.get(0)).T()).build();
            str = "x-directory/normal";
        } else {
            ArrayList arrayList = new ArrayList();
            long[] jArr = new long[listC0.size()];
            Uri uri = null;
            String strC = null;
            for (ng4 ng4Var : listC0) {
                int i2 = i + 1;
                ng4Var.getClass();
                f27 f27Var = (f27) ng4Var;
                Uri uriK = ng4Var.b0().K(ng4Var);
                if (uri == null) {
                    strC = f27Var.c();
                    uri = uriK;
                } else {
                    arrayList.add(uriK);
                }
                jArr[i] = ng4Var.S();
                i = i2;
            }
            if (arrayList.isEmpty()) {
                uriBuild = uri;
                str = strC;
                intent.putExtra("file_length", jArr).getClass();
            } else {
                if (this.d1) {
                    intent.putExtra("multiselection", arrayList);
                }
                if (this.e1) {
                    ClipData clipDataNewUri = ClipData.newUri(getContentResolver(), null, uri);
                    Iterator it = arrayList.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        clipDataNewUri.addItem(new ClipData.Item((Uri) next));
                    }
                    intent.setClipData(clipDataNewUri);
                    uriBuild = null;
                    str = null;
                }
                intent.putExtra("file_length", jArr).getClass();
            }
        }
        intent.setDataAndType(uriBuild, str);
        intent.addFlags(65);
        setResult(-1, intent);
        try {
            finish();
        } catch (Exception e) {
            App appW = w();
            appW.j0(appW, se8.k(e), true);
        }
    }

    public List C0() {
        jt5 jt5VarG = b0().g();
        if (this.f1) {
            qy1 qy1Var = jt5VarG.y;
            if (qy1Var.J instanceof i40) {
                return fwc.g(qy1Var);
            }
            return null;
        }
        LinkedHashSet<Object> linkedHashSet = jt5VarG.l;
        if (linkedHashSet.size() != 1 && ((!this.e1 && !this.d1) || linkedHashSet.isEmpty())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (obj instanceof f27) {
                obj.getClass();
                arrayList.add((ng4) obj);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    @Override // com.lonelycatgames.Xplore.Browser
    public final void O(w15 w15Var, zz2 zz2Var, int i) {
        GetContent getContent;
        w15Var.getClass();
        zz2Var.X(126659759);
        ws0 ws0VarA = vs0.a(b52.c, j72.Q, zz2Var, 0);
        int iHashCode = Long.hashCode(zz2Var.T);
        hx5 hx5VarL = zz2Var.l();
        w15 w15VarH = dyc.h(zz2Var, w15Var);
        aw0.j.getClass();
        ax0 ax0Var = zv0.b;
        zz2Var.a0();
        if (zz2Var.S) {
            zz2Var.k(ax0Var);
        } else {
            zz2Var.j0();
        }
        tq4.g(zv0.f, zz2Var, ws0VarA);
        tq4.g(zv0.e, zz2Var, hx5VarL);
        tq4.g(zv0.g, zz2Var, Integer.valueOf(iHashCode));
        tq4.f(zz2Var, zv0.h);
        tq4.g(zv0.d, zz2Var, w15VarH);
        super.O(uc4.a.e(new d44(1.0f, true)), zz2Var, i & 112);
        boolean zBooleanValue = ((Boolean) this.X0.getValue()).booleanValue();
        boolean zH = zz2Var.h(this);
        Object objL = zz2Var.L();
        if (zH || objL == gw0.a) {
            getContent = this;
            ha haVar = new ha(0, getContent, GetContent.class, "onButtonClick", "onButtonClick()V", 0, 23);
            zz2Var.g0(haVar);
            objL = haVar;
        } else {
            getContent = this;
        }
        nu3 nu3Var = (nu3) objL;
        if (getContent.w().b) {
            nu3Var = null;
        }
        y2b.a(zBooleanValue, (tx2) nu3Var, jxc.g(-376834527, new pf(19, getContent), zz2Var), zz2Var, 384);
        zz2Var.p(true);
        zz2Var.p(false);
    }

    @Override // com.lonelycatgames.Xplore.Browser
    public vx8 X() {
        return (this.Z0 != null || this.c1) ? new w91(this, w(), 1) : super.X();
    }

    @Override // com.lonelycatgames.Xplore.Browser
    public final boolean a0() {
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    @Override // com.lonelycatgames.Xplore.Browser, defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            String type = intent.getType();
            this.Z0 = type;
            if (type != null) {
                switch (type.hashCode()) {
                    case -1294595255:
                        if (type.equals("inode/directory")) {
                            this.f1 = true;
                            this.Z0 = null;
                            intent.setAction("android.intent.action.VIEW");
                        }
                        break;
                    case -301211778:
                        if (type.equals("x-directory/normal")) {
                        }
                        break;
                    case 41861:
                        if (type.equals("*/*")) {
                            this.Z0 = null;
                        }
                        break;
                    case 302189274:
                        if (type.equals("vnd.android.document/directory")) {
                        }
                        break;
                }
            }
            String str = this.Z0;
            if (str != null) {
                MimeTypeMap mimeTypeMap = p05.a;
                String strF0 = jj7.f0(str, '/');
                this.a1 = strF0;
                if (strF0.length() < str.length()) {
                    this.b1 = str.substring(strF0.length() + 1);
                }
            }
            this.c1 = intent.getBooleanExtra("android.intent.extra.LOCAL_ONLY", false);
            this.d1 = intent.getBooleanExtra("multiselection", false);
            this.e1 = intent.getBooleanExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        }
        super.onCreate(bundle);
    }

    @Override // com.lonelycatgames.Xplore.Browser
    public final void q0(boolean z) {
        super.q0(z);
        this.X0.setValue(Boolean.valueOf(C0() != null));
    }
}
