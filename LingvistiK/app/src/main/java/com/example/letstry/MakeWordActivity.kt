package com.example.letstry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_make_word.*

class MakeWordActivity : AppCompatActivity() {

    val a = mapOf("apple" to 1, "bear" to 2, "cat" to 3, "dolphin" to 4 , "elephant" to 5, "frog" to 6,  "giraffe" to 7, "horse" to 8,
        "ice-cream" to 9, "jelly-fish" to 10, "kangaroo" to 11, "lion" to 12, "mouse" to 13, "nestling" to 14, "octopus" to 15, "panda" to 16,
        "queen" to 17, "racoon" to 18,  "squirrel" to 19, "tiger" to 20, "umbrella" to 21, "varan" to 22, "wolf" to 23, "xylophone" to 24,
        "yogurt" to 25, "zebra" to 26)
    var count = 1
    var score  = 0
    var check = ""
    lateinit var editText: EditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_word)
    }


    fun confirm(view: View) {

        editText = findViewById(R.id.checkBox)
        check = checkBox.text.toString()

        if (check in a){
            score++
            println(score)
            checkBox.text = null
            if (count <= a.size)
                count++
            if (count > a.size){
                setContentView(R.layout.score_result)
            }



            val imageview = findViewById<ImageView>(R.id.imageView2)
            if (count == 1)
                imageview.setImageResource(R.drawable.apple)
            if (count == 2)
                imageview.setImageResource(R.drawable.bear)
            if (count == 3)
                imageview.setImageResource(R.drawable.dolphin)
            if (count == 4)
                imageview.setImageResource(R.drawable.elephant)
            if (count == 5)
                imageview.setImageResource(R.drawable.frog)
            if (count == 6)
                imageview.setImageResource(R.drawable.giraffe)
            if (count == 7)
                imageview.setImageResource(R.drawable.horse)
            if (count == 8)
                imageview.setImageResource(R.drawable.ice_cream)
            if (count == 9)
                imageview.setImageResource(R.drawable.jelly_fish)
            if (count == 10)
                imageview.setImageResource(R.drawable.kangaroo)
            if (count == 11)
                imageview.setImageResource(R.drawable.cat)
            if (count == 12)
                imageview.setImageResource(R.drawable.lion)
            if (count == 13)
                imageview.setImageResource(R.drawable.mouse)
            if (count == 14)
                imageview.setImageResource(R.drawable.nestling)
            if (count == 15)
                imageview.setImageResource(R.drawable.octopus)
            if (count == 16)
                imageview.setImageResource(R.drawable.panda)
            if (count == 17)
                imageview.setImageResource(R.drawable.queen)
            if (count == 18)
                imageview.setImageResource(R.drawable.racoon)
            if (count == 19)
                imageview.setImageResource(R.drawable.squirrel)
            if (count == 20)
                imageview.setImageResource(R.drawable.tiger)
            if (count == 21)
                imageview.setImageResource(R.drawable.umbrella)
            if (count == 22)
                imageview.setImageResource(R.drawable.varan)
            if (count == 23)
                imageview.setImageResource(R.drawable.wolf)
            if (count == 24)
                imageview.setImageResource(R.drawable.xylophone)
            if (count == 25)
                imageview.setImageResource(R.drawable.yogurt)
            if (count == 26)
                imageview.setImageResource(R.drawable.zebra)


        }
        else if (check !in a){
            val error = Toast.makeText(this, "Неправильно, попробуй снова.", Toast.LENGTH_SHORT)
            error.show()
        }

    }

    fun skipPic(view: View){

        checkBox.text = null
        if (count <= a.size)
            count++
        if (count > a.size)
            setContentView(R.layout.score_result)


        val imageview = findViewById<ImageView>(R.id.imageView2)
        if (count == 1)
            imageview.setImageResource(R.drawable.apple)
        if (count == 2)
            imageview.setImageResource(R.drawable.bear)
        if (count == 3)
            imageview.setImageResource(R.drawable.dolphin)
        if (count == 4)
            imageview.setImageResource(R.drawable.elephant)
        if (count == 5)
            imageview.setImageResource(R.drawable.frog)
        if (count == 6)
            imageview.setImageResource(R.drawable.giraffe)
        if (count == 7)
            imageview.setImageResource(R.drawable.horse)
        if (count == 8)
            imageview.setImageResource(R.drawable.ice_cream)
        if (count == 9)
            imageview.setImageResource(R.drawable.jelly_fish)
        if (count == 10)
            imageview.setImageResource(R.drawable.kangaroo)
        if (count == 11)
            imageview.setImageResource(R.drawable.cat)
        if (count == 12)
            imageview.setImageResource(R.drawable.lion)
        if (count == 13)
            imageview.setImageResource(R.drawable.mouse)
        if (count == 14)
            imageview.setImageResource(R.drawable.nestling)
        if (count == 15)
            imageview.setImageResource(R.drawable.octopus)
        if (count == 16)
            imageview.setImageResource(R.drawable.panda)
        if (count == 17)
            imageview.setImageResource(R.drawable.queen)
        if (count == 18)
            imageview.setImageResource(R.drawable.racoon)
        if (count == 19)
            imageview.setImageResource(R.drawable.squirrel)
        if (count == 20)
            imageview.setImageResource(R.drawable.tiger)
        if (count == 21)
            imageview.setImageResource(R.drawable.umbrella)
        if (count == 22)
            imageview.setImageResource(R.drawable.varan)
        if (count == 23)
            imageview.setImageResource(R.drawable.wolf)
        if (count == 24)
            imageview.setImageResource(R.drawable.xylophone)
        if (count == 25)
            imageview.setImageResource(R.drawable.yogurt)
        if (count == 26)
            imageview.setImageResource(R.drawable.zebra)

    }

    fun showScore(view: View){

        println(score)

        val scoreresult = findViewById<TextView>(R.id.score)
        scoreresult.text = "Ваш результат составил $score балла(ов) из  ${a.size} возможных."

    }



}