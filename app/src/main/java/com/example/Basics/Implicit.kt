package com.example.Basics

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Implicit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit)
        val btna = findViewById<Button>(R.id.btn1)
        val btnb = findViewById<Button>(R.id.btn2)
        val btnc = findViewById<Button>(R.id.btn5)
        val btnd = findViewById<Button>(R.id.btn6)
        val btne = findViewById<Button>(R.id.btn3)
        val btnf = findViewById<Button>(R.id.btn4)


        btna.setOnClickListener {
            val i1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(i1)
        }
        btnb.setOnClickListener {
            val i2 = Intent(Intent.ACTION_VIEW, Uri.parse("tel:123456789"))
            startActivity(i2)
        }
        btnc.setOnClickListener {
            val i5 = Intent()
            i5.action = Intent.ACTION_VIEW

            i5.type = "image/*"
            startActivity(i5)
        }
        btnd.setOnClickListener {
            val i6 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i6)
        }
        btne.setOnClickListener {
            val i3 = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(i3)
        }

        btnf.setOnClickListener {
            val i4 = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"))
            startActivity(i4)
        }

    }
}