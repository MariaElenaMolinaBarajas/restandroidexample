package com.example.mobileandroidtest.dao;

/**
 * Timeout Interceptor class
 * @author memb
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\t"}, d2 = {"Lcom/example/mobileandroidtest/dao/TimeoutInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "isConnectionTimedOut", "", "app_debug"})
public final class TimeoutInterceptor implements okhttp3.Interceptor {
    
    public TimeoutInterceptor() {
        super();
    }
    
    /**
     * Override intercept
     * @param chain Interceptor.Chain
     * return Response
     */
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    /**
     * Validate connection time out
     * @param chain Interceptor.Chain
     * @return Boolean
     */
    private final boolean isConnectionTimedOut(okhttp3.Interceptor.Chain chain) {
        return false;
    }
}