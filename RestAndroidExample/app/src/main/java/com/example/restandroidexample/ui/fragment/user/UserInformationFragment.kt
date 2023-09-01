package com.example.restandroidexample.ui.fragment.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobileandroidtest.utils.GlobalVariables
import com.example.mobileandroidtest.viewmodel.shared.SharedViewModel
import com.example.restandroidexample.R
import com.example.restandroidexample.databinding.FragmentUserInformationBinding
import com.example.restandroidexample.ui.adapter.UserInformationAdapter

/**
 * UserInformationFragment : Fragment()
 * @author memb
 */
class UserInformationFragment : Fragment() {
    private lateinit var binding: FragmentUserInformationBinding
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
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_user_information, container, false)

        shareViewModel.personalInformation.observe(viewLifecycleOwner, Observer {
            binding.tvNumberResul.text =
                shareViewModel.personalInformation.value?.info?.results.toString()
            binding.tvNumberPage.text =
                shareViewModel.personalInformation.value?.info?.page.toString()
            binding.tvNumberVersion.text = shareViewModel.personalInformation.value?.info?.version

            binding.rvUsers.layoutManager = LinearLayoutManager(this.requireContext())
            binding.rvUsers.adapter = UserInformationAdapter(it.results,
            ) { userSelect: Int ->
                userClicked(userSelect)
            }
        })

        return binding.root

    }

    /**
     * Get position from user clicked
     * @param position : Int
     */
    private fun userClicked(position: Int) {
        val bundle = bundleOf(GlobalVariables.KEY_POSITION to position)
        this.findNavController().navigate(R.id.action_userInformationFragment_to_userDetailsFragment, bundle)
    }
}