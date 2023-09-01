package com.example.mobileandroidtest.model

import com.google.gson.annotations.SerializedName

/**
 * Picture data class
 * @author memb
 */
data class Picture(
    @SerializedName("large")
    val large: String,
    @SerializedName("medium")
    val medium: String,
    @SerializedName("thumbnail")
    val thumbnail: String
)