package androidx.media;

import defpackage.kh8;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(kh8 kh8Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = 0;
        audioAttributesImplBase.b = 0;
        audioAttributesImplBase.c = 0;
        audioAttributesImplBase.d = -1;
        audioAttributesImplBase.a = kh8Var.f(0, 1);
        audioAttributesImplBase.b = kh8Var.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = kh8Var.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = kh8Var.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, kh8 kh8Var) {
        kh8Var.getClass();
        kh8Var.j(audioAttributesImplBase.a, 1);
        kh8Var.j(audioAttributesImplBase.b, 2);
        kh8Var.j(audioAttributesImplBase.c, 3);
        kh8Var.j(audioAttributesImplBase.d, 4);
    }
}
