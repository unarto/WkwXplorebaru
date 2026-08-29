package com.lcg.exoplayer.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import defpackage.cd7;
import defpackage.ce0;
import defpackage.dd7;
import defpackage.ffd;
import defpackage.hd9;
import defpackage.id7;
import defpackage.kr0;
import defpackage.lr0;
import defpackage.nr0;
import defpackage.rz2;
import defpackage.sp1;
import defpackage.un2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000:\u0002\u0018\u0019J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\nJ:\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0001H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/lcg/exoplayer/codec/CodecMp4;", "", "width", "height", "", "jniCreate", "(II)J", "dec", "Lsa8;", "jniRelease", "(J)V", "", "buf", "len", "", "dropBFrames", "flush", "jniDecode", "(J[BIZZ)I", "jniGetYuvHorizontalEdges", "(J)I", "bufferIndex", "jniCopyYuvToTextures", "(JI)V", "nr0", "kr0", "exo"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CodecMp4 extends dd7 {
    public static final boolean S;
    public int I;
    public int J;
    public Surface K;
    public id7 L;
    public long M;
    public final ArrayDeque N;
    public boolean O;
    public boolean P;
    public kr0 Q;
    public float R;
    public final int d = 2;
    public final nr0[] e;

    static {
        boolean z;
        try {
            System.loadLibrary("Mp4");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        S = z;
    }

    public CodecMp4() throws IOException {
        for (int i = 0; i < 4; i++) {
            try {
                this.a[i] = new cd7(262144);
            } catch (OutOfMemoryError e) {
                sp1.f(e.getMessage());
                throw null;
            }
        }
        int i2 = this.d;
        nr0[] nr0VarArr = new nr0[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            nr0VarArr[i3] = new nr0(this, i3);
        }
        this.e = nr0VarArr;
        this.N = new ArrayDeque(this.d);
        if (!S) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void jniCopyYuvToTextures(long dec, int bufferIndex);

    private final native long jniCreate(int width, int height);

    private final native int jniDecode(long dec, byte[] buf, int len, boolean dropBFrames, boolean flush);

    private final native int jniGetYuvHorizontalEdges(long dec);

    private final native void jniRelease(long dec);

    @Override // defpackage.jr0
    public final ByteBuffer[] a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        int i = this.d;
        ByteBuffer[] byteBufferArr = new ByteBuffer[i];
        for (int i2 = 0; i2 < i; i2++) {
            byteBufferArr[i2] = byteBufferAllocate;
        }
        return byteBufferArr;
    }

    @Override // defpackage.jr0
    public final void c() {
        kr0 kr0Var = this.Q;
        if (kr0Var != null) {
            this.Q = null;
            kr0Var.interrupt();
            try {
                kr0Var.join(200L);
            } catch (InterruptedException unused) {
            }
        }
        id7 id7Var = this.L;
        if (id7Var != null) {
            id7Var.c();
            try {
                id7Var.interrupt();
                ffd ffdVar = id7Var.M;
                ffdVar.getClass();
                synchronized (ffdVar) {
                    ffdVar.notify();
                }
                id7Var.join();
            } catch (InterruptedException unused2) {
            }
        }
        this.L = null;
        this.K = null;
        long j = this.M;
        if (j != 0) {
            jniRelease(j);
            this.M = 0L;
        }
    }

    @Override // defpackage.jr0
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        int i;
        synchronized (this) {
            try {
                if (this.c) {
                    this.c = false;
                    i = -2;
                } else {
                    nr0 nr0Var = (nr0) this.N.poll();
                    if (nr0Var != null) {
                        bufferInfo.size = 1;
                        bufferInfo.flags = 0;
                        if (nr0Var.e) {
                            bufferInfo.flags = 4;
                        }
                        bufferInfo.offset = 0;
                        bufferInfo.presentationTimeUs = nr0Var.d;
                        i = nr0Var.b;
                    } else {
                        i = -1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final boolean e(cd7 cd7Var, nr0 nr0Var, boolean z) {
        int i;
        if (this.M != 0) {
            ByteBuffer byteBuffer = cd7Var.a;
            int iLimit = byteBuffer.limit();
            System.currentTimeMillis();
            int iJniDecode = iLimit != 0 ? jniDecode(this.M, byteBuffer.array(), iLimit - 4, z, z) : -1;
            System.currentTimeMillis();
            if (iJniDecode != -1) {
                i = 1073741823 & iJniDecode;
                nr0Var.getClass();
                nr0Var.c = iJniDecode >>> 30;
            } else {
                nr0Var.getClass();
                nr0Var.c = -1;
                i = -1;
            }
            nr0Var.e = cd7Var.c;
            nr0Var.d = cd7Var.d;
            if (i != -1) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        synchronized (this) {
            try {
                synchronized (this) {
                    for (cd7 cd7Var : this.a) {
                        cd7Var.b = false;
                    }
                    this.b.clear();
                    notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        id7 id7Var = this.L;
        if (id7Var != null) {
            id7Var.c();
        }
        for (nr0 nr0Var : this.e) {
            nr0Var.a = false;
        }
    }

    @Override // defpackage.jr0
    public final void flush() {
        synchronized (this) {
            f();
            this.O = true;
            this.N.clear();
        }
    }

    public final void g(int i, int i2) {
        id7 id7Var = this.L;
        if (id7Var != null) {
            int i3 = id7Var.J;
            boolean z = (i3 == 0 || (id7Var.I == i && i3 == i2)) ? false : true;
            id7Var.I = i;
            id7Var.J = i2;
            try {
                id7Var.e(new rz2(i, i2, z, id7Var));
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // defpackage.jr0
    public final MediaFormat j() {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/raw", this.I, this.J);
        mediaFormatCreateVideoFormat.getClass();
        float f = this.R;
        if (f == 0.0f) {
            return mediaFormatCreateVideoFormat;
        }
        mediaFormatCreateVideoFormat.setFloat("pixel-aspect-ratio", f);
        return mediaFormatCreateVideoFormat;
    }

    @Override // defpackage.dd7, defpackage.jr0
    public final void n(int i, long j) {
        nr0 nr0Var = this.e[i];
        nr0Var.getClass();
        if (this.K != null) {
            id7 id7Var = this.L;
            if (nr0Var.c != -1 && id7Var != null) {
                lr0 lr0Var = nr0Var.g;
                lr0Var.a = j;
                ffd ffdVar = id7Var.M;
                ffdVar.getClass();
                synchronized (ffdVar) {
                    id7Var.L.add(lr0Var);
                    ffdVar.notify();
                }
                return;
            }
        }
        w(i, false);
    }

    @Override // defpackage.jr0
    public final void s(MediaFormat mediaFormat, Surface surface) {
        CodecMp4 codecMp4;
        int iLimit;
        mediaFormat.getClass();
        if (surface == null) {
            return;
        }
        this.I = mediaFormat.getInteger("width");
        this.J = mediaFormat.getInteger("height");
        this.K = surface;
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        int iJniGetYuvHorizontalEdges = 0;
        if (this.M == 0 && this.Q == null) {
            long jJniCreate = jniCreate(this.I, this.J);
            this.M = jJniCreate;
            if (jJniCreate == 0) {
                codecMp4 = this;
            } else {
                this.P = true;
                if (byteBuffer == null || (iLimit = byteBuffer.limit()) == 0) {
                    codecMp4 = this;
                } else {
                    this.P = false;
                    int i = iLimit + 4;
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                    byteBufferAllocate.put(byteBuffer.array(), 0, iLimit);
                    byteBufferAllocate.limit(i);
                    byteBufferAllocate.putInt(iLimit, 0);
                    long j = this.M;
                    byte[] bArrArray = byteBufferAllocate.array();
                    codecMp4 = this;
                    codecMp4.jniDecode(j, bArrArray, iLimit, false, false);
                }
                codecMp4.Q = new kr0(codecMp4);
                iJniGetYuvHorizontalEdges = codecMp4.jniGetYuvHorizontalEdges(codecMp4.M);
            }
        } else {
            codecMp4 = this;
            un2.j("Check failed.");
        }
        codecMp4.L = new id7(codecMp4, surface, iJniGetYuvHorizontalEdges);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(4:122|20|(1:22)(1:24)|25)|(10:27|(1:(1:(2:31|(5:33|(1:35)(3:37|116|38)|53|(4:87|(1:89)(1:90)|91|(1:94))|95)(1:41))(1:42))(1:43))(1:44)|118|46|(2:48|(1:50))|51|(10:54|(1:56)|57|(1:59)|60|(1:62)|63|(4:65|(3:67|(1:71)|131)|72|(3:74|(1:78)|133))|(1:80)|81)|53|(0)|95)(1:45)|36|118|46|(0)|51|(0)|53|(0)|95) */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad A[Catch: all -> 0x0021, IOException -> 0x00c4, TryCatch #1 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0011, B:10:0x0025, B:12:0x002a, B:13:0x0038, B:15:0x0041, B:17:0x004b, B:20:0x0056, B:22:0x0066, B:25:0x0072, B:46:0x00a7, B:48:0x00ad, B:50:0x00b9, B:51:0x00be, B:54:0x00c7, B:56:0x00dd, B:57:0x00e0, B:60:0x00fa, B:62:0x0103, B:63:0x0109, B:65:0x010f, B:69:0x011a, B:71:0x0120, B:72:0x0123, B:76:0x012c, B:78:0x0132, B:80:0x0137, B:81:0x013a, B:94:0x0163, B:95:0x0167, B:37:0x008d, B:38:0x0091, B:84:0x014e, B:96:0x0169, B:98:0x016d, B:99:0x0172, B:101:0x0178, B:105:0x017c, B:106:0x017d, B:100:0x0173), top: B:115:0x0001, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7 A[Catch: all -> 0x0021, IOException -> 0x00c4, TryCatch #1 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0011, B:10:0x0025, B:12:0x002a, B:13:0x0038, B:15:0x0041, B:17:0x004b, B:20:0x0056, B:22:0x0066, B:25:0x0072, B:46:0x00a7, B:48:0x00ad, B:50:0x00b9, B:51:0x00be, B:54:0x00c7, B:56:0x00dd, B:57:0x00e0, B:60:0x00fa, B:62:0x0103, B:63:0x0109, B:65:0x010f, B:69:0x011a, B:71:0x0120, B:72:0x0123, B:76:0x012c, B:78:0x0132, B:80:0x0137, B:81:0x013a, B:94:0x0163, B:95:0x0167, B:37:0x008d, B:38:0x0091, B:84:0x014e, B:96:0x0169, B:98:0x016d, B:99:0x0172, B:101:0x0178, B:105:0x017c, B:106:0x017d, B:100:0x0173), top: B:115:0x0001, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    @Override // defpackage.dd7, defpackage.jr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(int i, int i2, int i3, long j) {
        boolean z;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        synchronized (this) {
            try {
                super.v(i, i2, i3, j);
                cd7 cd7Var = this.a[i];
                if (cd7Var.b) {
                    ByteBuffer byteBuffer = cd7Var.a;
                    if (i2 > 0) {
                        byteBuffer.position(0);
                        int iLimit = byteBuffer.limit();
                        byteBuffer.limit(iLimit + 4);
                        byteBuffer.putInt(iLimit, 0);
                    }
                    if (this.P) {
                        byte[] bArrArray = byteBuffer.array();
                        bArrArray.getClass();
                        hd9 hd9Var = new hd9(bArrArray, bArrArray.length, 3);
                        while (hd9Var.b - hd9Var.c >= 32) {
                            if (hd9Var.h(24) == 1) {
                                hd9Var.q(24);
                                if ((hd9Var.h(8) & 240) == 32) {
                                    try {
                                        hd9Var.q(8);
                                        hd9Var.q(1);
                                        hd9Var.q(8);
                                        if (hd9Var.d()) {
                                            iC3 = hd9Var.c(4);
                                            hd9Var.q(3);
                                        } else {
                                            iC3 = 1;
                                        }
                                        iC4 = hd9Var.c(4);
                                    } catch (IOException unused) {
                                        iC = 0;
                                        iC2 = 0;
                                    }
                                    if (iC4 != 1) {
                                        iC2 = 11;
                                        if (iC4 == 2) {
                                            iC = 12;
                                        } else if (iC4 == 3) {
                                            iC = 10;
                                        } else if (iC4 == 4) {
                                            iC = 16;
                                        } else if (iC4 != 5) {
                                            if (iC4 != 15) {
                                                iC = 0;
                                            } else {
                                                iC = hd9Var.c(8);
                                                try {
                                                    iC2 = hd9Var.c(8);
                                                } catch (IOException unused2) {
                                                    iC2 = 0;
                                                }
                                            }
                                            z = true;
                                            if (z) {
                                                float f = iC2 == 0 ? 1.0f : iC / iC2;
                                                if (f != 1.0f) {
                                                    this.R = f;
                                                    this.c = true;
                                                }
                                            }
                                            this.P = false;
                                        } else {
                                            iC = 40;
                                            iC2 = 33;
                                        }
                                        if (hd9Var.d()) {
                                            hd9Var.q(2);
                                            hd9Var.d();
                                            if (hd9Var.d()) {
                                                hd9Var.q(79);
                                            }
                                        }
                                        if (hd9Var.c(2) == 0) {
                                            hd9Var.q(1);
                                            int iC5 = hd9Var.c(16);
                                            hd9Var.q(1);
                                            int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(iC5 - 1);
                                            if (hd9Var.d()) {
                                                hd9Var.q(iNumberOfLeadingZeros);
                                            }
                                            hd9Var.q(1);
                                            hd9Var.c(13);
                                            hd9Var.q(1);
                                            hd9Var.c(13);
                                            hd9Var.q(1);
                                            hd9Var.d();
                                            hd9Var.d();
                                            hd9Var.c(iC3 == 1 ? 1 : 2);
                                            if (hd9Var.d()) {
                                                hd9Var.c(4);
                                                hd9Var.q(4);
                                            }
                                            if (hd9Var.d()) {
                                                if (hd9Var.d()) {
                                                    for (int i4 = 0; i4 < 64 && hd9Var.c(8) != 0; i4++) {
                                                    }
                                                }
                                                if (hd9Var.d()) {
                                                    for (int i5 = 0; i5 < 64 && hd9Var.c(8) != 0; i5++) {
                                                    }
                                                }
                                            }
                                            if (iC3 != 1) {
                                                hd9Var.d();
                                            }
                                            hd9Var.d();
                                            hd9Var.d();
                                            hd9Var.c = (hd9Var.c + 7) & (-8);
                                        }
                                        z = true;
                                        if (z) {
                                        }
                                        this.P = false;
                                    } else {
                                        iC = 1;
                                    }
                                    iC2 = iC;
                                    if (hd9Var.d()) {
                                    }
                                    if (hd9Var.c(2) == 0) {
                                    }
                                    z = true;
                                    if (z) {
                                    }
                                    this.P = false;
                                }
                            } else {
                                hd9Var.q(8);
                            }
                        }
                        z = false;
                        iC = 0;
                        iC2 = 0;
                        if (z) {
                        }
                        this.P = false;
                    }
                    kr0 kr0Var = this.Q;
                    if (kr0Var != null) {
                        ce0 ce0Var = kr0Var.b;
                        ce0Var.getClass();
                        synchronized (ce0Var) {
                            kr0Var.a = true;
                            ce0Var.notify();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:6:0x0010, B:12:0x001e, B:13:0x0022, B:15:0x002b, B:18:0x002e, B:19:0x002f, B:22:0x0032, B:24:0x0038, B:25:0x003d, B:27:0x0043, B:30:0x0046, B:31:0x0047, B:26:0x003e, B:14:0x0023), top: B:36:0x0001, inners: #1, #2 }] */
    @Override // defpackage.jr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(int i, boolean z) {
        synchronized (this) {
            try {
                nr0 nr0Var = this.e[i];
                nr0Var.getClass();
                if (this.K == null || !z) {
                    nr0Var.a = false;
                    kr0 kr0Var = this.Q;
                    if (kr0Var != null) {
                        ce0 ce0Var = kr0Var.b;
                        ce0Var.getClass();
                        synchronized (ce0Var) {
                            kr0Var.a = true;
                            ce0Var.notify();
                        }
                    }
                } else {
                    id7 id7Var = this.L;
                    if ((nr0Var.c != -1) && id7Var != null) {
                        lr0 lr0Var = nr0Var.g;
                        ffd ffdVar = id7Var.M;
                        synchronized (ffdVar) {
                            id7Var.K.add(lr0Var);
                            ffdVar.notify();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
