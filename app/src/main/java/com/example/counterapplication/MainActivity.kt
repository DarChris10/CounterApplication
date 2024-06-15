package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.counterapplication.R

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private lateinit var counterText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterText = findViewById(R.id.counterText)
        val decrementButton: Button = findViewById(R.id.decrementButton)
        val incrementButton: Button = findViewById(R.id.incrementButton)

        decrementButton.setOnClickListener {
            counter--
            updateCounterText()
        }

        incrementButton.setOnClickListener {
            counter++
            updateCounterText()
        }
    }

    private fun updateCounterText() {
        counterText.text = counter.toString()
    }
}
