package com.lcg.unrar;

import defpackage.b10;
import defpackage.du0;
import defpackage.hd9;
import defpackage.ib8;
import defpackage.is;
import defpackage.kza;
import defpackage.yh2;
import defpackage.za6;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static final int[] G = {0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, 384, 512, 768, 1024, 1536, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576, 32768, 49152, 65536, 98304, 131072, 196608, 262144, 327680, 393216, 458752, 524288, 589824, 655360, 720896, 786432, 851968, 917504, 983040};
    public static final byte[] H = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public ib8[] F;
    public du0[] x;
    public int y;
    public byte[] z;

    @Override // com.lcg.unrar.b
    public final void g(yh2 yh2Var, InputStream inputStream) throws IOException {
        yh2Var.getClass();
        inputStream.getClass();
        super.g(yh2Var, inputStream);
        ib8[] ib8VarArr = new ib8[4];
        for (int i = 0; i < 4; i++) {
            ib8VarArr[i] = new ib8();
        }
        this.F = ib8VarArr;
        is.w(this.z, 0, 6);
        du0[] du0VarArr = new du0[4];
        for (int i2 = 0; i2 < 4; i2++) {
            du0VarArr[i2] = new du0();
        }
        this.x = du0VarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0280 A[PHI: r1
      0x0280: PHI (r1v19 int) = (r1v18 int), (r1v20 int) binds: [B:102:0x0275, B:104:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.lcg.unrar.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() throws EOFException, za6 {
        if (this.j <= 0) {
            m();
            return;
        }
        this.k &= this.o;
        if (a() < 30) {
            i();
        }
        int i = this.l;
        int i2 = this.k;
        if (((i - i2) & this.o) < 270 && i != i2) {
            o();
        }
        if (!this.A) {
            b10 b10Var = this.f;
            int iD = d((du0) b10Var.b);
            if (iD < 256) {
                byte[] bArr = this.n;
                int i3 = this.k;
                this.k = i3 + 1;
                bArr[i3] = (byte) iD;
                this.j--;
                return;
            }
            byte[] bArr2 = b.u;
            short[] sArr = b.t;
            hd9 hd9Var = this.g;
            if (iD > 269) {
                int i4 = iD - 270;
                int iF = sArr[i4] + 3;
                byte b = bArr2[i4];
                if (b > 0) {
                    iF += hd9Var.f() >>> (16 - b);
                    hd9Var.a(b);
                }
                int iD2 = d((du0) b10Var.c);
                int iF2 = G[iD2] + 1;
                byte b2 = H[iD2];
                if (b2 > 0) {
                    iF2 += hd9Var.f() >>> (16 - b2);
                    hd9Var.a(b2);
                }
                if (iF2 >= 8192) {
                    iF = ((long) iF2) >= 262144 ? iF + 2 : iF + 1;
                }
                l(iF, iF2);
                return;
            }
            if (iD == 269) {
                if (n()) {
                    return;
                }
                m();
                return;
            }
            if (iD == 256) {
                l(this.e, this.y);
                return;
            }
            if (iD >= 261) {
                if (iD < 270) {
                    int i5 = iD - 261;
                    int iF3 = b.v[i5] + 1;
                    byte b3 = b.w[i5];
                    if (b3 > 0) {
                        iF3 += hd9Var.f() >>> (16 - b3);
                        hd9Var.a(b3);
                    }
                    l(2, iF3);
                    return;
                }
                return;
            }
            int i6 = this.c[(this.d - (iD - 256)) & 3];
            int iD3 = d((du0) b10Var.e);
            int iF4 = sArr[iD3] + 2;
            byte b4 = bArr2[iD3];
            if (b4 > 0) {
                iF4 += hd9Var.f() >>> (16 - b4);
                hd9Var.a(b4);
            }
            if (i6 >= 257) {
                int i7 = iF4 + 1;
                if (i6 >= 8192) {
                    i7 = iF4 + 2;
                    iF4 = i6 >= 262144 ? iF4 + 3 : i7;
                }
            }
            l(iF4, i6);
            return;
        }
        int iD4 = d(this.x[this.D]);
        if (iD4 == 256) {
            if (n()) {
                return;
            }
            m();
            return;
        }
        byte[] bArr3 = this.n;
        int i8 = this.k;
        this.k = i8 + 1;
        ib8 ib8Var = this.F[this.D];
        ib8Var.l++;
        int i9 = ib8Var.h;
        ib8Var.i = i9;
        int i10 = ib8Var.g;
        ib8Var.h = i10;
        int i11 = ib8Var.j;
        int i12 = i11 - ib8Var.f;
        ib8Var.g = i12;
        ib8Var.f = i11;
        int i13 = ((((ib8Var.e * this.E) + ((ib8Var.d * i9) + ((ib8Var.c * i10) + ((ib8Var.b * i12) + ((ib8Var.a * i11) + (ib8Var.m * 8)))))) >>> 3) & 255) - iD4;
        int i14 = ((byte) iD4) << 3;
        int[] iArr = ib8Var.k;
        iArr[0] = Math.abs(i14) + iArr[0];
        iArr[1] = Math.abs(i14 - ib8Var.f) + iArr[1];
        iArr[2] = Math.abs(ib8Var.f + i14) + iArr[2];
        iArr[3] = Math.abs(i14 - ib8Var.g) + iArr[3];
        iArr[4] = Math.abs(ib8Var.g + i14) + iArr[4];
        iArr[5] = Math.abs(i14 - ib8Var.h) + iArr[5];
        iArr[6] = Math.abs(ib8Var.h + i14) + iArr[6];
        iArr[7] = Math.abs(i14 - ib8Var.i) + iArr[7];
        iArr[8] = Math.abs(ib8Var.i + i14) + iArr[8];
        iArr[9] = Math.abs(i14 - this.E) + iArr[9];
        iArr[10] = Math.abs(i14 + this.E) + iArr[10];
        byte b5 = (byte) (i13 - ib8Var.m);
        ib8Var.j = b5;
        this.E = b5;
        ib8Var.m = i13;
        if ((ib8Var.l & 31) == 0) {
            int i15 = iArr[0];
            iArr[0] = 0;
            int length = iArr.length;
            int i16 = 0;
            for (int i17 = 1; i17 < length; i17++) {
                int i18 = iArr[i17];
                if (i18 < i15) {
                    i16 = i17;
                    i15 = i18;
                }
                iArr[i17] = 0;
            }
            switch (i16) {
                case 1:
                    int i19 = ib8Var.a;
                    if (i19 >= -16) {
                        ib8Var.a = i19 - 1;
                    }
                    break;
                case 2:
                    int i20 = ib8Var.a;
                    if (i20 < 16) {
                        ib8Var.a = i20 + 1;
                    }
                    break;
                case 3:
                    int i21 = ib8Var.b;
                    if (i21 >= -16) {
                        ib8Var.b = i21 - 1;
                    }
                    break;
                case 4:
                    int i22 = ib8Var.b;
                    if (i22 < 16) {
                        ib8Var.b = i22 + 1;
                    }
                    break;
                case 5:
                    int i23 = ib8Var.c;
                    if (i23 >= -16) {
                        ib8Var.c = i23 - 1;
                    }
                    break;
                case 6:
                    int i24 = ib8Var.c;
                    if (i24 < 16) {
                        ib8Var.c = i24 + 1;
                    }
                    break;
                case 7:
                    int i25 = ib8Var.d;
                    if (i25 >= -16) {
                        ib8Var.d = i25 - 1;
                    }
                    break;
                case 8:
                    int i26 = ib8Var.d;
                    if (i26 < 16) {
                        ib8Var.d = i26 + 1;
                    }
                    break;
                case 9:
                    int i27 = ib8Var.e;
                    if (i27 >= -16) {
                        ib8Var.e = i27 - 1;
                    }
                    break;
                case 10:
                    int i28 = ib8Var.e;
                    if (i28 < 16) {
                        ib8Var.e = i28 + 1;
                    }
                    break;
            }
        }
        bArr3[i8] = (byte) i13;
        int i29 = this.D + 1;
        this.D = i29;
        if (i29 == this.C) {
            this.D = 0;
        }
        this.j--;
    }

    public final void l(int i, int i2) {
        int i3 = this.d;
        int i4 = i3 + 1;
        this.d = i4;
        this.c[i3] = i2;
        this.y = i2;
        this.d = i4 & 3;
        this.e = i;
        this.j -= (long) i;
        c(i, i2);
    }

    public final void m() throws EOFException, za6 {
        if (a() >= 5) {
            if (this.A) {
                if (d(this.x[this.D]) == 256) {
                    n();
                }
            } else if (d((du0) this.f.b) == 269) {
                n();
            }
        }
        o();
        this.r = true;
    }

    public final boolean n() throws EOFException, za6 {
        int i;
        int iF;
        byte[] bArr = this.z;
        byte[] bArr2 = new byte[19];
        byte[] bArr3 = new byte[1028];
        if (a() < 25) {
            i();
        }
        hd9 hd9Var = this.g;
        int iF2 = hd9Var.f();
        this.A = kza.b(iF2, 32768);
        if ((iF2 & 16384) == 0) {
            Arrays.fill(bArr, (byte) 0);
        }
        hd9Var.a(2);
        if (this.A) {
            int i2 = ((iF2 >>> 12) & 3) + 1;
            this.C = i2;
            if (this.D >= i2) {
                this.D = 0;
            }
            hd9Var.a(2);
            i = this.C * 257;
        } else {
            i = 374;
        }
        for (int i3 = 0; i3 < 19; i3++) {
            bArr2[i3] = (byte) (hd9Var.f() >>> 12);
            hd9Var.a(4);
        }
        b10 b10Var = this.f;
        b.f(bArr2, 0, (du0) b10Var.I, 19);
        int i4 = 0;
        while (i4 < i) {
            if (a() < 5) {
                i();
            }
            int iD = d((du0) b10Var.I);
            if (iD < 16) {
                bArr3[i4] = (byte) ((iD + bArr[i4]) & 15);
                i4++;
            } else if (iD == 16) {
                int iF3 = (hd9Var.f() >>> 14) + 3;
                hd9Var.a(2);
                if (i4 == 0) {
                    return false;
                }
                while (true) {
                    int i5 = iF3 - 1;
                    if (iF3 <= 0 || i4 >= i) {
                        break;
                    }
                    bArr3[i4] = bArr3[i4 - 1];
                    i4++;
                    iF3 = i5;
                }
            } else {
                if (iD == 17) {
                    iF = (hd9Var.f() >>> 13) + 3;
                    hd9Var.a(3);
                } else {
                    iF = (hd9Var.f() >>> 9) + 11;
                    hd9Var.a(7);
                }
                while (true) {
                    int i6 = iF - 1;
                    if (iF <= 0 || i4 >= i) {
                        break;
                    }
                    bArr3[i4] = 0;
                    i4++;
                    iF = i6;
                }
            }
        }
        this.B = true;
        if (a() < 0) {
            return true;
        }
        if (this.A) {
            int i7 = this.C;
            for (int i8 = 0; i8 < i7; i8++) {
                b.f(bArr3, i8 * 257, this.x[i8], 257);
            }
        } else {
            b.f(bArr3, 0, (du0) b10Var.b, 298);
            b.f(bArr3, 298, (du0) b10Var.c, 48);
            b.f(bArr3, 346, (du0) b10Var.e, 28);
        }
        is.q(bArr3, 0, i, bArr, 6);
        return true;
    }

    public final void o() {
        int i = this.k;
        int i2 = this.l;
        byte[] bArr = this.n;
        if (i < i2) {
            j(bArr, i2, (-i2) & this.o);
            j(this.n, 0, this.k);
        } else {
            j(bArr, i2, i - i2);
        }
        this.l = this.k;
    }
}
