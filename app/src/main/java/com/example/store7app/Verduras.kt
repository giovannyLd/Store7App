package com.example.store7app

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
//import com.google.firebase.firestore.FirebaseFirestore
import java.util.*


class Verduras : AppCompatActivity() {


    protected var tvAguacate: TextView? = null
    protected var btnMenosAguacate: Button? = null
    protected var tvCanAguacate: TextView? = null
    protected var btnMasAguacate: Button? = null
    protected var valorAguacate: TextView? = null

    protected var tvArveja: TextView? = null
    protected var btnMenosArveja: Button? = null
    protected var tvCanArveja: TextView? = null
    protected var btnMasArveja: Button? = null
    protected var valorArveja: TextView? = null

    protected var tvBerengena: TextView? = null
    protected var btnMenosBerengena: Button? = null
    protected var tvCanBerengena: TextView? = null
    protected var btnMasBerengena: Button? = null
    protected var valorBerengena: TextView? = null

    protected var tvBrocoli: TextView? = null
    protected var btnMenosBrocoli: Button? = null
    protected var tvCanBrocoli: TextView? = null
    protected var btnMasBrocoli: Button? = null
    protected var valorBrocoli: TextView? = null

    protected var tvEspinaca: TextView? = null
    protected var btnMenosEspinaca: Button? = null
    protected var tvCanEspinaca: TextView? = null
    protected var btnMasEspinaca: Button? = null
    protected var valorEspinaca: TextView? = null

    protected var tvGuatila: TextView? = null
    protected var btnMenosGuatila: Button? = null
    protected var tvCanGuatila: TextView? = null
    protected var btnMasGuatila: Button? = null
    protected var valorGuatila: TextView? = null

    protected var tvPimenton: TextView? = null
    protected var btnMenosPimenton: Button? = null
    protected var tvCanPimenton: TextView? = null
    protected var btnMasPimenton: Button? = null
    protected var valorPimenton: TextView? = null

    protected var tvTomate: TextView? = null
    protected var btnMenosTomate: Button? = null
    protected var tvCanTomate: TextView? = null
    protected var btnMasTomate: Button? = null
    protected var valorTomate: TextView? = null
    // var db = FirebaseFirestore.getInstance()
    var usuario:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verduras)

        usuario= getIntent().getStringExtra("usuario")

        Toast.makeText(this,"desde verduras "+ usuario,Toast.LENGTH_SHORT).show()


        tvAguacate = findViewById(R.id.tvAguacate)
        btnMenosAguacate = findViewById(R.id.btnMenosAguacate)
        tvCanAguacate = findViewById(R.id.tvCanAguacate)
        btnMasAguacate = findViewById(R.id.btnMasAguacate)
        valorAguacate = findViewById(R.id.valorAguacate)
        valorAguacate!!.setText("0")

        tvArveja = findViewById(R.id.tvArveja)
        btnMenosArveja = findViewById(R.id.btnMenosArveja)
        tvCanArveja = findViewById(R.id.tvCanArveja)
        btnMasArveja = findViewById(R.id.btnMasArveja)
        valorArveja = findViewById(R.id.valorArveja)
        valorArveja!!.setText("0")

        tvBerengena = findViewById(R.id.tvBerengena)
        btnMenosBerengena = findViewById(R.id.btnMenosBerengena)
        tvCanBerengena = findViewById(R.id.tvCanBerengena)
        btnMasBerengena = findViewById(R.id.btnMasBerengena)
        valorBerengena = findViewById(R.id.valorBerengena)
        valorBerengena!!.setText("0")

        tvBrocoli = findViewById(R.id.tvBrocoli)
        btnMenosBrocoli = findViewById(R.id.btnMenosBrocoli)
        tvCanBrocoli = findViewById(R.id.tvCanBrocoli)
        btnMasBrocoli = findViewById(R.id.btnMasBrocoli)
        valorBrocoli = findViewById(R.id.valorBrocoli)
        valorBrocoli!!.setText("0")

        tvEspinaca = findViewById(R.id.tvEspinaca)
        btnMenosEspinaca = findViewById(R.id.btnMenosEspinaca)
        tvCanEspinaca = findViewById(R.id.tvCanEspinaca)
        btnMasEspinaca = findViewById(R.id.btnMasEspinaca)
        valorEspinaca = findViewById(R.id.valorEspinaca)
        valorEspinaca!!.setText("0")

        tvGuatila = findViewById(R.id.tvGuatila)
        btnMenosGuatila = findViewById(R.id.btnMenosGuatila)
        tvCanGuatila = findViewById(R.id.tvCanGuatila)
        btnMasGuatila = findViewById(R.id.btnMasGuatila)
        valorGuatila = findViewById(R.id.valorGuatila)
        valorGuatila!!.setText("0")



        tvPimenton = findViewById(R.id.tvPimenton)
        btnMenosPimenton = findViewById(R.id.btnMenosPimenton)
        tvCanPimenton = findViewById(R.id.tvCanPimenton)
        btnMasPimenton = findViewById(R.id.btnMasPimenton)
        valorPimenton = findViewById(R.id.valorPimenton)
        valorPimenton!!.setText("0")

        tvTomate = findViewById(R.id.tvTomate)
        btnMenosTomate = findViewById(R.id.btnMenosTomate)
        tvCanTomate = findViewById(R.id.tvCanTomate)
        btnMasTomate = findViewById(R.id.btnMasTomate)
        valorTomate = findViewById(R.id.valorTomate)
        valorTomate!!.setText("0")

    }

    fun menosAguacate(view: android.view.View) {
        calculoAguacate(-1)
    }

    fun masAguacate(view: android.view.View) {
        calculoAguacate(1)
    }

    fun menosArveja(view: android.view.View) {
        calculoArveja(-1)
    }

    fun masArveja(view: android.view.View) {
        calculoArveja(1)
    }

    fun menosBerengena(view: android.view.View) {
        calculoBerengena(-1)
    }

    fun masBerengena(view: android.view.View) {
        calculoBerengena(1)
    }

    fun menosBrocoli(view: android.view.View) {
        calculoBrocoli(-1)
    }

    fun masBrocoli(view: android.view.View) {
        calculoBrocoli(1)
    }

    fun menosEspinaca(view: android.view.View) {
        calculoEspinaca(-1)
    }

    fun masEspinaca(view: android.view.View) {
        calculoEspinaca(1)
    }

    fun menosGuatila(view: android.view.View) {
        calculoGuatila(-1)
    }

    fun masGuatila(view: android.view.View) {
        calculoGuatila(1)
    }

    fun menosPimenton(view: android.view.View) {
        calculoPimenton(-1)
    }

    fun masPimenton(view: android.view.View) {
        calculoPimenton(1)
    }

    fun menosTomate(view: android.view.View) {
        calculoTomate(-1)
    }

    fun masTomate(view: android.view.View) {
        calculoTomate(1)
    }

    fun calculoAguacate(valor: Int) {

        val valAguacate: Int = 1200
        var cantidad = (tvCanAguacate!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanAguacate!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanAguacate!!.setText(cantidad.toString())
        }
        valorAguacate!!.setText("" + valAguacate * cantidad)
    }

    fun calculoArveja(valor: Int) {
        val valArveja: Int = 800
        var cantidad = (tvCanArveja!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanArveja!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanArveja!!.setText(cantidad.toString())
        }
        valorArveja!!.setText("" + valArveja * cantidad)
    }

    fun calculoBerengena(valor: Int) {
        val valBerengena: Int = 2000
        var cantidad = (tvCanBerengena!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanBerengena!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanBerengena!!.setText(cantidad.toString())
        }
        valorBerengena!!.setText("" + valBerengena * cantidad)
    }

    fun calculoBrocoli(valor: Int) {
        val valBrocoli: Int = 1500
        var cantidad = (tvCanBrocoli!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanBrocoli!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanBrocoli!!.setText(cantidad.toString())
        }
        valorBrocoli!!.setText("" + valBrocoli * cantidad)
    }

    fun calculoEspinaca(valor: Int) {
        val valEspinaca: Int = 800
        var cantidad = (tvCanEspinaca!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanEspinaca!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanEspinaca!!.setText(cantidad.toString())
        }
        valorEspinaca!!.setText("" + valEspinaca * cantidad)
    }

    fun calculoGuatila(valor: Int) {
        val valGuatila: Int = 800
        var cantidad = (tvCanGuatila!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanGuatila!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanGuatila!!.setText(cantidad.toString())
        }
        valorGuatila!!.setText("" + valGuatila * cantidad)
    }

    fun calculoPimenton(valor: Int) {
        val valPimenton: Int = 800
        var cantidad = (tvCanPimenton!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanPimenton!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanPimenton!!.setText(cantidad.toString())
        }
        valorPimenton!!.setText("" + valPimenton * cantidad)
    }

    fun calculoTomate(valor: Int) {
        val valTomate: Int = 800
        var cantidad = (tvCanTomate!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanTomate!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanTomate!!.setText(cantidad.toString())
        }
        valorTomate!!.setText("" + valTomate * cantidad)
    }


    fun envioCarrito(view: android.view.View) {
        var aguacate: String = valorAguacate!!.text.toString()
        var arveja: String = valorArveja!!.text.toString()
        var berengena: String = valorBerengena!!.text.toString()
        var brocoli: String = valorBrocoli!!.text.toString()
        var espinaca: String = valorEspinaca!!.text.toString()
        var guatila: String = valorGuatila!!.text.toString()
        var pimenton: String = valorPimenton!!.text.toString()
        var tomate: String = valorTomate!!.text.toString()

        var aguacateCan: Int = tvCanAguacate!!.text.toString().toInt()
        var arvejaCan: Int = tvCanArveja!!.text.toString().toInt()
        var berengenaCan: Int = tvCanBerengena!!.text.toString().toInt()
        var brocoliCan: Int = tvCanBrocoli!!.text.toString().toInt()
        var espinacaCan: Int = tvCanEspinaca!!.text.toString().toInt()
        var guatilaCan: Int = tvCanGuatila!!.text.toString().toInt()
        var pimentonCan: Int = tvCanPimenton!!.text.toString().toInt()
        var tomateCan: Int = tvCanTomate!!.text.toString().toInt()


        Toast.makeText(
            this,
            "SE HA CARGADO AL CARRITO DE MERCADO LO SIGUIENTE :  \n Aguacate = $ " + aguacate + "\nArveja = $ " + arveja + "\nBerengenas = $ " + berengena +
                    "\nBrocoli = $ " + brocoli + "\nEspinaca = $ " + espinaca + "\nGuatila = $ " + guatila + "\nPimenton = $ " + pimenton +
                    "\nTomate = $ " + tomate,
            Toast.LENGTH_LONG
        ).show()

        val cargueCarrito = CarroMercado(
            "Verduras",
            "aguacate",
            "arveja",
            "berengena",
            "brocoli",
            "espinaca",
            "guatila",
            "pimenton",
            "tomate",
        aguacate,arveja,berengena,brocoli,espinaca,guatila,pimenton,tomate,
            aguacateCan,arvejaCan,berengenaCan,brocoliCan,espinacaCan,guatilaCan,pimentonCan,tomateCan)

       cargueCarrito.cargar()
       // cargueCarrito.cargarPrueba()

     /*   var intentCarrito = Intent(this, Pruebas::class.java)

        intentCarrito.putExtra("categoria","Verduras")
        intentCarrito.putExtra("producto1","baguacate")
        intentCarrito.putExtra("producto2","arveja")
        intentCarrito.putExtra("producto3","berengena")
        intentCarrito.putExtra("producto4","brocoli")
        intentCarrito.putExtra("producto5","espinaca")
        intentCarrito.putExtra("producto6","guatila")
        intentCarrito.putExtra("producto7","pimenton")
        intentCarrito.putExtra("producto8","tomate")
        intentCarrito.putExtra("valor1", aguacate)
        intentCarrito.putExtra("valor2", arveja)
        intentCarrito.putExtra("valor3",berengena)
        intentCarrito.putExtra("valor4",brocoli)
        intentCarrito.putExtra("valor5",espinaca)
        intentCarrito.putExtra("valor6",guatila)
        intentCarrito.putExtra("valor7",pimenton)
        intentCarrito.putExtra("valor8",tomate)
        startActivity(intentCarrito)*/

    }

    fun VerCarrito(view: android.view.View) {
        val marker = Intent(this, VerCarroMercado::class.java)
        marker.putExtra("usuario",usuario)
        startActivity(marker)
    }
}