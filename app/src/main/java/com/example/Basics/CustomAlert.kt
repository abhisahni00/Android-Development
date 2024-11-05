package com.example.Basics

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomAlert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_alert)
        val subscribe = findViewById<Button>(R.id.btnsubscribe)


        subscribe.setOnClickListener{
            val pop = AlertDialog.Builder(this)
            pop.setTitle("Exit")
            pop.setMessage("Do you realy want to exit?")
            pop.setCancelable(false)
            pop.setPositiveButton("Yes"){ dialog,_ ->
                finish()
            }

            pop.setNeutralButton("Maybe"){dialog,_ ->
                dialog.dismiss()}

            pop.setNegativeButton("No"){dialog,_ ->
                dialog.dismiss()}


            pop.create().show()


        }

    }
}