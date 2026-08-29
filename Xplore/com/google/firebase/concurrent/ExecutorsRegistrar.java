package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ca6;
import defpackage.da8;
import defpackage.du0;
import defpackage.eu0;
import defpackage.g44;
import defpackage.j20;
import defpackage.n80;
import defpackage.ofa;
import defpackage.sp1;
import defpackage.uu0;
import defpackage.xe4;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final g44 a = new g44(new uu0(1));
    public static final g44 b = new g44(new uu0(2));
    public static final g44 c = new g44(new uu0(3));
    public static final g44 d = new g44(new uu0(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ca6 ca6Var = new ca6(j20.class, ScheduledExecutorService.class);
        ca6[] ca6VarArr = {new ca6(j20.class, ExecutorService.class), new ca6(j20.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(ca6Var);
        for (int i = 0; i < 2; i++) {
            ofa.b(ca6VarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, ca6VarArr);
        eu0 eu0Var = new eu0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new sp1(11), hashSet3);
        ca6 ca6Var2 = new ca6(n80.class, ScheduledExecutorService.class);
        ca6[] ca6VarArr2 = {new ca6(n80.class, ExecutorService.class), new ca6(n80.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(ca6Var2);
        for (int i2 = 0; i2 < 2; i2++) {
            ofa.b(ca6VarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, ca6VarArr2);
        eu0 eu0Var2 = new eu0(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new sp1(12), hashSet6);
        ca6 ca6Var3 = new ca6(xe4.class, ScheduledExecutorService.class);
        ca6[] ca6VarArr3 = {new ca6(xe4.class, ExecutorService.class), new ca6(xe4.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(ca6Var3);
        for (int i3 = 0; i3 < 2; i3++) {
            ofa.b(ca6VarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, ca6VarArr3);
        eu0 eu0Var3 = new eu0(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new sp1(13), hashSet9);
        du0 du0VarA = eu0.a(new ca6(da8.class, Executor.class));
        du0VarA.J = new sp1(14);
        return Arrays.asList(eu0Var, eu0Var2, eu0Var3, du0VarA.b());
    }
}
