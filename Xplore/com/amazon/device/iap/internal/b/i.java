package com.amazon.device.iap.internal.b;

import com.amazon.android.Kiwi;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.framework.task.command.AbstractCommandTask;
import com.amazon.android.licensing.LicenseFailurePromptContentMapper;
import com.amazon.device.iap.PurchasingService;
import com.amazon.venezia.command.FailureResult;
import com.amazon.venezia.command.SuccessResult;
import com.google.android.play.core.common.Ag.XdGEXS;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends AbstractCommandTask {
    private static final String a = "i";
    private final e b;
    private final String c;
    private final String d;
    private final String e;
    private final Map<String, Object> f;
    private boolean h;
    private i i;
    private i j;
    private final LicenseFailurePromptContentMapper g = new LicenseFailurePromptContentMapper();
    private boolean k = false;

    public i(e eVar, String str, String str2) {
        this.b = eVar;
        String string = eVar.c().toString();
        this.c = string;
        this.d = str;
        this.e = str2;
        HashMap map = new HashMap();
        this.f = map;
        map.put("requestId", string);
        map.put("sdkVersion", PurchasingService.SDK_VERSION);
        this.h = true;
        this.i = null;
        this.j = null;
    }

    private void a(PromptContent promptContent) {
        if (promptContent == null) {
            return;
        }
        Kiwi.getPromptManager().present(new b(promptContent));
    }

    public abstract boolean a(SuccessResult successResult);

    public void a_() {
        Kiwi.addCommandToCommandTaskPipeline(this);
    }

    public void b(i iVar) {
        this.j = iVar;
    }

    public String c() {
        return this.c;
    }

    public Map<String, Object> getCommandData() {
        return this.f;
    }

    public String getCommandName() {
        return this.d;
    }

    public String getCommandVersion() {
        return this.e;
    }

    public boolean isExecutionNeeded() {
        return true;
    }

    public final void onFailure(FailureResult failureResult) {
        String str;
        i iVar;
        com.amazon.device.iap.internal.util.e.a(a, "onFailure: result = " + failureResult);
        if (failureResult != null && (str = (String) failureResult.getExtensionData().get("maxVersion")) != null && str.equalsIgnoreCase("1.0") && (iVar = this.j) != null) {
            iVar.a(this.k);
            this.j.a_();
            return;
        }
        if (this.h) {
            a(new PromptContent(failureResult.getDisplayableName(), failureResult.getDisplayableMessage(), failureResult.getButtonLabel(), failureResult.show()));
        }
        if (this.k) {
            return;
        }
        this.b.b();
    }

    public final void onSuccess(SuccessResult successResult) {
        boolean zA;
        i iVar;
        String str = (String) successResult.getData().get("errorMessage");
        com.amazon.device.iap.internal.util.e.a(a, "onSuccess: result = " + successResult + ", errorMessage: " + str);
        if (!com.amazon.device.iap.internal.util.d.a(str)) {
            if (this.k) {
                return;
            }
            this.b.b();
            return;
        }
        try {
            zA = a(successResult);
        } catch (Exception e) {
            com.amazon.device.iap.internal.util.e.b(a, "Error calling onResult: " + e);
            zA = false;
        }
        if (zA && (iVar = this.i) != null) {
            iVar.a_();
            return;
        }
        if (this.k) {
            return;
        }
        e eVar = this.b;
        if (zA) {
            eVar.a();
        } else {
            eVar.b();
        }
    }

    public final void onException(KiwiException kiwiException) {
        i iVar;
        com.amazon.device.iap.internal.util.e.a(a, XdGEXS.QNzhRwCKgR + kiwiException.getMessage());
        if ("UNHANDLED_EXCEPTION".equals(kiwiException.getType()) && "2.0".equals(this.e) && (iVar = this.j) != null) {
            iVar.a(this.k);
            this.j.a_();
            return;
        }
        if (this.h) {
            a(this.g.map(kiwiException));
        }
        if (this.k) {
            return;
        }
        this.b.b();
    }

    public e b() {
        return this.b;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public i a(boolean z) {
        this.k = z;
        return this;
    }

    public void a(i iVar) {
        this.i = iVar;
    }

    public void a(String str, Object obj) {
        this.f.put(str, obj);
    }
}
