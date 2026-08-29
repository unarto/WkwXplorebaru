package com.lcg.pdfbox.model.graphics.color;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/lcg/pdfbox/model/graphics/color/PDDeviceCMYK$Companion", "", "", "roundingOffset", "F", "pdfbox"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class PDDeviceCMYK$Companion {
    public static void a(float f, float f2, float f3, float f4, byte[] bArr, float[] fArr) {
        int i = ((int) (f + 0.49999997f)) << 8;
        int i2 = ((int) (f2 + 0.49999997f)) << 8;
        int i3 = ((int) (f3 + 0.49999997f)) << 8;
        int i4 = ((int) (f4 + 0.49999997f)) << 8;
        int i5 = (i + 4096) >> 13;
        int i6 = (i2 + 4096) >> 13;
        int i7 = (i3 + 4096) >> 13;
        int i8 = (i4 + 4096) >> 13;
        int i9 = ((i7 * 9) + (i6 * 81) + (i5 * 729) + i8) * 3;
        byte b = bArr[i9];
        int i10 = (b & 255) << 8;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = i11 << 8;
        int i13 = bArr[i9 + 2] & 255;
        int i14 = i13 << 8;
        int i15 = i >> 13;
        if (i15 == i5) {
            i15 = i15 == 8 ? i15 - 1 : i15 + 1;
        }
        int i16 = i15;
        int i17 = i2 >> 13;
        if (i17 == i6) {
            i17 = i17 == 8 ? i17 - 1 : i17 + 1;
        }
        int i18 = i17;
        int i19 = i3 >> 13;
        if (i19 == i7) {
            i19 = i19 == 8 ? i19 - 1 : i19 + 1;
        }
        int i20 = i19;
        int i21 = i4 >> 13;
        if (i21 == i8) {
            i21 = i21 == 8 ? i21 - 1 : i21 + 1;
        }
        int i22 = ((i16 - i5) * 2187) + i9;
        int i23 = (i5 - i16) * (i - (i5 << 13));
        int i24 = b & 255;
        int i25 = (((i24 - (bArr[i22] & 255)) * i23) / 32) + i10;
        int i26 = (((i11 - (bArr[i22 + 1] & 255)) * i23) / 32) + i12;
        int i27 = (((i13 - (bArr[i22 + 2] & 255)) * i23) / 32) + i14;
        int i28 = ((i18 - i6) * 243) + i9;
        int i29 = (i6 - i18) * (i2 - (i6 << 13));
        int i30 = (((i24 - (bArr[i28] & 255)) * i29) / 32) + i25;
        int i31 = (((i11 - (bArr[i28 + 1] & 255)) * i29) / 32) + i26;
        int i32 = (((i13 - (bArr[i28 + 2] & 255)) * i29) / 32) + i27;
        int i33 = ((i20 - i7) * 27) + i9;
        int i34 = (i7 - i20) * (i3 - (i7 << 13));
        int i35 = (((i24 - (bArr[i33] & 255)) * i34) / 32) + i30;
        int i36 = (((i11 - (bArr[i33 + 1] & 255)) * i34) / 32) + i31;
        int i37 = (((i13 - (bArr[i33 + 2] & 255)) * i34) / 32) + i32;
        int i38 = ((i21 - i8) * 3) + i9;
        int i39 = (i8 - i21) * (i4 - (i8 << 13));
        int i40 = (((i24 - (bArr[i38] & 255)) * i39) / 32) + i35;
        int i41 = (((i11 - (bArr[i38 + 1] & 255)) * i39) / 32) + i36;
        int i42 = (((i13 - (bArr[i38 + 2] & 255)) * i39) / 32) + i37;
        int iMax = Math.max(i40, 0);
        int iMax2 = Math.max(i41, 0);
        int iMax3 = Math.max(i42, 0);
        fArr[0] = (iMax >> 8) * 0.003921569f;
        fArr[1] = (iMax2 >> 8) * 0.003921569f;
        fArr[2] = (iMax3 >> 8) * 0.003921569f;
    }
}
