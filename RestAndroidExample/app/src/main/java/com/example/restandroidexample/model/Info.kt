package com.example.mobileandroidtest.model

import com.google.gson.annotations.SerializedName

/**
 * Info data class
 * @author memb
 */
data class Info(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: Int,
    @SerializedName("seed")
    val seed: String,
    @SerializedName("version")
    val version: String
)