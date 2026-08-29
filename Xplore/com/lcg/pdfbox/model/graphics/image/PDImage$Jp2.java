package com.lcg.pdfbox.model.graphics.image;

import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/lcg/pdfbox/model/graphics/image/PDImage$Jp2", "", "", "data", "Ljava/nio/ByteBuffer;", "decode2", "([B)Ljava/nio/ByteBuffer;", "buf", "Lsa8;", "release", "(Ljava/nio/ByteBuffer;)V", "pdfbox"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class PDImage$Jp2 {
    public static final boolean a;

    static {
        boolean z;
        try {
            System.loadLibrary("PdfJp2");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }

    public static final native ByteBuffer decode2(byte[] data);

    public static final native void release(ByteBuffer buf);
}
