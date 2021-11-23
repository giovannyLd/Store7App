package com.example.store7app

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import androidx.appcompat.app.AlertDialog as AlertDialog1

private var etiqueta: TextView? = null

class Pruebas : AppCompatActivity() {

    var db = FirebaseFirestore.getInstance()
    private var vista: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pruebas)

        etiqueta = findViewById(R.id.titulo)
        vista = findViewById(R.id.vista)

    }

    fun pruebaFuncion(view: android.view.View) {

        val objetoIntent: Intent = intent
        var categoria = objetoIntent.getStringExtra("categoria").toString()
        var producto1 = objetoIntent.getStringExtra("producto1").toString()
        var producto2 = objetoIntent.getStringExtra("producto2").toString()
        var producto3 = objetoIntent.getStringExtra("producto3").toString()
        var producto4 = objetoIntent.getStringExtra("producto4").toString()
        var producto5 = objetoIntent.getStringExtra("producto5").toString()
        var producto6 = objetoIntent.getStringExtra("producto6").toString()
        var producto7 = objetoIntent.getStringExtra("producto7").toString()
        var producto8 = objetoIntent.getStringExtra("producto8").toString()
        var valor1 = objetoIntent.getStringExtra("valor1").toString().toInt()
        var valor2 = objetoIntent.getStringExtra("valor2").toString().toInt()
        var valor3 = objetoIntent.getStringExtra("valor3").toString().toInt()
        var valor4 = objetoIntent.getStringExtra("valor4").toString().toInt()
        var valor5 = objetoIntent.getStringExtra("valor5").toString().toInt()
        var valor6 = objetoIntent.getStringExtra("valor6").toString().toInt()
        var valor7 = objetoIntent.getStringExtra("valor7").toString().toInt()
        var valor8 = objetoIntent.getStringExtra("valor8").toString().toInt()

        validacion(
            categoria,
            producto1,
            producto2,producto3,producto4,producto5,producto6,producto7,producto8,
            valor1,
            valor2,
            valor3,
            valor4,
            valor5,
            valor6,
            valor7,
            valor8
        )


        etiqueta!!.setText(
            "arroz $valor1  \n avena $valor2\n  lenteja $valor3 \n" +
                    " maiz $valor4 \n" +
                    " pan $valor5 \n" +
                    " pasta $valor6 \n" +
                    " quinoa $valor7 \n" +
                    " trigo $valor8 \n"
        )

    }

    fun traer(view: android.view.View) {

        db.collection("carritoMercado").document("giovanny").get().addOnSuccessListener {
            vista!!.setText(it.get("producto") as String?)

        }
    }

    fun borrar(view: android.view.View) {

        db.collection("carritoMercado").document("Cereales").delete()
        db.collection("carritoMercado").document("Frutas").delete()
        db.collection("carritoMercado").document("Proteinas").delete()
        db.collection("carritoMercado").document("Verduras").delete()
        db.collection("carritoMercado").document("Salsas").delete()
        db.collection("carritoMercado").document("Embutidos").delete()
    }

    fun validacion(
        categoria: String,
        nom1: String,
        nom2: String,
        nom3: String,
        nom4: String,
        nom5: String,
        nom6: String,
        nom7: String,
        nom8: String,
        prod1: Int,
        prod2: Int,
        prod3: Int,
        prod4: Int,
        prod5: Int,
        prod6: Int,
        prod7: Int,
        prod8: Int
    ) {

        db.collection("carritoMercado").document(categoria).set(

            hashMapOf(
                nom1 to prod1,
                nom2 to prod2,
                nom3 to prod3,
                nom4 to prod4,
                nom5 to prod5,
                nom6 to prod6,
                nom7 to prod7,
                nom8 to prod8
            )
        )


    }
}