package com.lcg.pdfbox.model.graphics.image;

import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/lcg/pdfbox/model/graphics/image/PDImage$JpgNativeDecoder", "Ljava/io/FilterInputStream;", "", "createDecoder", "()J", "dec", "Lsa8;", "closeDecoder", "(J)V", "", "readHeader", "(J)[B", "buf", "decodeLine", "(J[B)V", "pdfbox"}, k = 1, mv = {2, 4, 0}, xi = 48)
final class PDImage$JpgNativeDecoder extends FilterInputStream {
    public static final boolean b;
    public final long a;

    static {
        boolean z;
        try {
            System.loadLibrary("PdfJpg");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDImage$JpgNativeDecoder(InputStream inputStream) {
        super(inputStream);
        inputStream.getClass();
        this.a = createDecoder();
    }

    private final native void closeDecoder(long dec);

    private final native long createDecoder();

    private final native void decodeLine(long dec, byte[] buf);

    private final native byte[] readHeader(long dec);

    public final void a(byte[] bArr) {
        decodeLine(this.a, bArr);
    }

    public final byte[] c() {
        return readHeader(this.a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.a;
        try {
            super.close();
        } finally {
            closeDecoder(j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        return super.read(bArr, i, i2);
    }
}
