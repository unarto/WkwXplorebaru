package com.lcg.pdfbox.model.graphics.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import defpackage.c0c;
import defpackage.ch0;
import defpackage.en5;
import defpackage.f62;
import defpackage.fh0;
import defpackage.fo5;
import defpackage.j62;
import defpackage.jh0;
import defpackage.np9;
import defpackage.pk3;
import defpackage.psc;
import defpackage.y82;
import defpackage.yj3;
import defpackage.ym5;
import defpackage.z9d;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final fh0 a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;

    public a(fh0 fh0Var) {
        this.a = fh0Var;
        boolean zA = fh0Var.a("ImageMask", "IM");
        this.b = zA;
        this.c = zA ? 1 : fh0.n(fh0Var, "BitsPerComponent", "BPC");
        this.d = fh0.n(fh0Var, "Width", "W");
        this.e = fh0.n(fh0Var, "Height", "H");
        this.f = !fh0Var.a("Interpolate", null);
    }

    public static final int c(byte[] bArr, int i) {
        int i2 = i * 2;
        return ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    public abstract Bitmap a();

    /* JADX WARN: Finally extract failed */
    public final Bitmap b(Bitmap.Config config, int i, pk3 pk3Var) {
        int i2;
        InputStream inputStreamD;
        int i3;
        config.getClass();
        boolean z = config == Bitmap.Config.ALPHA_8;
        ym5 ym5VarE = e();
        int i4 = this.c;
        List listJ = this.a.j();
        if (listJ == null) {
            listJ = y82.a;
        }
        boolean zContains = listJ.contains("DCTDecode");
        int i5 = this.d;
        int i6 = this.e;
        try {
            if (zContains || listJ.contains("DCT")) {
                i2 = -16777216;
                if (pk3Var != null) {
                    Log.w("PdfBox-Android", "colorKey on DCT image");
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = config;
                options.inSampleSize = i;
                options.inMutable = true;
                if (ym5VarE instanceof en5) {
                    inputStreamD = d();
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamD, null, options);
                        bitmapDecodeStream.getClass();
                        inputStreamD.close();
                        return bitmapDecodeStream;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                if (!PDImage$JpgNativeDecoder.b) {
                    throw new IllegalStateException("JPG library is not available");
                }
                PDImage$JpgNativeDecoder pDImage$JpgNativeDecoder = new PDImage$JpgNativeDecoder(d());
                try {
                    byte[] bArrC = pDImage$JpgNativeDecoder.c();
                    int iC = c(bArrC, 0);
                    int iC2 = c(bArrC, 1);
                    int iC3 = c(bArrC, 2);
                    if (iC != i5 || iC2 != i6 || iC3 != ym5VarE.e()) {
                        Log.w("PdfBox-Android", "JPG image size mismatch");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC2, config);
                    int[] iArr = new int[iC];
                    float[] fArr = new float[iC3];
                    byte[] bArr = new byte[iC * iC3];
                    float[] fArr2 = new float[3];
                    int i7 = 0;
                    while (i7 < iC2) {
                        pDImage$JpgNativeDecoder.a(bArr);
                        int i8 = 0;
                        for (int i9 = 0; i9 < iC; i9++) {
                            int i10 = 0;
                            while (i10 < iC3) {
                                fArr[i10] = (bArr[i8] & 255) * 0.003921569f;
                                i10++;
                                i8++;
                            }
                            ym5VarE.g(fArr, fArr2);
                            iArr[i9] = yj3.h(fArr2, 1.0f);
                        }
                        int[] iArr2 = iArr;
                        int i11 = iC;
                        int i12 = i7;
                        bitmapCreateBitmap.setPixels(iArr2, 0, i11, 0, i12, iC, 1);
                        i7 = i12 + 1;
                        iArr = iArr2;
                        iC = i11;
                    }
                    pDImage$JpgNativeDecoder.close();
                    return bitmapCreateBitmap;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        psc.d(pDImage$JpgNativeDecoder, th);
                        throw th2;
                    }
                }
            }
            try {
                if (!listJ.contains("JPXDecode")) {
                    i2 = -16777216;
                    int i13 = this.d;
                    int iE = (((ym5VarE.e() * i13) * i4) + 7) / 8;
                    int i14 = iE * i6;
                    byte[] bArr2 = new byte[i14];
                    inputStreamD = d();
                    try {
                        int iE2 = np9.e(inputStreamD, bArr2, i14);
                        inputStreamD.close();
                        if (iE2 != i14) {
                            Log.w("PdfBox-Android", "Image buffer size=" + i14 + ", read " + iE2);
                        }
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i13, i6, config);
                        int[] iArr3 = new int[i13];
                        float[] fArr3 = new float[3];
                        int i15 = 0;
                        while (i15 < i6) {
                            int i16 = i15 * iE;
                            int i17 = 0;
                            while (i17 < i13) {
                                int iF = ym5VarE.f(bArr2, i16, i17, i4, pk3Var, fArr3);
                                byte[] bArr3 = bArr2;
                                int i18 = i4;
                                float[] fArr4 = fArr3;
                                ym5 ym5Var = ym5VarE;
                                if (z) {
                                    iF <<= 24;
                                }
                                iArr3[i17] = iF;
                                i17++;
                                ym5VarE = ym5Var;
                                i4 = i18;
                                bArr2 = bArr3;
                                fArr3 = fArr4;
                            }
                            byte[] bArr4 = bArr2;
                            int i19 = i4;
                            float[] fArr5 = fArr3;
                            ym5 ym5Var2 = ym5VarE;
                            int i20 = i13;
                            int i21 = i15;
                            int i22 = i13;
                            Bitmap bitmap = bitmapCreateBitmap2;
                            bitmap.setPixels(iArr3, 0, i22, 0, i21, i20, 1);
                            i15 = i21 + 1;
                            bitmapCreateBitmap2 = bitmap;
                            i13 = i22;
                            ym5VarE = ym5Var2;
                            i4 = i19;
                            bArr2 = bArr4;
                            fArr3 = fArr5;
                        }
                        return bitmapCreateBitmap2;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                inputStreamD = d();
                try {
                    byte[] bArrE = c0c.e(inputStreamD);
                    inputStreamD.close();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!PDImage$Jp2.a) {
                        throw new IllegalStateException("JP2 library is not available");
                    }
                    ByteBuffer byteBufferDecode2 = PDImage$Jp2.decode2(bArrE);
                    if (byteBufferDecode2 == null) {
                        throw new IllegalStateException("No JP2 result");
                    }
                    try {
                        IntBuffer intBufferAsIntBuffer = byteBufferDecode2.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
                        int i23 = intBufferAsIntBuffer.get();
                        try {
                            int i24 = intBufferAsIntBuffer.get();
                            int i25 = intBufferAsIntBuffer.get();
                            byteBufferDecode2.position(12);
                            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i23, i24, config);
                            bitmapCreateBitmap3.setHasAlpha(i25 == 2 || i25 == 4 || z);
                            byte[] bArr5 = new byte[i23 * i25];
                            int[] iArr4 = new int[i23];
                            int i26 = 0;
                            while (i26 < i24) {
                                byteBufferDecode2.get(bArr5);
                                int i27 = 0;
                                int i28 = 0;
                                while (i27 < i23) {
                                    int i29 = i28 + 1;
                                    Bitmap bitmap2 = bitmapCreateBitmap3;
                                    int i30 = bArr5[i28] & 255;
                                    if (i25 == 1) {
                                        i3 = z ? i30 << 24 : (i30 << 16) | (-16777216) | (i30 << 8) | i30;
                                    } else {
                                        int i31 = i28 + 2;
                                        int i32 = bArr5[i29] & 255;
                                        if (i25 == 2) {
                                            i3 = (i32 << 24) | (i30 << 16) | (i30 << 8) | i30;
                                            i28 = i31;
                                        } else {
                                            i29 = i28 + 3;
                                            int i33 = (i30 << 16) | (i32 << 8) | (bArr5[i31] & 255);
                                            if (i25 == 3) {
                                                i3 = i33 | (-16777216);
                                            } else {
                                                i28 += 4;
                                                i3 = ((bArr5[i29] & 255) << 24) | i33;
                                            }
                                        }
                                        iArr4[i27] = i3;
                                        i27++;
                                        bitmapCreateBitmap3 = bitmap2;
                                    }
                                    i28 = i29;
                                    iArr4[i27] = i3;
                                    i27++;
                                    bitmapCreateBitmap3 = bitmap2;
                                }
                                Bitmap bitmap3 = bitmapCreateBitmap3;
                                int[] iArr5 = iArr4;
                                int i34 = i23;
                                int i35 = i26;
                                bitmap3.setPixels(iArr5, 0, i34, 0, i35, i23, 1);
                                i26 = i35 + 1;
                                bitmapCreateBitmap3 = bitmap3;
                                iArr4 = iArr5;
                                i23 = i34;
                            }
                            Bitmap bitmap4 = bitmapCreateBitmap3;
                            PDImage$Jp2.release(byteBufferDecode2);
                            Log.i("PdfBox-Android", ("jp2: ") + f62.j(z9d.i(System.currentTimeMillis() - jCurrentTimeMillis, j62.MILLISECONDS)));
                            return bitmap4;
                        } catch (Throwable th3) {
                            th = th3;
                            PDImage$Jp2.release(byteBufferDecode2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    i2 = -16777216;
                }
            } catch (Throwable th6) {
                th = th6;
                i2 = -16777216;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        th = th7;
        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(i5, i6, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap4);
        canvas.drawColor(-2039584);
        Paint paint = new Paint(1);
        paint.setColor(-65536);
        paint.setStrokeWidth(2.0f);
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        canvas.drawLine(0.0f, 0.0f, width, height, paint);
        canvas.drawLine(0.0f, height, width, 0.0f, paint);
        String strG = np9.g(th);
        Paint paint2 = new Paint();
        paint2.setColor(i2);
        paint2.setTextSize(20.0f);
        canvas.drawText(strG, 0.0f, 24.0f, paint2);
        return bitmapCreateBitmap4;
    }

    public abstract InputStream d();

    public abstract ym5 e();

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        float[] fArrB;
        if (!(e() instanceof fo5)) {
            Object objI = this.a.i("D", "Decode");
            float[] fArrF = null;
            ch0 ch0Var = objI instanceof ch0 ? (ch0) objI : null;
            ym5 ym5VarE = e();
            if (ch0Var != null) {
                ArrayList arrayList = ch0Var.a;
                if (arrayList.size() != ym5VarE.e() * 2) {
                    if (this.b && arrayList.size() >= 2 && (ch0Var.get(0) instanceof jh0) && (ch0Var.get(1) instanceof jh0)) {
                        float fA = ((jh0) ch0Var.get(0)).a();
                        float fA2 = ((jh0) ch0Var.get(1)).a();
                        if (0.0f <= fA && fA <= 1.0f && 0.0f <= fA2 && fA2 <= 1.0f) {
                            Log.w("PdfBox-Android", "decode array " + ch0Var + " not compatible with color space, using the first two entries");
                            fArrB = new float[]{fA, fA2};
                            if (fArrB[0] > fArrB[1]) {
                                return true;
                            }
                        }
                    }
                    np9.d("decode array " + ch0Var + " not compatible with color space, using default");
                } else {
                    fArrF = ch0Var.f();
                }
                fArrB = fArrF != null ? ym5VarE.b() : fArrF;
                if (fArrB[0] > fArrB[1]) {
                }
            } else {
                if (fArrF != null) {
                }
                if (fArrB[0] > fArrB[1]) {
                }
            }
        }
        return false;
    }
}
