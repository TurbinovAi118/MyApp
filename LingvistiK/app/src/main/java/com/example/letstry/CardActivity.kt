package com.example.letstry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView





class CardActivity : AppCompatActivity() {

    var count = 1
    val a = mapOf(1 to "apple", 2 to "bear", 3 to "cat", 4 to "dolphin", 5 to "elephant", 6 to "frog", 7 to "giraffe", 8 to "horse",
        9 to "ice_cream", 10 to "jelly_fish", 11 to "kangaroo", 12 to "lion", 13 to "mouse", 14 to "nestling", 15 to "octopus", 16 to "panda",
        17 to "queen", 18 to "racoon", 19 to "squirrel", 20 to "tiger", 21 to "umbrella", 22 to "varan", 23 to "wolf", 24 to "xylophone",
        25 to "yogurt", 26 to "zebra")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        val starttextview = findViewById<TextView>(R.id.cardProgress)
        starttextview.text ="Карточка 1/${a.size}"

    }

    fun next(view: View){

        count++
        if (count > a.size){
            count = 1}

        val textview = findViewById<TextView>(R.id.cardProgress)
        textview.text = "Карточка $count/${a.size}"

        val imageview = findViewById<ImageView>(R.id.imageView)

        if (count in a){
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


    }

    fun previous(view: View){


        count--
        if (count == 0){
            count = a.size}
        val textview = findViewById<TextView>(R.id.cardProgress)
        textview.text = "Карточка $count/${a.size}"

        val imageview = findViewById<ImageView>(R.id.imageView)
        if (count in a){
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

    }



}



