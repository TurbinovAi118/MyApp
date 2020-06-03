package com.example.letstry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EnglishChoosingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_choosing)
    }

    fun cardsButton(view: View){
        val card = Intent(this, CardActivity::class.java)

        startActivity(card)
    }

    fun makeWordButton(view: View){
        val redirect = Intent(this, MakeWordActivity::class.java)
        startActivity(redirect)
    }

}
