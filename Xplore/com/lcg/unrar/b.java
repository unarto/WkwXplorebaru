package com.lcg.unrar;

import defpackage.b10;
import defpackage.du0;
import defpackage.gb8;
import defpackage.hb8;
import defpackage.hd9;
import defpackage.hj3;
import defpackage.jw7;
import defpackage.sp1;
import defpackage.yh2;
import defpackage.yza;
import defpackage.za6;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final short[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224};
    public static final byte[] u = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
    public static final short[] v = {0, 4, 8, 16, 32, 64, 128, 192};
    public static final byte[] w = {2, 2, 3, 4, 5, 6, 6, 6};
    public InputStream a;
    public boolean b;
    public final int[] c;
    public int d;
    public int e;
    public final b10 f;
    public final hd9 g;
    public gb8 h;
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;
    public byte[] n;
    public int o;
    public long p;
    public int q;
    public boolean r;
    public final LinkedList s;

    public b(yh2 yh2Var, hj3 hj3Var) throws IOException {
        yh2Var.getClass();
        this.a = hj3Var;
        this.c = new int[4];
        this.f = new b10(22);
        this.g = new hd9(2, (byte) 0);
        this.h = new gb8();
        this.n = new byte[0];
        e(yh2Var);
        this.s = new LinkedList();
    }

    public static void f(byte[] bArr, int i, du0 du0Var, int i2) {
        int i3;
        int i4;
        int i5;
        du0Var.getClass();
        int[] iArr = (int[]) du0Var.a;
        short[] sArr = (short[]) du0Var.J;
        int[] iArr2 = (int[]) du0Var.d;
        du0Var.b = i2;
        int[] iArr3 = new int[16];
        int i6 = 0;
        while (true) {
            i3 = 1;
            if (i6 >= i2) {
                break;
            }
            int i7 = bArr[i + i6] & 15;
            iArr3[i7] = iArr3[i7] + 1;
            i6++;
        }
        iArr3[0] = 0;
        Arrays.fill(sArr, 0, sArr.length, (short) 0);
        iArr2[0] = 0;
        iArr[0] = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < 16; i9++) {
            int i10 = i8 + iArr3[i9];
            int i11 = i10 << (16 - i9);
            i8 = i10 * 2;
            iArr[i9] = i11;
            int i12 = i9 - 1;
            iArr2[i9] = iArr2[i12] + iArr3[i12];
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr2, iArr2.length);
        for (int i13 = 0; i13 < i2; i13++) {
            int i14 = bArr[i + i13] & 15;
            if (i14 != 0) {
                int i15 = iArrCopyOf[i14];
                sArr[i15] = (short) i13;
                iArrCopyOf[i14] = i15 + 1;
            }
        }
        if (i2 == 298 || i2 == 299 || i2 == 306) {
            i4 = 10;
            du0Var.c = 10;
        } else {
            i4 = 7;
            du0Var.c = 7;
        }
        int i16 = 1 << i4;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i17 << (16 - du0Var.c);
            while (i3 < iArr.length && i18 >= iArr[i3]) {
                i3++;
            }
            ((byte[]) du0Var.e)[i17] = (byte) i3;
            ((short[]) du0Var.I)[i17] = (i3 >= iArr2.length || (i5 = iArr2[i3] + ((i18 - iArr[i3 + (-1)]) >>> (16 - i3))) >= i2) ? (short) 0 : sArr[i5];
        }
    }

    public final int a() {
        return this.q - this.g.b;
    }

    public final void c(int i, int i2) {
        int i3 = this.k - i2;
        while (true) {
            int i4 = i - 1;
            if (i <= 0) {
                return;
            }
            byte[] bArr = this.n;
            int i5 = this.k;
            int i6 = this.o;
            bArr[i5] = bArr[i3 & i6];
            this.k = (i5 + 1) & i6;
            i = i4;
            i3++;
        }
    }

    public final int d(du0 du0Var) {
        du0Var.getClass();
        hd9 hd9Var = this.g;
        int iF = hd9Var.f() & 65534;
        int[] iArr = (int[]) du0Var.a;
        int i = du0Var.c;
        if (iF < iArr[i]) {
            int i2 = iF >>> (16 - i);
            hd9Var.a(((byte[]) du0Var.e)[i2] & 255);
            return ((short[]) du0Var.I)[i2];
        }
        while (true) {
            i++;
            if (i >= 15) {
                i = 15;
                break;
            }
            if (iF < iArr[i]) {
                break;
            }
        }
        hd9Var.a(i);
        int i3 = ((int[]) du0Var.d)[i] + ((iF - iArr[i - 1]) >>> (16 - i));
        if (i3 >= du0Var.b) {
            i3 = 0;
        }
        return ((short[]) du0Var.J)[i3];
    }

    public final void e(yh2 yh2Var) throws IOException {
        int iMax = Math.max(yh2Var.J, 131072);
        if (iMax == 0 || (iMax >>> 16) > 65536) {
            sp1.f("Invalid window size");
            return;
        }
        if (this.n.length != iMax) {
            this.n = new byte[iMax];
        }
        this.o = iMax - 1;
        this.i = yh2Var.c;
        this.j = yh2Var.d;
        this.b = yh2Var.N;
    }

    public void g(yh2 yh2Var, InputStream inputStream) throws IOException {
        yh2Var.getClass();
        inputStream.getClass();
        this.a = inputStream;
        e(yh2Var);
        this.r = false;
        hd9 hd9Var = this.g;
        hd9Var.c = 0;
        hd9Var.b = 0;
        this.p = 0L;
        this.q = 0;
        this.m = 0;
    }

    public final int h(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 > 0) {
            int iMin = (int) Math.min(this.i, i2);
            if (iMin > 0) {
                yza.d(this.a, bArr, i, iMin);
                i3 = iMin;
            }
            this.i -= (long) i3;
        }
        return i3;
    }

    public final void i() throws EOFException, za6 {
        int iA = a();
        if (iA < 0) {
            if (this.b) {
                throw new za6("Invalid password");
            }
            jw7.b();
            return;
        }
        gb8 gb8Var = this.h;
        int i = gb8Var.a;
        hd9 hd9Var = this.g;
        int i2 = hd9Var.b;
        byte[] bArr = hd9Var.d;
        gb8Var.a = i - (i2 - gb8Var.c);
        if (i2 > 16384) {
            if (iA > 0) {
                System.arraycopy(bArr, i2, bArr, 0, iA);
            }
            hd9Var.b = 0;
            this.q = iA;
        } else {
            iA = this.q;
        }
        int iH = iA;
        if (iA != 32768) {
            iH += h(bArr, iA, 32768 - iA);
            this.q = iH;
        }
        int i3 = iH - 30;
        this.m = i3;
        gb8 gb8Var2 = this.h;
        gb8Var2.c = hd9Var.b;
        if (gb8Var2.a != -1) {
            this.m = Math.min(i3, (r2 + r0) - 1);
        }
    }

    public final void j(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.s.add(new hb8(bArr, i, i2));
    }

    public abstract void k();

    public void b() {
    }
}
