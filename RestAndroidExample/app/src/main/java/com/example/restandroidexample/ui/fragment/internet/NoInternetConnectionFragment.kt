package com.example.restandroidexample.ui.fragment.internet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.mobileandroidtest.dao.InternetConnection
import com.example.mobileandroidtest.utils.GlobalVariables
import com.example.restandroidexample.R
import com.example.restandroidexample.databinding.FragmentNoInternetConnectionBinding

/**
 * NoInternetConnectionFragment : Fragment()
 * @author memb
 */
class NoInternetConnectionFragment : Fragment() {

    private lateinit var binding: FragmentNoInternetConnectionBinding

    /**
     * override onCreateView
     * creates and returns the view hierarchy associated with the fragment.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_no_internet_connection, container, false)

        binding.btnRetry.setOnClickListener {
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
            view.findNavController().navigate(R.id.action_noInternetConnectionFragment_to_homeFragment)
        } else {
            Toast.makeText(this.requireContext(), GlobalVariables.NO_INTERNET_CONNECTION, Toast.LENGTH_SHORT).show()
        }
    }
}