package com.example.snacktask

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.Basics.R
import com.google.android.material.snackbar.Snackbar

class SnackMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snack_main)
        val snack = findViewById<ImageButton>(R.id.image1)
        snack.setOnClickListener { view ->
            Snackbar.make(view, "Welcome to school  of CSE", Snackbar.LENGTH_LONG)
                .setAction("Activate") {
                    Toast.makeText(this, "Activated", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, Welcome::class.java)
                    startActivity(intent)
                }.show()


        }
        val snack1 = findViewById<ImageButton>(R.id.image2)
        snack1.setOnClickListener { view ->
            Snackbar.make(view, "Welcome to school  of Agriculture", Snackbar.LENGTH_LONG)
                .setAction("Activate") {
                    Toast.makeText(this, "Activated", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, Welcome1::class.java)
                    startActivity(intent)
                }.show()

        }
        val snack2 = findViewById<ImageButton>(R.id.image3)
        snack2.setOnClickListener { view ->
            Snackbar.make(view, "Welcome to school  of Law", Snackbar.LENGTH_LONG)
                .setAction("Activate") {
                    Toast.makeText(this, "Activated", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, Welcome2::class.java)
                    startActivity(intent)
                }.show()


        }
        val snack3 = findViewById<ImageButton>(R.id.image4)
        snack3.setOnClickListener { view ->
            Snackbar.make(view, "Welcome to school  of Architecture", Snackbar.LENGTH_LONG)
                .setAction("Activate") {
                    Toast.makeText(this, "Activated", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, Welcome3::class.java)
                    startActivity(intent)
                }.show()


        }
        val snack4 = findViewById<ImageButton>(R.id.image5)
        snack4.setOnClickListener { view ->
            Snackbar.make(view, "Welcome to mittal School of Business", Snackbar.LENGTH_LONG)
                .setAction("Activate") {
                    Toast.makeText(this, "Activated", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, Welcome4::class.java)
                    startActivity(intent)
                }.show()


        }
        val snack5 = findViewById<ImageButton>(R.id.image6)
        snack5.setOnClickListener { view ->
            Snackbar.make(view, "Welcome to school  of Civil Engineering", Snackbar.LENGTH_LONG)
                .setAction("Activate") {
                    Toast.makeText(this, "Activated", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, Welcome5::class.java)
                    startActivity(intent)
                }.show()


        }
        val snack6 = findViewById<ImageButton>(R.id.image7)
        snack6.setOnClickListener { view ->
            Snackbar.make(view, "Welcome to school  of Pharmacy", Snackbar.LENGTH_LONG)
                .setAction("Activate") {
                    Toast.makeText(this, "Activated", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, Welcome6::class.java)
                    startActivity(intent)
                }.show()


        }
        val snack7 = findViewById<ImageButton>(R.id.image8)
        snack7.setOnClickListener { view ->
            Snackbar.make(view, "Welcome to school  of Bioscience", Snackbar.LENGTH_LONG)
                .setAction("Activate") {
                    Toast.makeText(this, "Activated", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, Welcome7::class.java)
                    startActivity(intent)
                }.show()


        }
        val snack8 = findViewById<ImageButton>(R.id.image9)
        snack8.setOnClickListener { view ->
            Snackbar.make(view, "Welcome to school  of LPU", Snackbar.LENGTH_LONG)
                .setAction("Activate") {
                    Toast.makeText(this, "Activated", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, Welcome8::class.java)
                    startActivity(intent)
                }.show()


        }
    }
}
