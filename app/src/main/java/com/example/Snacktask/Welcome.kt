package com.example.Snacktask

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.Basics.R

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)
        val imageButton = findViewById<ImageButton>(R.id.W)
        imageButton.setOnClickListener {
            Toast.makeText(this, "Welcome To CSE", Toast.LENGTH_SHORT).show()
        }
    }
}