package com.example.mobileandroidtest.dao

import com.example.mobileandroidtest.utils.GlobalVariables
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Retrofit class to connect with the service
 * @author memb
 */
class RetrofitInstance {
    companion object {
        private const val BASE_URL = GlobalVariables.URL_RANDOM_USER
        private val interceptor = HttpLoggingInterceptor().apply {
            this.level = HttpLoggingInterceptor.Level.BODY
        }

        private val timeoutInterceptorImpl = TimeoutInterceptor()

        private val client = OkHttpClient.Builder().apply {
            this.addInterceptor(interceptor)
                .connectTimeout(
                    GlobalVariables.TIME_THIRTY.toLong(),
                    TimeUnit.SECONDS)

                .readTimeout(
                    GlobalVariables.TIME_TWENTY_FIVE.toLong(),
                    TimeUnit.SECONDS).addInterceptor(timeoutInterceptorImpl)
        }.build()

        /**
         * Create URL and JSON is created
         * @return Retrofit
         */
        fun getRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build()
        }
    }
}