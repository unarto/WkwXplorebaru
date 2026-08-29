package com.pairip.application;

import android.content.Context;
import com.lonelycatgames.Xplore.App;
import com.pairip.SignatureCheck;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: classes2.dex */
public class Application extends App {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lonelycatgames.Xplore.App, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        VMRunner.setContext(context);
        SignatureCheck.verifyIntegrity(context);
        super.attachBaseContext(context);
    }
}
