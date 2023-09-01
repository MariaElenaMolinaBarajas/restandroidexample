package com.example.restandroidexample.ui.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobileandroidtest.model.Result
import com.example.mobileandroidtest.utils.GlobalVariables
import com.example.restandroidexample.R
import com.squareup.picasso.Picasso

/**
 * User information holder
 * @param view View
 * @return RecyclerView.ViewHolder(view)
 * @author memb
 */
class UserInformationHolder(val view: View) : RecyclerView.ViewHolder(view) {
    /**
     * Function to referenced the type of views
     * @param userPosition Int
     * @param user Result
     * @param clickListener Int
     */
    fun bind(userPosition: Int, user: Result, clickListener: (Int) -> Unit) {
        val userName = view.findViewById<TextView>(R.id.tvNameValue)
        val age = view.findViewById<TextView>(R.id.tvEgeValue)
        val gender = view.findViewById<TextView>(R.id.tvGenderValue)
        val image = view.findViewById<ImageView>(R.id.ivPicture)

        val sbName = StringBuilder()
        userName.text = sbName.append(user.name.title, GlobalVariables.SPACE_EMPTY,
            user.name.first, GlobalVariables.SPACE_EMPTY, user.name.last)
        age.text = user.registered.age.toString()
        gender.text = user.gender
        Picasso.get().load(user.picture.medium).into(image)

        view.setOnClickListener {
            clickListener(userPosition)
        }
    }
}