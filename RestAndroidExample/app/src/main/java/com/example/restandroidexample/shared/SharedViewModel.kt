package com.example.mobileandroidtest.viewmodel.shared

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobileandroidtest.model.PersonalInformation

/**
 * Shared personal information : ViewModel()
 * @author memb
 */
class SharedViewModel : ViewModel(){

    val personalInformation = MutableLiveData<PersonalInformation>()

    fun setPersonalInformation(entity: PersonalInformation){
        this.personalInformation.value = entity
        Log.i("TAG_INFO_SHARE", this.personalInformation.value.toString())
    }
}