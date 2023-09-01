package com.example.mobileandroidtest.model

import com.google.gson.annotations.SerializedName

/**
 * PersonalInformation data class
 * @author memb
 */
data class PersonalInformation(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Result>
)