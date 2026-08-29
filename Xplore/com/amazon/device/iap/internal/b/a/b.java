package com.amazon.device.iap.internal.b.a;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    private static final String a = "b";

    public b(e eVar) {
        super(eVar, "1.0");
    }

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        Receipt receiptA;
        Map data = successResult.getData();
        com.amazon.device.iap.internal.util.e.a(a, "data: " + data);
        String str = (String) getCommandData().get("requestId");
        String str2 = (String) data.get("userId");
        String str3 = (String) data.get("marketplace");
        String str4 = (String) data.get("receipt");
        if (str == null || !com.amazon.device.iap.internal.c.b.a().a(str)) {
            b().d().b();
            return true;
        }
        if (com.amazon.device.iap.internal.util.d.a(str4)) {
            a(str2, str3, str, PurchaseResponse.RequestStatus.FAILED);
            return false;
        }
        JSONObject jSONObject = new JSONObject(str4);
        PurchaseResponse.RequestStatus requestStatusSafeValueOf = PurchaseResponse.RequestStatus.safeValueOf(jSONObject.getString("orderStatus"));
        if (requestStatusSafeValueOf == PurchaseResponse.RequestStatus.SUCCESSFUL) {
            try {
                receiptA = com.amazon.device.iap.internal.util.a.a(jSONObject, str2, str);
                if (ProductType.CONSUMABLE == receiptA.getProductType()) {
                    a(str, str2, str4);
                }
            } catch (Throwable unused) {
                a(str2, str3, str, PurchaseResponse.RequestStatus.FAILED);
                return false;
            }
        } else {
            receiptA = null;
        }
        e eVarB = b();
        eVarB.d().a(new PurchaseResponseBuilder().setRequestId(eVarB.c()).setRequestStatus(requestStatusSafeValueOf).setUserData(new UserDataBuilder().setUserId(str2).setMarketplace(str3).build()).setReceipt(receiptA).build());
        return true;
    }

    private void a(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            if (PurchaseResponse.RequestStatus.safeValueOf(jSONObject.getString("orderStatus")) == PurchaseResponse.RequestStatus.SUCCESSFUL) {
                com.amazon.device.iap.internal.c.a.a().a(str, str2, com.amazon.device.iap.internal.util.a.a(jSONObject, str2, str).getReceiptId(), str3);
            }
        } catch (Throwable th) {
            com.amazon.device.iap.internal.util.e.b(a, "Error in savePendingReceipt: " + th);
        }
    }
}
