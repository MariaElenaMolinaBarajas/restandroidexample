package com.example.mobileandroidtest.dao

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response
import java.net.SocketTimeoutException

/**
 * Timeout Interceptor class
 * @author memb
 */
class TimeoutInterceptor : Interceptor {

    /**
     * Override intercept
     * @param chain Interceptor.Chain
     * return Response
     */
    override fun intercept(chain: Interceptor.Chain): Response {
        Log.d("TAG_CONNECTION_1", "isConnectionTimedOut()")
        if (isConnectionTimedOut(chain))
            throw SocketTimeoutException()
        return chain.proceed(chain.request())
    }

    /**
     * Validate connection time out
     * @param chain Interceptor.Chain
     * @return Boolean
     */
    private fun isConnectionTimedOut(chain: Interceptor.Chain): Boolean {
        Log.d("TAG_CONNECTION_2", "isConnectionTimedOut()")
        try {
            val response = chain.proceed(chain.request())
            val content = response.toString()
            response.close()
            Log.d("TAG_CONNECTION_3", "isConnectionTimedOut() => $content")
        } catch (e: SocketTimeoutException) {
            return true
        }
        return false
    }
}