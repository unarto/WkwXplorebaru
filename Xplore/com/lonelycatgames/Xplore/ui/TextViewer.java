package com.lonelycatgames.Xplore.ui;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.aA.rOIT;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.ScaleGestureDetector;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.ui.TextViewer;
import defpackage.a41;
import defpackage.a87;
import defpackage.ae7;
import defpackage.aw0;
import defpackage.aw3;
import defpackage.ax0;
import defpackage.ay7;
import defpackage.b10;
import defpackage.b41;
import defpackage.b52;
import defpackage.b81;
import defpackage.ba3;
import defpackage.bj3;
import defpackage.c0c;
import defpackage.c22;
import defpackage.ca3;
import defpackage.ce2;
import defpackage.ch3;
import defpackage.cu7;
import defpackage.cy7;
import defpackage.dk;
import defpackage.dl2;
import defpackage.dt2;
import defpackage.dt9;
import defpackage.du2;
import defpackage.dyc;
import defpackage.ea1;
import defpackage.ead;
import defpackage.eg5;
import defpackage.es5;
import defpackage.eu2;
import defpackage.ew4;
import defpackage.ey7;
import defpackage.f22;
import defpackage.f2c;
import defpackage.f44;
import defpackage.fw7;
import defpackage.fwc;
import defpackage.ga0;
import defpackage.gs0;
import defpackage.gt7;
import defpackage.gw0;
import defpackage.h1;
import defpackage.hm3;
import defpackage.hx5;
import defpackage.ib1;
import defpackage.iu2;
import defpackage.iw7;
import defpackage.ix7;
import defpackage.j1d;
import defpackage.j2;
import defpackage.j30;
import defpackage.j72;
import defpackage.jaa;
import defpackage.jj7;
import defpackage.jxc;
import defpackage.jy7;
import defpackage.jyc;
import defpackage.k80;
import defpackage.kab;
import defpackage.kc6;
import defpackage.ks;
import defpackage.ky7;
import defpackage.l40;
import defpackage.lm7;
import defpackage.lr7;
import defpackage.mc4;
import defpackage.mc6;
import defpackage.mj4;
import defpackage.n00;
import defpackage.n5d;
import defpackage.n84;
import defpackage.ng4;
import defpackage.nu3;
import defpackage.nz4;
import defpackage.o01;
import defpackage.o22;
import defpackage.ot5;
import defpackage.pc1;
import defpackage.pg7;
import defpackage.pk3;
import defpackage.pwc;
import defpackage.qj7;
import defpackage.qp7;
import defpackage.qp9;
import defpackage.qq5;
import defpackage.qy1;
import defpackage.r84;
import defpackage.re8;
import defpackage.ri3;
import defpackage.s84;
import defpackage.sa8;
import defpackage.se8;
import defpackage.sfc;
import defpackage.su5;
import defpackage.th;
import defpackage.tq4;
import defpackage.tu4;
import defpackage.tva;
import defpackage.tx2;
import defpackage.u07;
import defpackage.u95;
import defpackage.uc4;
import defpackage.ue;
import defpackage.us;
import defpackage.ve5;
import defpackage.vq6;
import defpackage.vs0;
import defpackage.vu5;
import defpackage.w15;
import defpackage.w36;
import defpackage.w74;
import defpackage.ws0;
import defpackage.wx2;
import defpackage.x2d;
import defpackage.x4d;
import defpackage.xr0;
import defpackage.y52;
import defpackage.y82;
import defpackage.yr0;
import defpackage.yzc;
import defpackage.z74;
import defpackage.zk4;
import defpackage.znc;
import defpackage.zv0;
import defpackage.zz2;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class TextViewer extends gt7 {
    public static final /* synthetic */ int s0 = 0;
    public Uri f0;
    public String g0;
    public boolean i0;
    public boolean k0;
    public boolean l0;
    public final f44 m0;
    public final f44 n0;
    public final vu5 o0;
    public pg7 p0;
    public boolean q0;
    public final LinkedHashMap r0;
    public final vu5 h0 = yzc.c(null);
    public final vu5 j0 = yzc.c(null);

    public TextViewer() {
        cy7 cy7Var = new cy7(this, 1);
        String[] strArr = se8.a;
        n84 n84Var = n84.b;
        this.m0 = jyc.b(n84Var, cy7Var);
        this.n0 = jyc.b(n84Var, new cy7(this, 2));
        this.o0 = yzc.c(null);
        this.r0 = new LinkedHashMap();
    }

    public static String X(String str) {
        List listH = fwc.h(new lr7(), new nz4());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = f22.v;
        List<ce2> list = listH;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ce2) it.next()) instanceof lr7) {
                arrayList.add(new k80(6));
            }
        }
        LinkedHashSet linkedHashSet2 = f22.v;
        ArrayList arrayList6 = new ArrayList(arrayList);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList6.add((k80) f22.w.get((Class) it2.next()));
        }
        int i = 13;
        ew4 ew4Var = new ew4(13);
        new HashMap();
        ArrayList arrayList7 = new ArrayList(arrayList2);
        arrayList7.add(new n00(1));
        arrayList7.add(new n00(2));
        arrayList7.add(new n00(3));
        arrayList7.add(new n00(0));
        arrayList7.add(new n00(4));
        HashMap map = new HashMap();
        Object[] objArr = {new us('*'), new us('_')};
        ArrayList arrayList8 = new ArrayList(2);
        int i2 = 0;
        for (int i3 = 2; i2 < i3; i3 = 2) {
            Object obj = objArr[i2];
            Objects.requireNonNull(obj);
            arrayList8.add(obj);
            i2++;
        }
        ri3.b(Collections.unmodifiableList(arrayList8), map);
        ri3.b(arrayList3, map);
        new ArrayList(arrayList4).add(new ea1());
        BitSet bitSet = new BitSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            bitSet.set(((Character) it3.next()).charValue());
        }
        bitSet.set(33);
        Set setKeySet = map.keySet();
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it4 = setKeySet.iterator();
        while (it4.hasNext()) {
            bitSet2.set(((Character) it4.next()).charValue());
        }
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            Iterator it6 = ((n00) it5.next()).a().iterator();
            while (it6.hasNext()) {
                bitSet2.set(((Character) it6.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        f22 f22Var = new f22(arrayList6, ew4Var, arrayList2, arrayList3, arrayList4, hashSet);
        int i4 = 0;
        while (true) {
            int length = str.length();
            int i5 = i4;
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                }
                char cCharAt = str.charAt(i5);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i5++;
            }
            if (i5 == -1) {
                break;
            }
            f22Var.h(i4, str.substring(i4, i5));
            i4 = i5 + 1;
            if (i4 < str.length() && str.charAt(i5) == '\r' && str.charAt(i4) == '\n') {
                i4 = i5 + 2;
            }
        }
        if (!str.isEmpty() && (i4 == 0 || i4 < str.length())) {
            f22Var.h(i4, str.substring(i4));
        }
        f22Var.e(f22Var.t.size());
        b10 b10Var = new b10(f22Var.l, f22Var.m, f22Var.n, f22Var.o, f22Var.s, 9);
        f22Var.k.getClass();
        ri3 ri3Var = new ri3(b10Var);
        Iterator it7 = f22Var.u.iterator();
        while (it7.hasNext()) {
            ((j2) it7.next()).i(ri3Var);
        }
        c22 c22Var = (c22) f22Var.r.b;
        Iterator it8 = arrayList5.iterator();
        if (it8.hasNext()) {
            throw ve5.g(it8);
        }
        tu4 tu4Var = new tu4(i, false);
        Object[] objArr2 = {"http", "https", "mailto", "data"};
        ArrayList arrayList9 = new ArrayList(4);
        for (int i6 = 0; i6 < 4; i6++) {
            Object obj2 = objArr2[i6];
            Objects.requireNonNull(obj2);
            arrayList9.add(obj2);
        }
        new HashSet(Collections.unmodifiableList(arrayList9));
        tu4Var.b = new ArrayList();
        tu4Var.c = new ArrayList();
        for (ce2 ce2Var : list) {
            if (ce2Var instanceof ba3) {
                ((ba3) ce2Var).a(tu4Var);
            }
        }
        jaa jaaVar = new jaa(tu4Var);
        StringBuilder sb = new StringBuilder();
        x4d x4dVar = new x4d(jaaVar, new ca3(sb));
        bj3 bj3Var = (bj3) x4dVar.d;
        final int i7 = 0;
        ((ArrayList) bj3Var.a).forEach(new Consumer() { // from class: xd5
            @Override // java.util.function.Consumer
            public final void accept(Object obj3) {
                wd5 wd5Var = (wd5) obj3;
                switch (i7) {
                    case 0:
                        wd5Var.getClass();
                        break;
                    default:
                        wd5Var.getClass();
                        break;
                }
            }
        });
        x4dVar.k(c22Var);
        final int i8 = 1;
        ((ArrayList) bj3Var.a).forEach(new Consumer() { // from class: xd5
            @Override // java.util.function.Consumer
            public final void accept(Object obj3) {
                wd5 wd5Var = (wd5) obj3;
                switch (i8) {
                    case 0:
                        wd5Var.getClass();
                        break;
                    default:
                        wd5Var.getClass();
                        break;
                }
            }
        });
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v10, types: [int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void R(Object obj, String str) {
        Object objY = obj;
        boolean z = false;
        if (objY instanceof String) {
            String str2 = this.g0;
            if (hm3.b(str2, "text/xml")) {
                String str3 = (String) objY;
                qp7 qp7Var = w().L() ? new qp7(0) : new qp7(1);
                List<??> listX = jj7.X(str3, new char[]{'\n'}, 0, 6);
                ArrayList arrayList = new ArrayList(yr0.o(listX, 10));
                boolean z2 = false;
                boolean z3 = false;
                for (?? r10 : listX) {
                    dk dkVar = new dk();
                    ?? length = z;
                    while (true) {
                        if (length >= r10.length()) {
                            break;
                        }
                        if (z2) {
                            int iL = jj7.L(r10, "-->", length, z, 4);
                            if (iL == -1) {
                                int iH = dkVar.h(qp7Var.c());
                                try {
                                    dkVar.f(r10.substring(length));
                                    dkVar.g(iH);
                                    length = r10.length();
                                } finally {
                                }
                            } else {
                                int iH2 = dkVar.h(qp7Var.c());
                                int i = iL + 3;
                                try {
                                    dkVar.f(r10.substring(length, i));
                                    dkVar.g(iH2);
                                    z2 = z;
                                    length = i;
                                } finally {
                                }
                            }
                        } else if (z3) {
                            int iK = jj7.K(r10, '>', length, 4);
                            if (iK == -1) {
                                n5d.d(dkVar, r10.substring(length), qp7Var.e(), qp7Var.a(), qp7Var.b(), qp7Var.d(), false);
                                length = r10.length();
                            } else {
                                int i2 = iK + 1;
                                n5d.d(dkVar, r10.substring(length, i2), qp7Var.e(), qp7Var.a(), qp7Var.b(), qp7Var.d(), false);
                                length = i2;
                                z3 = z;
                            }
                        } else {
                            int iK2 = jj7.K(r10, '<', length, 4);
                            if (iK2 == -1) {
                                dkVar.f(r10.substring(length));
                                break;
                            }
                            dkVar.f(r10.substring(length, iK2));
                            if (r10.startsWith("<!--", iK2)) {
                                length = iK2;
                                z2 = true;
                            } else {
                                int iK3 = jj7.K(r10, '>', iK2, 4);
                                if (iK3 == -1) {
                                    n5d.d(dkVar, r10.substring(iK2), qp7Var.e(), qp7Var.a(), qp7Var.b(), qp7Var.d(), true);
                                    z3 = true;
                                    length = r10.length();
                                } else {
                                    int i3 = iK3 + 1;
                                    n5d.d(dkVar, r10.substring(iK2, i3), qp7Var.e(), qp7Var.a(), qp7Var.b(), qp7Var.d(), true);
                                    length = i3;
                                }
                            }
                            z = false;
                        }
                    }
                    arrayList.add(dkVar.i());
                    z = false;
                }
                objY = arrayList;
            } else if (!hm3.b(str2, "text/html")) {
                objY = jj7.Y((CharSequence) objY, new String[]{"\n"}, 6);
            }
        }
        boolean z4 = objY instanceof List;
        vu5 vu5Var = this.j0;
        if (z4) {
            vu5Var.setValue(objY);
            return;
        }
        String str4 = objY instanceof String ? (String) objY : null;
        vu5Var.setValue(str4);
        try {
            U().loadDataWithBaseURL("http://--xplore-text-viewer--/" + xr0.F(new pk3(1, 10, 1), "/", null, null, null, 62) + "/" + (str == null ? "" : str), str4 == null ? "Error loading file" : str4, (!hm3.b(this.g0, "text/html") || str4 == null) ? "text/plain" : "text/html", "UTF-8", null);
        } catch (Exception e) {
            e = e;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (true) {
                Throwable cause = e.getCause();
                if (cause == null || cause == e || !linkedHashSet.add(e)) {
                    break;
                } else {
                    e = cause;
                }
            }
            w().j0(this, se8.k(e), false);
            finish();
        } catch (OutOfMemoryError unused) {
            App appW = w();
            Handler handler = App.M0;
            appW.j0(this, "Out of memory", true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r7 = defpackage.jj7.Y(r7, new java.lang.String[]{"/"}, 6);
        r2 = new java.util.ArrayList();
        r7 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r7.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        r4 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (((java.lang.String) r4).length() <= 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r2.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r2.isEmpty() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        r7 = r6.r0;
        r4 = ((defpackage.qy1) r0).T();
        r5 = r7.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (r5 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        r5 = ((defpackage.qy1) r0).M0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized ng4 S(String str) {
        ng4 ng4VarR0;
        int i;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String strT;
        Object objM0;
        Object next;
        try {
            ng4VarR0 = (qy1) this.m0.getValue();
            if (ng4VarR0 != null) {
                while (true) {
                    i = 0;
                    if (!qj7.w(str, "../", false)) {
                        break;
                    }
                    dl2 dl2Var = ng4VarR0.J;
                    dl2Var.getClass();
                    qy1 qy1Var = ng4VarR0.L;
                    ng4VarR0 = qy1Var == null ? dl2Var.r0(ng4VarR0) : qy1Var;
                    if (ng4VarR0 == null) {
                        return null;
                    }
                    str = str.substring(3);
                }
            } else {
                return null;
            }
        } catch (Throwable th) {
            throw th;
        }
        linkedHashMap.put(strT, objM0);
        List list = (List) objM0;
        if (list == null) {
            return null;
        }
        int i2 = i + 1;
        String str2 = (String) arrayList.get(i);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (qj7.q(((ng4) next).Z(), str2)) {
                break;
            }
        }
        ng4VarR0 = (ng4) next;
        if (ng4VarR0 == null) {
            return null;
        }
        if (i2 == arrayList.size()) {
            if (ng4VarR0.k0()) {
                return null;
            }
            return ng4VarR0;
        }
        if (!(ng4VarR0 instanceof qy1)) {
            return null;
        }
        i = i2;
    }

    public final WebView T() {
        return (WebView) this.h0.getValue();
    }

    public final WebView U() {
        WebView webViewT = T();
        if (webViewT == null) {
            webViewT = new WebView(this);
            this.h0.setValue(webViewT);
            webViewT.setWebViewClient(new jy7(this, webViewT));
            webViewT.setOnTouchListener(new ey7());
            webViewT.setWebChromeClient(new o22(1));
            WebSettings settings = webViewT.getSettings();
            settings.setFixedFontFamily(settings.getSansSerifFontFamily());
            settings.setSupportZoom(false);
            settings.setAllowContentAccess(true);
            webViewT.setOnTouchListener(new b41(1, new ScaleGestureDetector(webViewT.getContext(), new ky7(webViewT))));
            webViewT.setBackgroundColor(this.k0 ? -16777216 : -1);
            if (hm3.b(this.g0, "text/html")) {
                WebSettings settings2 = webViewT.getSettings();
                settings2.setJavaScriptEnabled(true);
                settings2.setDomStorageEnabled(true);
            }
            webViewT.clearHistory();
        }
        return webViewT;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:89|62|(6:63|(1:104)(3:94|71|106)|74|87|75|76)|65|74|87|75|76) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String V(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        String string;
        String strB;
        String str = x().g;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(4);
        try {
            try {
                byte[] bArr = new byte[4];
                int i = bufferedInputStream.read(bArr);
                if (i >= 2) {
                    if (hm3.b(this.g0, "text/xml") && i == 4) {
                        byte b = bArr[0];
                        if (b == 3 && bArr[1] == 0 && bArr[2] == 8 && bArr[3] == 0) {
                            this.i0 = true;
                            bufferedInputStream.reset();
                            strB = tva.c(c0c.e(bufferedInputStream));
                        } else if (b == 65 && bArr[1] == 66 && bArr[2] == 88 && bArr[3] == 0) {
                            this.i0 = true;
                            bufferedInputStream.reset();
                            strB = tva.b(bufferedInputStream);
                        }
                        try {
                            return strB;
                        } catch (Exception e) {
                            return strB;
                        }
                    }
                    if (i >= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
                        str = "utf-8";
                    } else {
                        byte b2 = bArr[0];
                        if (b2 == -2 && bArr[1] == -1) {
                            str = "utf-16be";
                        } else if (b2 == -1 && bArr[1] == -2) {
                            str = "utf-16";
                        }
                    }
                }
            } finally {
                try {
                    bufferedInputStream.reset();
                } catch (Exception e2) {
                    Handler handler = App.M0;
                    qp9.d(e2);
                }
            }
        } catch (Exception e3) {
            Handler handler2 = App.M0;
            qp9.d(e3);
        }
        try {
            bufferedInputStream.reset();
        } catch (Exception e4) {
            Handler handler3 = App.M0;
            qp9.d(e4);
        }
        try {
            inputStreamReader = new InputStreamReader(bufferedInputStream, str);
        } catch (UnsupportedEncodingException unused) {
            inputStreamReader = new InputStreamReader(bufferedInputStream);
        }
        StringBuilder sb = new StringBuilder();
        try {
            char[] cArr = new char[4096];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 < 0) {
                    try {
                        break;
                    } catch (OutOfMemoryError unused2) {
                        string = "Error: Out of memory - text file is too big!";
                    }
                } else {
                    try {
                        sb.append(cArr, 0, i2);
                    } catch (OutOfMemoryError unused3) {
                        string = null;
                    }
                }
                se8.a(inputStream);
                re8.t(inputStreamReader);
                return string;
            }
            string = sb.toString();
            se8.a(inputStream);
            re8.t(inputStreamReader);
            return string;
        } catch (Throwable th) {
            String[] strArr = se8.a;
            try {
                re8.t(inputStreamReader);
            } catch (Exception unused4) {
            }
            throw th;
        }
    }

    public final void W() {
        pg7 pg7Var = this.p0;
        b81 b81Var = null;
        if (pg7Var != null) {
            pg7Var.d(null);
        }
        this.p0 = null;
        this.q0 = true;
        Uri uri = this.f0;
        if (uri == null) {
            return;
        }
        this.l0 = hm3.b(uri.getScheme(), "http") || hm3.b(uri.getScheme(), "https");
        this.k0 = this.k0 && !hm3.b(this.g0, "text/html");
        if (this.l0) {
            U().loadUrl(uri.toString());
        } else {
            this.p0 = kab.d(x2d.e(this), null, null, new ot5(this, uri, b81Var, 20), 3);
        }
    }

    @Override // defpackage.mu0, android.app.Activity
    public final void onBackPressed() {
        WebView webViewT = T();
        if (webViewT == null || !webViewT.canGoBack()) {
            super.onBackPressed();
        } else {
            webViewT.goBack();
        }
    }

    @Override // defpackage.gt7, defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j30.z(this);
        if (w().L()) {
            this.k0 = true;
        }
        SharedPreferences sharedPreferencesB = w().B();
        if (getSharedPreferences("WebViewSettings", 0).getInt("double_tap_toast_count", 1) > 0) {
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            editorEdit.getClass();
            editorEdit.putInt("double_tap_toast_count", 0);
            editorEdit.apply();
        }
        C();
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("title");
        Uri data = intent.getData();
        if (data != null) {
            this.f0 = data;
            this.g0 = intent.getType();
            if (stringExtra == null) {
                ContentResolver contentResolver = getContentResolver();
                contentResolver.getClass();
                String strG = th.g(contentResolver, data);
                String strZ = w().z(se8.f(strG));
                if (strZ != null) {
                    this.g0 = strZ;
                }
                stringExtra = strG;
            }
        }
        if (stringExtra != null) {
            setTitle(stringExtra);
        } else {
            Uri uri = this.f0;
            if (uri != null) {
                setTitle(uri.getPath());
            }
        }
        W();
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        rOIT.DDRi.invoke(null, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [es5] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r18v2, types: [tx2] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    @Override // defpackage.j30
    public final void r(qq5 qq5Var, zz2 zz2Var, int i) {
        int i2;
        int i3;
        TextViewer textViewer;
        zz2 zz2Var2;
        int i4;
        String str;
        Throwable th;
        w74 w74Var;
        w74 w74Var2;
        ?? r33;
        String str2;
        Throwable th2;
        Throwable th3;
        ScaleGestureDetector scaleGestureDetector;
        List list;
        su5 su5Var;
        w74 w74Var3;
        Object obj;
        final List list2;
        ib1 ib1Var;
        u95 u95Var;
        final u95 u95Var2;
        final su5 su5Var2;
        Object obj2;
        final w74 w74Var4;
        ib1 ib1Var2;
        boolean z;
        Object obj3;
        u95 u95Var3;
        Object obj4;
        boolean z2;
        boolean z3;
        boolean z4;
        final TextViewer textViewer2 = this;
        zz2Var.Y(1548630007);
        if ((i & 6) == 0) {
            i2 = i | (zz2Var.f(qq5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zz2Var.h(textViewer2) ? 32 : 16;
        }
        if (zz2Var.O(i2 & 1, (i2 & 19) != 18)) {
            w15 w15VarI = f2c.i(uc4.b, qq5Var);
            ws0 ws0VarA = vs0.a(b52.c, j72.Q, zz2Var, 0);
            int iHashCode = Long.hashCode(zz2Var.T);
            hx5 hx5VarL = zz2Var.l();
            w15 w15VarH = dyc.h(zz2Var, w15VarI);
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
            Object objL = zz2Var.L();
            j72 j72Var = gw0.a;
            if (objL == j72Var) {
                objL = dt9.h(zz2Var);
                zz2Var.g0(objL);
            }
            final ib1 ib1Var3 = (ib1) objL;
            vq6 vq6VarC = znc.c(zz2Var);
            w74 w74VarA = z74.a(0, zz2Var, 3);
            Object objL2 = zz2Var.L();
            if (objL2 == j72Var) {
                objL2 = yzc.c(Boolean.valueOf(textViewer2.w().B().getBoolean("text_viewer_wrap", true)));
                zz2Var.g0(objL2);
            }
            u95 u95Var4 = (u95) objL2;
            Object objL3 = zz2Var.L();
            if (objL3 == j72Var) {
                objL3 = yzc.c(null);
                zz2Var.g0(objL3);
            }
            final u95 u95Var5 = (u95) objL3;
            boolean zG = zz2Var.g(textViewer2.i0);
            Object objL4 = zz2Var.L();
            String str3 = "";
            if (zG || objL4 == j72Var) {
                objL4 = yzc.c(textViewer2.i0 ? "Decoded binary XML" : "");
                zz2Var.g0(objL4);
            }
            u95 u95Var6 = (u95) objL4;
            Object value = textViewer2.j0.getValue();
            List list3 = value instanceof List ? (List) value : null;
            Object objL5 = zz2Var.L();
            if (objL5 == j72Var) {
                objL5 = yzc.c(y82.a);
                zz2Var.g0(objL5);
            }
            final u95 u95Var7 = (u95) objL5;
            Object objL6 = zz2Var.L();
            if (objL6 == j72Var) {
                objL6 = new su5(-1);
                zz2Var.g0(objL6);
            }
            su5 su5Var3 = (su5) objL6;
            List list4 = list3;
            long jB = gs0.b(0.5f, uc4.e(zz2Var).h);
            long jB2 = gs0.b(0.5f, uc4.e(zz2Var).a);
            fw7 fw7Var = (fw7) u95Var5.getValue();
            if (fw7Var != null) {
                str = fw7Var.a.b;
                th = null;
            } else {
                str = null;
                th = null;
            }
            boolean zF = zz2Var.f(value) | zz2Var.f(str) | zz2Var.d(su5Var3.h());
            Object objL7 = zz2Var.L();
            if (zF || objL7 == j72Var) {
                if (list4 == null) {
                    w74Var = w74VarA;
                    objL7 = th;
                } else {
                    fw7 fw7Var2 = (fw7) u95Var5.getValue();
                    if (fw7Var2 != null && (str2 = fw7Var2.a.b) != null) {
                        str3 = str2;
                    }
                    if (str3.length() == 0) {
                        w74Var = w74VarA;
                        objL7 = list4;
                    } else {
                        int size = ((List) u95Var7.getValue()).size();
                        int iH = su5Var3.h();
                        Object obj5 = (iH < 0 || iH >= size) ? th : (es5) ((List) u95Var7.getValue()).get(su5Var3.h());
                        List list5 = list4;
                        ArrayList arrayList = new ArrayList(yr0.o(list5, 10));
                        Iterator it = list5.iterator();
                        int i5 = 0;
                        ?? r0 = obj5;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                fwc.m();
                                throw th;
                            }
                            CharSequence charSequenceI = (CharSequence) next;
                            ks ksVarM0 = xr0.m0((List) u95Var7.getValue());
                            Iterator it2 = it;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = ksVarM0.iterator();
                            String str4 = str3;
                            while (true) {
                                y52 y52Var = (y52) it3;
                                w74Var2 = w74VarA;
                                if (!y52Var.b.hasNext()) {
                                    break;
                                }
                                Object next2 = y52Var.next();
                                if (((Number) ((es5) ((ch3) next2).b).a).intValue() == i5) {
                                    arrayList2.add(next2);
                                }
                                w74VarA = w74Var2;
                            }
                            if (arrayList2.isEmpty()) {
                                r33 = r0;
                            } else {
                                dk dkVar = new dk();
                                dkVar.e(charSequenceI);
                                Iterator it4 = arrayList2.iterator();
                                ?? r02 = r0;
                                while (it4.hasNext()) {
                                    int iIntValue = ((Number) ((es5) ((ch3) it4.next()).b).b).intValue();
                                    dkVar.a(new ae7(0L, 0L, (iu2) null, (du2) null, (eu2) null, (dt2) null, (String) null, 0L, (l40) null, (iw7) null, (mj4) null, r02 != 0 && ((Number) r02.a).intValue() == i5 && ((Number) r02.b).intValue() == iIntValue ? jB2 : jB, (cu7) null, (u07) null, 63487), iIntValue, str4.length() + iIntValue);
                                    r02 = r02;
                                }
                                r33 = r02;
                                charSequenceI = dkVar.i();
                            }
                            arrayList.add(charSequenceI);
                            i5 = i6;
                            it = it2;
                            str3 = str4;
                            w74VarA = w74Var2;
                            r0 = r33;
                        }
                        w74Var = w74VarA;
                        objL7 = arrayList;
                    }
                }
                zz2Var.g0(objL7);
            } else {
                w74Var = w74VarA;
            }
            List list6 = (List) objL7;
            ScaleGestureDetector scaleGestureDetectorP = textViewer2.P(zz2Var);
            Object objL8 = zz2Var.L();
            if (objL8 == j72Var) {
                objL8 = yzc.c(th);
                zz2Var.g0(objL8);
            }
            u95 u95Var8 = (u95) objL8;
            if (((fw7) u95Var5.getValue()) != null) {
                zz2Var.X(-2100716768);
                if (list4 != null) {
                    zz2Var.X(-2100695502);
                    zz2Var.p(false);
                    u95Var8.setValue(new ix7(su5Var3.h(), ((List) u95Var7.getValue()).size()));
                    z4 = false;
                } else {
                    zz2Var.X(-2100576896);
                    WebView webViewT = textViewer2.T();
                    boolean zH = zz2Var.h(textViewer2);
                    Object objL9 = zz2Var.L();
                    if (zH || objL9 == j72Var) {
                        objL9 = new mc6(textViewer2, 16, u95Var8);
                        zz2Var.g0(objL9);
                    }
                    dt9.a(webViewT, (wx2) objL9, zz2Var);
                    z4 = false;
                    zz2Var.p(false);
                }
                zz2Var.p(z4);
                th2 = th;
            } else {
                zz2Var.X(-2099953021);
                zz2Var.p(false);
                th2 = th;
                u95Var8.setValue(th2);
            }
            CharSequence title = textViewer2.getTitle();
            title.getClass();
            boolean zH2 = zz2Var.h(textViewer2);
            Object objL10 = zz2Var.L();
            if (zH2 || objL10 == j72Var) {
                th3 = th2;
                scaleGestureDetector = scaleGestureDetectorP;
                list = list4;
                su5Var = su5Var3;
                w74Var3 = w74Var;
                zk4 zk4Var = new zk4(0, textViewer2, TextViewer.class, "finish", "finish()V", 0, 18);
                zz2Var.g0(zk4Var);
                objL10 = zk4Var;
            } else {
                th3 = th2;
                scaleGestureDetector = scaleGestureDetectorP;
                list = list4;
                su5Var = su5Var3;
                w74Var3 = w74Var;
            }
            tx2 tx2Var = (tx2) ((nu3) objL10);
            fw7 fw7Var3 = (fw7) u95Var5.getValue();
            ix7 ix7Var = (ix7) u95Var8.getValue();
            boolean zH3 = zz2Var.h(list) | zz2Var.h(ib1Var3) | zz2Var.f(w74Var3) | zz2Var.h(textViewer2);
            Object objL11 = zz2Var.L();
            if (zH3 || objL11 == j72Var) {
                final w74 w74Var5 = w74Var3;
                list2 = list;
                final su5 su5Var4 = su5Var;
                obj = new wx2() { // from class: fy7
                    @Override // defpackage.wx2
                    public final Object a(Object obj6) {
                        Object obj7;
                        fw7 fw7Var4 = (fw7) obj6;
                        int i7 = TextViewer.s0;
                        fw7Var4.getClass();
                        String str5 = fw7Var4.a.b;
                        u95 u95Var9 = u95Var5;
                        fw7 fw7Var5 = (fw7) u95Var9.getValue();
                        b81 b81Var = null;
                        boolean zB = hm3.b(str5, fw7Var5 != null ? fw7Var5.a.b : null);
                        u95Var9.setValue(fw7Var4);
                        if (!zB) {
                            List list7 = list2;
                            if (list7 != null) {
                                if (str5.length() == 0) {
                                    obj7 = y82.a;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    int size2 = list7.size();
                                    for (int i8 = 0; i8 < size2; i8++) {
                                        String string = list7.get(i8).toString();
                                        for (int iL = jj7.L(string, str5, 0, true, 2); iL >= 0; iL = jj7.I(string, str5, str5.length() + iL, true)) {
                                            arrayList3.add(new es5(Integer.valueOf(i8), Integer.valueOf(iL)));
                                        }
                                    }
                                    obj7 = arrayList3;
                                }
                                u95 u95Var10 = u95Var7;
                                u95Var10.setValue(obj7);
                                int i9 = ((List) u95Var10.getValue()).isEmpty() ? -1 : 0;
                                su5 su5Var5 = su5Var4;
                                su5Var5.i(i9);
                                if (su5Var5.h() >= 0) {
                                    kab.d(ib1Var3, null, null, new ot5(u95Var10, w74Var5, b81Var, 18), 3);
                                }
                            } else {
                                WebView webViewT2 = textViewer2.T();
                                if (webViewT2 != null) {
                                    webViewT2.findAllAsync(str5);
                                }
                            }
                        }
                        return sa8.a;
                    }
                };
                ib1Var = ib1Var3;
                textViewer2 = textViewer2;
                u95Var = u95Var5;
                u95Var2 = u95Var7;
                su5Var2 = su5Var4;
                zz2Var.g0(obj);
            } else {
                obj = objL11;
                list2 = list;
                ib1Var = ib1Var3;
                u95Var = u95Var5;
                u95Var2 = u95Var7;
                su5Var2 = su5Var;
            }
            wx2 wx2Var = (wx2) obj;
            boolean zH4 = zz2Var.h(list2) | zz2Var.h(textViewer2);
            Object objL12 = zz2Var.L();
            if (zH4 || objL12 == j72Var) {
                aw3 aw3Var = new aw3(list2, textViewer2, u95Var, u95Var2, su5Var2, 3);
                zz2Var.g0(aw3Var);
                objL12 = aw3Var;
            }
            tx2 tx2Var2 = (tx2) objL12;
            boolean zH5 = zz2Var.h(list2) | zz2Var.h(ib1Var) | zz2Var.f(w74Var3) | zz2Var.h(textViewer2);
            Object objL13 = zz2Var.L();
            if (zH5 || objL13 == j72Var) {
                final ib1 ib1Var4 = ib1Var;
                final int i7 = 0;
                final TextViewer textViewer3 = textViewer2;
                w74Var4 = w74Var3;
                obj2 = new tx2() { // from class: gy7
                    @Override // defpackage.tx2
                    public final Object d() {
                        int i8 = i7;
                        sa8 sa8Var = sa8.a;
                        w74 w74Var6 = w74Var4;
                        su5 su5Var5 = su5Var2;
                        u95 u95Var9 = u95Var2;
                        TextViewer textViewer4 = textViewer3;
                        ib1 ib1Var5 = ib1Var4;
                        List list7 = list2;
                        b81 b81Var = null;
                        int i9 = 3;
                        switch (i8) {
                            case 0:
                                int i10 = TextViewer.s0;
                                if (list7 == null) {
                                    WebView webViewT2 = textViewer4.T();
                                    if (webViewT2 != null) {
                                        webViewT2.findNext(false);
                                    }
                                } else if (!((List) u95Var9.getValue()).isEmpty()) {
                                    su5Var5.i((((List) u95Var9.getValue()).size() + (su5Var5.h() - 1)) % ((List) u95Var9.getValue()).size());
                                    kab.d(ib1Var5, null, null, new v74(w74Var6, ((Number) ((es5) ((List) u95Var9.getValue()).get(su5Var5.h())).a).intValue(), b81Var, i9), 3);
                                }
                                break;
                            default:
                                int i11 = TextViewer.s0;
                                if (list7 == null) {
                                    WebView webViewT3 = textViewer4.T();
                                    if (webViewT3 != null) {
                                        webViewT3.findNext(true);
                                    }
                                } else if (!((List) u95Var9.getValue()).isEmpty()) {
                                    su5Var5.i((su5Var5.h() + 1) % ((List) u95Var9.getValue()).size());
                                    kab.d(ib1Var5, null, null, new v74(w74Var6, ((Number) ((es5) ((List) u95Var9.getValue()).get(su5Var5.h())).a).intValue(), b81Var, 4), 3);
                                }
                                break;
                        }
                        return sa8Var;
                    }
                };
                ib1Var2 = ib1Var4;
                textViewer2 = textViewer3;
                zz2Var.g0(obj2);
            } else {
                obj2 = objL13;
                ib1Var2 = ib1Var;
                w74Var4 = w74Var3;
            }
            tx2 tx2Var3 = (tx2) obj2;
            boolean zH6 = zz2Var.h(list2) | zz2Var.h(ib1Var2) | zz2Var.f(w74Var4) | zz2Var.h(textViewer2);
            Object objL14 = zz2Var.L();
            if (zH6 || objL14 == j72Var) {
                final int i8 = 1;
                final ib1 ib1Var5 = ib1Var2;
                final TextViewer textViewer4 = textViewer2;
                tx2 tx2Var4 = new tx2() { // from class: gy7
                    @Override // defpackage.tx2
                    public final Object d() {
                        int i82 = i8;
                        sa8 sa8Var = sa8.a;
                        w74 w74Var6 = w74Var4;
                        su5 su5Var5 = su5Var2;
                        u95 u95Var9 = u95Var2;
                        TextViewer textViewer42 = textViewer4;
                        ib1 ib1Var52 = ib1Var5;
                        List list7 = list2;
                        b81 b81Var = null;
                        int i9 = 3;
                        switch (i82) {
                            case 0:
                                int i10 = TextViewer.s0;
                                if (list7 == null) {
                                    WebView webViewT2 = textViewer42.T();
                                    if (webViewT2 != null) {
                                        webViewT2.findNext(false);
                                    }
                                } else if (!((List) u95Var9.getValue()).isEmpty()) {
                                    su5Var5.i((((List) u95Var9.getValue()).size() + (su5Var5.h() - 1)) % ((List) u95Var9.getValue()).size());
                                    kab.d(ib1Var52, null, null, new v74(w74Var6, ((Number) ((es5) ((List) u95Var9.getValue()).get(su5Var5.h())).a).intValue(), b81Var, i9), 3);
                                }
                                break;
                            default:
                                int i11 = TextViewer.s0;
                                if (list7 == null) {
                                    WebView webViewT3 = textViewer42.T();
                                    if (webViewT3 != null) {
                                        webViewT3.findNext(true);
                                    }
                                } else if (!((List) u95Var9.getValue()).isEmpty()) {
                                    su5Var5.i((su5Var5.h() + 1) % ((List) u95Var9.getValue()).size());
                                    kab.d(ib1Var52, null, null, new v74(w74Var6, ((Number) ((es5) ((List) u95Var9.getValue()).get(su5Var5.h())).a).intValue(), b81Var, 4), 3);
                                }
                                break;
                        }
                        return sa8Var;
                    }
                };
                ib1Var2 = ib1Var5;
                textViewer2 = textViewer4;
                zz2Var.g0(tx2Var4);
                objL14 = tx2Var4;
            }
            tx2 tx2Var5 = (tx2) objL14;
            Object obj6 = (Uri) textViewer2.n0.getValue();
            if (obj6 == null || textViewer2.i0) {
                obj6 = th3;
            }
            if (obj6 == null) {
                zz2Var.X(-2096938954);
                zz2Var.p(false);
                z = false;
                obj3 = th3;
            } else {
                zz2Var.X(-2096938953);
                boolean zH7 = zz2Var.h(textViewer2) | zz2Var.h(obj6);
                Object objL15 = zz2Var.L();
                if (zH7 || objL15 == j72Var) {
                    objL15 = new eg5(textViewer2, 20, obj6);
                    zz2Var.g0(objL15);
                }
                z = false;
                zz2Var.p(false);
                obj3 = (tx2) objL15;
            }
            boolean zH8 = zz2Var.h(textViewer2) | zz2Var.h(list2) | zz2Var.h(ib1Var2) | zz2Var.f(w74Var4);
            Object objL16 = zz2Var.L();
            if (zH8 || objL16 == j72Var) {
                w74 w74Var6 = w74Var4;
                u95Var3 = u95Var4;
                ay7 ay7Var = new ay7(list2, textViewer2, ib1Var2, w74Var6, u95Var3, 0);
                w74Var4 = w74Var6;
                zz2Var.g0(ay7Var);
                objL16 = ay7Var;
            } else {
                u95Var3 = u95Var4;
            }
            boolean z5 = z;
            ScaleGestureDetector scaleGestureDetector2 = scaleGestureDetector;
            i3 = i;
            ead.b(title, u95Var6, tx2Var, fw7Var3, ix7Var, wx2Var, tx2Var2, tx2Var3, tx2Var5, obj3, (wx2) objL16, zz2Var, 0);
            zz2 zz2Var3 = zz2Var;
            w15 w15Var = uc4.a;
            ((r84) zz2Var3.j(s84.a)).a.getClass();
            ga0.a(hm3.d(a87.e(w15Var, 0.75f), pwc.k(uc4.e(zz2Var3).p, ((gs0) zz2Var3.j(o01.a)).a, 0.2f), sfc.a), zz2Var3, z5 ? 1 : 0);
            if (list2 != null) {
                zz2Var3.X(-2094772704);
                w15 w15Var2 = uc4.b;
                w15 w15VarE = !((Boolean) u95Var3.getValue()).booleanValue() ? znc.e(w15Var2, vq6VarC, z5) : w15Var2;
                w15Var2.getClass();
                scaleGestureDetector2.getClass();
                w15 w15VarB = lm7.b(w15Var2, scaleGestureDetector2, new ue(5, scaleGestureDetector2));
                h1 h1Var = new h1(this, w15VarE, w74Var4, list6, list2, u95Var3);
                textViewer = this;
                j1d.a(w15VarB, null, 0L, 0L, 0.0f, null, null, jxc.g(828802147, h1Var, zz2Var3), zz2Var, 12582912, 126);
                zz2Var.p(z5);
                i4 = 5;
                zz2Var2 = zz2Var;
                z2 = true;
            } else {
                textViewer = this;
                zz2Var3.X(-2092075704);
                String str5 = (String) textViewer.o0.getValue();
                if (str5 == null) {
                    zz2Var3.X(-2092071458);
                    zz2Var3.p(z5);
                    obj4 = th3;
                } else {
                    zz2Var3.X(-2092071457);
                    mc4.a(str5, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, false, zz2Var3, 0, 0, 262142);
                    zz2Var3 = zz2Var3;
                    zz2Var3.p(z5);
                    obj4 = sa8.a;
                }
                if (obj4 == null) {
                    zz2Var3.X(-2092000746);
                    WebView webViewT2 = textViewer.T();
                    if (webViewT2 == null) {
                        zz2Var3.X(-2092000747);
                        zz2Var3.p(z5);
                        i4 = 5;
                        zz2Var2 = zz2Var3;
                        z2 = true;
                        z3 = z5 ? 1 : 0;
                    } else {
                        zz2Var3.X(-2092000746);
                        boolean zH9 = zz2Var3.h(webViewT2);
                        Object objL17 = zz2Var3.L();
                        if (zH9 || objL17 == j72Var) {
                            z2 = true;
                            objL17 = new a41(webViewT2, 1);
                            zz2Var3.g0(objL17);
                        } else {
                            z2 = true;
                        }
                        w15 w15Var3 = uc4.b;
                        zz2Var2 = zz2Var3;
                        i4 = 5;
                        z3 = z5 ? 1 : 0;
                        pc1.b((wx2) objL17, w15Var3, null, zz2Var2, 0, 4);
                        zz2Var2.p(z3);
                    }
                    zz2Var2.p(z3);
                } else {
                    i4 = 5;
                    zz2Var2 = zz2Var3;
                    z2 = true;
                    z3 = z5 ? 1 : 0;
                    zz2Var2.X(-1037317638);
                    zz2Var2.p(z3);
                }
                zz2Var2.p(z3);
            }
            zz2Var2.p(z2);
        } else {
            i3 = i;
            textViewer = textViewer2;
            zz2Var2 = zz2Var;
            i4 = 5;
            zz2Var2.R();
        }
        kc6 kc6VarR = zz2Var2.r();
        if (kc6VarR != null) {
            kc6VarR.d = new w36(textViewer, qq5Var, i3, i4);
        }
    }
}
