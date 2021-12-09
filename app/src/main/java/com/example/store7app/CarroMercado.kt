package com.example.store7app


import android.content.ContentValues.TAG
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.facebook.FacebookSdk.getApplicationContext
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import java.security.Timestamp
import java.util.*

class CarroMercado(
    var categoria: String,
    var producto1: String,
    var producto2: String,
    var producto3: String,
    var producto4: String,
    var producto5: String,
    var producto6: String,
    var producto7: String,
    var producto8: String,
    var valor1: String,
    var valor2: String,
    var valor3: String,
    var valor4: String,
    var valor5: String,
    var valor6: String,
    var valor7: String,
    var valor8: String,
    var cantidad1:Int,
    var cantidad2:Int,
    var cantidad3:Int,
    var cantidad4:Int,
    var cantidad5:Int,
    var cantidad6:Int,
    var cantidad7:Int,
    var cantidad8:Int,
) {

   constructor() : this("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",0,0,0,0,0,0,0,0)

    var db = FirebaseFirestore.getInstance()

    var listaValor = listOf<Int>(
        valor1.toInt(),
        valor2.toInt(),
        valor3.toInt(),
        valor4.toInt(),
        valor5.toInt(),
        valor6.toInt(),
        valor7.toInt(),
        valor8.toInt()
    )

    var listaCategorias =
        listOf<String>(
            categoria,
            producto1,
            producto2,
            producto3,
            producto4,
            producto5,
            producto6,
            producto7,
            producto8
        )
    var listaCategoriasPrueba =
        listOf<String>(
            producto1,
            producto2,
            producto3,
            producto4,
            producto5,
            producto6,
            producto7,
            producto8
        )

    var listaCantidad = listOf<Int>(
        cantidad1,
        cantidad2,
        cantidad3,
        cantidad4,
        cantidad5,
        cantidad6,
        cantidad7,
        cantidad8
    )


    fun cargar() {

        val listaProductos = hashMapOf(
            "listaCategoria" to listaCategorias,
            "listaValor" to listaValor,
            "listaCantidad" to listaCantidad
        )

        var coleccion = db.collection("carritoMercado").document(categoria)
            .set(listaProductos)
            .addOnSuccessListener { println("DocumentSnapshot successfully written!") }
            .addOnFailureListener { e -> println("Error writing document" + e) }

       //val data = hashMapOf("capital" to true)
    }

    fun borrarBD(){
        db.collection("carritoMercado").document("Cereales").delete()

    }



    fun cargarPrueba() {

        var y=0
        for(x in listaCategoriasPrueba){
        val listaProductos = hashMapOf(

            "cantidad" to listaCantidad[y],
            "valor" to listaValor[y]
        )

        var coleccion = db.collection("carrito").document(x)
            .set(listaProductos)
            .addOnSuccessListener { println("DocumentSnapshot successfully written!")}
            .addOnFailureListener { e -> println("Error writing document" + e) }

                y++
        }
    }



    fun mostrarCarrito() {

        println("hola como estan ")
/*        var datos: MutableList<String> = mutableListOf<String>()
        db.collection("carritoMercado").get().addOnSuccessListener { document ->

            for (documento in document) {

                datos.add("${documento.data}")
            }

            separarCadena(datos[0])
        }*/
    }

    fun separarCadena(datos: String) {

        var valor: MutableList<Char> =
            ((((datos.substringAfter("listaValor=[")).substringBefore("]")).replace(
                ",",
                ""
            )).replace(" ","")).toMutableList()

        var categoria =
            ((datos.substringAfter("listaCategoria=[")).substringBefore("]")).replace(
                " ",
                ""
            ).split(",").toMutableList()

        var cantidad: MutableList<Char> =
            ((((datos.substringAfter("listaCantidad=[")).substringBefore("]")).replace(
                ",",
                ""
            )).replace(" ","")).toMutableList()


        println(valor)
        println(categoria)
        println(cantidad)

        var num =0
        for (x in cantidad) {
            if (x.toByte().toInt() != 48) {
                println(categoria[num+1]+"= "+x+" = "+cantidad[num])
                num++
            }
        }


    }
}


















