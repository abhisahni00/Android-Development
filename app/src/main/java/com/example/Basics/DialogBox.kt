package com.example.Basics

import android.media.Rating
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DialogBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dialog_box)
        val dialogbtn = findViewById<Button>(R.id.btndia)
        var ratingBar = findViewById<RatingBar>(R.id.rating)

        dialogbtn.setOnClickListener{
            val pop = AlertDialog.Builder(this)
            pop.setTitle("Exit")
            pop.setMessage("Do you really want to exit?")
            pop.setCancelable(false)
            pop.setPositiveButton("Yes"){ dialog,_ ->
                finish()
            }

            pop.setNeutralButton("No"){dialog,_ ->
                dialog.dismiss()}


            pop.create().show()


        }
        ratingBar.setOnRatingBarChangeListener{ _, rating, _ ->
            Toast.makeText(this, "Rating:$rating", Toast.LENGTH_LONG).show()

        }


    }
}