package com.pedrorocha.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setButtonActions()
    }

    private fun setButtonActions() {
        val clickableViews: List<View> =
            listOf(box_one, box_two, box_three, box_four, box_five,
                main_layout, red_button, green_button, blue_button)

        for (view in clickableViews) {
            view.setOnClickListener {
                changeColor(it)
            }
        }
    }

    private fun changeColor(view: View) {
        when (view.id) {
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five -> view.setBackgroundResource(android.R.color.holo_orange_dark)

            R.id.red_button -> box_three.setBackgroundResource(R.color.red)
            R.id.green_button -> box_five.setBackgroundResource(R.color.green)
            R.id.blue_button -> box_four.setBackgroundResource(R.color.blue)

            else -> view.setBackgroundColor(Color.MAGENTA)
        }
    }

}