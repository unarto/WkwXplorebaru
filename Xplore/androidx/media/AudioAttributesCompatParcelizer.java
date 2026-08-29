package androidx.media;

import defpackage.kh8;
import defpackage.mh8;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(kh8 kh8Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        mh8 mh8VarH = audioAttributesCompat.a;
        if (kh8Var.e(1)) {
            mh8VarH = kh8Var.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) mh8VarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, kh8 kh8Var) {
        kh8Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        kh8Var.i(1);
        kh8Var.l(audioAttributesImpl);
    }
}
