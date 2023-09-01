package com.example.mobileandroidtest.dao

import com.example.mobileandroidtest.model.PersonalInformation
import retrofit2.Response
import retrofit2.http.GET

/**
 * Interface with url path
 * @author memb
 */
interface PersonalInformationService {

    @GET("/api/")
    suspend fun getPersonalInformation() : Response<PersonalInformation>
}