package com.example.simplebuttonlistenerbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


    class MainActivity : AppCompatActivity() {
        lateinit var button: Button
        lateinit var button2: Button
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            button = findViewById(R.id.button)
            button2 = findViewById(R.id.button2)

            button.setOnClickListener {
                Toast.makeText(this, "kotlin", Toast.LENGTH_LONG).show()
            }
        }

        fun makeTost(view: android.view.View) {
            Toast.makeText(this, "XML", Toast.LENGTH_LONG).show()
        }
    }
