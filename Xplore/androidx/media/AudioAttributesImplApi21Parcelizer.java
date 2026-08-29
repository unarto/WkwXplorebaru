package androidx.media;

import android.media.AudioAttributes;
import defpackage.kh8;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(kh8 kh8Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) kh8Var.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = kh8Var.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, kh8 kh8Var) {
        kh8Var.getClass();
        kh8Var.k(audioAttributesImplApi21.a, 1);
        kh8Var.j(audioAttributesImplApi21.b, 2);
    }
}
