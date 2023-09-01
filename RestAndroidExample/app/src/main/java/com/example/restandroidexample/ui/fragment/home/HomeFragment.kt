package com.example.restandroidexample.ui.fragment.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.mobileandroidtest.dao.InternetConnection
import com.example.mobileandroidtest.dao.PersonalInformationService
import com.example.mobileandroidtest.dao.RetrofitInstance
import com.example.mobileandroidtest.model.PersonalInformation
import com.example.mobileandroidtest.utils.GlobalVariables
import com.example.mobileandroidtest.viewmodel.shared.SharedViewModel
import com.example.restandroidexample.R
import com.example.restandroidexample.databinding.FragmentHomeBinding
import retrofit2.Response

/**
 * Home fragment : Fragment()
 * @author memb
 */
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val shareViewModel: SharedViewModel by viewModels(
        ownerProducer = { requireParentFragment() }
    )

    /**
     * override onCreateView
     * creates and returns the view hierarchy associated with the fragment.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.btnGetInformation.setOnClickListener {
            binding.btnGetInformation.isEnabled = false
            validateInternetConnection(it)
        }

        return binding.root
    }

    /**
     * Validate internet connection
     * @param view View
     */
    private fun validateInternetConnection(view: View) {
        val internetConnection = InternetConnection()
        val isConnected = internetConnection.validateInternetConnection(requireContext())
        if (isConnected) {
            getServiceUserInformation()
        } else {
            view.findNavController().navigate(R.id.action_homeFragment_to_noInternetConnectionFragment)
        }
    }

    /**
     * Get services user information when application is connected to internet
     * @exception Exception
     */
    private fun getServiceUserInformation() {

        try {
            val retService =
                RetrofitInstance.getRetrofitInstance()
                    .create(PersonalInformationService::class.java)

            val responseLiveData: LiveData<Response<PersonalInformation>> = liveData {
                val response = retService.getPersonalInformation()
                emit(response)
            }

            responseLiveData.observe(requireActivity(), Observer {
                Log.i("TAG_RESPONSE", it.body().toString())

                if (it.isSuccessful) {
                    binding.btnGetInformation.isEnabled = true
                    it.body()?.let { it1 -> shareViewModel.setPersonalInformation(it1) }
                    findNavController().navigate(R.id.action_homeFragment_to_userInformationFragment)
                } else {
                    Toast.makeText(requireContext(), GlobalVariables.ERROR_RESPONSE, Toast.LENGTH_SHORT).show()
                }
            })
        } catch (e: Exception) {
            Toast.makeText(requireContext(), GlobalVariables.ERROR_EXCEPTION, Toast.LENGTH_SHORT)
                .show()
        }
    }

}