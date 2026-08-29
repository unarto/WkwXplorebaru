package com.lcg.exoplayer.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import defpackage.cd7;
import defpackage.dd7;
import defpackage.sp1;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000J\u0010\u0010\u0002\u001a\u00020\u0001H\u0094 ¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0094 ¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0094 ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/lcg/exoplayer/codec/CodecAc3;", "", "nativeCreate", "()J", "dec", "Lsa8;", "nativeRelease", "(J)V", "", "pcmBuf", "codedData", "", "codecOffs", "codedLen", "decodeFrame", "(J[B[BII)J", "exo"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CodecAc3 extends dd7 {
    public boolean I;
    public int J;
    public long K;
    public ByteBuffer L;
    public final ByteBuffer d;
    public final long e;

    public CodecAc3() throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6144);
        byteBufferAllocate.getClass();
        this.d = byteBufferAllocate;
        try {
            System.loadLibrary("Ac3");
            this.e = nativeCreate();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(this.a[0].a.capacity());
            byteBufferAllocate2.getClass();
            this.L = byteBufferAllocate2;
            byteBufferAllocate2.limit(0).position(0);
        } catch (UnsatisfiedLinkError e) {
            sp1.f(e.getMessage());
            throw null;
        }
    }

    @Override // defpackage.jr0
    public final ByteBuffer[] a() {
        return new ByteBuffer[]{this.d};
    }

    @Override // defpackage.jr0
    public final void c() {
        long j = this.e;
        if (j != 0) {
            nativeRelease(j);
        }
    }

    @Override // defpackage.jr0
    public final int d(MediaCodec.BufferInfo bufferInfo) throws Throwable {
        CodecAc3 codecAc3;
        Throwable th;
        long jDecodeFrame;
        boolean z;
        synchronized (this) {
            try {
                int i = 0;
                if (!this.c) {
                    if (!this.I) {
                        while (true) {
                            if (this.L.hasRemaining()) {
                                int iPosition = this.L.position();
                                long j = this.e;
                                byte[] bArrArray = this.d.array();
                                bArrArray.getClass();
                                byte[] bArrArray2 = this.L.array();
                                bArrArray2.getClass();
                                codecAc3 = this;
                                try {
                                    jDecodeFrame = codecAc3.decodeFrame(j, bArrArray, bArrArray2, iPosition, this.L.remaining());
                                    if (jDecodeFrame != 0) {
                                        if (jDecodeFrame >= 0) {
                                            codecAc3.L.position(iPosition + ((int) (jDecodeFrame >> 32)));
                                            if (!codecAc3.L.hasRemaining()) {
                                                codecAc3.L.limit(0).position(0);
                                            }
                                        } else {
                                            try {
                                                throw new IllegalStateException("Decoder error " + ((int) jDecodeFrame));
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th;
                                }
                            } else {
                                codecAc3 = this;
                                jDecodeFrame = 0;
                            }
                            if (jDecodeFrame != 0) {
                                bufferInfo.size = (int) jDecodeFrame;
                                bufferInfo.flags = 0;
                                bufferInfo.offset = 0;
                                bufferInfo.presentationTimeUs = codecAc3.K;
                                codecAc3.I = true;
                                break;
                            }
                            cd7 cd7Var = (cd7) codecAc3.b.poll();
                            if (cd7Var == null) {
                                break;
                            }
                            int iLimit = cd7Var.a.limit();
                            if (codecAc3.L.limit() + iLimit > codecAc3.L.capacity()) {
                                codecAc3.L.compact().limit(codecAc3.L.position()).position(0);
                                if (codecAc3.L.limit() + iLimit > codecAc3.L.capacity()) {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(codecAc3.L.limit() + iLimit);
                                    byteBufferAllocate.put(codecAc3.L);
                                    codecAc3.L = byteBufferAllocate;
                                    byteBufferAllocate.limit(0).position(0);
                                }
                            }
                            int iLimit2 = codecAc3.L.limit();
                            int iPosition2 = codecAc3.L.position();
                            int i2 = iLimit2 + iLimit;
                            if (i2 > codecAc3.L.capacity()) {
                                iLimit2 = 0;
                                iPosition2 = 0;
                                i2 = iLimit;
                            }
                            codecAc3.L.limit(i2);
                            codecAc3.L.position(iLimit2);
                            codecAc3.L.put(cd7Var.a.array(), 0, iLimit).position(iPosition2);
                            codecAc3.K = cd7Var.d;
                            synchronized (codecAc3) {
                                cd7Var.b = false;
                                z = cd7Var.c;
                                if (z) {
                                    bufferInfo.size = (int) jDecodeFrame;
                                    bufferInfo.flags = 4;
                                    bufferInfo.offset = 0;
                                    bufferInfo.presentationTimeUs = codecAc3.K;
                                    codecAc3.I = true;
                                }
                            }
                            if (z) {
                                break;
                            }
                            this = codecAc3;
                        }
                        return i;
                    }
                    codecAc3 = this;
                    i = -1;
                    return i;
                }
                try {
                    this.c = false;
                    codecAc3 = this;
                    i = -2;
                    return i;
                } catch (Throwable th4) {
                    th = th4;
                    codecAc3 = this;
                }
            } catch (Throwable th5) {
                th = th5;
                codecAc3 = this;
            }
            th = th;
            throw th;
        }
    }

    public native long decodeFrame(long dec, byte[] pcmBuf, byte[] codedData, int codecOffs, int codedLen);

    @Override // defpackage.jr0
    public final void flush() {
        synchronized (this) {
            this.L.limit(0).position(0);
            synchronized (this) {
                for (cd7 cd7Var : this.a) {
                    cd7Var.b = false;
                }
                this.b.clear();
                notify();
            }
        }
        this.I = false;
        this.K = 0L;
    }

    @Override // defpackage.jr0
    public final MediaFormat j() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/raw", this.J, 2);
        mediaFormatCreateAudioFormat.getClass();
        return mediaFormatCreateAudioFormat;
    }

    public native long nativeCreate();

    public native void nativeRelease(long dec);

    @Override // defpackage.jr0
    public final void s(MediaFormat mediaFormat, Surface surface) {
        mediaFormat.getClass();
        this.J = mediaFormat.getInteger("sample-rate");
    }

    @Override // defpackage.dd7, defpackage.jr0
    public final void v(int i, int i2, int i3, long j) {
        synchronized (this) {
            super.v(i, i2, i3, j);
            notify();
        }
    }

    @Override // defpackage.jr0
    public final void w(int i, boolean z) {
        synchronized (this) {
            this.I = false;
        }
    }
}
