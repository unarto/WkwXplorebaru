package com.lonelycatgames.Xplore.utils;

import com.lonelycatgames.Xplore.FileSystem.ftp.FtpShareServer;
import defpackage.xz7;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class FtpTileService extends xz7 {
    @Override // defpackage.xz7
    public final boolean b() {
        return a().N();
    }

    @Override // defpackage.xz7
    public final void c() {
        a().l0(true);
    }

    @Override // defpackage.xz7
    public final void d() {
        FtpShareServer ftpShareServer = a().l0;
        if (ftpShareServer != null) {
            ftpShareServer.stopSelf();
        }
    }
}
