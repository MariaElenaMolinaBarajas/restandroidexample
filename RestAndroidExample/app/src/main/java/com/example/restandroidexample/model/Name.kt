package com.example.mobileandroidtest.model

import com.google.gson.annotations.SerializedName

/**
 * Name data class
 * @author memb
 */
data class Name(
    @SerializedName("first")
    val first: String,
    @SerializedName("last")
    val last: String,
    @SerializedName("title")
    val title: String
)