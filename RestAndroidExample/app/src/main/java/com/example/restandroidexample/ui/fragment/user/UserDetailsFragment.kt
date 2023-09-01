package com.example.restandroidexample.ui.fragment.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.mobileandroidtest.utils.GlobalVariables
import com.example.mobileandroidtest.viewmodel.shared.SharedViewModel
import com.example.restandroidexample.R
import com.example.restandroidexample.databinding.FragmentUserDetailsBinding
import com.squareup.picasso.Picasso
import java.lang.StringBuilder

/**
 * UserDetailsFragment : Fragment()
 * @author memb
 */
class UserDetailsFragment : Fragment() {

    private lateinit var binding: FragmentUserDetailsBinding
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
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_user_details, container, false)

        getUserDetails()

        return binding.root
    }

    /**
     * Get user details
     */
    private fun getUserDetails() {
        val position = arguments?.getInt(GlobalVariables.KEY_POSITION)
        shareViewModel.personalInformation.observe(viewLifecycleOwner, Observer {
            val result = it.results[position!!]

            val sbAddress = StringBuilder()
            binding.tvAddressValue.text = sbAddress.append(
                result.location.street.name, GlobalVariables.SPACE_EMPTY,
                result.location.street.number.toString())

            binding.tvCityValue.text = result.location.city
            binding.tvStateValue.text = result.location.state
            binding.tvCountryValue.text = result.location.country
            binding.tvZipCodeValue.text = result.location.postcode.toString()
            binding.tvEmailValue.text = result.email
            Picasso.get().load(result.picture.large).into(binding.ivPicture)
        })
    }
}