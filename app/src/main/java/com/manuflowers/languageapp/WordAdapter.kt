package com.manuflowers.languageapp

import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.app.Activity

class WordAdapter
/**
 * This is my own custom constructor:
 * The context is used to inflate the layout file, and the list is the data we want to populate into the list
 *
 * @param context : The current context. Used to inflate the layout file.
 * @param listOfWords : A list of Word objects to display in a list*/
    (context: Activity, listOfWords: MutableList<Word>)
//Here, I initialize the ArrayAdapter's internal storage for the context and the list.
//the second argument is used is used when the ArrayAdapter is populating a single TextView.
    //Because this is a custom adapter for two textViews, the adapter is not going to use this second argument, so
    //
    : ArrayAdapter<Word>(context, 0, listOfWords) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }
}