package com.example.Basics

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
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
        var subscribe = findViewById<Button>(R.id.btnsubscribe)

        subscribe.setOnClickListener{
            var dialogbox = LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
            var pop = AlertDialog.Builder(this).setView(dialogbox)

            pop.setPositiveButton("Subscribe"){ dialog,_ ->
               val e = dialogbox.findViewById<EditText>(R.id.email)
               val email = e.text.toString()
               if (email.isNotBlank()){
                   Toast.makeText(this, "Subscribed with  $email", Toast.LENGTH_LONG).show()

               }
                else{
                    Toast.makeText(this, "Enter Valid Email id", Toast.LENGTH_LONG).show()
               }
               dialog.dismiss()
            }

            pop.setNegativeButton("cancel"){dialog,_ ->
                dialog.dismiss()}

            pop.create().show()
        }
    }
}