package com.example.cs501_assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // This function will be called when the button is clicked
    fun onHelloWorldClick(view: View) {
        // Find the TextView by ID
        val helloWorldText = findViewById<TextView>(R.id.hello_world_text)

        // Change the text of the TextView when the Button is clicked
        helloWorldText.text = "Hello, world!"
    }
}