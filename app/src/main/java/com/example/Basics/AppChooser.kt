package com.example.Basics

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AppChooser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_chooser)
       val btn = findViewById<Button>(R.id.btnshare)
        btn.setOnClickListener {
            share("This is a test")
        }



    }
    private fun share(txt:String){
        val intent = Intent().apply{
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,txt)
            type = "text/plain"
        }
        val chooser1= Intent.createChooser(intent,"Share using...")
        startActivity(chooser1)

    }
}