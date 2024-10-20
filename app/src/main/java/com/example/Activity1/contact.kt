package com.example.Activity1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.Basics.R

class contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact)
        val call1 = findViewById<ImageButton>(R.id.call)
        call1.setOnClickListener {
            val i1 = Intent(Intent.ACTION_VIEW, Uri.parse("tel:9034593821"))
            startActivity(i1)
        }
        val call2 = findViewById<ImageButton>(R.id.email)
        call2.setOnClickListener {
            val i2 = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:abhisheksahni53@gmail.com"))
            startActivity(i2)
        }
        val linkedin = findViewById<ImageButton>(R.id.linkedin)
        linkedin.setOnClickListener {
            val i3 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/abhishek-sahni/"))
            startActivity(i3)

        }
    }
}