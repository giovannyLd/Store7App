package com.example.store7app

import android.content.ContentValues.TAG
import android.content.Intent
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

        val objetoIntent: Intent =intent

        var arroz = objetoIntent.getStringExtra("arroz").toString().toInt()
        var avena = objetoIntent.getStringExtra("avena").toString().toInt()
        var lenteja = objetoIntent.getStringExtra("lenteja")
        var maiz = objetoIntent.getStringExtra("maiz")
        var pan = objetoIntent.getStringExtra("pan")
        var pasta = objetoIntent.getStringExtra("pasta")
        var quinoa = objetoIntent.getStringExtra("quinoa")
        var trigo = objetoIntent.getStringExtra("trigo")

        var banana = objetoIntent.getStringExtra("banana")
        var arandanos= objetoIntent.getStringExtra("arandanos")
        var cereza = objetoIntent.getStringExtra("cereza")
        var durazno = objetoIntent.getStringExtra("durazno")
        var manzana = objetoIntent.getStringExtra("manzana")
        var patilla = objetoIntent.getStringExtra("patilla")
        var pina = objetoIntent.getStringExtra("pina")
        var papaya = objetoIntent.getStringExtra("papaya")
        var suma = arroz + avena

        etiqueta!!.setText("arroz $arroz  \n avena $avena\n  lenteja $lenteja \n" +
                " maiz $maiz \n" +
                " pan $pan \n" +
                " pasta $pasta \n" +
                " quinoa $quinoa \n" +
                " trigo $trigo \n" +
                " suma $suma \n" +
                " \$")



    }
}