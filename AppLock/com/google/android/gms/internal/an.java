package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.C2445g;
import com.google.android.gms.common.api.C2463d;
import com.google.android.gms.common.api.C2463d.C2462a;
import com.google.android.gms.common.api.C2466h;
import com.google.android.gms.common.api.Status;

public class an<R extends C2445g> extends C2463d<R> {
    private final Status f7907a;

    @Nullable
    public Integer mo3470a() {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    public void mo3471a(@NonNull C2462a c2462a) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    public void mo3472a(@NonNull C2466h<? super R> c2466h) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @NonNull
    Status m8981b() {
        return this.f7907a;
    }
}
