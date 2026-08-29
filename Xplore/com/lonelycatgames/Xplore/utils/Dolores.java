package com.lonelycatgames.Xplore.utils;

import android.content.Context;
import com.lonelycatgames.Xplore.R;
import defpackage.dn0;
import defpackage.is;
import defpackage.jj7;
import defpackage.se8;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bJ \u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/lonelycatgames/Xplore/utils/Dolores;", "", "", "decoder", "", "data", "process", "(J[B)[B", "Companion", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class Dolores {
    public static final Companion b = new Companion();
    public static Dolores c;
    public final long a;

    /* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/lonelycatgames/Xplore/utils/Dolores$Companion;", "", "Landroid/content/Context;", "ctx", "", "id", "", "init", "(Landroid/content/Context;I)J", "Lcom/lonelycatgames/Xplore/utils/Dolores;", "inst", "Lcom/lonelycatgames/Xplore/utils/Dolores;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ long a(Context context) {
            return Dolores.b.init(context, R.color.backdrop_bar);
        }

        public static int c(byte[] bArr, int i) {
            byte b = (i < 0 || i >= bArr.length) ? (byte) 0 : bArr[i];
            String[] strArr = se8.a;
            return b & 255;
        }

        private final native long init(Context ctx, int id);

        public final synchronized Dolores b(Context context) {
            Dolores dolores;
            context.getClass();
            dolores = Dolores.c;
            if (dolores == null) {
                dolores = new Dolores(context);
                Dolores.c = dolores;
            }
            return dolores;
        }
    }

    public Dolores(Context context) {
        System.loadLibrary(se8.v(15, "k`c`}j|"));
        this.a = Companion.a(context);
    }

    private final native byte[] process(long decoder, byte[] data);

    public final String a(String str) {
        return jj7.m0(new String(b(se8.b(str, false)), dn0.a), 0);
    }

    public final byte[] b(byte[] bArr) {
        if ((bArr.length & 15) != 0) {
            byte[] bArr2 = new byte[(bArr.length + 15) & (-16)];
            is.q(bArr, 0, 0, bArr2, 14);
            bArr = bArr2;
        }
        return process(this.a, bArr);
    }
}
