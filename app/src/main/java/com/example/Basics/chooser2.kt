package com.example.Basics

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class chooser2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chooser2)
        val check1 = findViewById<CheckBox>(R.id.chk1)
        val check2 = findViewById<CheckBox>(R.id.chk2)
        val check3 = findViewById<CheckBox>(R.id.chk3)
        val check4 = findViewById<CheckBox>(R.id.chk4)
        val check5 = findViewById<CheckBox>(R.id.chk5)
        val sharebutton = findViewById<Button>(R.id.btn1)

        val checkboxes = arrayOf(check1, check2, check3, check4, check5)


    }
}