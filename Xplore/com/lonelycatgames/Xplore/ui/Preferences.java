package com.lonelycatgames.Xplore.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import com.google.android.material.floatingactionbutton.lGl.OGXZhi;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.R;
import defpackage.a16;
import defpackage.b10;
import defpackage.c4;
import defpackage.d60;
import defpackage.es5;
import defpackage.exc;
import defpackage.fb4;
import defpackage.fwc;
import defpackage.gs0;
import defpackage.hm3;
import defpackage.ia8;
import defpackage.is;
import defpackage.kd7;
import defpackage.l36;
import defpackage.la;
import defpackage.m36;
import defpackage.m60;
import defpackage.mu;
import defpackage.mx0;
import defpackage.n36;
import defpackage.p0d;
import defpackage.p36;
import defpackage.pg8;
import defpackage.px0;
import defpackage.q36;
import defpackage.qx0;
import defpackage.ra2;
import defpackage.rk5;
import defpackage.rx0;
import defpackage.s26;
import defpackage.s36;
import defpackage.sx0;
import defpackage.t36;
import defpackage.td3;
import defpackage.to4;
import defpackage.u36;
import defpackage.uc4;
import defpackage.ud3;
import defpackage.uj8;
import defpackage.usb;
import defpackage.v26;
import defpackage.ve6;
import defpackage.w15;
import defpackage.w26;
import defpackage.x26;
import defpackage.x36;
import defpackage.xr0;
import defpackage.y36;
import defpackage.yl8;
import defpackage.yr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class Preferences extends y36 {
    public static final Map h0 = to4.q(new es5("en", "English"), new es5("ca", "Català"), new es5("cs", "Česky"), new es5("de", "Deutsch"), new es5("es", "Español"), new es5("fr", "Français"), new es5("el", "Ελληνικά (Greek)"), new es5("et", "Eesti"), new es5("in", "Bahasa Indonesia"), new es5("it", "Italiano"), new es5("lt", "Lietuvos"), new es5("lv", "Latviešu"), new es5("hu", "Magyar"), new es5("nl", "Nederlands"), new es5("pl", "Polski"), new es5("pt", "Português (Portugal)"), new es5("pt-br", "Português (Brasil)"), new es5("ro", "Română"), new es5("sk", "Slovensky"), new es5("tr", "Türkçe"), new es5("vi", "Tiếng Việt"), new es5("bg", "Български"), new es5("uk", "Українська"), new es5("uz", "O'zbek tili"), new es5("zh-cn", "简体中文 (Simplified Chinese)"), new es5("zh-tw", "繁體中文（Traditional Chinese）"), new es5("ja", "日本語 (Japanese)"), new es5("ko", "한국어 (Korean)"), new es5("ar", "لعربية (Arabic)"), new es5("fa", "فارسی (Persian)"), new es5(OGXZhi.uJNJMiGFY, "עִבְרִית (Hebrew)"), new es5("bn", "বাংলা (Bengali)"), new es5("gu", "ગુજરાતી (Gujarati)"), new es5("hi", "हिन्दी (Hindi)"), new es5("kn", "ಕನ್ನಡ (Kannada)"), new es5("mr", "मराठी (Marathi)"), new es5("ta", "தமிழ் (Tamil)"), new es5("te", "తెలుగు (Telugu)"), new es5("be", "Беларуская"));
    public boolean e0;
    public final b10 f0 = new b10(ve6.a.b(a.class), new x26(this, 1), new x26(this, 0), new x26(this, 2));
    public ArrayList g0;

    /* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
    public static final class a extends uj8 {
        public boolean b;
    }

    @Override // defpackage.y36
    public final List P() {
        ArrayList arrayList = this.g0;
        if (arrayList != null) {
            return arrayList;
        }
        hm3.l("items");
        throw null;
    }

    @Override // defpackage.y36
    public final int Q() {
        return R.string.configuration;
    }

    @Override // defpackage.y36
    public final void R() {
        setResult(-1);
        this.e0 = true;
    }

    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        char c;
        n36 n36Var;
        char c2;
        char c3;
        char c4;
        char c5;
        w26 w26Var;
        Integer numValueOf = Integer.valueOf(R.string.enabled);
        Integer numValueOf2 = Integer.valueOf(R.string.disabled);
        Integer numValueOf3 = Integer.valueOf(R.drawable.op_sort);
        super.onCreate(bundle);
        App appW = w();
        Resources resources = getResources();
        resources.getClass();
        appW.a(resources, false);
        m60 m60Var = new m60(w(), "appStart");
        n36 n36Var2 = new n36(this, Integer.valueOf(R.string.show_hidden_files), "showHidden", Integer.valueOf(R.string.show_hidden_files_hlp), Integer.valueOf(R.drawable.op_show_hidden), null, 112);
        Integer numValueOf4 = Integer.valueOf(R.string.root_access);
        ra2 ra2Var = qx0.J;
        ArrayList arrayList = new ArrayList(yr0.o(ra2Var, 10));
        c4 c4Var = new c4(0, ra2Var);
        while (true) {
            if (!c4Var.hasNext()) {
                break;
            }
            CharSequence text = getText(((qx0) c4Var.next()).a);
            text.getClass();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                text = p0d.e(spanned);
            }
            arrayList.add(text);
        }
        q36 q36Var = new q36(this, numValueOf4, "root_access", arrayList, 1, Integer.valueOf(R.string.root_access_hlp), null, 160);
        n36 n36Var3 = new n36(this, Integer.valueOf(R.string.show_media), "showMediaFiles", Integer.valueOf(R.string.show_media_hlp), null, null, 104);
        n36 n36Var4 = new n36(this, Integer.valueOf(R.string.open_apk_as_zip), "showApkAsZip", Integer.valueOf(R.string.open_apk_files_as_zip_hlp), Integer.valueOf(R.drawable.op_apk_as_zip), null, 112);
        ra2 ra2Var2 = rx0.e;
        ArrayList arrayList2 = new ArrayList(yr0.o(ra2Var2, 10));
        c4 c4Var2 = new c4(0, ra2Var2);
        while (c4Var2.hasNext()) {
            arrayList2.add(Integer.valueOf(((rx0) c4Var2.next()).a));
        }
        rx0.b.getClass();
        q36 q36Var2 = new q36(this, Integer.valueOf(R.string.sort_by), "sortMode", arrayList2, rx0.c.ordinal(), Integer.valueOf(R.string.sort_by_hlp), numValueOf3, 192);
        ra2 ra2Var3 = px0.J;
        ArrayList arrayList3 = new ArrayList(yr0.o(ra2Var3, 10));
        c4 c4Var3 = new c4(0, ra2Var3);
        while (c4Var3.hasNext()) {
            arrayList3.add(Integer.valueOf(((px0) c4Var3.next()).a));
        }
        px0.b.getClass();
        q36 q36Var3 = new q36(this, Integer.valueOf(R.string.sort_images_by), "imageSortMode", arrayList3, px0.c.ordinal(), Integer.valueOf(R.string.sort_images_by_help), numValueOf3, 192);
        n36 n36Var5 = new n36(this, Integer.valueOf(R.string.sort_descending), "sortDescending", Integer.valueOf(R.string.sort_descending_hlp), numValueOf3, null, 112);
        n36 n36Var6 = new n36(this, Integer.valueOf(R.string.sort_audio_by_metadata), "sortAudioByMetadata", Integer.valueOf(R.string.sort_audio_by_metadata_hlp), numValueOf3, null, 112);
        ra2 ra2Var4 = mx0.e;
        ArrayList arrayList4 = new ArrayList(yr0.o(ra2Var4, 10));
        c4 c4Var4 = new c4(0, ra2Var4);
        while (c4Var4.hasNext()) {
            arrayList4.add(Integer.valueOf(((mx0) c4Var4.next()).a));
        }
        mx0.b.getClass();
        q36 q36Var4 = new q36(this, Integer.valueOf(R.string.sort_dirs_by), "dirSortMode", arrayList4, mx0.c.ordinal(), null, numValueOf3, 208);
        Integer numValueOf5 = Integer.valueOf(R.string.text_coding);
        List listU = is.U(sx0.J);
        String[] strArr = sx0.K;
        s36 s36Var = new s36(this, numValueOf5, "defaultCharset", listU, is.U(strArr), strArr[0], Integer.valueOf(R.string.text_coding_hlp), null, null, 192);
        n36 n36Var7 = new n36(this, Integer.valueOf(R.string.vibrate_on_success), "vibrate", Integer.valueOf(R.string.vibrate_on_success_hlp), null, null, 104);
        x36 x36Var = new x36(this, Integer.valueOf(R.string.item_height), "itemHeight", Integer.valueOf(R.string.item_height_hlp), 80, 250, w().getResources().getInteger(R.integer.defaultItemHeightPercent), 8);
        x36 x36Var2 = new x36(this, Integer.valueOf(R.string.font_scale), "fontScale", Integer.valueOf(R.string.font_scale_hlp), 50, 200, 100, 8);
        n36 n36Var8 = new n36(this, Integer.valueOf(R.string.fullscreen), "fullscreen", Integer.valueOf(R.string.fullscreen_hlp), null, null, 120);
        l36 l36Var = new l36(this, Integer.valueOf(R.string.program_password), Integer.valueOf(R.string.program_password_hlp));
        int iA = new mu(new yl8((Context) m60Var.a)).a(m60Var.b.equals("appStart") ? 255 : 15);
        if (iA == 12 || iA == -1 || m60Var.c == null) {
            c = '\f';
            n36Var = null;
        } else {
            c = '\f';
            n36Var = new n36(this, Integer.valueOf(R.string.fingerprint_to_start), "useFingerToStart", Integer.valueOf(R.string.fingerprint_to_start_hlp), Integer.valueOf(R.drawable.ic_fp_40px), null, 112);
        }
        p36 p36Var = new p36(this, Integer.valueOf(R.string.dark_theme), fwc.h(numValueOf2, numValueOf, Integer.valueOf(R.string.automatic)), Integer.valueOf(R.string.dark_theme_hlp), Integer.valueOf(R.drawable.ic_dark_mode));
        n36 n36Var9 = new n36(this, Integer.valueOf(R.string.remember_path), "rememberLastPath", Integer.valueOf(R.string.remember_path_hlp), null, null, 104);
        n36 n36Var10 = new n36(this, Integer.valueOf(R.string.ask_to_exit), "ask_to_exit", Integer.valueOf(R.string.ask_to_exit_hlp), null, null, 104);
        q36 q36Var5 = new q36(this, Integer.valueOf(R.string.use_recycle_bin), "use_trash", fwc.h(numValueOf2, numValueOf, Integer.valueOf(R.string.enabled_and_hidden)), 0, Integer.valueOf(R.string.use_recycle_bin_hlp), Integer.valueOf(R.drawable.le_folder_overlay_trash), 192);
        List listS = to4.s(h0);
        List listG = fwc.g(getString(R.string.sort_default));
        List list = listS;
        ArrayList arrayList5 = new ArrayList(yr0.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList5.add((String) ((es5) it.next()).b);
        }
        ArrayList arrayListP = xr0.P(listG, arrayList5);
        List listG2 = fwc.g("");
        ArrayList arrayList6 = new ArrayList(yr0.o(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList6.add((String) ((es5) it2.next()).a);
        }
        ArrayList arrayListP2 = xr0.P(listG2, arrayList6);
        w15 w15Var = uc4.a;
        ud3 ud3VarB = exc.b;
        if (ud3VarB != null) {
            c2 = 17;
            c3 = c;
        } else {
            td3 td3Var = new td3("Sharp.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = pg8.a;
            kd7 kd7Var = new kd7(gs0.b);
            usb usbVar = new usb(17);
            usbVar.p(11.99f, 2.0f);
            usbVar.h(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            c2 = 17;
            usbVar.v(4.47f, 10.0f, 9.99f, 10.0f);
            usbVar.h(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
            usbVar.u(17.52f, 2.0f, 11.99f, 2.0f);
            usbVar.g();
            usbVar.p(18.92f, 8.0f);
            usbVar.l(-2.95f);
            usbVar.i(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
            usbVar.i(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
            usbVar.g();
            usbVar.p(12.0f, 4.04f);
            usbVar.i(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
            usbVar.l(-3.82f);
            usbVar.i(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
            usbVar.g();
            usbVar.p(4.26f, 14.0f);
            usbVar.h(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
            c3 = c;
            usbVar.v(0.1f, -1.36f, 0.26f, -2.0f);
            usbVar.l(3.38f);
            usbVar.i(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
            usbVar.v(0.06f, 1.34f, 0.14f, 2.0f);
            usbVar.n(4.26f, 14.0f);
            usbVar.g();
            usbVar.p(5.08f, 16.0f);
            usbVar.l(2.95f);
            usbVar.i(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
            usbVar.i(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
            usbVar.g();
            usbVar.p(8.03f, 8.0f);
            usbVar.n(5.08f, 8.0f);
            usbVar.i(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
            usbVar.h(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
            usbVar.g();
            usbVar.p(12.0f, 19.96f);
            usbVar.i(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
            usbVar.l(3.82f);
            usbVar.i(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
            usbVar.g();
            usbVar.p(14.34f, 14.0f);
            usbVar.n(9.66f, 14.0f);
            usbVar.i(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
            usbVar.v(0.07f, -1.35f, 0.16f, -2.0f);
            usbVar.l(4.68f);
            usbVar.i(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
            usbVar.v(-0.07f, 1.34f, -0.16f, 2.0f);
            usbVar.g();
            usbVar.p(14.59f, 19.56f);
            usbVar.i(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
            usbVar.l(2.95f);
            usbVar.i(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
            usbVar.g();
            usbVar.p(16.36f, 14.0f);
            usbVar.i(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
            usbVar.v(-0.06f, -1.34f, -0.14f, -2.0f);
            usbVar.l(3.38f);
            usbVar.i(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
            usbVar.v(-0.1f, 1.36f, -0.26f, 2.0f);
            usbVar.l(-3.38f);
            usbVar.g();
            td3.a(td3Var, (ArrayList) usbVar.b, kd7Var);
            ud3VarB = td3Var.b();
            exc.b = ud3VarB;
        }
        v26 v26Var = new v26(this, arrayListP, arrayListP2, ud3VarB, new fb4(21, this));
        n36 n36Var11 = !w().b ? new n36(this, Integer.valueOf(R.string.clipboard_toolbar), "clipboardToolbar", Integer.valueOf(R.string.clipboard_toolbar_hlp), Integer.valueOf(R.drawable.op_clipboard), null, 112) : null;
        n36 n36Var12 = new n36(this, Integer.valueOf(R.string.show_dir_meta), "show_dir_meta", Integer.valueOf(R.string.show_dir_meta_hlp), null, null, 104);
        d60 d60Var = d60.a;
        m36 m36Var = (d60.b() && la.c) ? new m36(Integer.valueOf(R.string.gdpr_consent), Integer.valueOf(R.string.gdpr_consent_hlp), null, new a16(1, this)) : null;
        if (w().b) {
            c4 = 1;
            c5 = 0;
            w26Var = null;
        } else {
            List listD = w().D();
            ArrayList<rk5> arrayList7 = new ArrayList();
            for (Object obj : listD) {
                if (!(((rk5) obj) instanceof ia8)) {
                    arrayList7.add(obj);
                }
            }
            ArrayList arrayList8 = new ArrayList(yr0.o(arrayList7, 10));
            for (rk5 rk5Var : arrayList7) {
                arrayList8.add(new u36(Integer.valueOf(rk5Var.b), Integer.valueOf(rk5Var.a)));
            }
            List list2 = (List) w().C().d;
            ArrayList arrayList9 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                int iIndexOf = arrayList7.indexOf((rk5) it3.next());
                Integer numValueOf6 = iIndexOf >= 0 ? Integer.valueOf(iIndexOf) : null;
                if (numValueOf6 != null) {
                    arrayList9.add(numValueOf6);
                }
            }
            c5 = 0;
            c4 = 1;
            w26Var = new w26(this, arrayList7, arrayList8, arrayList9, w().getString(R.string.select_max_n_items, 3), new s26(this, arrayList7, 0));
        }
        t36[] t36VarArr = new t36[25];
        t36VarArr[c5] = n36Var2;
        t36VarArr[c4] = q36Var;
        t36VarArr[2] = n36Var3;
        t36VarArr[3] = n36Var4;
        t36VarArr[4] = q36Var2;
        t36VarArr[5] = q36Var3;
        t36VarArr[6] = n36Var5;
        t36VarArr[7] = n36Var6;
        t36VarArr[8] = q36Var4;
        t36VarArr[9] = s36Var;
        t36VarArr[10] = n36Var7;
        t36VarArr[11] = x36Var;
        t36VarArr[c3] = x36Var2;
        t36VarArr[13] = n36Var8;
        t36VarArr[14] = l36Var;
        t36VarArr[15] = n36Var;
        t36VarArr[16] = p36Var;
        t36VarArr[c2] = n36Var9;
        t36VarArr[18] = n36Var10;
        t36VarArr[19] = q36Var5;
        t36VarArr[20] = v26Var;
        t36VarArr[21] = n36Var11;
        t36VarArr[22] = n36Var12;
        t36VarArr[23] = m36Var;
        t36VarArr[24] = w26Var;
        this.g0 = is.y(t36VarArr);
        C();
    }

    @Override // defpackage.jv2, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.e0) {
            w().X();
            this.e0 = false;
        }
        b10 b10Var = this.f0;
        if (((a) b10Var.getValue()).b) {
            App appW = w();
            Resources resources = appW.getResources();
            resources.getClass();
            appW.a(resources, true);
            ((a) b10Var.getValue()).b = false;
        }
    }
}
