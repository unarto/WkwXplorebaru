package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.maps.android.compose.utils.attribution.njD.AUsNcgWE;
import defpackage.ay0;
import defpackage.do2;
import defpackage.dy0;
import defpackage.em;
import defpackage.eo2;
import defpackage.ho2;
import defpackage.lj9;
import defpackage.nqa;
import defpackage.zx0;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes2.dex */
public class ConfigFetchHttpClient {
    public static final Pattern g = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j, long j2) {
        this.a = context;
        this.b = str;
        this.c = str2;
        Matcher matcher = g.matcher(str);
        this.d = matcher.matches() ? matcher.group(1) : null;
        this.e = j;
        this.f = j2;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.d + "/namespaces/firebase:fetch").openConnection();
        } catch (IOException e) {
            throw new eo2(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f A[LOOP:0: B:13:0x0099->B:15:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00da A[Catch: all -> 0x01ad, JSONException -> 0x01af, IOException | JSONException -> 0x01b1, TRY_LEAVE, TryCatch #5 {all -> 0x01ad, blocks: (B:17:0x00be, B:19:0x00da, B:69:0x01b3, B:70:0x01bc, B:71:0x01bd, B:72:0x01c4), top: B:90:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b3 A[Catch: all -> 0x01ad, JSONException -> 0x01af, IOException | JSONException -> 0x01b1, TRY_ENTER, TryCatch #5 {all -> 0x01ad, blocks: (B:17:0x00be, B:19:0x00da, B:69:0x01b3, B:70:0x01bc, B:71:0x01bd, B:72:0x01c4), top: B:90:0x00be }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dy0 fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date, Map<String, String> map3) {
        String strC;
        int responseCode;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        boolean z;
        byte[] bArrG;
        httpURLConnection.setDoOutput(true);
        long j = this.e;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(j));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        Context context = this.a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            bArrG = lj9.g(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e);
        }
        if (bArrG == null) {
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
            strC = null;
            httpURLConnection.setRequestProperty("X-Android-Cert", strC);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            try {
                try {
                    d(httpURLConnection, a(str, str2, map, l, map3).toString().getBytes("utf-8"));
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        throw new ho2(responseCode, httpURLConnection.getResponseMessage());
                    }
                    String headerField = httpURLConnection.getHeaderField("ETag");
                    JSONObject jSONObjectC = c(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    try {
                        zx0 zx0VarD = ay0.d();
                        zx0VarD.d = date;
                        try {
                            jSONObject = jSONObjectC.getJSONObject("entries");
                        } catch (JSONException unused2) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            try {
                                zx0VarD.b = new JSONObject(jSONObject.toString());
                            } catch (JSONException unused3) {
                            }
                        }
                        try {
                            jSONArray = jSONObjectC.getJSONArray("experimentDescriptions");
                        } catch (JSONException unused4) {
                            jSONArray = null;
                        }
                        if (jSONArray != null) {
                            try {
                                zx0VarD.e = new JSONArray(jSONArray.toString());
                            } catch (JSONException unused5) {
                            }
                        }
                        try {
                            jSONObject2 = jSONObjectC.getJSONObject("personalizationMetadata");
                        } catch (JSONException unused6) {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            try {
                                zx0VarD.c = new JSONObject(jSONObject2.toString());
                            } catch (JSONException unused7) {
                            }
                        }
                        String string = jSONObjectC.has("templateVersion") ? jSONObjectC.getString("templateVersion") : null;
                        if (string != null) {
                            zx0VarD.a = Long.parseLong(string);
                        }
                        try {
                            jSONArray2 = jSONObjectC.getJSONArray("rolloutMetadata");
                        } catch (JSONException unused8) {
                            jSONArray2 = null;
                        }
                        if (jSONArray2 != null) {
                            try {
                                zx0VarD.f = new JSONArray(jSONArray2.toString());
                            } catch (JSONException unused9) {
                            }
                        }
                        ay0 ay0Var = new ay0((JSONObject) zx0VarD.b, (Date) zx0VarD.d, (JSONArray) zx0VarD.e, (JSONObject) zx0VarD.c, zx0VarD.a, (JSONArray) zx0VarD.f);
                        try {
                            z = !jSONObjectC.get("state").equals("NO_CHANGE");
                        } catch (JSONException unused10) {
                            z = true;
                        }
                        return !z ? new dy0(1, ay0Var, null) : new dy0(0, ay0Var, headerField);
                    } catch (JSONException e2) {
                        throw new do2("Fetch failed: fetch response could not be parsed.", e2);
                    }
                } finally {
                    httpURLConnection.disconnect();
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused11) {
                    }
                }
            } catch (IOException | JSONException e3) {
                throw new do2("The client had an error while calling the backend!", e3);
            }
        }
        strC = nqa.c(bArrG);
        httpURLConnection.setRequestProperty("X-Android-Cert", strC);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        while (r0.hasNext()) {
        }
        d(httpURLConnection, a(str, str2, map, l, map3).toString().getBytes("utf-8"));
        httpURLConnection.connect();
        responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
        }
    }

    public final JSONObject a(String str, String str2, Map map, Long l, Map map2) throws do2 {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new do2("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.b);
        Context context = this.a;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        map3.put("languageCode", locale.toLanguageTag());
        int i = Build.VERSION.SDK_INT;
        map3.put("platformVersion", Integer.toString(i));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(i >= 28 ? em.f(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put("sdkVersion", "23.1.0");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", AUsNcgWE.xcsHtiwtS + map2.keySet());
        }
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(map3);
    }
}
