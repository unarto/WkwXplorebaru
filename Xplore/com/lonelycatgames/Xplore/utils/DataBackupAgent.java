package com.lonelycatgames.Xplore.utils;

import android.app.backup.BackupAgentHelper;
import android.app.backup.FileBackupHelper;
import com.pairip.StartupLauncher;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class DataBackupAgent extends BackupAgentHelper {
    static {
        StartupLauncher.launch();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFilesDir() {
        return getDatabasePath("news.db").getParentFile();
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        addHelper("dbs", new FileBackupHelper(this, "news.db"));
    }
}
