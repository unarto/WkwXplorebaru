package androidx.work;

import android.content.Context;
import defpackage.bp3;
import defpackage.d81;
import defpackage.hm3;
import defpackage.jh4;
import defpackage.mb1;
import defpackage.n1c;
import defpackage.nb1;
import defpackage.o0d;
import defpackage.qh4;
import defpackage.s4d;
import defpackage.za1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-b27c35d34ee1aa35f2ccd8a4e3bf8990c42366571be3447cced122019a0faa6f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lqh4;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "mb1", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends qh4 {
    public final WorkerParameters e;
    public final mb1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = mb1.c;
    }

    public abstract Object a(d81 d81Var);

    @Override // defpackage.qh4
    public final jh4 getForegroundInfoAsync() {
        bp3 bp3VarA = n1c.a();
        mb1 mb1Var = this.f;
        mb1Var.getClass();
        return s4d.b(o0d.g(mb1Var, bp3VarA), new nb1(this, null, 0));
    }

    @Override // defpackage.qh4
    public final jh4 startWork() {
        mb1 mb1Var = mb1.c;
        za1 za1Var = this.f;
        if (hm3.b(za1Var, mb1Var)) {
            za1Var = this.e.g;
        }
        za1Var.getClass();
        return s4d.b(za1Var.y(n1c.a()), new nb1(this, null, 1));
    }
}
