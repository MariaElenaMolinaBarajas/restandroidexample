package com.example.mobileandroidtest.model

import com.google.gson.annotations.SerializedName

/**
 * Coordinates data class
 * @author memb
 */
data class Coordinates(
    @SerializedName("latitude")
    val latitude: String,
    @SerializedName("longitude")
    val longitude: String
)