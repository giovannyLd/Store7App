package com.example.store7app

import android.content.ContentValues.TAG
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.facebook.FacebookSdk
import com.google.firebase.firestore.FirebaseFirestore
//import com.google.firebase.firestore.FirebaseFirestore
import java.util.*


class Cereales : AppCompatActivity() {


    protected var tvArroz: TextView? = null
    protected var btnMenosArroz: Button? = null
    protected var tvCanArroz: TextView? = null
    protected var btnMasArroz: Button? = null
    protected var valorArroz: TextView? = null

    protected var tvAvena: TextView? = null
    protected var btnMenosAvena: Button? = null
    protected var tvCanAvena: TextView? = null
    protected var btnMasAvena: Button? = null
    protected var valorAvena: TextView? = null

    protected var tvLenteja: TextView? = null
    protected var btnMenosLenteja: Button? = null
    protected var tvCanLenteja: TextView? = null
    protected var btnMasLenteja: Button? = null
    protected var valorLenteja: TextView? = null

    protected var tvMaiz: TextView? = null
    protected var btnMenosMaiz: Button? = null
    protected var tvCanMaiz: TextView? = null
    protected var btnMasMaiz: Button? = null
    protected var valorMaiz: TextView? = null

    protected var tvPan: TextView? = null
    protected var btnMenosPan: Button? = null
    protected var tvCanPan: TextView? = null
    protected var btnMasPan: Button? = null
    protected var valorPan: TextView? = null

    protected var tvPasta: TextView? = null
    protected var btnMenosPasta: Button? = null
    protected var tvCanPasta: TextView? = null
    protected var btnMasPasta: Button? = null
    protected var valorPasta: TextView? = null

    protected var tvQuinoa: TextView? = null
    protected var btnMenosQuinoa: Button? = null
    protected var tvCanQuinoa: TextView? = null
    protected var btnMasQuinoa: Button? = null
    protected var valorQuinoa: TextView? = null

    protected var tvTrigo: TextView? = null
    protected var btnMenosTrigo: Button? = null
    protected var tvCanTrigo: TextView? = null
    protected var btnMasTrigo: Button? = null
    protected var valorTrigo: TextView? = null
    var db = FirebaseFirestore.getInstance()
    var usuario: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cereales)

        usuario = getIntent().getStringExtra("usuario")

        Toast.makeText(this, "desde cereales " + usuario, Toast.LENGTH_SHORT).show()

        tvArroz = findViewById(R.id.tvArroz)
        btnMenosArroz = findViewById(R.id.btnMenosArroz)
        tvCanArroz = findViewById(R.id.tvCanArroz)
        btnMasArroz = findViewById(R.id.btnMasArroz)
        valorArroz = findViewById(R.id.valorArroz)
        valorArroz!!.setText("0")

        tvAvena = findViewById(R.id.tvAvena)
        btnMenosAvena = findViewById(R.id.btnMenosAvena)
        tvCanAvena = findViewById(R.id.tvCanAvena)
        btnMasAvena = findViewById(R.id.btnMasAvena)
        valorAvena = findViewById(R.id.valorAvena)
        valorAvena!!.setText("0")

        tvLenteja = findViewById(R.id.tvLenteja)
        btnMenosLenteja = findViewById(R.id.btnMenosLenteja)
        tvCanLenteja = findViewById(R.id.tvCanLenteja)
        btnMasLenteja = findViewById(R.id.btnMasLenteja)
        valorLenteja = findViewById(R.id.valorLenteja)
        valorLenteja!!.setText("0")

        tvMaiz = findViewById(R.id.tvMaiz)
        btnMenosMaiz = findViewById(R.id.btnMenosMaiz)
        tvCanMaiz = findViewById(R.id.tvCanMaiz)
        btnMasMaiz = findViewById(R.id.btnMasMaiz)
        valorMaiz = findViewById(R.id.valorMaiz)
        valorMaiz!!.setText("0")

        tvPan = findViewById(R.id.tvPan)
        btnMenosPan = findViewById(R.id.btnMenosPan)
        tvCanPan = findViewById(R.id.tvCanPan)
        btnMasPan = findViewById(R.id.btnMasPan)
        valorPan = findViewById(R.id.valorPan)
        valorPan!!.setText("0")

        tvPasta = findViewById(R.id.tvPasta)
        btnMenosPasta = findViewById(R.id.btnMenosPasta)
        tvCanPasta = findViewById(R.id.tvCanPasta)
        btnMasPasta = findViewById(R.id.btnMasPasta)
        valorPasta = findViewById(R.id.valorPasta)
        valorPasta!!.setText("0")



        tvQuinoa = findViewById(R.id.tvQuinoa)
        btnMenosQuinoa = findViewById(R.id.btnMenosQuinoa)
        tvCanQuinoa = findViewById(R.id.tvCanQuinoa)
        btnMasQuinoa = findViewById(R.id.btnMasQuinoa)
        valorQuinoa = findViewById(R.id.valorQuinoa)
        valorQuinoa!!.setText("0")

        tvTrigo = findViewById(R.id.tvTrigo)
        btnMenosTrigo = findViewById(R.id.btnMenosTrigo)
        tvCanTrigo = findViewById(R.id.tvCanTrigo)
        btnMasTrigo = findViewById(R.id.btnMasTrigo)
        valorTrigo = findViewById(R.id.valorTrigo)
        valorTrigo!!.setText("0")

    }

    fun menosArroz(view: android.view.View) {
        calculoArroz(-1)
    }

    fun masArroz(view: android.view.View) {
        calculoArroz(1)
    }

    fun menosAvena(view: android.view.View) {
        calculoAvena(-1)
    }

    fun masAvena(view: android.view.View) {
        calculoAvena(1)
    }

    fun menosLenteja(view: android.view.View) {
        calculoLenteja(-1)
    }

    fun masLenteja(view: android.view.View) {
        calculoLenteja(1)
    }

    fun menosMaiz(view: android.view.View) {
        calculoMaiz(-1)
    }

    fun masMaiz(view: android.view.View) {
        calculoMaiz(1)
    }

    fun menosPan(view: android.view.View) {
        calculoPan(-1)
    }

    fun masPan(view: android.view.View) {
        calculoPan(1)
    }

    fun menosPasta(view: android.view.View) {
        calculoPasta(-1)
    }

    fun masPasta(view: android.view.View) {
        calculoPasta(1)
    }

    fun menosQuinoa(view: android.view.View) {
        calculoQuinoa(-1)
    }

    fun masQuinoa(view: android.view.View) {
        calculoQuinoa(1)
    }

    fun menosTrigo(view: android.view.View) {
        calculoTrigo(-1)
    }

    fun masTrigo(view: android.view.View) {
        calculoTrigo(1)
    }

    fun calculoArroz(valor: Int) {

        val valArroz: Int = 1200
        var cantidad = (tvCanArroz!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanArroz!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanArroz!!.setText(cantidad.toString())
        }
        valorArroz!!.setText("" + valArroz * cantidad)
    }

    fun calculoAvena(valor: Int) {
        val valAvena: Int = 800
        var cantidad = (tvCanAvena!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanAvena!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanAvena!!.setText(cantidad.toString())
        }
        valorAvena!!.setText("" + valAvena * cantidad)
    }

    fun calculoLenteja(valor: Int) {
        val valLenteja: Int = 2000
        var cantidad = (tvCanLenteja!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanLenteja!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanLenteja!!.setText(cantidad.toString())
        }
        valorLenteja!!.setText("" + valLenteja * cantidad)
    }

    fun calculoMaiz(valor: Int) {
        val valMaiz: Int = 1500
        var cantidad = (tvCanMaiz!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanMaiz!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanMaiz!!.setText(cantidad.toString())
        }
        valorMaiz!!.setText("" + valMaiz * cantidad)
    }

    fun calculoPan(valor: Int) {
        val valPan: Int = 800
        var cantidad = (tvCanPan!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanPan!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanPan!!.setText(cantidad.toString())
        }
        valorPan!!.setText("" + valPan * cantidad)
    }

    fun calculoPasta(valor: Int) {
        val valPasta: Int = 800
        var cantidad = (tvCanPasta!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanPasta!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanPasta!!.setText(cantidad.toString())
        }
        valorPasta!!.setText("" + valPasta * cantidad)
    }

    fun calculoQuinoa(valor: Int) {
        val valQuinoa: Int = 800
        var cantidad = (tvCanQuinoa!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanQuinoa!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanQuinoa!!.setText(cantidad.toString())
        }
        valorQuinoa!!.setText("" + valQuinoa * cantidad)
    }

    fun calculoTrigo(valor: Int) {
        val valTrigo: Int = 800
        var cantidad = (tvCanTrigo!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanTrigo!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanTrigo!!.setText(cantidad.toString())
        }
        valorTrigo!!.setText("" + valTrigo * cantidad)


    }


    fun envioCarrito(view: android.view.View) {

        var arroz: String = valorArroz!!.text.toString()
        var avena: String = valorAvena!!.text.toString()
        var lenteja: String = valorLenteja!!.text.toString()
        var maiz: String = valorMaiz!!.text.toString()
        var pan: String = valorPan!!.text.toString()
        var pasta: String = valorPasta!!.text.toString()
        var quinoa: String = valorQuinoa!!.text.toString()
        var trigo: String = valorTrigo!!.text.toString()

        var arrozCan: Int = tvCanArroz!!.text.toString().toInt()
        var avenaCan: Int = tvCanAvena!!.text.toString().toInt()
        var lentejaCan: Int = tvCanLenteja!!.text.toString().toInt()
        var maizCan: Int = tvCanMaiz!!.text.toString().toInt()
        var panCan: Int = tvCanPan!!.text.toString().toInt()
        var pastaCan: Int = tvCanPasta!!.text.toString().toInt()
        var quinoaCan: Int = tvCanQuinoa!!.text.toString().toInt()
        var trigoCan: Int = tvCanTrigo!!.text.toString().toInt()


        Toast.makeText(
            this,
            "SE HA CARGADO AL CARRITO DE MERCADO LO SIGUIENTE :  \n Arroz = $ " + arroz + "\nAvena = $ " + avena + "\nLentejas = $ " + lenteja +
                    "\nMaiz = $ " + maiz + "\nPan = $ " + pan + "\nPasta = $ " + pasta + "\nQuinoa = $ " + quinoa +
                    "\nTrigo = $ " + trigo,
            Toast.LENGTH_LONG
        ).show()
        val cargueCarrito = CarroMercado(
            "Cereales",
            "arroz",
            "avena",
            "lenteja",
            "maiz",
            "pan",
            "pasta",
            "quinoa",
            "trigo",
            arroz,
            avena,
            lenteja,
            maiz,
            pan,
            pasta,
            quinoa,
            trigo, arrozCan, avenaCan, lentejaCan, maizCan, panCan, pastaCan, quinoaCan, trigoCan
        )

        cargueCarrito.cargar()
        //cargueCarrito.cargarPrueba()
        cargueCarrito.historico("$usuario")


    }

   /*fun pruebaExtraerBD1() {


       var datos: MutableList<String> = mutableListOf<String>()
       db.collection("carritoMercado").get().addOnSuccessListener { document ->

           for (documento in document) {

               AlertDialog.Builder(this)

                   .setMessage(documento.id + "${documento.data}")
                   .create().show()

               var datoBD = "${documento.data}"

               datos.add("${documento.data}")
           }
           var intentCarrito = Intent(this, VerCarroMercado::class.java)
           intentCarrito.putExtra("datos", datos[0])
           intentCarrito.putExtra("datos1", datos[1])
           intentCarrito.putExtra("datos2", datos[2])
           intentCarrito.putExtra("datos3", datos[3])
           intentCarrito.putExtra("datos4", datos[4])
           intentCarrito.putExtra("datos5", datos[5])
           startActivity(intentCarrito)
       }*/

       fun VerCarrito(view: android.view.View) {
           val marker = Intent(this, VerCarroMercado::class.java)
           marker.putExtra("usuario", usuario)
           startActivity(marker)
       }
   }
   /* fun pruebaExtraerBD2() {

        db.collection("carritoMercado").document("Cereales").collection("cereales").get()
            .addOnSuccessListener { documentos ->


                if(documentos.any()){
                    for(item in documentos ){

                        Log.d(TAG, "${item.id} => ${item.data}")
                        println( item.data["nombre"].toString())
                    }

                }


            }
    }*/



