package com.example.mobileandroidtest.model

import com.google.gson.annotations.SerializedName

/**
 * Street data class
 * @author memb
 */
data class Street(
    @SerializedName("name")
    val name: String,
    @SerializedName("number")
    val number: Int
)