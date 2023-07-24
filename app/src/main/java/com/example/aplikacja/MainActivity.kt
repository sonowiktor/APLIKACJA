package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Assuming you have a button with ID "orderPizzaButton" in your layout
        val orderPizzaButton = findViewById<Button>(R.id.orderButton)
        orderPizzaButton.setOnClickListener {
            // Call the function to direct to the different XML file
            orderPizza()
        }
    }

    fun orderPizza() {
        // Create an Intent to start the new activity with the different XML layout
        val intent = Intent(this, PizzaOrderActivity::class.java)
        startActivity(intent)
    }
}
