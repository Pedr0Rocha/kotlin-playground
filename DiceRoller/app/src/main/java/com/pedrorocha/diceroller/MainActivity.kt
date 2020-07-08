package com.pedrorocha.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_iv)

        val rollButton: Button = findViewById(R.id.roll_btn)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val result = Random().nextInt(6) + 1

        diceImage.setImageResource(getDiceImageByResult(result))

        Toast.makeText(this, getString(R.string.rolled, result), Toast.LENGTH_SHORT).show()
    }

    private fun getDiceImageByResult(result: Int): Int {
        return when (result) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
    }
}