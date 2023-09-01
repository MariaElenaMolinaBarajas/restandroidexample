package com.example.mobileandroidtest.dao

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

/**
 * Class internet connection
 * @author memb
 */
class InternetConnection {

    /**
     * Validate internet connection
     * @param context Context
     * @return Boolean
     */
    fun validateInternetConnection(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
        return activeNetwork?.isConnectedOrConnecting == true
    }
}