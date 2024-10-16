package com.example.Basics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Intent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent)
        val loginButton = findViewById<Button>(R.id.btn)
        loginButton.setOnClickListener{
            var i = Intent(this, LoginSuccessful::class.java)
            startActivity(i)
        }
    }
}