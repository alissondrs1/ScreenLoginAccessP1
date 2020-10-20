package com.example.screenloginaccess

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Display_Data_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.setContentView(R.layout.activity_display__data_)
        showMessage(intent)

    }
    private fun showMessage(intent: Intent) {

        val message = intent.extras?.get("EXTRA_MESSAGE") as SpannableString

        val textView = findViewById<TextView>(R.id.textView)
            textView.text = message
    }
}