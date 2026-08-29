package androidx.media;

import android.media.AudioAttributes;
import defpackage.kh8;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(kh8 kh8Var) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) kh8Var.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = kh8Var.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, kh8 kh8Var) {
        kh8Var.getClass();
        kh8Var.k(audioAttributesImplApi26.a, 1);
        kh8Var.j(audioAttributesImplApi26.b, 2);
    }
}
