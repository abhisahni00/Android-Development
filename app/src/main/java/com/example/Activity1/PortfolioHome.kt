package com.example.Activity1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.Activity1.PortfolioHome
import com.example.Basics.LoginSuccessful
import com.example.Basics.R
import com.example.Activity1.PortfolioHome as PortfolioHome1

class PortfolioHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_portfolio_home)
        val t1 = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(t1)
        val btn = findViewById<ImageButton>(R.id.profile)

        btn.setOnClickListener{
            var i = Intent(this, Profile::class.java)
            startActivity(i)

    }
        val btn1 = findViewById<ImageButton>(R.id.skills)

        btn1.setOnClickListener{
            var i1 = Intent(this, skills::class.java)
            startActivity(i1)

        }
        val btn2 = findViewById<ImageButton>(R.id.hobbies)
        btn2.setOnClickListener {
            var i2 = Intent(this, hobbies::class.java)
            startActivity(i2)
        }
        val btn3 = findViewById<ImageButton>(R.id.academic)

        btn3.setOnClickListener{
            var i3 = Intent(this, academics::class.java)
            startActivity(i3)

        }
        val btn4 = findViewById<ImageButton>(R.id.project)
        btn4.setOnClickListener {
            var i4 = Intent(this, project::class.java)
            startActivity(i4)
        }
        val btn5 = findViewById<ImageButton>(R.id.Gallery)
        btn5.setOnClickListener {
            var i5 = Intent(this, gallery::class.java)
            startActivity(i5)
        }

    }
    override fun onCreateOptionsMenu(menu: android.view.Menu?): Boolean {
        menuInflater.inflate(
            R.menu.portfolio,
            menu
        )
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_email -> {
                val i1 = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:abhisheksahni53@gmail.com"))
                startActivity(i1)
                true
            }
            R.id.menu_contact -> {
                val i2 = Intent(Intent.ACTION_VIEW, Uri.parse("tel:9034593821"))
                startActivity(i2)
                true
            }
            R.id.menu_feedback -> {
                val i3 = Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/jdQ3YxeRuuodpJkJ6"))
                startActivity(i3)

                true
            }
            R.id.exit -> {

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




                true
            }
            else -> super.onOptionsItemSelected(item)

        }
    }



}
