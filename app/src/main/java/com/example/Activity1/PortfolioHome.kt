package com.example.Activity1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.Basics.R

class PortfolioHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_portfolio_home)
        val t1 = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(t1)
    }
    override fun onCreateOptionsMenu(menu: android.view.Menu?): Boolean {
        menuInflater.inflate(R.menu.portfolio, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_email -> {
                val i4 = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"))
                startActivity(i4)
                true
            }
            R.id.menu_contact -> {
                val i2 = Intent(Intent.ACTION_VIEW, Uri.parse("tel:123456789"))
                startActivity(i2)
                true
            }
            R.id.menu_feedback -> {

                true
            }
            else -> super.onOptionsItemSelected(item)

        }
    }
}