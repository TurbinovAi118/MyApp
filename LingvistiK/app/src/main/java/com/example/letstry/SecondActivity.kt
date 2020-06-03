package com.example.letstry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun chineseButton (view: View){
        val chinese = Toast.makeText(this, "Coming soon", Toast.LENGTH_SHORT)

        chinese.show()
    }

    fun spanishButton (view: View){
        val spanish = Toast.makeText(this, "Coming soon", Toast.LENGTH_SHORT)

        spanish.show()
    }

    fun englishButton(view: View){
        val english = Intent(this, EnglishChoosingActivity::class.java)

        startActivity(english)
    }
}


