package com.google.maps.android.ktx.utils.attribution;

import android.content.Context;
import defpackage.di3;
import defpackage.k6d;
import defpackage.sa8;
import defpackage.y82;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/maps/android/ktx/utils/attribution/AttributionIdInitializer;", "Ldi3;", "Lsa8;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "maps-ktx"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AttributionIdInitializer implements di3 {
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public void m4create(Context context) {
        context.getClass();
        k6d.a(context, "gmp_git_androidmapsktx_v6.2.0");
    }

    @Override // defpackage.di3
    public List<Class<? extends di3>> dependencies() {
        return y82.a;
    }

    @Override // defpackage.di3
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m4create(context);
        return sa8.a;
    }
}
