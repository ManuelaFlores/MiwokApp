package com.manuflowers.languageapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNumbersList.setOnClickListener {
            openNewActivity(NumbersActivity::class.java as Class<*>)
        }

        btnColorsList.setOnClickListener {
            openNewActivity(ColorsActivity::class.java as Class<*>)
        }

        btnFamilyList.setOnClickListener {
            openNewActivity(FamilyActivity::class.java as Class<*>)
        }

        btnPhrasesList.setOnClickListener {
            openNewActivity(PhrasesActivity::class.java as Class<*>)
        }

    }

    private fun openNewActivity(activity: Class<*>){
        val intent = Intent(this, activity)
        startActivity(intent)
    }


}
