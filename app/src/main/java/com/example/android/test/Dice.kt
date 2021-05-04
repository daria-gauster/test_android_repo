package com.example.android.test

class Dice {
    var currentNumber: Int = 0

    fun roll() {currentNumber = (1..6).random()}


}