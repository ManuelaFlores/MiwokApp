package com.manuflowers.languageapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView

class NumbersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

        //TODO: Implement an array of Strings:
        val numbers  = mutableListOf(
            "one",
            "two",
            "Three",
            "four",
            "Five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten"
            )

        var itemsAdapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, numbers)
        var listView: ListView = findViewById(R.id.lvNumbersContainer)
        listView.adapter = itemsAdapter
    }
}
