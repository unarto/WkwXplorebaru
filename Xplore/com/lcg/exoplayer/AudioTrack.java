package com.lcg.exoplayer;

import android.media.AudioTimestamp;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import defpackage.fu;
import defpackage.gu;
import defpackage.oe2;
import defpackage.sd2;
import defpackage.un2;
import defpackage.ve5;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\nJ*\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/lcg/exoplayer/AudioTrack;", "", "Ljava/nio/ByteBuffer;", "buf", "", "sizeInSamples", "volume8Fp", "Lsa8;", "jniChangeVolume", "(Ljava/nio/ByteBuffer;II)V", "fu", "exo"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AudioTrack {
    public long A;
    public long B;
    public long C;
    public int E;
    public boolean F;
    public int G;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public PlaybackParams g;
    public long i;
    public long j;
    public long k;
    public boolean l;
    public android.media.AudioTrack n;
    public int p;
    public long q;
    public int r;
    public int s;
    public long t;
    public long u;
    public boolean v;
    public long w;
    public Method x;
    public long y;
    public int z;
    public final ConditionVariable a = new ConditionVariable(true);
    public final AudioTimestamp h = new AudioTimestamp();
    public float m = 1.0f;
    public fu o = new fu(0, 0, 0, 0);
    public float D = 1.0f;
    public final long[] H = new long[10];

    public AudioTrack() {
        try {
            this.x = android.media.AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
    }

    private final native void jniChangeVolume(ByteBuffer buf, int sizeInSamples, int volume8Fp);

    public final long a(long j) {
        return (j * 1000000) / ((long) this.o.a);
    }

    public final long b() {
        if (this.d != -1) {
            return Math.min(this.f, this.e + ((((SystemClock.elapsedRealtime() * 1000) - this.d) * ((long) this.o.a)) / 1000000));
        }
        android.media.AudioTrack audioTrack = this.n;
        Integer numValueOf = audioTrack != null ? Integer.valueOf(audioTrack.getPlayState()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 0L;
        }
        android.media.AudioTrack audioTrack2 = this.n;
        audioTrack2.getClass();
        long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
        if (this.b > playbackHeadPosition) {
            this.c++;
        }
        this.b = playbackHeadPosition;
        return playbackHeadPosition + (this.c << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(ByteBuffer byteBuffer, int i, int i2, long j) {
        int i3;
        int i4;
        byteBuffer.getClass();
        if (i2 == 0) {
            return 2;
        }
        if (this.G == 0) {
            this.G = i2;
            byteBuffer.position(i);
            long jA = j - a(f(i2));
            if (this.z == 0) {
                this.A = Math.max(0L, jA);
                this.z = 1;
            } else {
                long jA2 = a(f(this.y)) + this.A;
                if (this.z == 1 && Math.abs(jA2 - jA) > 200000) {
                    oe2[] oe2VarArr = sd2.F;
                    StringBuilder sbP = ve5.p(jA2, "Discontinuity detected [expected ", ", got ");
                    sbP.append(jA);
                    sbP.append("]");
                    Log.w("ExoPlayer", sbP.toString());
                    this.z = 2;
                }
                if (this.z == 2) {
                    this.A = (jA - jA2) + this.A;
                    this.z = 1;
                    i3 = 1;
                }
                i4 = this.E;
                if (i4 != 0) {
                    jniChangeVolume(byteBuffer, i2 / 2, i4);
                }
            }
            i3 = 0;
            i4 = this.E;
            if (i4 != 0) {
            }
        } else {
            i3 = 0;
        }
        android.media.AudioTrack audioTrack = this.n;
        audioTrack.getClass();
        int iWrite = audioTrack.write(byteBuffer, this.G, 1);
        if (iWrite < 0) {
            un2.j("Check failed.");
            return 0;
        }
        int i5 = this.G - iWrite;
        this.G = i5;
        this.y += (long) iWrite;
        return i5 == 0 ? i3 | 2 : i3;
    }

    public final boolean d() {
        return this.n != null;
    }

    public final void e() {
        PlaybackParams playbackParams;
        android.media.AudioTrack audioTrack = this.n;
        if (audioTrack == null || (playbackParams = this.g) == null) {
            return;
        }
        if (this.m < 0.01f) {
            audioTrack.pause();
            return;
        }
        if (this.l) {
            audioTrack.play();
        }
        try {
            audioTrack.setPlaybackParams(playbackParams);
        } catch (Exception unused) {
        }
    }

    public final long f(long j) {
        return j / ((long) (this.o.d * 2));
    }

    public final void g() {
        android.media.AudioTrack audioTrack;
        if (d()) {
            this.B = System.nanoTime() / 1000;
            this.l = true;
            if (this.m <= 0.0f || (audioTrack = this.n) == null) {
                return;
            }
            audioTrack.play();
        }
    }

    public final void h() {
        if (d()) {
            this.y = 0L;
            this.G = 0;
            this.z = 0;
            this.C = 0L;
            this.t = 0L;
            this.s = 0;
            this.r = 0;
            this.u = 0L;
            this.v = false;
            this.w = 0L;
            android.media.AudioTrack audioTrack = this.n;
            if (audioTrack != null && audioTrack.getPlayState() == 3) {
                audioTrack.pause();
            }
            this.n = null;
            this.d = -1L;
            this.b = 0L;
            this.c = 0L;
            e();
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.a.close();
            new gu(audioTrack, this).start();
        }
    }
}
