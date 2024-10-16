package com.example.Basics

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pizza : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pizza)
        val pizzaTypeGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val pizzaSizeGroup = findViewById<RadioGroup>(R.id.radioGroup2)


        val topping1 = findViewById<CheckBox>(R.id.checkBox)
        val topping2 = findViewById<CheckBox>(R.id.checkBox2)
        val topping3 = findViewById<CheckBox>(R.id.checkBox3)


        val orderButton = findViewById<Button>(R.id.button)

        orderButton.setOnClickListener {
            val selectedPizzaTypeId = pizzaTypeGroup.checkedRadioButtonId
            val selectedPizzaType = findViewById<RadioButton>(selectedPizzaTypeId).text

            val selectedPizzaSizeId = pizzaSizeGroup.checkedRadioButtonId
            val selectedPizzaSize = findViewById<RadioButton>(selectedPizzaSizeId).text

            val selectedToppings = mutableListOf<String>()
            if (topping1.isChecked) selectedToppings.add(topping1.text.toString())
            if (topping2.isChecked) selectedToppings.add(topping2.text.toString())
            if (topping3.isChecked) selectedToppings.add(topping3.text.toString())


            val orderDetails = "$selectedPizzaType; $selectedPizzaSize; ${if (selectedToppings.isEmpty()) "None" else selectedToppings.joinToString(", ")}"

            Toast.makeText(this, orderDetails, Toast.LENGTH_LONG).show()
        }
    }
}