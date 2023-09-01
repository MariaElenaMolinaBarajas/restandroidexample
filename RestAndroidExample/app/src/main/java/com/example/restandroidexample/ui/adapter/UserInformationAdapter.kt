package com.example.restandroidexample.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobileandroidtest.model.Result
import com.example.restandroidexample.R
import com.example.restandroidexample.ui.holder.UserInformationHolder

/**
 * User information adapter
 * @param users List<Result>
 * @param clickListener Int
 * @return recyclerview
 * @author memb
 */
class UserInformationAdapter (
    private val users: List<Result>,
    private val clickListener: (Int) -> Unit) :
    RecyclerView.Adapter<UserInformationHolder>() {

    /**
     * Override onCreateViewHolder
     * @param parent ViewGroup
     * @param viewType Int
     * @return UserInformationHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserInformationHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listUser = layoutInflater.inflate(R.layout.user_adapter, parent, false)
        return UserInformationHolder(listUser)
    }

    /**
     * Override onBindViewHolder
     * @param holder UserInformationHolder
     * @param position Int
     */
    override fun onBindViewHolder(holder: UserInformationHolder, position: Int) {
        val user = users[position]
        holder.bind(position, user, clickListener)

    }

    /**
     * Override getItemCount
     * @return users.size
     */
    override fun getItemCount(): Int = users.size
}