package com.lonelycatgames.Xplore;

import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.storage.StorageManager;
import com.google.android.material.sidesheet.CaOA.XMpxi;
import com.google.android.play.core.common.Ag.XdGEXS;
import defpackage.a11;
import defpackage.aj4;
import defpackage.b11;
import defpackage.c11;
import defpackage.d11;
import defpackage.dl2;
import defpackage.dn0;
import defpackage.hm3;
import defpackage.i40;
import defpackage.k5d;
import defpackage.kl2;
import defpackage.lh2;
import defpackage.mh2;
import defpackage.ml3;
import defpackage.ng4;
import defpackage.oad;
import defpackage.pg;
import defpackage.pg4;
import defpackage.q6d;
import defpackage.qy1;
import defpackage.r1;
import defpackage.s00;
import defpackage.se8;
import defpackage.sp1;
import defpackage.uh2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class FileContentProvider extends a {
    public static final String[] d = {"_display_name", "_size", "mime_type", "_data"};
    public final LinkedHashMap c = new LinkedHashMap();

    public final void b() {
        LinkedHashMap linkedHashMap = this.c;
        synchronized (linkedHashMap) {
            try {
                String[] strArr = se8.a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    d11 d11Var = (d11) entry.getValue();
                    if (d11Var.d == 0 && jCurrentTimeMillis - d11Var.c > 300000) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap.remove((String) ((Map.Entry) it.next()).getKey());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        a11 a11VarD = d(uri);
        if (a11VarD == null) {
            a11VarD = c(uri);
        }
        if (a11VarD != null) {
            return a11VarD.i();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.ParcelFileDescriptor[], java.io.Serializable] */
    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws IOException {
        File file;
        Object objA0;
        uri.getClass();
        str.getClass();
        int mode = ParcelFileDescriptor.parseMode(str);
        boolean z = mode == 268435456;
        if (!z && se8.o(mode, 33554432)) {
            sp1.f("Append not supported");
            return null;
        }
        try {
            lh2 lh2VarC = c(uri);
            c11 c11VarD = d(uri);
            if (lh2VarC == null && c11VarD != null && z && (c11VarD.b.b0() instanceof i40)) {
                File file2 = new File(c11VarD.b.T());
                if (file2.canRead()) {
                    lh2VarC = new lh2(a(), file2);
                }
            }
            if (lh2VarC != null && (z || (c11VarD == null && lh2VarC.c.canWrite()))) {
                return ParcelFileDescriptor.open(lh2VarC.c, mode);
            }
            String strD = c11VarD != null ? c11VarD.d() : null;
            if (strD != null && z) {
                return ParcelFileDescriptor.open(new File(strD), mode);
            }
            if (a.b && c11VarD != null && c11VarD.a() >= 0) {
                b11 b11Var = new b11(c11VarD, mode);
                return ((StorageManager) this.a.getValue()).openProxyFileDescriptor(mode, b11Var, new Handler(b11Var.h.getLooper()));
            }
            if (c11VarD == null || (objA0 = c11VarD.b) == null) {
                if (lh2VarC == null || (file = lh2VarC.c) == null) {
                    throw new FileNotFoundException();
                }
                q6d q6dVar = dl2.b;
                String path = file.getPath();
                path.getClass();
                ml3 ml3VarY = q6d.y(path, false);
                String path2 = file.getPath();
                path2.getClass();
                objA0 = ml3VarY.A0(path2);
            }
            Object obj = objA0;
            d11 d11Var = c11VarD instanceof d11 ? (d11) c11VarD : null;
            if (d11Var != null) {
                synchronized (d11Var) {
                    d11Var.d++;
                }
            }
            pg pgVar = new pg(27, d11Var);
            if (se8.o(mode, 268435456)) {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                oad.b("Pipe copy", new r1(17, parcelFileDescriptorArrCreatePipe, pgVar, obj), 23);
                return parcelFileDescriptorArrCreatePipe[0];
            }
            if (!se8.o(mode, 536870912)) {
                throw new IllegalStateException("Invalid open flags");
            }
            ?? CreatePipe = ParcelFileDescriptor.createPipe();
            oad.b("Pipe write", new s00((Serializable) CreatePipe, pgVar, mode, obj, 1), 23);
            return CreatePipe[1];
        } catch (Exception unused) {
            throw new FileNotFoundException("Unable to open " + uri);
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        a11 a11VarD = d(uri);
        if (a11VarD == null) {
            a11VarD = c(uri);
        }
        if (a11VarD == null) {
            return null;
        }
        if (strArr == null) {
            strArr = d;
        }
        String[] strArr3 = strArr;
        if (a11VarD instanceof c11) {
            c11 c11Var = (c11) a11VarD;
            return new mh2(c11Var.b, c11Var.a(), c11Var.c(), c11Var.i(), strArr3);
        }
        if (a11VarD instanceof lh2) {
            return new lh2(a(), ((lh2) a11VarD).c, strArr3);
        }
        return null;
    }

    public final lh2 c(Uri uri) {
        if (hm3.b(uri.getAuthority(), XdGEXS.FkeKzrfeRK)) {
            List<String> pathSegments = uri.getPathSegments();
            if (hm3.b(pathSegments.get(0), "file") && pathSegments.size() == 3) {
                String str = pathSegments.get(1);
                str.getClass();
                String str2 = new String(se8.b(str, false), dn0.a);
                a();
                aj4 aj4Var = aj4.k;
                kl2 kl2VarH = k5d.h(str2);
                if (kl2VarH != null && !kl2VarH.d()) {
                    return new lh2(a(), new File(str2));
                }
                Handler handler = App.M0;
            }
        }
        return null;
    }

    public final c11 d(Uri uri) {
        long j;
        long j2;
        String strA;
        d11 d11Var = null;
        if (hm3.b(uri.getAuthority(), XMpxi.jdjhBZ)) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                String str = pathSegments.get(0);
                if (hm3.b(str, "le")) {
                    String str2 = pathSegments.get(1);
                    LinkedHashMap linkedHashMap = this.c;
                    synchronized (linkedHashMap) {
                        d11 d11Var2 = (d11) linkedHashMap.get(str2);
                        if (d11Var2 != null) {
                            d11Var2.l();
                            d11Var = d11Var2;
                        }
                    }
                    return d11Var;
                }
                if (hm3.b(str, "uid")) {
                    try {
                        String str3 = pathSegments.get(1);
                        App appA = a();
                        str3.getClass();
                        ng4 ng4Var = new pg4(appA, str3).b;
                        String queryParameter = uri.getQueryParameter("size");
                        if (queryParameter != null) {
                            j = Long.parseLong(queryParameter);
                        } else {
                            j = -1;
                        }
                        long j3 = j;
                        String queryParameter2 = uri.getQueryParameter("time");
                        if (queryParameter2 != null) {
                            j2 = Long.parseLong(queryParameter2);
                        } else {
                            j2 = 0;
                        }
                        long j4 = j2;
                        if (ng4Var instanceof uh2) {
                            ((uh2) ng4Var).Q = j3;
                            ((uh2) ng4Var).R = j4;
                        } else if (ng4Var instanceof qy1) {
                            ((qy1) ng4Var).U = j4;
                        }
                        if (ng4Var.m0()) {
                            strA = ng4Var.c();
                        } else {
                            strA = a().A(ng4Var.Z());
                        }
                        return new mh2(ng4Var, j3, j4, strA, d);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return null;
    }
}
