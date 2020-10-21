package com.example.screenloginaccess

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun acessApp(view: View){

        val editTextNameUser = findViewById<EditText>(R.id.editTextTextPersonName3)
        val userLogin = editTextNameUser.text.toString()

        val editTextPwd=findViewById<EditText>(R.id.editTextTextPersonName4)
        val userPwd = editTextPwd.text.toString()

        if ((userLogin == userExample.name) and (userPwd == userExample.email) or (userLogin == userExample.CPF)){
            val intent = Intent(this, Display_Data_Activity::class.java)
            startActivity(intent)
        }


    }

}