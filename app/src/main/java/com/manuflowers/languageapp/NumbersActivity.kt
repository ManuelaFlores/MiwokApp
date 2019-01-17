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
        val numbers = mutableListOf(
            Word("one", "lutti"),
            Word("two", "otiiko"),
            Word("three", "tolookosu"),
            Word("four", "oyyisa"),
            Word("five", "massokka"),
            Word("six", "temmokka"),
            Word("seven", "kenekaku"),
            Word("eight", "kawinta"),
            Word("nine", "wo'e"),
            Word("ten", "na'aacha")
        )

        val itemsAdapter: ArrayAdapter<Word> = ArrayAdapter(this, R.layout.item_of_list, numbers)
        val listView: ListView = findViewById(R.id.lvNumbersContainer)
        listView.adapter = itemsAdapter
    }
}
