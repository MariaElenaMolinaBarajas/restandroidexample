package com.example.mobileandroidtest.dao;

/**
 * Retrofit class to connect with the service
 * @author memb
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/mobileandroidtest/dao/RetrofitInstance;", "", "()V", "Companion", "app_debug"})
public final class RetrofitInstance {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BASE_URL = "https://randomuser.me";
    @org.jetbrains.annotations.NotNull
    private static final okhttp3.logging.HttpLoggingInterceptor interceptor = null;
    @org.jetbrains.annotations.NotNull
    private static final com.example.mobileandroidtest.dao.TimeoutInterceptor timeoutInterceptorImpl = null;
    @org.jetbrains.annotations.NotNull
    private static final okhttp3.OkHttpClient client = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.mobileandroidtest.dao.RetrofitInstance.Companion Companion = null;
    
    public RetrofitInstance() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/mobileandroidtest/dao/RetrofitInstance$Companion;", "", "()V", "BASE_URL", "", "client", "Lokhttp3/OkHttpClient;", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "timeoutInterceptorImpl", "Lcom/example/mobileandroidtest/dao/TimeoutInterceptor;", "getRetrofitInstance", "Lretrofit2/Retrofit;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create URL and JSON is created
         * @return Retrofit
         */
        @org.jetbrains.annotations.NotNull
        public final retrofit2.Retrofit getRetrofitInstance() {
            return null;
        }
    }
}