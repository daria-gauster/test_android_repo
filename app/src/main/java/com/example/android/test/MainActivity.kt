package com.example.android.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnToDice: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToDice = findViewById(R.id.btnToDice)

        btnToDice.setOnClickListener {
            startActivity(Intent(this, DiceActivity::class.java))
        }
    }
}