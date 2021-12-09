package com.example.store7app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
//import com.google.firebase.firestore.FirebaseFirestore


class Proteinas : AppCompatActivity() {


    protected var tvAtun: TextView? = null
    protected var btnMenosAtun: Button? = null
    protected var tvCanAtun: TextView? = null
    protected var btnMasAtun: Button? = null
    protected var valorAtun: TextView? = null

    protected var tvHuevos: TextView? = null
    protected var btnMenosHuevos: Button? = null
    protected var tvCanHuevos: TextView? = null
    protected var btnMasHuevos: Button? = null
    protected var valorHuevos: TextView? = null

    protected var tvLeche: TextView? = null
    protected var btnMenosLeche: Button? = null
    protected var tvCanLeche: TextView? = null
    protected var btnMasLeche: Button? = null
    protected var valorLeche: TextView? = null

    protected var tvMantequilla: TextView? = null
    protected var btnMenosMantequilla: Button? = null
    protected var tvCanMantequilla: TextView? = null
    protected var btnMasMantequilla: Button? = null
    protected var valorMantequilla: TextView? = null

    protected var tvPescado: TextView? = null
    protected var btnMenosPescado: Button? = null
    protected var tvCanPescado: TextView? = null
    protected var btnMasPescado: Button? = null
    protected var valorPescado: TextView? = null

    protected var tvPollo: TextView? = null
    protected var btnMenosPollo: Button? = null
    protected var tvCanPollo: TextView? = null
    protected var btnMasPollo: Button? = null
    protected var valorPollo: TextView? = null

    protected var tvQueso: TextView? = null
    protected var btnMenosQueso: Button? = null
    protected var tvCanQueso: TextView? = null
    protected var btnMasQueso: Button? = null
    protected var valorQueso: TextView? = null

    protected var tvSardinas: TextView? = null
    protected var btnMenosSardinas: Button? = null
    protected var tvCanSardinas: TextView? = null
    protected var btnMasSardinas: Button? = null
    protected var valorSardinas: TextView? = null
    // var db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proteinas)

        tvAtun = findViewById(R.id.tvAtun)
        btnMenosAtun = findViewById(R.id.btnMenosAtun)
        tvCanAtun = findViewById(R.id.tvCanAtun)
        btnMasAtun = findViewById(R.id.btnMasAtun)
        valorAtun = findViewById(R.id.valorAtun)
        valorAtun!!.setText("200")

        tvHuevos = findViewById(R.id.tvHuevos)
        btnMenosHuevos = findViewById(R.id.btnMenosHuevos)
        tvCanHuevos = findViewById(R.id.tvCanHuevos)
        btnMasHuevos = findViewById(R.id.btnMasHuevos)
        valorHuevos = findViewById(R.id.valorHuevos)
        valorHuevos!!.setText("0")

        tvLeche = findViewById(R.id.tvLeche)
        btnMenosLeche = findViewById(R.id.btnMenosLeche)
        tvCanLeche = findViewById(R.id.tvCanLeche)
        btnMasLeche = findViewById(R.id.btnMasLeche)
        valorLeche = findViewById(R.id.valorLeche)
        valorLeche!!.setText("0")

        tvMantequilla = findViewById(R.id.tvMantequilla)
        btnMenosMantequilla = findViewById(R.id.btnMenosMantequilla)
        tvCanMantequilla = findViewById(R.id.tvCanMantequilla)
        btnMasMantequilla = findViewById(R.id.btnMasMantequilla)
        valorMantequilla = findViewById(R.id.valorMantequilla)
        valorMantequilla!!.setText("0")

        tvPescado = findViewById(R.id.tvPescado)
        btnMenosPescado = findViewById(R.id.btnMenosPescado)
        tvCanPescado = findViewById(R.id.tvCanPescado)
        btnMasPescado = findViewById(R.id.btnMasPescado)
        valorPescado = findViewById(R.id.valorPescado)
        valorPescado!!.setText("0")

        tvPollo = findViewById(R.id.tvPollo)
        btnMenosPollo = findViewById(R.id.btnMenosPollo)
        tvCanPollo = findViewById(R.id.tvCanPollo)
        btnMasPollo = findViewById(R.id.btnMasPollo)
        valorPollo = findViewById(R.id.valorPollo)
        valorPollo!!.setText("0")



        tvQueso = findViewById(R.id.tvQueso)
        btnMenosQueso = findViewById(R.id.btnMenosQueso)
        tvCanQueso = findViewById(R.id.tvCanQueso)
        btnMasQueso = findViewById(R.id.btnMasQueso)
        valorQueso = findViewById(R.id.valorQueso)
        valorQueso!!.setText("0")

        tvSardinas = findViewById(R.id.tvSardinas)
        btnMenosSardinas = findViewById(R.id.btnMenosSardinas)
        tvCanSardinas = findViewById(R.id.tvCanSardinas)
        btnMasSardinas = findViewById(R.id.btnMasSardinas)
        valorSardinas = findViewById(R.id.valorSardinas)
        valorSardinas!!.setText("0")

    }

    fun menosAtun(view: android.view.View) {
        calculoAtun(-1)
    }

    fun masAtun(view: android.view.View) {
        calculoAtun(1)
    }

    fun menosHuevos(view: android.view.View) {
        calculoHuevos(-1)
    }

    fun masHuevos(view: android.view.View) {
        calculoHuevos(1)
    }

    fun menosLeche(view: android.view.View) {
        calculoLeche(-1)
    }

    fun masLeche(view: android.view.View) {
        calculoLeche(1)
    }

    fun menosMantequilla(view: android.view.View) {
        calculoMantequilla(-1)
    }

    fun masMantequilla(view: android.view.View) {
        calculoMantequilla(1)
    }

    fun menosPescado(view: android.view.View) {
        calculoPescado(-1)
    }

    fun masPescado(view: android.view.View) {
        calculoPescado(1)
    }

    fun menosPollo(view: android.view.View) {
        calculoPollo(-1)
    }

    fun masPollo(view: android.view.View) {
        calculoPollo(1)
    }

    fun menosQueso(view: android.view.View) {
        calculoQueso(-1)
    }

    fun masQueso(view: android.view.View) {
        calculoQueso(1)
    }

    fun menosSardinas(view: android.view.View) {
        calculoSardinas(-1)
    }

    fun masSardinas(view: android.view.View) {
        calculoSardinas(1)
    }

    fun calculoAtun(valor: Int) {

        val valAtun: Int = 1200
        var cantidad = (tvCanAtun!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanAtun!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanAtun!!.setText(cantidad.toString())
        }
        valorAtun!!.setText("" + valAtun * cantidad)
    }

    fun calculoHuevos(valor: Int) {
        val valHuevos: Int = 800
        var cantidad = (tvCanHuevos!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanHuevos!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanHuevos!!.setText(cantidad.toString())
        }
        valorHuevos!!.setText("" + valHuevos * cantidad)
    }

    fun calculoLeche(valor: Int) {
        val valLeche: Int = 2000
        var cantidad = (tvCanLeche!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanLeche!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanLeche!!.setText(cantidad.toString())
        }
        valorLeche!!.setText("" + valLeche * cantidad)
    }

    fun calculoMantequilla(valor: Int) {
        val valMantequilla: Int = 1500
        var cantidad = (tvCanMantequilla!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanMantequilla!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanMantequilla!!.setText(cantidad.toString())
        }
        valorMantequilla!!.setText("" + valMantequilla * cantidad)
    }

    fun calculoPescado(valor: Int) {
        val valPescado: Int = 800
        var cantidad = (tvCanPescado!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanPescado!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanPescado!!.setText(cantidad.toString())
        }
        valorPescado!!.setText("" + valPescado * cantidad)
    }

    fun calculoPollo(valor: Int) {
        val valPollo: Int = 800
        var cantidad = (tvCanPollo!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanPollo!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanPollo!!.setText(cantidad.toString())
        }
        valorPollo!!.setText("" + valPollo * cantidad)
    }

    fun calculoQueso(valor: Int) {
        val valQueso: Int = 800
        var cantidad = (tvCanQueso!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanQueso!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanQueso!!.setText(cantidad.toString())
        }
        valorQueso!!.setText("" + valQueso * cantidad)
    }

    fun calculoSardinas(valor: Int) {
        val valSardinas: Int = 800
        var cantidad = (tvCanSardinas!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanSardinas!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanSardinas!!.setText(cantidad.toString())
        }
        valorSardinas!!.setText("" + valSardinas * cantidad)
    }


    fun envioCarrito(view: android.view.View) {
        var atun: String = valorAtun!!.text.toString()
        var huevos: String = valorHuevos!!.text.toString()
        var leche: String = valorLeche!!.text.toString()
        var mantequilla: String = valorMantequilla!!.text.toString()
        var pescado: String = valorPescado!!.text.toString()
        var pollo: String = valorPollo!!.text.toString()
        var queso: String = valorQueso!!.text.toString()
        var sardinas: String = valorSardinas!!.text.toString()


        var atunCan: Int = tvCanAtun!!.text.toString().toInt()
        var huevosCan: Int = tvCanHuevos!!.text.toString().toInt()
        var lecheCan: Int = tvCanLeche!!.text.toString().toInt()
        var mantequillaCan: Int = tvCanMantequilla!!.text.toString().toInt()
        var pescadoCan: Int = tvCanPescado!!.text.toString().toInt()
        var polloCan: Int = tvCanPollo!!.text.toString().toInt()
        var quesoCan: Int = tvCanQueso!!.text.toString().toInt()
        var sardinasCan: Int = tvCanSardinas!!.text.toString().toInt()




        Toast.makeText(
            this,
            "SE HA CARGADO AL CARRITO DE MERCADO LO SIGUIENTE :  \n Atun = $ " + atun + "\nHuevos = $ " + huevos + "\nLeches = $ " + leche +
                    "\nMantequilla = $ " + mantequilla + "\nPescado = $ " + pescado + "\nPollo = $ " + pollo + "\nQueso = $ " + queso +
                    "\nSardinas = $ " + sardinas,
            Toast.LENGTH_LONG
        ).show()


        val cargueCarrito = CarroMercado(
            "Proteinas",
            "atun",
            "huevos",
            "leche",
            "mantequilla",
            "pescado",
            "pollo",
            "queso",
            "sardina",
            atun,
            huevos,
            leche,
            mantequilla,
            pescado,
            pollo,
            queso,
            sardinas,atunCan,huevosCan,lecheCan,mantequillaCan,pescadoCan,polloCan,quesoCan
        ,sardinasCan)

       cargueCarrito.cargar()
       // cargueCarrito.cargarPrueba()

     /* var intentCarrito = Intent(this, Pruebas::class.java)

        intentCarrito.putExtra("categoria", "Proteinas")
        intentCarrito.putExtra("producto1", "atun")
        intentCarrito.putExtra("producto2", "huevos")
        intentCarrito.putExtra("producto3", "leche")
        intentCarrito.putExtra("producto4", "mantequilla")
        intentCarrito.putExtra("producto5", "pescado")
        intentCarrito.putExtra("producto6", "pollo")
        intentCarrito.putExtra("producto7", "queso")
        intentCarrito.putExtra("producto8", "sardina")
        intentCarrito.putExtra("valor1", atun)
        intentCarrito.putExtra("valor2", huevos)
        intentCarrito.putExtra("valor3", leche)
        intentCarrito.putExtra("valor4", mantequilla)
        intentCarrito.putExtra("valor5", pescado)
        intentCarrito.putExtra("valor6", pollo)
        intentCarrito.putExtra("valor7", queso)
        intentCarrito.putExtra("valor8", sardinas)
        startActivity(intentCarrito)*/


    }
}