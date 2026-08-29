package com.lonelycatgames.Xplore.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.material.sidesheet.CaOA.XMpxi;
import com.lonelycatgames.Xplore.App;
import com.lonelycatgames.Xplore.R;
import com.lonelycatgames.Xplore.api.LoginActivity;
import com.lonelycatgames.Xplore.ops.copy.Ww.EQvrnCmT;
import com.lonelycatgames.Xplore.ui.Tweaks;
import defpackage.ab4;
import defpackage.aw0;
import defpackage.ax0;
import defpackage.b52;
import defpackage.dd5;
import defpackage.dyc;
import defpackage.eg5;
import defpackage.f2c;
import defpackage.fwc;
import defpackage.gs0;
import defpackage.hm3;
import defpackage.hx5;
import defpackage.j72;
import defpackage.kc6;
import defpackage.m36;
import defpackage.n36;
import defpackage.pc1;
import defpackage.q36;
import defpackage.r84;
import defpackage.rc4;
import defpackage.s84;
import defpackage.sfc;
import defpackage.tq4;
import defpackage.tx2;
import defpackage.uc4;
import defpackage.uc5;
import defpackage.vs0;
import defpackage.w15;
import defpackage.wi9;
import defpackage.ws0;
import defpackage.wx2;
import defpackage.x36;
import defpackage.y36;
import defpackage.zv0;
import defpackage.zz2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes3.dex */
public final class Tweaks extends y36 {
    public static final /* synthetic */ int f0 = 0;
    public ArrayList e0;

    @Override // defpackage.y36
    public final void N(int i, zz2 zz2Var) {
        zz2Var.Y(-2015871877);
        int i2 = i & 1;
        if (zz2Var.O(i2, i2 != 0)) {
            ab4 ab4Var = ((r84) zz2Var.j(s84.a)).a;
            w15 w15VarK = f2c.k(hm3.d(uc4.a, gs0.b(0.2f, gs0.d), sfc.a), ab4Var.e, ab4Var.c);
            ws0 ws0VarA = vs0.a(b52.c, j72.Q, zz2Var, 0);
            int iHashCode = Long.hashCode(zz2Var.T);
            hx5 hx5VarL = zz2Var.l();
            w15 w15VarH = dyc.h(zz2Var, w15VarK);
            aw0.j.getClass();
            ax0 ax0Var = zv0.b;
            zz2Var.a0();
            if (zz2Var.S) {
                zz2Var.k(ax0Var);
            } else {
                zz2Var.j0();
            }
            tq4.g(zv0.f, zz2Var, ws0VarA);
            tq4.g(zv0.e, zz2Var, hx5VarL);
            tq4.g(zv0.g, zz2Var, Integer.valueOf(iHashCode));
            tq4.f(zz2Var, zv0.h);
            tq4.g(zv0.d, zz2Var, w15VarH);
            rc4.a(uc4.g(zz2Var).k, wi9.a, zz2Var, 48);
            zz2Var.p(true);
        } else {
            zz2Var.R();
        }
        kc6 kc6VarR = zz2Var.r();
        if (kc6VarR != null) {
            kc6VarR.d = new uc5(this, i, 21);
        }
    }

    @Override // defpackage.y36
    public final List P() {
        ArrayList arrayList = this.e0;
        if (arrayList != null) {
            return arrayList;
        }
        hm3.l("items");
        throw null;
    }

    @Override // defpackage.y36
    public final int Q() {
        return R.string.tweaks;
    }

    @Override // defpackage.j30, defpackage.jv2, defpackage.mu0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = new ArrayList();
        w15 w15Var = uc4.a;
        final int i = 0;
        arrayList.add(new m36("X-plore account", "Manage X-plore account", pc1.e(), new tx2(this) { // from class: f68
            public final /* synthetic */ Tweaks b;

            {
                this.b = this;
            }

            @Override // defpackage.tx2
            public final Object d() {
                int i2 = i;
                sa8 sa8Var = sa8.a;
                Tweaks tweaks = this.b;
                switch (i2) {
                    case 0:
                        int i3 = Tweaks.f0;
                        tweaks.startActivity(new Intent(tweaks, (Class<?>) LoginActivity.class).setAction("android.intent.action.EDIT").putExtra("account", tweaks.w().w()));
                        break;
                    default:
                        int i4 = Tweaks.f0;
                        dd5.f.getClass();
                        dd5.C();
                        tweaks.setResult(-1);
                        App appW = tweaks.w();
                        Handler handler = App.M0;
                        appW.k0("News reset", false);
                        tweaks.finish();
                        break;
                }
                return sa8Var;
            }
        }));
        arrayList.add(new n36(this, "Auto-pause music", "music_auto_pause", "Pause music player when screen goes off and resume it when screen goes back on.", null, null, 120));
        arrayList.add(new n36(this, "Context button", "show_context_button", "Show small button on left of files to open context menu.", null, null, 104));
        arrayList.add(new n36(this, "List animations", "list_animations", "Enable animations of items in file list.", null, null, 104));
        arrayList.add(new n36(this, "LAN high speed", "lanHighSpeed", "Use LAN file transfer in high-speed mode. It doesn't work with some servers.", null, null, 120));
        final int i2 = 4;
        arrayList.add(new n36(this, "Support split-APK", "exportSplitApk", "Export apps made of multiple APK files (Split-APK) as Zip containing all APKs.", null, new wx2(this) { // from class: g68
            public final /* synthetic */ Tweaks b;

            {
                this.b = this;
            }

            @Override // defpackage.wx2
            public final Object a(Object obj) {
                int i3 = i2;
                sa8 sa8Var = sa8.a;
                Tweaks tweaks = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i3) {
                    case 0:
                        int i4 = Tweaks.f0;
                        tweaks.x().y = zBooleanValue;
                        break;
                    case 1:
                        int i5 = Tweaks.f0;
                        tweaks.x().p = zBooleanValue;
                        break;
                    case 2:
                        int i6 = Tweaks.f0;
                        tweaks.x().F = zBooleanValue;
                        break;
                    case 3:
                        int i7 = Tweaks.f0;
                        tweaks.x().i = zBooleanValue;
                        break;
                    case 4:
                        int i8 = Tweaks.f0;
                        tweaks.x().s = zBooleanValue;
                        break;
                    case 5:
                        int i9 = Tweaks.f0;
                        tweaks.x().t = zBooleanValue;
                        break;
                    case 6:
                        int i10 = Tweaks.f0;
                        tweaks.x().u = zBooleanValue;
                        break;
                    case 7:
                        int i11 = Tweaks.f0;
                        tweaks.x().v = zBooleanValue;
                        break;
                    case 8:
                        int i12 = Tweaks.f0;
                        tweaks.x().w = zBooleanValue;
                        break;
                    default:
                        int i13 = Tweaks.f0;
                        tweaks.x().x = zBooleanValue;
                        break;
                }
                return sa8Var;
            }
        }, 40));
        arrayList.add(new n36(this, "Recycle bin unchecked", "trashUnchecked", "By default uncheck \"Use Recycle bin\" option when deleting files.", null, null, 120));
        if (Build.VERSION.SDK_INT >= 28) {
            arrayList.add(new n36(this, "Animate GIF/WEBP thumbnails", "animateGifThumbnails", null, null, null, 124));
        }
        arrayList.add(new n36(this, "Http streaming", "http_streaming", "Use http:// scheme when opening .html files.", null, null, 104));
        final int i3 = 5;
        arrayList.add(new n36(this, "Show full date", "showFullDate", "Show full date/time on files, including year and seconds.", null, new wx2(this) { // from class: g68
            public final /* synthetic */ Tweaks b;

            {
                this.b = this;
            }

            @Override // defpackage.wx2
            public final Object a(Object obj) {
                int i32 = i3;
                sa8 sa8Var = sa8.a;
                Tweaks tweaks = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i32) {
                    case 0:
                        int i4 = Tweaks.f0;
                        tweaks.x().y = zBooleanValue;
                        break;
                    case 1:
                        int i5 = Tweaks.f0;
                        tweaks.x().p = zBooleanValue;
                        break;
                    case 2:
                        int i6 = Tweaks.f0;
                        tweaks.x().F = zBooleanValue;
                        break;
                    case 3:
                        int i7 = Tweaks.f0;
                        tweaks.x().i = zBooleanValue;
                        break;
                    case 4:
                        int i8 = Tweaks.f0;
                        tweaks.x().s = zBooleanValue;
                        break;
                    case 5:
                        int i9 = Tweaks.f0;
                        tweaks.x().t = zBooleanValue;
                        break;
                    case 6:
                        int i10 = Tweaks.f0;
                        tweaks.x().u = zBooleanValue;
                        break;
                    case 7:
                        int i11 = Tweaks.f0;
                        tweaks.x().v = zBooleanValue;
                        break;
                    case 8:
                        int i12 = Tweaks.f0;
                        tweaks.x().w = zBooleanValue;
                        break;
                    default:
                        int i13 = Tweaks.f0;
                        tweaks.x().x = zBooleanValue;
                        break;
                }
                return sa8Var;
            }
        }, 56));
        final int i4 = 6;
        arrayList.add(new n36(this, "Show date on folders", "showDirDate", EQvrnCmT.ygSbJaOdgeIZl, null, new wx2(this) { // from class: g68
            public final /* synthetic */ Tweaks b;

            {
                this.b = this;
            }

            @Override // defpackage.wx2
            public final Object a(Object obj) {
                int i32 = i4;
                sa8 sa8Var = sa8.a;
                Tweaks tweaks = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i32) {
                    case 0:
                        int i42 = Tweaks.f0;
                        tweaks.x().y = zBooleanValue;
                        break;
                    case 1:
                        int i5 = Tweaks.f0;
                        tweaks.x().p = zBooleanValue;
                        break;
                    case 2:
                        int i6 = Tweaks.f0;
                        tweaks.x().F = zBooleanValue;
                        break;
                    case 3:
                        int i7 = Tweaks.f0;
                        tweaks.x().i = zBooleanValue;
                        break;
                    case 4:
                        int i8 = Tweaks.f0;
                        tweaks.x().s = zBooleanValue;
                        break;
                    case 5:
                        int i9 = Tweaks.f0;
                        tweaks.x().t = zBooleanValue;
                        break;
                    case 6:
                        int i10 = Tweaks.f0;
                        tweaks.x().u = zBooleanValue;
                        break;
                    case 7:
                        int i11 = Tweaks.f0;
                        tweaks.x().v = zBooleanValue;
                        break;
                    case 8:
                        int i12 = Tweaks.f0;
                        tweaks.x().w = zBooleanValue;
                        break;
                    default:
                        int i13 = Tweaks.f0;
                        tweaks.x().x = zBooleanValue;
                        break;
                }
                return sa8Var;
            }
        }, 56));
        final int i5 = 7;
        arrayList.add(new n36(this, "Show video framerate", "showVideoFps", "Show frames per seconds on videos.", null, new wx2(this) { // from class: g68
            public final /* synthetic */ Tweaks b;

            {
                this.b = this;
            }

            @Override // defpackage.wx2
            public final Object a(Object obj) {
                int i32 = i5;
                sa8 sa8Var = sa8.a;
                Tweaks tweaks = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i32) {
                    case 0:
                        int i42 = Tweaks.f0;
                        tweaks.x().y = zBooleanValue;
                        break;
                    case 1:
                        int i52 = Tweaks.f0;
                        tweaks.x().p = zBooleanValue;
                        break;
                    case 2:
                        int i6 = Tweaks.f0;
                        tweaks.x().F = zBooleanValue;
                        break;
                    case 3:
                        int i7 = Tweaks.f0;
                        tweaks.x().i = zBooleanValue;
                        break;
                    case 4:
                        int i8 = Tweaks.f0;
                        tweaks.x().s = zBooleanValue;
                        break;
                    case 5:
                        int i9 = Tweaks.f0;
                        tweaks.x().t = zBooleanValue;
                        break;
                    case 6:
                        int i10 = Tweaks.f0;
                        tweaks.x().u = zBooleanValue;
                        break;
                    case 7:
                        int i11 = Tweaks.f0;
                        tweaks.x().v = zBooleanValue;
                        break;
                    case 8:
                        int i12 = Tweaks.f0;
                        tweaks.x().w = zBooleanValue;
                        break;
                    default:
                        int i13 = Tweaks.f0;
                        tweaks.x().x = zBooleanValue;
                        break;
                }
                return sa8Var;
            }
        }, 56));
        final int i6 = 8;
        arrayList.add(new n36(this, "Show path on favorites", "hideFavoritePath", null, null, new wx2(this) { // from class: g68
            public final /* synthetic */ Tweaks b;

            {
                this.b = this;
            }

            @Override // defpackage.wx2
            public final Object a(Object obj) {
                int i32 = i6;
                sa8 sa8Var = sa8.a;
                Tweaks tweaks = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i32) {
                    case 0:
                        int i42 = Tweaks.f0;
                        tweaks.x().y = zBooleanValue;
                        break;
                    case 1:
                        int i52 = Tweaks.f0;
                        tweaks.x().p = zBooleanValue;
                        break;
                    case 2:
                        int i62 = Tweaks.f0;
                        tweaks.x().F = zBooleanValue;
                        break;
                    case 3:
                        int i7 = Tweaks.f0;
                        tweaks.x().i = zBooleanValue;
                        break;
                    case 4:
                        int i8 = Tweaks.f0;
                        tweaks.x().s = zBooleanValue;
                        break;
                    case 5:
                        int i9 = Tweaks.f0;
                        tweaks.x().t = zBooleanValue;
                        break;
                    case 6:
                        int i10 = Tweaks.f0;
                        tweaks.x().u = zBooleanValue;
                        break;
                    case 7:
                        int i11 = Tweaks.f0;
                        tweaks.x().v = zBooleanValue;
                        break;
                    case 8:
                        int i12 = Tweaks.f0;
                        tweaks.x().w = zBooleanValue;
                        break;
                    default:
                        int i13 = Tweaks.f0;
                        tweaks.x().x = zBooleanValue;
                        break;
                }
                return sa8Var;
            }
        }, 28));
        arrayList.add(new n36(this, "Show path on Bookmarks", "bookmarks_no_show_path", "In Bookmarks popup, display path of the bookmark.", null, null, 88));
        final int i7 = 9;
        arrayList.add(new n36(this, "Hide path bar", "hidePathBar", null, null, new wx2(this) { // from class: g68
            public final /* synthetic */ Tweaks b;

            {
                this.b = this;
            }

            @Override // defpackage.wx2
            public final Object a(Object obj) {
                int i32 = i7;
                sa8 sa8Var = sa8.a;
                Tweaks tweaks = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i32) {
                    case 0:
                        int i42 = Tweaks.f0;
                        tweaks.x().y = zBooleanValue;
                        break;
                    case 1:
                        int i52 = Tweaks.f0;
                        tweaks.x().p = zBooleanValue;
                        break;
                    case 2:
                        int i62 = Tweaks.f0;
                        tweaks.x().F = zBooleanValue;
                        break;
                    case 3:
                        int i72 = Tweaks.f0;
                        tweaks.x().i = zBooleanValue;
                        break;
                    case 4:
                        int i8 = Tweaks.f0;
                        tweaks.x().s = zBooleanValue;
                        break;
                    case 5:
                        int i9 = Tweaks.f0;
                        tweaks.x().t = zBooleanValue;
                        break;
                    case 6:
                        int i10 = Tweaks.f0;
                        tweaks.x().u = zBooleanValue;
                        break;
                    case 7:
                        int i11 = Tweaks.f0;
                        tweaks.x().v = zBooleanValue;
                        break;
                    case 8:
                        int i12 = Tweaks.f0;
                        tweaks.x().w = zBooleanValue;
                        break;
                    default:
                        int i13 = Tweaks.f0;
                        tweaks.x().x = zBooleanValue;
                        break;
                }
                return sa8Var;
            }
        }, 60));
        arrayList.add(new n36(this, "Take JPG date from Exif", "useJpgExifDate", "For JPG images on device, obtain file date from image Exif data", null, new wx2(this) { // from class: g68
            public final /* synthetic */ Tweaks b;

            {
                this.b = this;
            }

            @Override // defpackage.wx2
            public final Object a(Object obj) {
                int i32 = i;
                sa8 sa8Var = sa8.a;
                Tweaks tweaks = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i32) {
                    case 0:
                        int i42 = Tweaks.f0;
                        tweaks.x().y = zBooleanValue;
                        break;
                    case 1:
                        int i52 = Tweaks.f0;
                        tweaks.x().p = zBooleanValue;
                        break;
                    case 2:
                        int i62 = Tweaks.f0;
                        tweaks.x().F = zBooleanValue;
                        break;
                    case 3:
                        int i72 = Tweaks.f0;
                        tweaks.x().i = zBooleanValue;
                        break;
                    case 4:
                        int i8 = Tweaks.f0;
                        tweaks.x().s = zBooleanValue;
                        break;
                    case 5:
                        int i9 = Tweaks.f0;
                        tweaks.x().t = zBooleanValue;
                        break;
                    case 6:
                        int i10 = Tweaks.f0;
                        tweaks.x().u = zBooleanValue;
                        break;
                    case 7:
                        int i11 = Tweaks.f0;
                        tweaks.x().v = zBooleanValue;
                        break;
                    case 8:
                        int i12 = Tweaks.f0;
                        tweaks.x().w = zBooleanValue;
                        break;
                    default:
                        int i13 = Tweaks.f0;
                        tweaks.x().x = zBooleanValue;
                        break;
                }
                return sa8Var;
            }
        }, 56));
        List listH = fwc.h("Two panes full", "Two panes scrolling", XMpxi.SHaWFVaetRDSpIt, "Automatic");
        arrayList.add(new q36(this, "Portrait layout", "layout_portrait", listH, 3, null, null, 240));
        arrayList.add(new q36(this, "Landscape layout", "layout_landscape", listH, 3, null, null, 240));
        arrayList.add(new q36(this, "Button columns", "button_columns", fwc.h(Integer.valueOf(R.string.sort_default), "1", "2"), 0, "Number of buttons in one row in the center button bar.", null, 224));
        final int i8 = 1;
        arrayList.add(new n36(this, "Use X-plore USB-Driver", "enable_usb_driver", "Allow X-plore to access USB devices directly to work with USB OTG.", null, new wx2(this) { // from class: g68
            public final /* synthetic */ Tweaks b;

            {
                this.b = this;
            }

            @Override // defpackage.wx2
            public final Object a(Object obj) {
                int i32 = i8;
                sa8 sa8Var = sa8.a;
                Tweaks tweaks = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i32) {
                    case 0:
                        int i42 = Tweaks.f0;
                        tweaks.x().y = zBooleanValue;
                        break;
                    case 1:
                        int i52 = Tweaks.f0;
                        tweaks.x().p = zBooleanValue;
                        break;
                    case 2:
                        int i62 = Tweaks.f0;
                        tweaks.x().F = zBooleanValue;
                        break;
                    case 3:
                        int i72 = Tweaks.f0;
                        tweaks.x().i = zBooleanValue;
                        break;
                    case 4:
                        int i82 = Tweaks.f0;
                        tweaks.x().s = zBooleanValue;
                        break;
                    case 5:
                        int i9 = Tweaks.f0;
                        tweaks.x().t = zBooleanValue;
                        break;
                    case 6:
                        int i10 = Tweaks.f0;
                        tweaks.x().u = zBooleanValue;
                        break;
                    case 7:
                        int i11 = Tweaks.f0;
                        tweaks.x().v = zBooleanValue;
                        break;
                    case 8:
                        int i12 = Tweaks.f0;
                        tweaks.x().w = zBooleanValue;
                        break;
                    default:
                        int i13 = Tweaks.f0;
                        tweaks.x().x = zBooleanValue;
                        break;
                }
                return sa8Var;
            }
        }, 56));
        dd5.f.getClass();
        if (dd5.h.isEmpty()) {
            final int i9 = 1;
            arrayList.add(new m36("Reset News", "Make News button to show again", null, new tx2(this) { // from class: f68
                public final /* synthetic */ Tweaks b;

                {
                    this.b = this;
                }

                @Override // defpackage.tx2
                public final Object d() {
                    int i22 = i9;
                    sa8 sa8Var = sa8.a;
                    Tweaks tweaks = this.b;
                    switch (i22) {
                        case 0:
                            int i32 = Tweaks.f0;
                            tweaks.startActivity(new Intent(tweaks, (Class<?>) LoginActivity.class).setAction("android.intent.action.EDIT").putExtra("account", tweaks.w().w()));
                            break;
                        default:
                            int i42 = Tweaks.f0;
                            dd5.f.getClass();
                            dd5.C();
                            tweaks.setResult(-1);
                            App appW = tweaks.w();
                            Handler handler = App.M0;
                            appW.k0("News reset", false);
                            tweaks.finish();
                            break;
                    }
                    return sa8Var;
                }
            }));
        }
        String string = Settings.Secure.getString(w().getContentResolver(), "android_id");
        if (string != null) {
            String upperCase = string.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            arrayList.add(new m36("Android ID", upperCase, null, new eg5(this, 23, upperCase)));
        }
        arrayList.add(new n36(this, "Open files as new task", "openAsNewTask", "When opening a file, make a new task for opening app (visible in Recent tasks)", null, null, 120));
        arrayList.add(new n36(this, "Single pane", "singlePane", "Show only one pane.", null, null, 120));
        final int i10 = 2;
        arrayList.add(new n36(this, "Disable gesture for pane switch", "disablePaneGesture", "Disable horizontal swipe gesture for switching between panes.", null, new wx2(this) { // from class: g68
            public final /* synthetic */ Tweaks b;

            {
                this.b = this;
            }

            @Override // defpackage.wx2
            public final Object a(Object obj) {
                int i32 = i10;
                sa8 sa8Var = sa8.a;
                Tweaks tweaks = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i32) {
                    case 0:
                        int i42 = Tweaks.f0;
                        tweaks.x().y = zBooleanValue;
                        break;
                    case 1:
                        int i52 = Tweaks.f0;
                        tweaks.x().p = zBooleanValue;
                        break;
                    case 2:
                        int i62 = Tweaks.f0;
                        tweaks.x().F = zBooleanValue;
                        break;
                    case 3:
                        int i72 = Tweaks.f0;
                        tweaks.x().i = zBooleanValue;
                        break;
                    case 4:
                        int i82 = Tweaks.f0;
                        tweaks.x().s = zBooleanValue;
                        break;
                    case 5:
                        int i92 = Tweaks.f0;
                        tweaks.x().t = zBooleanValue;
                        break;
                    case 6:
                        int i102 = Tweaks.f0;
                        tweaks.x().u = zBooleanValue;
                        break;
                    case 7:
                        int i11 = Tweaks.f0;
                        tweaks.x().v = zBooleanValue;
                        break;
                    case 8:
                        int i12 = Tweaks.f0;
                        tweaks.x().w = zBooleanValue;
                        break;
                    default:
                        int i13 = Tweaks.f0;
                        tweaks.x().x = zBooleanValue;
                        break;
                }
                return sa8Var;
            }
        }, 56));
        arrayList.add(new n36(this, "Auto-update", "auto_update", "Download and offer app updates automatically", null, null, 104));
        final int i11 = 3;
        arrayList.add(new n36(this, "Media thumbnails", "showSmallMediaThumbnails", "If 'Show Media files' is disabled, show mini thumbnails on images and videos.", null, new wx2(this) { // from class: g68
            public final /* synthetic */ Tweaks b;

            {
                this.b = this;
            }

            @Override // defpackage.wx2
            public final Object a(Object obj) {
                int i32 = i11;
                sa8 sa8Var = sa8.a;
                Tweaks tweaks = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i32) {
                    case 0:
                        int i42 = Tweaks.f0;
                        tweaks.x().y = zBooleanValue;
                        break;
                    case 1:
                        int i52 = Tweaks.f0;
                        tweaks.x().p = zBooleanValue;
                        break;
                    case 2:
                        int i62 = Tweaks.f0;
                        tweaks.x().F = zBooleanValue;
                        break;
                    case 3:
                        int i72 = Tweaks.f0;
                        tweaks.x().i = zBooleanValue;
                        break;
                    case 4:
                        int i82 = Tweaks.f0;
                        tweaks.x().s = zBooleanValue;
                        break;
                    case 5:
                        int i92 = Tweaks.f0;
                        tweaks.x().t = zBooleanValue;
                        break;
                    case 6:
                        int i102 = Tweaks.f0;
                        tweaks.x().u = zBooleanValue;
                        break;
                    case 7:
                        int i112 = Tweaks.f0;
                        tweaks.x().v = zBooleanValue;
                        break;
                    case 8:
                        int i12 = Tweaks.f0;
                        tweaks.x().w = zBooleanValue;
                        break;
                    default:
                        int i13 = Tweaks.f0;
                        tweaks.x().x = zBooleanValue;
                        break;
                }
                return sa8Var;
            }
        }, 56));
        arrayList.add(new x36(this, Integer.valueOf(R.string.recent_files), "numRecentFiles", "Number of recent files to show in the list", 3, 100, 10, 328));
        this.e0 = arrayList;
        C();
    }
}
