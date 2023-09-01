package com.example.mobileandroidtest.model

import com.google.gson.annotations.SerializedName

/**
 * Dob data class
 * @author memb
 */
data class Dob(
    @SerializedName("age")
    val age: Int,
    @SerializedName("date")
    val date: String
)