package com.example.android.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class DiceActivity : AppCompatActivity() {
    private val dice = Dice()

    private lateinit var btnRollDice: Button
    private lateinit var tvDice: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        btnRollDice = findViewById(R.id.btnRollDice)
        tvDice = findViewById(R.id.tvDice)


        btnRollDice.setOnClickListener {
            dice.apply{
                roll()
                tvDice.text = currentNumber.toString()
            }





        }



    }

}