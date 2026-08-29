package com.lonelycatgames.Xplore.ui;

import android.R;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.ScaleGestureDetector;
import com.google.maps.android.compose.utils.attribution.njD.AUsNcgWE;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.FileContentProvider;
import defpackage.a87;
import defpackage.ada;
import defpackage.aw0;
import defpackage.ax0;
import defpackage.b1;
import defpackage.b52;
import defpackage.b81;
import defpackage.ca;
import defpackage.dyc;
import defpackage.e2d;
import defpackage.e30;
import defpackage.f2c;
import defpackage.fw7;
import defpackage.fwc;
import defpackage.gt7;
import defpackage.gw0;
import defpackage.he4;
import defpackage.hm3;
import defpackage.hu7;
import defpackage.hx5;
import defpackage.i41;
import defpackage.iqb;
import defpackage.ix7;
import defpackage.j30;
import defpackage.j72;
import defpackage.jj7;
import defpackage.ju7;
import defpackage.jxc;
import defpackage.k37;
import defpackage.k9d;
import defpackage.kab;
import defpackage.kc6;
import defpackage.ku0;
import defpackage.ku7;
import defpackage.lm7;
import defpackage.mu7;
import defpackage.n20;
import defpackage.ng4;
import defpackage.nu7;
import defpackage.nx3;
import defpackage.ot5;
import defpackage.qp9;
import defpackage.qq5;
import defpackage.qsb;
import defpackage.se8;
import defpackage.t15;
import defpackage.th;
import defpackage.tn;
import defpackage.tq4;
import defpackage.tx2;
import defpackage.u95;
import defpackage.uc4;
import defpackage.ue;
import defpackage.uh2;
import defpackage.um4;
import defpackage.vs0;
import defpackage.vu5;
import defpackage.w15;
import defpackage.w36;
import defpackage.ws0;
import defpackage.wx2;
import defpackage.x2d;
import defpackage.x94;
import defpackage.xb0;
import defpackage.xc0;
import defpackage.y02;
import defpackage.yo1;
import defpackage.yu0;
import defpackage.yzc;
import defpackage.zk4;
import defpackage.zo3;
import defpackage.zv0;
import defpackage.zz2;
import eM.RJRxBMfzzSpiPT;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class TextEditor extends gt7 {
    public static final String[] m0 = {"utf-8", "utf-16", "us-ascii"};
    public ada g0;
    public nx3 k0;
    public boolean l0;
    public String f0 = "";
    public final vu5 h0 = yzc.c(null);
    public final vu5 i0 = yzc.c(null);
    public final qsb j0 = new qsb(10);

    public static final void R(TextEditor textEditor, fw7 fw7Var, fw7 fw7Var2, u95 u95Var, u95 u95Var2, int i, boolean z, int i2) {
        List list = ((mu7) u95Var.getValue()).a;
        int iNextIndex = -1;
        if (z) {
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Number) it.next()).intValue() >= i) {
                    iNextIndex = i3;
                    break;
                }
                i3++;
            }
        } else {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                } else if (((Number) listIterator.previous()).intValue() <= i) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
        }
        if (iNextIndex < 0 || iNextIndex >= list.size()) {
            iNextIndex = z ? 0 : list.size() - 1;
        }
        u95Var2.setValue(new ix7(iNextIndex, i2));
        int iIntValue = ((Number) list.get(iNextIndex)).intValue();
        ada adaVar = textEditor.g0;
        if (adaVar != null) {
            ((vu5) adaVar.d).setValue(fw7.a(fw7Var, null, k9d.a(iIntValue, fw7Var2.a.b.length() + iIntValue), 5));
        } else {
            hm3.l("state");
            throw null;
        }
    }

    public final void S() {
        ada adaVar = this.g0;
        if (adaVar == null) {
            hm3.l("state");
            throw null;
        }
        if (((Boolean) ((vu5) adaVar.c).getValue()).booleanValue()) {
            U(new hu7(this, 4));
            return;
        }
        k37 k37Var = k37.g;
        App appW = w();
        ada adaVar2 = this.g0;
        if (adaVar2 == null) {
            hm3.l("state");
            throw null;
        }
        uh2 uh2Var = (uh2) ((iqb) adaVar2.b).b;
        String strT = uh2Var != null ? uh2Var.T() : null;
        if (strT == null) {
            strT = "/";
        }
        k37Var.getClass();
        k37.E(this, appW, strT);
    }

    public final void U(tx2 tx2Var) {
        vu5 vu5Var = this.i0;
        zo3 zo3Var = (zo3) vu5Var.getValue();
        b81 b81Var = null;
        if (zo3Var != null) {
            zo3Var.d(null);
        }
        vu5Var.setValue(kab.d(x2d.e(this), null, null, new ot5(this, tx2Var, b81Var, 17), 3));
    }

    public final void V(String str) {
        if (str == null) {
            str = "";
        }
        ada adaVar = this.g0;
        if (adaVar != null) {
            ((vu5) adaVar.d).setValue(new fw7(4, k9d.a(0, 0), str));
        } else {
            hm3.l("state");
            throw null;
        }
    }

    public final void W(String str, boolean z) {
        Handler handler = App.M0;
        if (!qp9.f()) {
            he4 he4VarE = x2d.e(this);
            yo1 yo1Var = y02.a;
            kab.d(he4VarE, um4.a, null, new tn(this, str, z, null, 3), 2);
            return;
        }
        i41 i41VarF = qsb.F(this.j0, str, Integer.valueOf(R.drawable.ic_dialog_alert), Integer.valueOf(com.lonelycatgames.Xplore.R.string.error), null, 8);
        if (z) {
            i41VarF.J = new zk4(0, this, TextEditor.class, "finish", "finish()V", 0, 17);
        }
    }

    public final void X(tx2 tx2Var, tx2 tx2Var2) {
        x94 x94Var = new x94(this.j0, null, Integer.valueOf(com.lonelycatgames.Xplore.R.string.q_save_changes_), null, 26);
        x94.p(x94Var, Integer.valueOf(com.lonelycatgames.Xplore.R.string.yes), new e30(14, tx2Var), 2);
        x94.n(x94Var, Integer.valueOf(com.lonelycatgames.Xplore.R.string.no), new xc0(10, tx2Var2), 2);
    }

    @Override // defpackage.mu0
    public final Object m() {
        ada adaVar = this.g0;
        if (adaVar != null) {
            return new nu7(adaVar);
        }
        hm3.l("state");
        throw null;
    }

    @Override // defpackage.mu0, android.app.Activity
    public final void onBackPressed() {
        ada adaVar = this.g0;
        if (adaVar == null) {
            hm3.l("state");
            throw null;
        }
        if (!((Boolean) ((vu5) adaVar.c).getValue()).booleanValue()) {
            super.onBackPressed();
            return;
        }
        X(new hu7(this, 0), new zk4(0, this, TextEditor.class, "finish", "finish()V", 0, 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r2.equals("file") == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    @Override // defpackage.gt7, defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        iqb iqbVar;
        ada adaVar;
        Uri data;
        iqb iqbVar2;
        super.onCreate(bundle);
        j30.z(this);
        ku0 ku0Var = (ku0) getLastNonConfigurationInstance();
        Object[] objArr = 0;
        nu7 nu7Var = (nu7) (ku0Var != null ? ku0Var.a : null);
        if (nu7Var == null || (adaVar = nu7Var.a) == null) {
            Intent intent = getIntent();
            if (intent == null || (data = intent.getData()) == null) {
                iqbVar = null;
                if (iqbVar == null) {
                    iqbVar = new iqb("", (uh2) null, (Uri) null, 14);
                }
                adaVar = new ada(iqbVar);
            } else {
                String scheme = data.getScheme();
                if (scheme == null) {
                    String strL = th.l(data);
                    String[] strArr = se8.a;
                    iqbVar2 = new iqb(jj7.d0('/', strL, strL), (uh2) null, data, 10);
                    iqbVar = iqbVar2;
                    if (iqbVar == null) {
                    }
                    adaVar = new ada(iqbVar);
                } else {
                    int iHashCode = scheme.hashCode();
                    if (iHashCode != 3143036) {
                        if (iHashCode == 951530617 && scheme.equals("content")) {
                            String[] strArr2 = FileContentProvider.d;
                            ContentResolver contentResolver = getContentResolver();
                            contentResolver.getClass();
                            ng4 ng4VarL = n20.l(contentResolver, data);
                            uh2 uh2Var = ng4VarL instanceof uh2 ? (uh2) ng4VarL : null;
                            if (uh2Var != null) {
                                iqbVar = new iqb(uh2Var.Z(), uh2Var, (Uri) null, 12);
                            } else {
                                ContentResolver contentResolver2 = getContentResolver();
                                contentResolver2.getClass();
                                iqbVar2 = new iqb(th.g(contentResolver2, data), (uh2) null, data, 10);
                                iqbVar = iqbVar2;
                            }
                        }
                        if (iqbVar == null) {
                        }
                        adaVar = new ada(iqbVar);
                    }
                    iqbVar = null;
                    if (iqbVar == null) {
                    }
                    adaVar = new ada(iqbVar);
                }
            }
        }
        this.g0 = adaVar;
        iqb iqbVar3 = (iqb) adaVar.b;
        if (((uh2) iqbVar3.b) == null && ((Uri) iqbVar3.c) == null) {
            finish();
            return;
        }
        this.f0 = (String) iqbVar3.d;
        if (nu7Var == null) {
            this.h0.setValue(kab.d(x2d.e(this), null, null, new ca(this, objArr == true ? 1 : 0, 28), 3));
        }
        ada adaVar2 = this.g0;
        if (adaVar2 == null) {
            hm3.l("state");
            throw null;
        }
        uh2 uh2Var2 = (uh2) ((iqb) adaVar2.b).b;
        String strT = uh2Var2 != null ? uh2Var2.T() : null;
        boolean zB = hm3.b(strT != null ? w().z(se8.f(strT)) : null, "text/x-sh");
        this.l0 = zB;
        this.k0 = zB ? new nx3(0, 0, 0, null, 124) : new nx3(3, 0, 0, null, 126);
        C();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
    }

    @Override // defpackage.mu0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
    }

    @Override // defpackage.j30
    public final qsb y() {
        return this.j0;
    }

    public final void T() {
        String strA;
        ada adaVar = this.g0;
        if (adaVar == null) {
            hm3.l("state");
            throw null;
        }
        iqb iqbVar = (iqb) adaVar.b;
        Uri uriN = (Uri) iqbVar.c;
        if (uriN == null) {
            uh2 uh2Var = (uh2) iqbVar.b;
            uriN = uh2Var != null ? uh2Var.N() : null;
            if (uriN == null) {
                return;
            }
        }
        ada adaVar2 = this.g0;
        if (adaVar2 == null) {
            hm3.l("state");
            throw null;
        }
        uh2 uh2Var2 = (uh2) ((iqb) adaVar2.b).b;
        if (uh2Var2 == null || (strA = uh2Var2.c()) == null) {
            App appW = w();
            ada adaVar3 = this.g0;
            if (adaVar3 == null) {
                hm3.l("state");
                throw null;
            }
            strA = appW.A((String) ((iqb) adaVar3.b).d);
        }
        Intent intent = new Intent(RJRxBMfzzSpiPT.zuFYTWjnmyKBJ, uriN, getApplicationContext(), TextViewer.class);
        if (strA != null) {
            intent.setDataAndType(uriN, strA);
        }
        ada adaVar4 = this.g0;
        if (adaVar4 == null) {
            hm3.l("state");
            throw null;
        }
        intent.putExtra("title", (String) ((iqb) adaVar4.b).d);
        ada adaVar5 = this.g0;
        if (adaVar5 == null) {
            hm3.l("state");
            throw null;
        }
        String str = (String) ((iqb) adaVar5.b).e;
        if (str != null) {
            intent.putExtra("com.lonelycatgames.Xplore.encoding", str);
        }
        intent.putExtra("com.lonelycatgames.Xplore.contentUri", uriN);
        startActivity(intent);
        finish();
    }

    @Override // defpackage.j30
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        int i2;
        zz2 zz2Var2 = zz2Var;
        zz2Var2.Y(-1045377385);
        if ((i & 6) == 0) {
            i2 = (zz2Var2.f(qq5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zz2Var2.h(this) ? 32 : 16;
        }
        int i3 = 3;
        if (zz2Var2.O(i2 & 1, (i2 & 19) != 18)) {
            w15 w15VarI = f2c.i(uc4.b, qq5Var);
            ws0 ws0VarA = vs0.a(b52.c, j72.Q, zz2Var2, 0);
            int iHashCode = Long.hashCode(zz2Var2.T);
            hx5 hx5VarL = zz2Var2.l();
            w15 w15VarH = dyc.h(zz2Var2, w15VarI);
            aw0.j.getClass();
            ax0 ax0Var = zv0.b;
            zz2Var2.a0();
            if (zz2Var2.S) {
                zz2Var2.k(ax0Var);
            } else {
                zz2Var2.j0();
            }
            tq4.g(zv0.f, zz2Var2, ws0VarA);
            tq4.g(zv0.e, zz2Var2, hx5VarL);
            tq4.g(zv0.g, zz2Var2, Integer.valueOf(iHashCode));
            tq4.f(zz2Var2, zv0.h);
            tq4.g(zv0.d, zz2Var2, w15VarH);
            ScaleGestureDetector scaleGestureDetectorP = P(zz2Var2);
            Object objL = zz2Var2.L();
            j72 j72Var = gw0.a;
            if (objL == j72Var) {
                objL = yzc.c(null);
                zz2Var2.g0(objL);
            }
            u95 u95Var = (u95) objL;
            ada adaVar = this.g0;
            String str = AUsNcgWE.AlCbRjEyoTobp;
            if (adaVar == null) {
                hm3.l(str);
                throw null;
            }
            List listG = fwc.g(((vu5) adaVar.c).getValue());
            boolean zH = zz2Var2.h(this);
            Object objL2 = zz2Var2.L();
            if (zH || objL2 == j72Var) {
                objL2 = new ju7(this, u95Var, 1);
                zz2Var2.g0(objL2);
            }
            tx2 tx2Var = (tx2) objL2;
            yu0 yu0VarG = jxc.g(1340812282, new xb0(this, 13, u95Var), zz2Var2);
            boolean zH2 = zz2Var2.h(this);
            Object objL3 = zz2Var2.L();
            if (zH2 || objL3 == j72Var) {
                objL3 = new ku7(this, i3);
                zz2Var2.g0(objL3);
            }
            e2d.a(null, null, 0L, tx2Var, yu0VarG, listG, false, (wx2) objL3, zz2Var, 1597446, 6);
            zz2Var2 = zz2Var;
            int iH = this.e0.h();
            boolean zO = O();
            ada adaVar2 = this.g0;
            if (adaVar2 == null) {
                hm3.l(str);
                throw null;
            }
            vu5 vu5Var = (vu5) adaVar2.d;
            nx3 nx3Var = this.k0;
            if (nx3Var == null) {
                hm3.l("keyboardOptions");
                throw null;
            }
            vu5 vu5Var2 = (vu5) adaVar2.c;
            w15 w15VarC = a87.c(t15.a, 1.0f);
            w15VarC.getClass();
            scaleGestureDetectorP.getClass();
            w15 w15VarB = lm7.b(w15VarC, scaleGestureDetectorP, new ue(5, scaleGestureDetectorP));
            boolean z = ((zo3) this.i0.getValue()) == null;
            Object objL4 = zz2Var2.L();
            if (objL4 == j72Var) {
                objL4 = new b1(u95Var, 22);
                zz2Var2.g0(objL4);
            }
            dyc.c(iH, zO, vu5Var, nx3Var, vu5Var2, w15VarB, z, (tx2) objL4, zz2Var2, 12582912);
            zz2Var2.p(true);
        } else {
            zz2Var2.R();
        }
        kc6 kc6VarR = zz2Var2.r();
        if (kc6VarR != null) {
            kc6VarR.d = new w36(this, qq5Var, i, 3);
        }
    }
}
