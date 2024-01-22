package com.example.cs501_assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // This function will be called when the button is clicked
    fun onHelloWorldClick(view: View) {
        // Add your code here to handle the button click
        // For example, you can show a toast message
        println("helloing world")
    }
}