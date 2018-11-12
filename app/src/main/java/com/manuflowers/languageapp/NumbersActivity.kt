package com.manuflowers.languageapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

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
            "ten")
        Log.v("Numbers Activity", "${numbers[0]}")
    }
}
