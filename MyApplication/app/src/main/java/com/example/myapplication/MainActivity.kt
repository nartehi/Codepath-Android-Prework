package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.util.Log.i as Log
import android.util.Log.i as Log



// this is the kotlin file for user actions.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Isaac", "Clicked on button")

            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.yellowish))


        // display customized text to show
        // Hello from + name.

        // Allow user to click a button to change text color
        // 1. Add a button to layout
        //Set a logic when user has tapped on the button.
        // Change the color of the text.
        //
        }
    }
}