package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.lonelycatgames.Xplore.ops.copy.Ww.EQvrnCmT;
import defpackage.bs;
import defpackage.ey8;
import defpackage.uu4;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public final Bundle a;

    public MediaMetadataCompat(Parcel parcel) {
        this.a = parcel.readBundle(uu4.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    static {
        bs bsVar = new bs(0);
        bsVar.put("android.media.metadata.TITLE", 1);
        bsVar.put("android.media.metadata.ARTIST", 1);
        bsVar.put("android.media.metadata.DURATION", 0);
        bsVar.put("android.media.metadata.ALBUM", 1);
        bsVar.put("android.media.metadata.AUTHOR", 1);
        bsVar.put("android.media.metadata.WRITER", 1);
        bsVar.put("android.media.metadata.COMPOSER", 1);
        bsVar.put("android.media.metadata.COMPILATION", 1);
        bsVar.put("android.media.metadata.DATE", 1);
        bsVar.put("android.media.metadata.YEAR", 0);
        bsVar.put("android.media.metadata.GENRE", 1);
        bsVar.put("android.media.metadata.TRACK_NUMBER", 0);
        bsVar.put("android.media.metadata.NUM_TRACKS", 0);
        bsVar.put("android.media.metadata.DISC_NUMBER", 0);
        bsVar.put(EQvrnCmT.ouvxcCFHh, 1);
        bsVar.put("android.media.metadata.ART", 2);
        bsVar.put("android.media.metadata.ART_URI", 1);
        bsVar.put("android.media.metadata.ALBUM_ART", 2);
        bsVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        bsVar.put("android.media.metadata.USER_RATING", 3);
        bsVar.put("android.media.metadata.RATING", 3);
        bsVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        bsVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        bsVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        bsVar.put("android.media.metadata.DISPLAY_ICON", 2);
        bsVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        bsVar.put("android.media.metadata.MEDIA_ID", 1);
        bsVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        bsVar.put("android.media.metadata.MEDIA_URI", 1);
        bsVar.put("android.media.metadata.ADVERTISEMENT", 0);
        bsVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new ey8(18);
    }
}
