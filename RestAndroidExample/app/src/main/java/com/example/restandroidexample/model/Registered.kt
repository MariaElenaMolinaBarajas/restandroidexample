package com.example.mobileandroidtest.model

import com.google.gson.annotations.SerializedName

/**
 * Registered data class
 * @author memb
 */
data class Registered(
    @SerializedName("age")
    val age: Int,
    @SerializedName("date")
    val date: String
)