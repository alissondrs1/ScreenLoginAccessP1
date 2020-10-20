package com.example.screenloginaccess

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val EXTRA_MESSAGE = "EXTRA_MESSAGE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun acessApp(view: View){
        val editTextTextPersonName3 = findViewById<EditText>(R.id.editTextTextPersonName3)
        val message = editTextTextPersonName3.text.toString()
        val intent = Intent(this, Display_Data_Activity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)

    }

}