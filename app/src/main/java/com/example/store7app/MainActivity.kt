package com.example.store7app

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var btnLog: Button? = null
    private var btnCheck: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog = findViewById(R.id.btnLogin)
        btnCheck = findViewById(R.id.btnCheckIn)
    }

    fun Login(botonLogin: View) {


        val intento = Intent(this, LoginActivity::class.java)

        startActivity(intento)

    }

    fun checkIn(checkIn: View) {
        val registro = Intent(this, FormActivity::class.java)
        startActivity(registro)

    }

   /* fun registro(view: android.view.View) {

        Toast.makeText(getApplicationContext(),"hola ",Toast.LENGTH_LONG).show()
        val registro = Intent(this, FormActivity::class.java)
        startActivity(registro)
    }*/
}