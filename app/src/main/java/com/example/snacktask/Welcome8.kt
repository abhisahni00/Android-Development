package com.example.snacktask

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.Basics.R

class Welcome8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome8)
        val imageButton = findViewById<ImageButton>(R.id.W8)
        imageButton.setOnClickListener {
            Toast.makeText(this, "Welcome To LPU", Toast.LENGTH_SHORT).show()
        }
    }
}