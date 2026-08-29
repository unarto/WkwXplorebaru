package com.lcg.unrar;

import defpackage.b10;
import defpackage.du0;
import defpackage.e;
import defpackage.hd9;
import defpackage.is;
import defpackage.jb8;
import defpackage.jw7;
import defpackage.kb8;
import defpackage.kza;
import defpackage.mb8;
import defpackage.sp1;
import defpackage.yh2;
import defpackage.za6;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0011\u0012\u0013J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/lcg/unrar/Unpack29;", "Lmb8;", "Lcom/lcg/unrar/RarCharProvider;", "cp", "", "createPpm", "(Lcom/lcg/unrar/RarCharProvider;)J", "h", "Lsa8;", "freePpm", "(J)V", "", "ppmGetEscChar", "(J)I", "ppmDecodeChar", "getChar", "()I", "lb8", "jb8", "kb8", "unrar"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class Unpack29 extends mb8 implements RarCharProvider {
    public static final int[] F = new int[64];
    public static final byte[] G = new byte[64];
    public static final int[] H = {4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 14, 0, 12};
    public static int I = -1;
    public int A;
    public int B;
    public byte[] C;
    public int D;
    public kb8 E;
    public long x;
    public boolean y;
    public int z;

    private final native long createPpm(RarCharProvider cp);

    private final native void freePpm(long h);

    private final native int ppmDecodeChar(long h);

    private final native int ppmGetEscChar(long h);

    @Override // com.lcg.unrar.b
    public final void b() {
        long j = this.x;
        if (j != 0) {
            freePpm(j);
            this.x = 0L;
        }
    }

    @Override // com.lcg.unrar.b
    public final void g(yh2 yh2Var, InputStream inputStream) throws IOException {
        ArrayList arrayList;
        yh2Var.getClass();
        inputStream.getClass();
        super.g(yh2Var, inputStream);
        kb8 kb8Var = this.E;
        if (kb8Var != null && (arrayList = (ArrayList) kb8Var.f) != null) {
            arrayList.clear();
        }
        r();
    }

    public int getChar() throws EOFException, za6 {
        hd9 hd9Var = this.g;
        int i = hd9Var.b;
        if (i > 32738) {
            i();
            i = hd9Var.b;
            if (i >= 32768) {
                return 0;
            }
        }
        byte[] bArr = hd9Var.d;
        hd9Var.b = i + 1;
        return bArr[i] & 255;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    @Override // com.lcg.unrar.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() throws IOException {
        boolean zB;
        boolean z;
        int i;
        int i2;
        int iQ;
        this.k &= this.o;
        hd9 hd9Var = this.g;
        if (hd9Var.b > this.m) {
            r();
        }
        int i3 = this.l;
        int i4 = this.k;
        if (((i3 - i4) & this.o) < 260 && i3 != i4) {
            s();
            if (this.p > this.j) {
                this.r = true;
                return;
            }
        }
        boolean zA = false;
        int i5 = 0;
        zA = false;
        zA = false;
        zA = false;
        zA = false;
        zA = false;
        boolean zA2 = false;
        if (this.D == 1) {
            int iPpmDecodeChar = ppmDecodeChar(this.x);
            if (iPpmDecodeChar == this.B) {
                int iQ2 = q();
                if (iQ2 == -1) {
                    o();
                    return;
                }
                if (iQ2 == 0) {
                    if (p()) {
                        return;
                    }
                    o();
                    return;
                }
                if (iQ2 == 2) {
                    o();
                    return;
                }
                if (iQ2 == 3) {
                    kb8 kb8Var = this.E;
                    if (kb8Var == null) {
                        o();
                        return;
                    }
                    int iQ3 = q();
                    if (iQ3 != -1) {
                        int i6 = (iQ3 & 7) + 1;
                        if (i6 == 7) {
                            int iQ4 = q();
                            if (iQ4 != -1) {
                                i6 = iQ4 + 7;
                                i2 = i6;
                                if (i2 != 0) {
                                }
                            }
                        } else if (i6 == 8) {
                            int iQ5 = q();
                            if (iQ5 != -1 && (iQ = q()) != -1) {
                                i6 = (iQ5 * 256) + iQ;
                                i2 = i6;
                                if (i2 != 0) {
                                    byte[] bArr = new byte[i2];
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= i2) {
                                            zA2 = kb8Var.a(iQ3, i2, this.k, this.l, this.o, bArr);
                                            break;
                                        }
                                        int iQ6 = q();
                                        if (iQ6 == -1) {
                                            break;
                                        }
                                        bArr[i7] = (byte) iQ6;
                                        i7++;
                                    }
                                }
                            }
                        } else {
                            i2 = i6;
                            if (i2 != 0) {
                            }
                        }
                    }
                    if (zA2) {
                        return;
                    }
                    o();
                    return;
                }
                if (iQ2 == 4) {
                    boolean z2 = false;
                    int i8 = 0;
                    byte b = 0;
                    while (i5 < 4 && !z2) {
                        int iQ7 = q();
                        if (iQ7 == -1) {
                            z2 = true;
                        } else if (i5 == 3) {
                            b = (byte) iQ7;
                        } else {
                            i8 = (i8 << 8) + ((byte) iQ7);
                        }
                        i5++;
                        z2 = z2;
                    }
                    if (z2) {
                        o();
                        return;
                    } else {
                        c(b + 32, i8 + 2);
                        return;
                    }
                }
                if (iQ2 == 5) {
                    int iQ8 = q();
                    if (iQ8 == -1) {
                        o();
                        return;
                    } else {
                        c(iQ8 + 4, 1);
                        return;
                    }
                }
            }
            byte[] bArr2 = this.n;
            int i9 = this.k;
            this.k = i9 + 1;
            bArr2[i9] = (byte) iPpmDecodeChar;
            return;
        }
        b10 b10Var = this.f;
        int iD = d((du0) b10Var.b);
        if (iD < 256) {
            byte[] bArr3 = this.n;
            int i10 = this.k;
            this.k = i10 + 1;
            bArr3[i10] = (byte) iD;
            return;
        }
        byte[] bArr4 = b.u;
        short[] sArr = b.t;
        if (iD >= 271) {
            int i11 = iD - 271;
            int iF = sArr[i11] + 3;
            byte b2 = bArr4[i11];
            if (b2 > 0) {
                iF += hd9Var.f() >>> (16 - b2);
                hd9Var.a(b2);
            }
            int iD2 = d((du0) b10Var.c);
            int iF2 = F[iD2] + 1;
            int i12 = G[iD2] & 255;
            if (i12 > 0) {
                if (iD2 > 9) {
                    if (i12 > 4) {
                        iF2 += (hd9Var.f() >>> (20 - i12)) << 4;
                        hd9Var.a(i12 - 4);
                    }
                    int i13 = this.A;
                    if (i13 > 0) {
                        this.A = i13 - 1;
                        i = this.z;
                    } else {
                        int iD3 = d((du0) b10Var.d);
                        if (iD3 == 16) {
                            this.A = 15;
                            i = this.z;
                        } else {
                            iF2 += iD3;
                            this.z = iD3;
                        }
                    }
                    iF2 += i;
                } else {
                    iF2 += hd9Var.f() >>> (16 - i12);
                    hd9Var.a(i12);
                }
            }
            if (iF2 >= 8192) {
                iF = iF2 >= 262144 ? iF + 2 : iF + 1;
            }
            l(iF2);
            this.e = iF;
            c(iF, iF2);
            return;
        }
        if (iD == 256) {
            int iF3 = hd9Var.f();
            if (kza.b(iF3, 32768)) {
                hd9Var.a(1);
                zB = true;
                z = false;
            } else {
                zB = kza.b(iF3, 16384);
                hd9Var.a(2);
                z = true;
            }
            this.y = !zB;
            if (z ? false : p()) {
                return;
            }
            o();
            return;
        }
        if (iD != 257) {
            int[] iArr = this.c;
            if (iD == 258) {
                int i14 = this.e;
                if (i14 != 0) {
                    c(i14, iArr[0]);
                    return;
                }
                return;
            }
            if (iD >= 263) {
                if (iD < 272) {
                    int i15 = iD - 263;
                    int iF4 = b.v[i15] + 1;
                    byte b3 = b.w[i15];
                    if (b3 > 0) {
                        iF4 += hd9Var.f() >>> (16 - b3);
                        hd9Var.a(b3);
                    }
                    l(iF4);
                    this.e = 2;
                    c(2, iF4);
                    return;
                }
                return;
            }
            int i16 = iD - 259;
            int i17 = iArr[i16];
            System.arraycopy(iArr, 0, iArr, 1, i16);
            iArr[0] = i17;
            int iD4 = d((du0) b10Var.e);
            int iF5 = sArr[iD4] + 2;
            byte b4 = bArr4[iD4];
            if (b4 > 0) {
                iF5 += hd9Var.f() >>> (16 - b4);
                hd9Var.a(b4);
            }
            this.e = iF5;
            c(iF5, i17);
            return;
        }
        int iF6 = hd9Var.f() >>> 8;
        hd9Var.a(8);
        int iF7 = (iF6 & 7) + 1;
        if (iF7 == 7) {
            iF7 = (hd9Var.f() >>> 8) + 7;
            hd9Var.a(8);
        } else if (iF7 == 8) {
            iF7 = hd9Var.f();
            hd9Var.a(16);
        }
        int i18 = iF7;
        if (i18 != 0) {
            byte[] bArr5 = new byte[i18];
            for (int i19 = 0; i19 < i18; i19++) {
                if (hd9Var.b >= this.q - 1) {
                    r();
                }
                bArr5[i19] = (byte) (hd9Var.f() >>> 8);
                hd9Var.a(8);
            }
            kb8 kb8Var2 = this.E;
            if (kb8Var2 == null) {
                kb8Var2 = new kb8();
                kb8Var2.c = new byte[262148];
                kb8Var2.d = new int[8];
                kb8Var2.e = new ArrayList();
                kb8Var2.f = new ArrayList();
                kb8Var2.g = new ArrayList();
                kb8Var2.h = new hd9(2, (byte) 0);
                this.E = kb8Var2;
            }
            zA = kb8Var2.a(iF6, i18, this.k, this.l, this.o, bArr5);
        }
        if (zA) {
            return;
        }
        o();
    }

    public final void o() {
        this.r = true;
        s();
    }

    public final boolean p() throws IOException {
        int iF;
        int iF2;
        byte[] bArr = this.C;
        byte[] bArr2 = new byte[20];
        byte[] bArr3 = new byte[404];
        if (a() < 25) {
            r();
        }
        hd9 hd9Var = this.g;
        hd9Var.a((8 - hd9Var.c) & 7);
        int iF3 = hd9Var.f();
        if (kza.b(iF3, 32768)) {
            int i = I;
            if (i == -1) {
                try {
                    System.loadLibrary("unrar_ppm");
                    i = 1;
                } catch (Throwable unused) {
                    i = 0;
                }
                I = i;
            }
            if (i != 1) {
                sp1.f("PPM can't be decoded");
                return false;
            }
            long jCreatePpm = this.x;
            if (jCreatePpm == 0) {
                jCreatePpm = createPpm(this);
                this.x = jCreatePpm;
                if (jCreatePpm == 0) {
                    if (this.b) {
                        throw new za6("Invalid password");
                    }
                    sp1.f("Can't init PPM");
                    return false;
                }
            }
            this.B = ppmGetEscChar(jCreatePpm);
            this.D = 1;
            return true;
        }
        this.D = 0;
        this.z = 0;
        this.A = 0;
        if ((iF3 & 16384) == 0) {
            is.w(bArr, 0, 6);
        }
        hd9Var.a(2);
        int i2 = 0;
        while (i2 < 20) {
            byte bF = (byte) (hd9Var.f() >>> 12);
            hd9Var.a(4);
            if (bF == 15) {
                byte bF2 = (byte) (hd9Var.f() >>> 12);
                hd9Var.a(4);
                if (bF2 == 0) {
                    bArr2[i2] = 15;
                } else {
                    int i3 = bF2 + 2;
                    while (true) {
                        int i4 = i3 - 1;
                        if (i3 <= 0 || i2 >= 20) {
                            break;
                        }
                        bArr2[i2] = 0;
                        i2++;
                        i3 = i4;
                    }
                    i2--;
                }
            } else {
                bArr2[i2] = bF;
            }
            i2++;
        }
        b10 b10Var = this.f;
        b.f(bArr2, 0, (du0) b10Var.I, 20);
        int i5 = 0;
        while (true) {
            if (i5 < 404) {
                if (a() < 5) {
                    r();
                }
                int iD = d((du0) b10Var.I);
                if (iD < 16) {
                    bArr3[i5] = (byte) ((iD + bArr[i5]) & 15);
                    i5++;
                } else if (iD < 18) {
                    if (iD == 16) {
                        iF = (hd9Var.f() >>> 13) + 3;
                        hd9Var.a(3);
                    } else {
                        iF = (hd9Var.f() >>> 9) + 11;
                        hd9Var.a(7);
                    }
                    if (i5 == 0) {
                        break;
                    }
                    while (true) {
                        int i6 = iF - 1;
                        if (iF <= 0 || i5 >= 404) {
                            break;
                        }
                        bArr3[i5] = bArr3[i5 - 1];
                        i5++;
                        iF = i6;
                    }
                } else {
                    if (iD == 18) {
                        iF2 = (hd9Var.f() >>> 13) + 3;
                        hd9Var.a(3);
                    } else {
                        iF2 = (hd9Var.f() >>> 9) + 11;
                        hd9Var.a(7);
                    }
                    while (true) {
                        int i7 = iF2 - 1;
                        if (iF2 <= 0 || i5 >= 404) {
                            break;
                        }
                        bArr3[i5] = 0;
                        i5++;
                        iF2 = i7;
                    }
                }
            } else {
                this.y = true;
                if (a() >= 0) {
                    b.f(bArr3, 0, (du0) b10Var.b, 299);
                    b.f(bArr3, 299, (du0) b10Var.c, 60);
                    b.f(bArr3, 359, (du0) b10Var.d, 17);
                    b.f(bArr3, 376, (du0) b10Var.e, 28);
                    System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
                    return true;
                }
            }
        }
        return false;
    }

    public final int q() {
        int iPpmDecodeChar = ppmDecodeChar(this.x);
        if (iPpmDecodeChar == -1) {
            this.D = 0;
        }
        return iPpmDecodeChar;
    }

    public final void r() throws IOException {
        int iA = a();
        if (iA < 0) {
            if (this.b) {
                throw new za6("Invalid password");
            }
            jw7.b();
            return;
        }
        hd9 hd9Var = this.g;
        int i = hd9Var.b;
        byte[] bArr = hd9Var.d;
        if (i > 16384) {
            if (iA > 0) {
                System.arraycopy(bArr, i, bArr, 0, iA);
            }
            hd9Var.b = 0;
            this.q = iA;
        } else {
            iA = this.q;
        }
        int iH = this.q + h(bArr, iA, 32768 - iA);
        this.q = iH;
        this.m = iH - 30;
    }

    public final void s() {
        jb8 jb8Var;
        int i = this.l;
        int i2 = (this.k - i) & this.o;
        kb8 kb8Var = this.E;
        if (kb8Var != null) {
            ArrayList arrayList = (ArrayList) kb8Var.f;
            int i3 = 0;
            while (i3 < arrayList.size()) {
                jb8 jb8Var2 = (jb8) arrayList.get(i3);
                if (jb8Var2 != null) {
                    if (jb8Var2.h) {
                        jb8Var2.h = false;
                    } else {
                        int i4 = jb8Var2.f;
                        int i5 = jb8Var2.g;
                        int i6 = this.o;
                        if (((i4 - i) & i6) >= i2) {
                            continue;
                        } else {
                            if (i != i4) {
                                m(i, i4);
                                int i7 = this.k - i4;
                                i6 = this.o;
                                i2 = i7 & i6;
                                i = i4;
                            }
                            if (i5 > i2) {
                                int size = arrayList.size();
                                while (i3 < size) {
                                    jb8 jb8Var3 = (jb8) arrayList.get(i3);
                                    if (jb8Var3 != null && jb8Var3.h) {
                                        jb8Var3.h = false;
                                    }
                                    i3++;
                                }
                                this.l = i;
                                return;
                            }
                            i = (i4 + i5) & i6;
                            if (i4 < i || i == 0) {
                                kb8Var.d(this.n, 0, i4, i5);
                            } else {
                                byte[] bArr = this.n;
                                int length = bArr.length - i4;
                                kb8Var.d(bArr, 0, i4, length);
                                kb8Var.d(this.n, length, 0, i);
                            }
                            kb8Var.b(jb8Var2, this.p);
                            byte[] bArr2 = jb8Var2.c;
                            int i8 = jb8Var2.d;
                            int i9 = jb8Var2.e;
                            arrayList.set(i3, null);
                            while (true) {
                                int i10 = i3 + 1;
                                if (i10 >= arrayList.size() || (jb8Var = (jb8) arrayList.get(i10)) == null || jb8Var.f != i4 || jb8Var.g != i9 || jb8Var.h) {
                                    break;
                                }
                                if (bArr2 != null) {
                                    kb8Var.d(bArr2, 0, 0, i9);
                                }
                                kb8Var.b(jb8Var, this.p);
                                bArr2 = jb8Var.c;
                                i8 = jb8Var.d;
                                i9 = jb8Var.e;
                                arrayList.set(i10, null);
                                i3 = i10;
                            }
                            if (bArr2 == null) {
                                e.k("Required value was null.");
                                return;
                            } else {
                                j(bArr2, i8, i9);
                                this.p += (long) i9;
                                i2 = (this.k - i) & this.o;
                            }
                        }
                    }
                }
                i3++;
            }
        }
        m(i, this.k);
        this.l = this.k;
    }
}
