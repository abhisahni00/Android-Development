package com.example.Activity1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.Basics.R

class project : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_project)
        val btna = findViewById<Button>(R.id.btn1)
        val btnb = findViewById<Button>(R.id.btn2)
        val btnc = findViewById<Button>(R.id.btn3)

        btna.setOnClickListener {
            val i1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/abhisahni00/Wine-Prediction"))
            startActivity(i1)
        }
        btnb.setOnClickListener {
            val i2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/abhisahni00/Banking-System-Simulation"))
            startActivity(i2)
        }
        btnc.setOnClickListener {
            val i3 = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/abhisahni00/Android-Development"))
            startActivity(i3)
        }
    }
}