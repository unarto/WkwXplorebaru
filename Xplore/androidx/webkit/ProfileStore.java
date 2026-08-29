package androidx.webkit;

import defpackage.om8;
import defpackage.pm8;
import defpackage.q56;
import defpackage.t56;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (!om8.f.b()) {
            throw om8.a();
        }
        t56 t56Var = t56.b;
        if (t56Var != null) {
            return t56Var;
        }
        t56 t56Var2 = new t56(pm8.a.getProfileStore());
        t56.b = t56Var2;
        return t56Var2;
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    q56 getOrCreateProfile(String str);

    q56 getProfile(String str);
}
