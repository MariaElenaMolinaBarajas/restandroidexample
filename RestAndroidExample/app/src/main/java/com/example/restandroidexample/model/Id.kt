package com.example.mobileandroidtest.model

import com.google.gson.annotations.SerializedName

/**
 * Id data class
 * @author memb
 */
data class Id(
    @SerializedName("name")
    val name: String,
    @SerializedName("value")
    val value: Any
)