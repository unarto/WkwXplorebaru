package com.amazon.device.iap.internal.b.e;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    private static final String b = "c";

    public c(e eVar) {
        super(eVar, "2.0");
    }

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        String str = b;
        com.amazon.device.iap.internal.util.e.a(str, "onResult: result = " + successResult);
        Map data = successResult.getData();
        com.amazon.device.iap.internal.util.e.a(str, "data: " + data);
        String str2 = (String) data.get("userId");
        String str3 = (String) data.get("marketplace");
        e eVarB = b();
        if (com.amazon.device.iap.internal.util.d.a(str2) || com.amazon.device.iap.internal.util.d.a(str3)) {
            eVarB.d().a(new UserDataResponseBuilder().setRequestId(eVarB.c()).setRequestStatus(UserDataResponse.RequestStatus.FAILED).build());
            return false;
        }
        UserData userDataBuild = new UserDataBuilder().setUserId(str2).setMarketplace(str3).build();
        UserDataResponse userDataResponseBuild = new UserDataResponseBuilder().setRequestId(eVarB.c()).setRequestStatus(UserDataResponse.RequestStatus.SUCCESSFUL).setUserData(userDataBuild).build();
        eVarB.d().a("userId", userDataBuild.getUserId());
        eVarB.d().a(userDataResponseBuild);
        return true;
    }
}
