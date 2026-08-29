package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.di3;
import defpackage.fd5;
import defpackage.mj;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements di3 {
    @Override // defpackage.di3
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new mj(this, context.getApplicationContext()));
        return new fd5(2);
    }

    @Override // defpackage.di3
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
