package com.lonelycatgames.Xplore.FileSystem.wifi;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import androidx.core.graphics.drawable.IconCompat;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.Browser;
import com.lonelycatgames.Xplore.FileSystem.wifi.WifiShareServer;
import com.lonelycatgames.Xplore.R;
import defpackage.c4;
import defpackage.cn0;
import defpackage.d60;
import defpackage.e;
import defpackage.e27;
import defpackage.e92;
import defpackage.f44;
import defpackage.fa6;
import defpackage.fh8;
import defpackage.g7d;
import defpackage.gj7;
import defpackage.gy9;
import defpackage.h70;
import defpackage.hm3;
import defpackage.i80;
import defpackage.i92;
import defpackage.il1;
import defpackage.im8;
import defpackage.iwb;
import defpackage.ja3;
import defpackage.jyc;
import defpackage.lm4;
import defpackage.mjb;
import defpackage.n84;
import defpackage.ng4;
import defpackage.p15;
import defpackage.pg4;
import defpackage.pp7;
import defpackage.q13;
import defpackage.qp9;
import defpackage.qsb;
import defpackage.ra2;
import defpackage.re8;
import defpackage.s96;
import defpackage.se5;
import defpackage.se8;
import defpackage.sp1;
import defpackage.t62;
import defpackage.tv0;
import defpackage.tx2;
import defpackage.u05;
import defpackage.ue5;
import defpackage.uh2;
import defpackage.uo4;
import defpackage.w03;
import defpackage.wf0;
import defpackage.x03;
import defpackage.xja;
import defpackage.xn8;
import defpackage.xr0;
import defpackage.yr0;
import defpackage.yu4;
import defpackage.zr5;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class WifiShareServer extends e27 {
    public static final LinkedHashMap W;
    public String M;
    public String N;
    public boolean O;
    public boolean P;
    public int Q;
    public im8 R;
    public final String S;
    public ArrayList T;
    public final pp7 U;
    public final f44 V;

    static {
        ra2 ra2Var = xn8.O;
        int iH = uo4.h(yr0.o(ra2Var, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        c4 c4Var = new c4(0, ra2Var);
        while (c4Var.hasNext()) {
            Object next = c4Var.next();
            linkedHashMap.put(((xn8) next).a, next);
        }
        W = linkedHashMap;
    }

    public WifiShareServer() {
        super("WiFi share", 3);
        this.S = "wifi";
        final int i = 0;
        this.U = new pp7(new tx2(this) { // from class: ko8
            public final /* synthetic */ WifiShareServer b;

            {
                this.b = this;
            }

            @Override // defpackage.tx2
            public final Object d() {
                int i2 = i;
                WifiShareServer wifiShareServer = this.b;
                switch (i2) {
                    case 0:
                        LinkedHashMap linkedHashMap = WifiShareServer.W;
                        return new su8(new File(wifiShareServer.getApplicationInfo().sourceDir));
                    default:
                        LinkedHashMap linkedHashMap2 = WifiShareServer.W;
                        PendingIntent pendingIntentB = wifiShareServer.b();
                        ue5 ue5Var = new ue5(wifiShareServer.a(), "WiFi");
                        Notification notification = ue5Var.B;
                        notification.icon = R.drawable.ic_stat_wifi_server;
                        ue5Var.w = -14380824;
                        ue5Var.e("X-plore " + ((Object) wifiShareServer.getText(R.string.wifi_server)));
                        ue5Var.g = th.c(wifiShareServer, ve6.a.b(Browser.class), null, 6);
                        ue5Var.f(2, true);
                        ue5Var.a(R.drawable.ic_close, wifiShareServer.getText(R.string.stop), pendingIntentB);
                        notification.deleteIntent = pendingIntentB;
                        ue5Var.h(-16776961, 0, 0);
                        return ue5Var;
                }
            }
        });
        final int i2 = 1;
        tx2 tx2Var = new tx2(this) { // from class: ko8
            public final /* synthetic */ WifiShareServer b;

            {
                this.b = this;
            }

            @Override // defpackage.tx2
            public final Object d() {
                int i22 = i2;
                WifiShareServer wifiShareServer = this.b;
                switch (i22) {
                    case 0:
                        LinkedHashMap linkedHashMap = WifiShareServer.W;
                        return new su8(new File(wifiShareServer.getApplicationInfo().sourceDir));
                    default:
                        LinkedHashMap linkedHashMap2 = WifiShareServer.W;
                        PendingIntent pendingIntentB = wifiShareServer.b();
                        ue5 ue5Var = new ue5(wifiShareServer.a(), "WiFi");
                        Notification notification = ue5Var.B;
                        notification.icon = R.drawable.ic_stat_wifi_server;
                        ue5Var.w = -14380824;
                        ue5Var.e("X-plore " + ((Object) wifiShareServer.getText(R.string.wifi_server)));
                        ue5Var.g = th.c(wifiShareServer, ve6.a.b(Browser.class), null, 6);
                        ue5Var.f(2, true);
                        ue5Var.a(R.drawable.ic_close, wifiShareServer.getText(R.string.stop), pendingIntentB);
                        notification.deleteIntent = pendingIntentB;
                        ue5Var.h(-16776961, 0, 0);
                        return ue5Var;
                }
            }
        };
        String[] strArr = se8.a;
        this.V = jyc.b(n84.b, tx2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x0655, code lost:
    
        r2 = new defpackage.x03[]{r10, r6}[1].b;
        r4 = r3 - r2.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0663, code lost:
    
        if (r6 >= r4) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0665, code lost:
    
        r11[r37 + r6] = 0;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x066d, code lost:
    
        java.lang.System.arraycopy(r2, 0, r11, r37 + r4, r2.length);
        r2 = new byte[r3];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0677, code lost:
    
        if (r4 >= r3) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0679, code lost:
    
        r2[r4] = (byte) r11[r0 + r4];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0683, code lost:
    
        r5.add(new defpackage.i80(r1, r2));
        r15 = java.lang.Math.max(r15, r0);
        r14 = java.lang.Math.max(r14, r3);
        r12 = r12 + r0[0];
        r11 = r31 + 1;
        r7 = r27;
        r1 = r30;
        r4 = r32;
        r13 = r33;
        r3 = r34;
        r6 = r35;
        r8 = r36;
        r2 = r39;
        r9 = r40;
        r10 = r41;
        r19 = 2;
        r20 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0337 A[LOOP:2: B:147:0x0335->B:148:0x0337, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    @Override // defpackage.e27
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Notification c() throws q13 {
        ue5 ue5Var;
        int i;
        boolean zContainsKey;
        Charset charsetForName;
        p15 p15Var;
        int i2;
        fh8 fh8VarA;
        h70 h70Var;
        fh8 fh8Var;
        cn0 cn0Var;
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int i7;
        int i8;
        byte[][] bArr;
        int i9;
        int i10;
        int i11;
        char c;
        x03 x03Var;
        int i12;
        int[] iArr;
        x03 x03Var2;
        x03 x03Var3;
        fh8 fh8Var2;
        int i13;
        int i14;
        char c2;
        x03 x03Var4;
        ue5 ue5Var2 = (ue5) this.V.getValue();
        ue5Var2.d(g());
        if (this.K != null) {
            String strG = g();
            int i15 = Build.VERSION.SDK_INT >= 31 ? 160 : 120;
            e92 e92Var = e92.c;
            Map mapSingletonMap = Collections.singletonMap(e92Var, 0);
            mapSingletonMap.getClass();
            if (strG.isEmpty()) {
                e.k("Found empty contents");
                return null;
            }
            e92 e92Var2 = e92.a;
            int i16 = 4;
            if (mapSingletonMap.containsKey(e92Var2)) {
                String string = mapSingletonMap.get(e92Var2).toString();
                if (string != null) {
                    if (!string.equals("L")) {
                        if (string.equals("M")) {
                            i = 2;
                        } else if (string.equals("Q")) {
                            i = 3;
                        } else if (string.equals("H")) {
                            i = 4;
                        } else {
                            e.k("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(string));
                        }
                    }
                    if (mapSingletonMap.containsKey(e92Var)) {
                    }
                    Charset charset = i92.b;
                    e92 e92Var3 = e92.J;
                    if (mapSingletonMap.containsKey(e92Var3)) {
                        e92 e92Var4 = e92.I;
                        if (mapSingletonMap.containsKey(e92Var4)) {
                            e92 e92Var5 = e92.b;
                            zContainsKey = mapSingletonMap.containsKey(e92Var5);
                            if (!zContainsKey) {
                            }
                        }
                    }
                } else {
                    e.f("Name is null");
                }
                i = 0;
                if (mapSingletonMap.containsKey(e92Var)) {
                }
                Charset charset2 = i92.b;
                e92 e92Var32 = e92.J;
                if (mapSingletonMap.containsKey(e92Var32)) {
                }
            } else {
                i = 1;
                int i17 = mapSingletonMap.containsKey(e92Var) ? Integer.parseInt(mapSingletonMap.get(e92Var).toString()) : 4;
                Charset charset22 = i92.b;
                e92 e92Var322 = e92.J;
                boolean z = mapSingletonMap.containsKey(e92Var322) && Boolean.parseBoolean(mapSingletonMap.get(e92Var322).toString());
                e92 e92Var42 = e92.I;
                boolean z2 = !mapSingletonMap.containsKey(e92Var42) && Boolean.parseBoolean(mapSingletonMap.get(e92Var42).toString());
                e92 e92Var52 = e92.b;
                zContainsKey = mapSingletonMap.containsKey(e92Var52);
                if (!zContainsKey) {
                    try {
                        charsetForName = Charset.forName(mapSingletonMap.get(e92Var52).toString());
                    } catch (UnsupportedCharsetException unused) {
                        charsetForName = charset22;
                    }
                    int i18 = 2;
                    int i19 = 1;
                    if (z2) {
                        Charset charset3 = gj7.b;
                        p15 p15Var2 = p15.BYTE;
                        if (charset3 != null && charset3.equals(charsetForName) && i92.b(strG)) {
                            p15Var = p15.KANJI;
                        } else {
                            boolean z3 = false;
                            boolean z4 = false;
                            int i20 = 0;
                            while (true) {
                                if (i20 < strG.length()) {
                                    char cCharAt = strG.charAt(i20);
                                    if (cCharAt < '0' || cCharAt > '9') {
                                        if ((cCharAt < '`' ? i92.a[cCharAt] : -1) == -1) {
                                            break;
                                        }
                                        z3 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    i20++;
                                } else if (z3) {
                                    p15Var = p15.ALPHANUMERIC;
                                } else if (z4) {
                                    p15Var = p15.NUMERIC;
                                }
                            }
                            p15Var = p15Var2;
                        }
                        h70 h70Var2 = new h70();
                        if (p15Var == p15Var2 && zContainsKey && (cn0Var = (cn0) cn0.d.get(charsetForName.name())) != null) {
                            i2 = 4;
                            h70Var2.b(7, 4);
                            h70Var2.b(cn0Var.a[0], 8);
                        } else {
                            i2 = 4;
                        }
                        if (z) {
                            h70Var2.b(5, i2);
                        }
                        h70Var2.b(p15Var.b, i2);
                        h70 h70Var3 = new h70();
                        i92.a(strG, p15Var, h70Var3, charsetForName);
                        e92 e92Var6 = e92.d;
                        if (!mapSingletonMap.containsKey(e92Var6)) {
                            int iA = p15Var.a(fh8.a(1)) + h70Var2.b + h70Var3.b;
                            int i21 = 1;
                            while (i21 <= 40) {
                                fh8 fh8VarA2 = fh8.a(i21);
                                if (i92.c(iA, fh8VarA2, i)) {
                                    int iA2 = p15Var.a(fh8VarA2) + h70Var2.b + h70Var3.b;
                                    int i22 = 1;
                                    while (i22 <= 40) {
                                        fh8VarA = fh8.a(i22);
                                        if (!i92.c(iA2, fh8VarA, i)) {
                                            i22++;
                                            i15 = i15;
                                            i17 = i17;
                                            i = i;
                                        }
                                    }
                                    throw new q13("Data too big", 7);
                                }
                                i21++;
                                i15 = i15;
                                i17 = i17;
                                i = i;
                            }
                            throw new q13("Data too big", 7);
                        }
                        fh8 fh8VarA3 = fh8.a(Integer.parseInt(mapSingletonMap.get(e92Var6).toString()));
                        if (!i92.c(p15Var.a(fh8VarA3) + h70Var2.b + h70Var3.b, fh8VarA3, i)) {
                            throw new q13("Data too big for requested version", 7);
                        }
                        fh8VarA = fh8VarA3;
                        h70 h70Var4 = new h70();
                        int i23 = h70Var2.b;
                        h70Var4.c(i23);
                        for (int i24 = 0; i24 < i23; i24++) {
                            h70Var4.a(h70Var2.d(i24));
                        }
                        int iE = p15Var == p15Var2 ? h70Var3.e() : strG.length();
                        int iA3 = p15Var.a(fh8VarA);
                        int i25 = 1 << iA3;
                        if (iE >= i25) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(iE);
                            sb.append(" is bigger than ");
                            sb.append(i25 - 1);
                            throw new q13(sb.toString(), 7);
                        }
                        h70Var4.b(iE, iA3);
                        int i26 = h70Var3.b;
                        h70Var4.c(h70Var4.b + i26);
                        for (int i27 = 0; i27 < i26; i27++) {
                            h70Var4.a(h70Var3.d(i27));
                        }
                        h70Var = h70Var4;
                        fh8Var = fh8VarA;
                    } else {
                        if (charsetForName.equals(charset22)) {
                            charsetForName = null;
                        }
                        wf0 wf0Var = new wf0();
                        wf0Var.c = strG;
                        wf0Var.b = z;
                        wf0Var.d = new t62(strG, charsetForName);
                        wf0Var.a = i;
                        int i28 = wf0Var.a;
                        fh8[] fh8VarArr = {wf0.m(1), wf0.m(2), wf0.m(3)};
                        mjb[] mjbVarArr = {wf0Var.l(fh8VarArr[0]), wf0Var.l(fh8VarArr[1]), wf0Var.l(fh8VarArr[2])};
                        int i29 = 0;
                        int i30 = Integer.MAX_VALUE;
                        int i31 = -1;
                        for (int i32 = 3; i29 < i32; i32 = 3) {
                            mjb mjbVar = mjbVarArr[i29];
                            int iR = mjbVar.r((fh8) mjbVar.c);
                            if (i92.c(iR, fh8VarArr[i29], i28) && iR < i30) {
                                i31 = i29;
                                i30 = iR;
                            }
                            i29++;
                        }
                        if (i31 < 0) {
                            throw new q13("Data too big for any version", 7);
                        }
                        mjb mjbVar2 = mjbVarArr[i31];
                        h70Var = new h70();
                        for (u05 u05Var : (ArrayList) mjbVar2.b) {
                            int i33 = u05Var.c;
                            mjb mjbVar3 = u05Var.e;
                            wf0 wf0Var2 = (wf0) mjbVar3.d;
                            p15 p15Var3 = u05Var.a;
                            h70Var.b(p15Var3.b, i16);
                            int i34 = u05Var.d;
                            if (i34 > 0) {
                                h70Var.b(u05Var.a(), p15Var3.a((fh8) mjbVar3.c));
                            }
                            if (p15Var3 == p15.ECI) {
                                h70Var.b(((cn0) cn0.d.get(((t62) wf0Var2.d).a[i33].charset().name())).a[0], 8);
                            } else if (i34 > 0) {
                                String str = (String) wf0Var2.c;
                                int i35 = u05Var.b;
                                i92.a(str.substring(i35, i34 + i35), p15Var3, h70Var, ((t62) wf0Var2.d).a[i33].charset());
                            }
                            i16 = 4;
                        }
                        fh8Var = (fh8) mjbVar2.c;
                    }
                    xja xjaVar = fh8Var.b[yu4.z(i)];
                    int i36 = fh8Var.c;
                    int i37 = xjaVar.b;
                    fa6[] fa6VarArr = (fa6[]) xjaVar.c;
                    int i38 = 0;
                    for (fa6 fa6Var : fa6VarArr) {
                        i38 += fa6Var.b;
                    }
                    int i39 = i36 - (i38 * i37);
                    i3 = i39 * 8;
                    if (h70Var.b <= i3) {
                        throw new q13("data bits cannot fit in the QR Code" + h70Var.b + " > " + i3, 7);
                    }
                    for (int i40 = 0; i40 < 4 && h70Var.b < i3; i40++) {
                        h70Var.a(false);
                    }
                    boolean z5 = false;
                    int i41 = h70Var.b & 7;
                    if (i41 > 0) {
                        while (i41 < 8) {
                            h70Var.a(z5);
                            i41++;
                            z5 = false;
                        }
                    }
                    int iE2 = i39 - h70Var.e();
                    for (int i42 = 0; i42 < iE2; i42++) {
                        h70Var.b((i42 & 1) == 0 ? 236 : 17, 8);
                    }
                    if (h70Var.b != i3) {
                        throw new q13("Bits size does not equal capacity", 7);
                    }
                    int i43 = 0;
                    for (fa6 fa6Var2 : fa6VarArr) {
                        i43 += fa6Var2.b;
                    }
                    if (h70Var.e() != i39) {
                        throw new q13("Number of bits and data bytes does not match", 7);
                    }
                    ArrayList arrayList = new ArrayList(i43);
                    int i44 = 0;
                    int i45 = 0;
                    int iMax2 = 0;
                    int iMax3 = 0;
                    while (i44 < i43) {
                        int i46 = i17;
                        int i47 = i19;
                        int[] iArr2 = new int[i47];
                        int[] iArr3 = new int[i47];
                        if (i44 >= i43) {
                            throw new q13("Block ID too large", 7);
                        }
                        int i48 = i36 % i43;
                        int i49 = i43 - i48;
                        int i50 = i36 / i43;
                        int i51 = i50 + 1;
                        int i52 = i39 / i43;
                        int i53 = i52 + 1;
                        int i54 = i50 - i52;
                        ue5 ue5Var3 = ue5Var2;
                        int i55 = i51 - i53;
                        if (i54 != i55) {
                            throw new q13("EC bytes mismatch", 7);
                        }
                        if (i43 != i49 + i48) {
                            throw new q13("RS blocks mismatch", 7);
                        }
                        if (i36 != ((i53 + i55) * i48) + ((i52 + i54) * i49)) {
                            throw new q13("Total bytes mismatch", 7);
                        }
                        if (i44 < i49) {
                            c = 0;
                            iArr2[0] = i52;
                            iArr3[0] = i54;
                        } else {
                            c = 0;
                            iArr2[0] = i53;
                            iArr3[0] = i55;
                        }
                        int i56 = iArr2[c];
                        byte[] bArr2 = new byte[i56];
                        int i57 = i45 * 8;
                        int i58 = 0;
                        while (i58 < i56) {
                            int i59 = i15;
                            int i60 = i58;
                            int i61 = i43;
                            int i62 = i57;
                            int i63 = i44;
                            int i64 = 0;
                            for (int i65 = 0; i65 < 8; i65++) {
                                if (h70Var.d(i62)) {
                                    i64 = (1 << (7 - i65)) | i64;
                                }
                                i62++;
                            }
                            bArr2[i60] = (byte) i64;
                            i58 = i60 + 1;
                            i44 = i63;
                            i15 = i59;
                            i57 = i62;
                            i43 = i61;
                        }
                        int i66 = i15;
                        int i67 = i44;
                        int i68 = i43;
                        int i69 = iArr3[0];
                        int i70 = i56 + i69;
                        int[] iArr4 = new int[i70];
                        int i71 = 0;
                        while (i71 < i56) {
                            iArr4[i71] = bArr2[i71] & 255;
                            i71++;
                            i70 = i70;
                        }
                        int i72 = i70;
                        w03 w03Var = w03.g;
                        ArrayList arrayList2 = new ArrayList();
                        h70 h70Var5 = h70Var;
                        int i73 = i;
                        arrayList2.add(new x03(w03Var, new int[]{1}));
                        if (i69 == 0) {
                            e.k("No error correction bytes");
                            return null;
                        }
                        int i74 = i72 - i69;
                        if (i74 <= 0) {
                            e.k("No data bytes provided");
                            return null;
                        }
                        if (i69 >= arrayList2.size()) {
                            x03 x03Var5 = (x03) yu4.y(1, arrayList2);
                            int size = arrayList2.size();
                            while (size <= i69) {
                                int i75 = size;
                                Map map = mapSingletonMap;
                                int[] iArr5 = {1, w03Var.a[(size - 1) + w03Var.f]};
                                if (iArr5[0] == 0) {
                                    fh8Var2 = fh8Var;
                                    int i76 = i18;
                                    int i77 = 1;
                                    while (i77 < i76 && iArr5[i77] == 0) {
                                        i77++;
                                    }
                                    if (i77 == i76) {
                                        c2 = 0;
                                        iArr5 = new int[]{0};
                                        i13 = i36;
                                        i14 = i39;
                                    } else {
                                        c2 = 0;
                                        i13 = i36;
                                        int i78 = 2 - i77;
                                        i14 = i39;
                                        int[] iArr6 = new int[i78];
                                        System.arraycopy(iArr5, i77, iArr6, 0, i78);
                                        iArr5 = iArr6;
                                    }
                                } else {
                                    fh8Var2 = fh8Var;
                                    i13 = i36;
                                    i14 = i39;
                                    c2 = 0;
                                }
                                x03 x03Var6 = x03Var5;
                                w03 w03Var2 = x03Var6.a;
                                if (!w03Var2.equals(w03Var)) {
                                    e.k("GenericGFPolys do not have same GenericGF field");
                                    return null;
                                }
                                if (x03Var6.c() || iArr5[c2] == 0) {
                                    x03Var4 = w03Var2.c;
                                } else {
                                    int[] iArr7 = x03Var6.b;
                                    int length = iArr7.length;
                                    int length2 = iArr5.length;
                                    int[] iArr8 = new int[(length + length2) - 1];
                                    int[] iArr9 = iArr5;
                                    int i79 = 0;
                                    while (i79 < length) {
                                        int i80 = length;
                                        int i81 = iArr7[i79];
                                        int i82 = i79;
                                        int i83 = 0;
                                        while (i83 < length2) {
                                            int i84 = i82 + i83;
                                            int i85 = i83;
                                            iArr8[i84] = iArr8[i84] ^ w03Var2.a(i81, iArr9[i85]);
                                            i83 = i85 + 1;
                                        }
                                        i79 = i82 + 1;
                                        length = i80;
                                    }
                                    x03Var4 = new x03(w03Var2, iArr8);
                                }
                                arrayList2.add(x03Var4);
                                size = i75 + 1;
                                x03Var5 = x03Var4;
                                mapSingletonMap = map;
                                fh8Var = fh8Var2;
                                i36 = i13;
                                i39 = i14;
                                i18 = 2;
                            }
                        }
                        fh8 fh8Var3 = fh8Var;
                        Map map2 = mapSingletonMap;
                        int i86 = i36;
                        int i87 = i39;
                        x03 x03Var7 = (x03) arrayList2.get(i69);
                        int[] iArr10 = new int[i74];
                        System.arraycopy(iArr4, 0, iArr10, 0, i74);
                        if (i74 == 0) {
                            sp1.l();
                            return null;
                        }
                        if (i74 > 1 && iArr10[0] == 0) {
                            int i88 = 1;
                            while (i88 < i74 && iArr10[i88] == 0) {
                                i88++;
                            }
                            if (i88 == i74) {
                                iArr10 = new int[]{0};
                            } else {
                                int i89 = i74 - i88;
                                int[] iArr11 = new int[i89];
                                System.arraycopy(iArr10, i88, iArr11, 0, i89);
                                iArr10 = iArr11;
                            }
                        }
                        if (i69 < 0) {
                            sp1.l();
                            return null;
                        }
                        int length3 = iArr10.length;
                        int[] iArr12 = new int[length3 + i69];
                        int i90 = 0;
                        while (i90 < length3) {
                            iArr12[i90] = w03Var.a(iArr10[i90], 1);
                            i90++;
                            i74 = i74;
                        }
                        int i91 = i74;
                        x03 x03Var8 = new x03(w03Var, iArr12);
                        w03 w03Var3 = x03Var7.a;
                        int[] iArr13 = x03Var7.b;
                        boolean zEquals = w03Var.equals(w03Var3);
                        x03 x03Var9 = w03Var.c;
                        if (!zEquals) {
                            e.k("GenericGFPolys do not have same GenericGF field");
                            return null;
                        }
                        if (x03Var7.c()) {
                            e.k("Divide by 0");
                            return null;
                        }
                        if (iArr13[(iArr13.length - 1) - x03Var7.b()] == 0) {
                            throw new ArithmeticException();
                        }
                        int i92 = w03Var.a[(w03Var.d - w03Var.b[r6]) - 1];
                        x03 x03VarA = x03Var9;
                        x03 x03VarA2 = x03Var8;
                        while (true) {
                            x03 x03Var10 = x03Var9;
                            if (x03VarA2.b() < x03Var7.b() || x03VarA2.c()) {
                                break;
                            }
                            int iB = x03VarA2.b() - x03Var7.b();
                            int iA4 = w03Var.a(x03VarA2.b[(r9.length - 1) - x03VarA2.b()], i92);
                            w03 w03Var4 = x03Var7.a;
                            if (iB < 0) {
                                sp1.l();
                                return null;
                            }
                            if (iA4 == 0) {
                                x03Var2 = w03Var4.c;
                                x03Var = x03Var7;
                                i12 = i92;
                                iArr = iArr13;
                            } else {
                                x03Var = x03Var7;
                                int length4 = iArr13.length;
                                i12 = i92;
                                int[] iArr14 = new int[length4 + iB];
                                iArr = iArr13;
                                int i93 = 0;
                                while (i93 < length4) {
                                    iArr14[i93] = w03Var4.a(iArr[i93], iA4);
                                    i93++;
                                    length4 = length4;
                                }
                                x03Var2 = new x03(w03Var4, iArr14);
                            }
                            if (iB < 0) {
                                sp1.l();
                                return null;
                            }
                            if (iA4 == 0) {
                                x03Var3 = x03Var10;
                            } else {
                                int[] iArr15 = new int[iB + 1];
                                iArr15[0] = iA4;
                                x03Var3 = new x03(w03Var, iArr15);
                            }
                            x03VarA = x03VarA.a(x03Var3);
                            x03VarA2 = x03VarA2.a(x03Var2);
                            x03Var9 = x03Var10;
                            x03Var7 = x03Var;
                            i92 = i12;
                            iArr13 = iArr;
                        }
                    }
                    ue5 ue5Var4 = ue5Var2;
                    fh8 fh8Var4 = fh8Var;
                    int i94 = i15;
                    Map map3 = mapSingletonMap;
                    int i95 = i17;
                    int i96 = i;
                    int i97 = i36;
                    if (i39 != i45) {
                        throw new q13("Data bytes does not match offset", 7);
                    }
                    h70 h70Var6 = new h70();
                    for (int i98 = 0; i98 < iMax3; i98++) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            byte[] bArr3 = ((i80) it.next()).a;
                            if (i98 < bArr3.length) {
                                h70Var6.b(bArr3[i98], 8);
                            }
                        }
                    }
                    for (int i99 = 0; i99 < iMax2; i99++) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            byte[] bArr4 = ((i80) it2.next()).b;
                            if (i99 < bArr4.length) {
                                h70Var6.b(bArr4[i99], 8);
                            }
                        }
                    }
                    if (i97 != h70Var6.e()) {
                        StringBuilder sbP = tv0.p(i97, "Interleaving error: ", " and ");
                        sbP.append(h70Var6.e());
                        sbP.append(" differ.");
                        throw new q13(sbP.toString(), 7);
                    }
                    int i100 = (fh8Var4.a * 4) + 17;
                    lm4 lm4Var = new lm4(i100, i100, 3, (byte) 0);
                    int i101 = lm4Var.c;
                    int i102 = lm4Var.b;
                    e92 e92Var7 = e92.e;
                    if (map3.containsKey(e92Var7)) {
                        i5 = Integer.parseInt(map3.get(e92Var7).toString());
                        i4 = 8;
                        if (i5 < 0 || i5 >= 8) {
                        }
                        if (i5 == -1) {
                            i5 = -1;
                            int i103 = Integer.MAX_VALUE;
                            int i104 = 0;
                            while (i104 < i4) {
                                int i105 = i96;
                                iwb.b(h70Var6, i105, fh8Var4, i104, lm4Var);
                                int iA5 = g7d.a(lm4Var, false) + g7d.a(lm4Var, true);
                                byte[][] bArr5 = (byte[][]) lm4Var.d;
                                int i106 = 0;
                                for (int i107 = 0; i107 < i101 - 1; i107++) {
                                    byte[] bArr6 = bArr5[i107];
                                    int i108 = 0;
                                    while (i108 < i102 - 1) {
                                        byte b = bArr6[i108];
                                        int i109 = i108 + 1;
                                        int i110 = i108;
                                        if (b == bArr6[i109]) {
                                            byte[] bArr7 = bArr5[i107 + 1];
                                            if (b == bArr7[i110] && b == bArr7[i109]) {
                                                i106++;
                                            }
                                        }
                                        i108 = i109;
                                    }
                                }
                                int i111 = (i106 * 3) + iA5;
                                int i112 = 0;
                                for (int i113 = 0; i113 < i101; i113++) {
                                    int i114 = 0;
                                    while (i114 < i102) {
                                        byte[] bArr8 = bArr5[i113];
                                        int i115 = i114 + 6;
                                        int i116 = i112;
                                        if (i115 < i102) {
                                            i7 = i111;
                                            byte b2 = 1;
                                            if (bArr8[i114] == 1 && bArr8[i114 + 1] == 0 && bArr8[i114 + 2] == 1 && bArr8[i114 + 3] == 1 && bArr8[i114 + 4] == 1 && bArr8[i114 + 5] == 0 && bArr8[i115] == 1) {
                                                int i117 = i114 - 4;
                                                if (i117 < 0 || bArr8.length < i114) {
                                                    i10 = i114 + 7;
                                                    i11 = i114 + 11;
                                                    if (i10 >= 0 && bArr8.length >= i11) {
                                                        while (i10 < i11) {
                                                            int i118 = i10;
                                                            if (bArr8[i10] != 1) {
                                                                i10 = i118 + 1;
                                                            }
                                                        }
                                                        i112 = i116 + 1;
                                                    }
                                                } else {
                                                    while (i117 < i114) {
                                                        if (bArr8[i117] == b2) {
                                                            i10 = i114 + 7;
                                                            i11 = i114 + 11;
                                                            if (i10 >= 0) {
                                                                while (i10 < i11) {
                                                                }
                                                                i112 = i116 + 1;
                                                            }
                                                        } else {
                                                            i117++;
                                                            b2 = 1;
                                                        }
                                                    }
                                                    i112 = i116 + 1;
                                                }
                                            }
                                            i8 = i113 + 6;
                                            if (i8 >= i101) {
                                                byte b3 = 1;
                                                if (bArr5[i113][i114] == 1 && bArr5[i113 + 1][i114] == 0 && bArr5[i113 + 2][i114] == 1 && bArr5[i113 + 3][i114] == 1 && bArr5[i113 + 4][i114] == 1 && bArr5[i113 + 5][i114] == 0 && bArr5[i8][i114] == 1) {
                                                    int i119 = i113 - 4;
                                                    if (i119 < 0 || bArr5.length < i113) {
                                                        i9 = i113 + 7;
                                                        int i120 = i113 + 11;
                                                        if (i9 < 0 && bArr5.length >= i120) {
                                                            while (i9 < i120) {
                                                                bArr = bArr5;
                                                                if (bArr5[i9][i114] == 1) {
                                                                    break;
                                                                }
                                                                i9++;
                                                                bArr5 = bArr;
                                                            }
                                                            bArr = bArr5;
                                                            i112++;
                                                        }
                                                    } else {
                                                        while (i119 < i113) {
                                                            if (bArr5[i119][i114] == b3) {
                                                                i9 = i113 + 7;
                                                                int i1202 = i113 + 11;
                                                                if (i9 < 0) {
                                                                    bArr = bArr5;
                                                                }
                                                            } else {
                                                                i119++;
                                                                b3 = 1;
                                                            }
                                                        }
                                                        bArr = bArr5;
                                                        i112++;
                                                    }
                                                } else {
                                                    bArr = bArr5;
                                                }
                                            }
                                            i114++;
                                            i111 = i7;
                                            bArr5 = bArr;
                                        } else {
                                            i7 = i111;
                                        }
                                        i112 = i116;
                                        i8 = i113 + 6;
                                        if (i8 >= i101) {
                                        }
                                        i114++;
                                        i111 = i7;
                                        bArr5 = bArr;
                                    }
                                }
                                byte[][] bArr9 = bArr5;
                                int i121 = (i112 * 40) + i111;
                                int i122 = 0;
                                for (int i123 = 0; i123 < i101; i123++) {
                                    byte[] bArr10 = bArr9[i123];
                                    for (int i124 = 0; i124 < i102; i124++) {
                                        if (bArr10[i124] == 1) {
                                            i122++;
                                        }
                                    }
                                }
                                int i125 = i101 * i102;
                                int iAbs = (((Math.abs((i122 * 2) - i125) * 10) / i125) * 10) + i121;
                                if (iAbs < i103) {
                                    i103 = iAbs;
                                    i5 = i104;
                                }
                                i104++;
                                i96 = i105;
                                i4 = 8;
                            }
                        }
                        iwb.b(h70Var6, i96, fh8Var4, i5, lm4Var);
                        int i126 = i95 * 2;
                        int i127 = i102 + i126;
                        int i128 = i126 + i101;
                        int i129 = 320;
                        iMax = Math.max(320, i127);
                        int iMax4 = Math.max(i94, i128);
                        int iMin = Math.min(iMax / i127, iMax4 / i128);
                        int i130 = (iMax - (i102 * iMin)) / 2;
                        int i131 = (iMax4 - (i101 * iMin)) / 2;
                        if (iMax >= 1 || iMax4 < 1) {
                            e.k("Both dimensions must be greater than 0");
                            return null;
                        }
                        int i132 = (iMax + 31) / 32;
                        int[] iArr16 = new int[i132 * iMax4];
                        int i133 = 0;
                        while (i133 < i101) {
                            int i134 = i130;
                            int i135 = 0;
                            while (i135 < i102) {
                                int i136 = i129;
                                if (lm4Var.x(i135, i133) != 1) {
                                    i6 = iMin;
                                } else {
                                    if (i131 < 0 || i134 < 0) {
                                        e.k("Left and top must be nonnegative");
                                        return null;
                                    }
                                    if (iMin < 1 || iMin < 1) {
                                        e.k("Height and width must be at least 1");
                                        return null;
                                    }
                                    int i137 = i134 + iMin;
                                    int i138 = i131 + iMin;
                                    if (i138 > iMax4 || i137 > iMax) {
                                        e.k("The region must fit inside the matrix");
                                        return null;
                                    }
                                    i6 = iMin;
                                    int i139 = i131;
                                    while (i139 < i138) {
                                        int i140 = i139 * i132;
                                        int i141 = i139;
                                        for (int i142 = i134; i142 < i137; i142++) {
                                            int i143 = (i142 / 32) + i140;
                                            iArr16[i143] = iArr16[i143] | (1 << (i142 & 31));
                                        }
                                        i139 = i141 + 1;
                                    }
                                }
                                i135++;
                                i134 += i6;
                                i129 = i136;
                                iMin = i6;
                            }
                            i133++;
                            i131 += iMin;
                        }
                        int i144 = i129;
                        int i145 = i144 * i94;
                        int[] iArr17 = new int[i145];
                        for (int i146 = 0; i146 < i145; i146++) {
                            int i147 = i146 % 320;
                            iArr17[i146] = ((iArr16[(i147 / 32) + ((i146 / 320) * i132)] >>> (i147 & 31)) & 1) != 0 ? 0 : -1;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr17, i144, i94, Bitmap.Config.RGB_565);
                        bitmapCreateBitmap.getClass();
                        se5 se5Var = new se5(9, false);
                        se5Var.c = IconCompat.b(bitmapCreateBitmap);
                        ue5Var = ue5Var4;
                        ue5Var.j(se5Var);
                    } else {
                        i4 = 8;
                    }
                    i5 = -1;
                    if (i5 == -1) {
                    }
                    iwb.b(h70Var6, i96, fh8Var4, i5, lm4Var);
                    int i1262 = i95 * 2;
                    int i1272 = i102 + i1262;
                    int i1282 = i1262 + i101;
                    int i1292 = 320;
                    iMax = Math.max(320, i1272);
                    int iMax42 = Math.max(i94, i1282);
                    int iMin2 = Math.min(iMax / i1272, iMax42 / i1282);
                    int i1302 = (iMax - (i102 * iMin2)) / 2;
                    int i1312 = (iMax42 - (i101 * iMin2)) / 2;
                    if (iMax >= 1) {
                    }
                    e.k("Both dimensions must be greater than 0");
                    return null;
                }
                charsetForName = charset22;
                int i182 = 2;
                int i192 = 1;
                if (z2) {
                }
                xja xjaVar2 = fh8Var.b[yu4.z(i)];
                int i362 = fh8Var.c;
                int i372 = xjaVar2.b;
                fa6[] fa6VarArr2 = (fa6[]) xjaVar2.c;
                int i382 = 0;
                while (i < r11) {
                }
                int i392 = i362 - (i382 * i372);
                i3 = i392 * 8;
                if (h70Var.b <= i3) {
                }
            }
        } else {
            ue5Var = ue5Var2;
        }
        if (this.T == null) {
            ue5Var.o = ue5.c(this.J);
        }
        Notification notificationB = ue5Var.b();
        notificationB.getClass();
        return notificationB;
    }

    @Override // defpackage.e27
    public final void e() {
        a().u0(new Object[0], 2);
        f();
    }

    public final String g() {
        s96 s96Var = this.K;
        if (s96Var == null) {
            return "No WiFi IP address";
        }
        int i = s96Var.a;
        StringBuilder sb = new StringBuilder();
        sb.append((i >> 24) & 255);
        sb.append(".");
        sb.append((i >> 16) & 255);
        sb.append(".");
        sb.append((i >> 8) & 255);
        return "http://" + yu4.i(i & 255, ".", sb) + ":" + this.Q;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, Uri uri, boolean z, boolean z2, InputStream inputStream, qsb qsbVar) {
        Object objB;
        xn8 xn8Var = (xn8) W.get(str);
        if (xn8Var != null) {
            if (z && !str2.equals("GET")) {
                throw new ja3(403, "Forbidden", "Read-only access");
            }
            switch (str2.hashCode()) {
                case 70454:
                    if (str2.equals("GET")) {
                        objB = xn8Var.b(this, uri, qsbVar);
                        if (objB != null) {
                            if (objB instanceof JSONObject) {
                                if (z) {
                                    ((JSONObject) objB).put("read_only", true);
                                }
                                if (z2) {
                                    ((JSONObject) objB).put("hasDon", true);
                                }
                            }
                            return objB;
                        }
                    }
                    sp1.f("Unsupported method: ".concat(str2));
                    return null;
                case 79599:
                    if (str2.equals("PUT")) {
                        objB = xn8Var.d(a(), uri);
                        if (objB != null) {
                        }
                    }
                    sp1.f("Unsupported method: ".concat(str2));
                    return null;
                case 2461856:
                    if (str2.equals("POST")) {
                        App appA = a();
                        if (inputStream == null) {
                            sp1.f("Empty post data");
                            return null;
                        }
                        objB = xn8Var.c(appA, uri, inputStream, qsbVar);
                        if (objB != null) {
                        }
                    }
                    sp1.f("Unsupported method: ".concat(str2));
                    return null;
                case 2012838315:
                    if (str2.equals("DELETE")) {
                        objB = xn8Var.a(a(), uri);
                        if (objB != null) {
                        }
                    }
                    sp1.f("Unsupported method: ".concat(str2));
                    return null;
                default:
                    sp1.f("Unsupported method: ".concat(str2));
                    return null;
            }
        }
        sp1.f(tv0.k("Invalid command: ", str));
        return null;
    }

    @Override // defpackage.jp7, android.app.Service
    public final void onCreate() {
        super.onCreate();
        long j = a().b0;
        String[] strArr = se8.a;
        String hexString = Long.toHexString(j);
        hexString.getClass();
        this.M = hexString;
        il1 il1VarL = a().l();
        String[] strArr2 = il1.d;
        this.O = il1VarL.h("wifi_share_read_only", false);
        d60 d60Var = d60.a;
        this.P = !d60.k(zr5.c);
        String str = null;
        String strG = il1VarL.g("wifi_share_password", null);
        if (strG != null && strG.length() > 0) {
            str = strG;
        }
        if (str != null) {
            this.N = gy9.f(str);
        }
        this.Q = (int) il1VarL.i("wifi_share_port", 1111L);
        f();
    }

    @Override // defpackage.e27, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        im8 im8Var = this.R;
        if (im8Var != null) {
            String[] strArr = se8.a;
            try {
                re8.t(im8Var);
            } catch (Exception unused) {
            }
        }
        this.R = null;
        a().u0(new Object[]{this}, 1);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        if (hm3.b(intent != null ? intent.getAction() : null, "cancel")) {
            stopSelf();
            return 2;
        }
        if (this.R == null) {
            try {
                d();
                if (intent != null) {
                    String[] strArr = (String[]) (Build.VERSION.SDK_INT >= 33 ? intent.getSerializableExtra("files", String[].class) : (String[]) intent.getSerializableExtra("files"));
                    if (strArr != null) {
                        ArrayList arrayList = new ArrayList(strArr.length);
                        for (String str2 : strArr) {
                            ng4 ng4Var = new pg4(a(), str2).b;
                            if (ng4Var instanceof uh2) {
                                ((uh2) ng4Var).D0(a().z(ng4Var.Q()));
                            }
                            arrayList.add(ng4Var);
                        }
                        this.T = arrayList;
                        this.O = true;
                        ue5 ue5Var = (ue5) this.V.getValue();
                        ng4 ng4Var2 = (ng4) xr0.W(arrayList);
                        if (ng4Var2 != null) {
                            str = (ng4Var2.m0() ? "📁" : "📄") + " " + ng4Var2.Z();
                        } else {
                            str = "✔ " + arrayList.size();
                        }
                        ue5Var.getClass();
                        ue5Var.o = ue5.c(str);
                    }
                }
                this.R = new im8(this, this.Q);
            } catch (Exception e) {
                Handler handler = App.M0;
                qp9.d(e);
                App appA = a();
                appA.j0(appA, se8.k(e), true);
                stopSelf();
                return 2;
            }
        }
        f();
        a().u0(new Object[]{this}, 0);
        return 1;
    }
}
