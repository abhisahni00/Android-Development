package com.example.Snacktask

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.Basics.R

class Welcome6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome6)
        val imageButton = findViewById<ImageButton>(R.id.W6)
        imageButton.setOnClickListener {
            Toast.makeText(this, "Welcome To Pharmacy", Toast.LENGTH_SHORT).show()
        }
    }
}