package com.example.mobileandroidtest.model

import com.google.gson.annotations.SerializedName

/**
 * Timezone data class
 * @author memb
 */
data class Timezone(
    @SerializedName("description")
    val description: String,
    @SerializedName("offset")
    val offset: String
)