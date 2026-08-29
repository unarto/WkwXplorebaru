package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.uu4;
import defpackage.vi6;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends vi6 {
    @Override // defpackage.vi6
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = uu4.d(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
