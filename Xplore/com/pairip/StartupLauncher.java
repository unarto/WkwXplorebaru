package com.pairip;

/* JADX INFO: loaded from: classes2.dex */
public final class StartupLauncher {
    private static boolean launchCalled = false;
    private static String startupProgramName = "8nXYqC5r7wvAOy8x";

    public static synchronized void launch() {
        if (launchCalled) {
            return;
        }
        launchCalled = true;
        VMRunner.invoke(startupProgramName, null);
    }

    private StartupLauncher() {
    }
}
