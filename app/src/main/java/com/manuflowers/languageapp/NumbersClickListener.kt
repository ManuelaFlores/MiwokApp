package com.manuflowers.languageapp

import android.view.View
import android.widget.Toast

class NumbersClickListener : View.OnClickListener {
    override fun onClick(view: View?) {
        Toast.makeText(
            view!!.context,
            "Open the list of numbers",
            Toast.LENGTH_SHORT
        ).show()

    }
}