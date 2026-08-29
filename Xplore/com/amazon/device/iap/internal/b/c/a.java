package com.amazon.device.iap.internal.b.c;

import com.amazon.device.iap.internal.a.ns.SFLvitRFwnxtcs;
import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.util.MetricsHelper;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.venezia.command.SuccessResult;
import defpackage.tv0;
import defpackage.yu4;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {
    private static final String b = "a";

    public a(e eVar, Set<String> set) {
        super(eVar, "2.0", set);
    }

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        Map data = successResult.getData();
        com.amazon.device.iap.internal.util.e.a(b, "data: " + data);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap map = new HashMap();
        for (String str : this.a) {
            if (data.containsKey(str)) {
                try {
                    map.put(str, a(str, data));
                } catch (IllegalArgumentException e) {
                    linkedHashSet.add(str);
                    String str2 = (String) data.get(str);
                    String strC = c();
                    StringBuilder sb = new StringBuilder();
                    String str3 = b;
                    sb.append(str3);
                    sb.append(".onResult()");
                    MetricsHelper.submitJsonParsingExceptionMetrics(strC, str2, sb.toString());
                    StringBuilder sbR = yu4.r("Error parsing JSON for SKU ", str, ": ");
                    sbR.append(e.getMessage());
                    com.amazon.device.iap.internal.util.e.b(str3, sbR.toString());
                }
            } else {
                linkedHashSet.add(str);
            }
        }
        e eVarB = b();
        eVarB.d().a(new ProductDataResponseBuilder().setRequestId(eVarB.c()).setRequestStatus(ProductDataResponse.RequestStatus.SUCCESSFUL).setUnavailableSkus(linkedHashSet).setProductData(map).build());
        return true;
    }

    private Product a(String str, Map map) {
        JSONObject jSONObjectOptJSONObject;
        String str2 = (String) map.get(str);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            ProductType productTypeValueOf = ProductType.valueOf(jSONObject.getString("itemType").toUpperCase());
            String string = jSONObject.getString("description");
            String strOptString = jSONObject.optString("price", null);
            if (com.amazon.device.iap.internal.util.d.a(strOptString) && (jSONObjectOptJSONObject = jSONObject.optJSONObject("priceJson")) != null) {
                Currency currency = Currency.getInstance(jSONObjectOptJSONObject.getString("currency"));
                strOptString = currency.getSymbol() + new BigDecimal(jSONObjectOptJSONObject.getString("value"));
            }
            return new ProductBuilder().setSku(str).setProductType(productTypeValueOf).setDescription(string).setPrice(strOptString).setSmallIconUrl(jSONObject.getString("iconUrl")).setTitle(jSONObject.getString(SFLvitRFwnxtcs.uszXpYH)).setCoinsRewardAmount(jSONObject.optInt("coinsRewardAmount", 0)).build();
        } catch (JSONException unused) {
            defpackage.e.k(tv0.k("error in parsing json string", str2));
            return null;
        }
    }
}
