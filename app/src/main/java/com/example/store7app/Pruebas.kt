package com.example.store7app

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog as AlertDialog1

private var etiqueta: TextView?=null
class Pruebas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pruebas)

        etiqueta=findViewById(R.id.titulo)
    }

    fun pruebaFuncion(view: android.view.View) {

        etiqueta!!.setText("hola")



    }
}