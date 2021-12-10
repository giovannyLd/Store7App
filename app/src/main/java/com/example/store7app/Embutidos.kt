package com.example.store7app

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
//import com.google.firebase.firestore.FirebaseFirestore
import java.util.*


class Embutidos : AppCompatActivity() {


    protected var tvChorizo: TextView? = null
    protected var btnMenosChorizo: Button? = null
    protected var tvCanChorizo: TextView? = null
    protected var btnMasChorizo: Button? = null
    protected var valorChorizo: TextView? = null

    protected var tvPizza: TextView? = null
    protected var btnMenosPizza: Button? = null
    protected var tvCanPizza: TextView? = null
    protected var btnMasPizza: Button? = null
    protected var valorPizza: TextView? = null

    protected var tvHamburguesa: TextView? = null
    protected var btnMenosHamburguesa: Button? = null
    protected var tvCanHamburguesa: TextView? = null
    protected var btnMasHamburguesa: Button? = null
    protected var valorHamburguesa: TextView? = null

    protected var tvJamon: TextView? = null
    protected var btnMenosJamon: Button? = null
    protected var tvCanJamon: TextView? = null
    protected var btnMasJamon: Button? = null
    protected var valorJamon: TextView? = null

    protected var tvMortadela: TextView? = null
    protected var btnMenosMortadela: Button? = null
    protected var tvCanMortadela: TextView? = null
    protected var btnMasMortadela: Button? = null
    protected var valorMortadela: TextView? = null

    protected var tvSalami: TextView? = null
    protected var btnMenosSalami: Button? = null
    protected var tvCanSalami: TextView? = null
    protected var btnMasSalami: Button? = null
    protected var valorSalami: TextView? = null

    protected var tvSalchichas: TextView? = null
    protected var btnMenosSalchichas: Button? = null
    protected var tvCanSalchichas: TextView? = null
    protected var btnMasSalchichas: Button? = null
    protected var valorSalchichas: TextView? = null

    protected var tvSalchicon: TextView? = null
    protected var btnMenosSalchicon: Button? = null
    protected var tvCanSalchicon: TextView? = null
    protected var btnMasSalchicon: Button? = null
    protected var valorSalchicon: TextView? = null
    // var db = FirebaseFirestore.getInstance()
    var usuario:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_embutidos)

        usuario= getIntent().getStringExtra("usuario")

        Toast.makeText(this,"desde embutidos "+ usuario,Toast.LENGTH_SHORT).show()


        tvChorizo = findViewById(R.id.tvChorizo)
        btnMenosChorizo = findViewById(R.id.btnMenosChorizo)
        tvCanChorizo = findViewById(R.id.tvCanChorizo)
        btnMasChorizo = findViewById(R.id.btnMasChorizo)
        valorChorizo = findViewById(R.id.valorChorizo)
        valorChorizo!!.setText("0")

        tvPizza = findViewById(R.id.tvPizza)
        btnMenosPizza = findViewById(R.id.btnMenosPizza)
        tvCanPizza = findViewById(R.id.tvCanPizza)
        btnMasPizza = findViewById(R.id.btnMasPizza)
        valorPizza = findViewById(R.id.valorPizza)
        valorPizza!!.setText("0")

        tvHamburguesa = findViewById(R.id.tvHamburguesa)
        btnMenosHamburguesa = findViewById(R.id.btnMenosHamburguesa)
        tvCanHamburguesa = findViewById(R.id.tvCanHamburguesa)
        btnMasHamburguesa = findViewById(R.id.btnMasHamburguesa)
        valorHamburguesa = findViewById(R.id.valorHamburguesa)
        valorHamburguesa!!.setText("0")

        tvJamon = findViewById(R.id.tvJamon)
        btnMenosJamon = findViewById(R.id.btnMenosJamon)
        tvCanJamon = findViewById(R.id.tvCanJamon)
        btnMasJamon = findViewById(R.id.btnMasJamon)
        valorJamon = findViewById(R.id.valorJamon)
        valorJamon!!.setText("0")

        tvMortadela = findViewById(R.id.tvMortadela)
        btnMenosMortadela = findViewById(R.id.btnMenosMortadela)
        tvCanMortadela = findViewById(R.id.tvCanMortadela)
        btnMasMortadela = findViewById(R.id.btnMasMortadela)
        valorMortadela = findViewById(R.id.valorMortadela)
        valorMortadela!!.setText("0")

        tvSalami = findViewById(R.id.tvSalami)
        btnMenosSalami = findViewById(R.id.btnMenosSalami)
        tvCanSalami = findViewById(R.id.tvCanSalami)
        btnMasSalami = findViewById(R.id.btnMasSalami)
        valorSalami = findViewById(R.id.valorSalami)
        valorSalami!!.setText("0")



        tvSalchichas = findViewById(R.id.tvSalchichas)
        btnMenosSalchichas = findViewById(R.id.btnMenosSalchichas)
        tvCanSalchichas = findViewById(R.id.tvCanSalchichas)
        btnMasSalchichas = findViewById(R.id.btnMasSalchichas)
        valorSalchichas = findViewById(R.id.valorSalchichas)
        valorSalchichas!!.setText("0")

        tvSalchicon = findViewById(R.id.tvSalchichon)
        btnMenosSalchicon = findViewById(R.id.btnMenosSalchichon)
        tvCanSalchicon = findViewById(R.id.tvCanSalchichon)
        btnMasSalchicon = findViewById(R.id.btnMasSalchichon)
        valorSalchicon = findViewById(R.id.valorSalchichon)
        valorSalchicon!!.setText("0")

    }

    fun menosChorizo(view: android.view.View) {
        calculoChorizo(-1)
    }

    fun masChorizo(view: android.view.View) {
        calculoChorizo(1)
    }

    fun menosPizza(view: android.view.View) {
        calculoPizza(-1)
    }

    fun masPizza(view: android.view.View) {
        calculoPizza(1)
    }

    fun menosHamburguesa(view: android.view.View) {
        calculoHamburguesa(-1)
    }

    fun masHamburguesa(view: android.view.View) {
        calculoHamburguesa(1)
    }

    fun menosJamon(view: android.view.View) {
        calculoJamon(-1)
    }

    fun masJamon(view: android.view.View) {
        calculoJamon(1)
    }

    fun menosMortadela(view: android.view.View) {
        calculoMortadela(-1)
    }

    fun masMortadela(view: android.view.View) {
        calculoMortadela(1)
    }

    fun menosSalami(view: android.view.View) {
        calculoSalami(-1)
    }

    fun masSalami(view: android.view.View) {
        calculoSalami(1)
    }

    fun menosSalchichas(view: android.view.View) {
        calculoSalchichas(-1)
    }

    fun masSalchichas(view: android.view.View) {
        calculoSalchichas(1)
    }

    fun menosSalchicon(view: android.view.View) {
        calculoSalchicon(-1)
    }

    fun masSalchichon(view: android.view.View) {
        calculoSalchicon(1)
    }

    fun calculoChorizo(valor: Int) {

        val valChorizo: Int = 1200
        var cantidad = (tvCanChorizo!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanChorizo!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanChorizo!!.setText(cantidad.toString())
        }
        valorChorizo!!.setText("" + valChorizo * cantidad)
    }

    fun calculoPizza(valor: Int) {
        val valPizza: Int = 800
        var cantidad = (tvCanPizza!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanPizza!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanPizza!!.setText(cantidad.toString())
        }
        valorPizza!!.setText("" + valPizza * cantidad)
    }

    fun calculoHamburguesa(valor: Int) {
        val valHamburguesa: Int = 2000
        var cantidad = (tvCanHamburguesa!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanHamburguesa!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanHamburguesa!!.setText(cantidad.toString())
        }
        valorHamburguesa!!.setText("" + valHamburguesa * cantidad)
    }

    fun calculoJamon(valor: Int) {
        val valJamon: Int = 1500
        var cantidad = (tvCanJamon!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanJamon!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanJamon!!.setText(cantidad.toString())
        }
        valorJamon!!.setText("" + valJamon * cantidad)
    }

    fun calculoMortadela(valor: Int) {
        val valMortadela: Int = 800
        var cantidad = (tvCanMortadela!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanMortadela!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanMortadela!!.setText(cantidad.toString())
        }
        valorMortadela!!.setText("" + valMortadela * cantidad)
    }

    fun calculoSalami(valor: Int) {
        val valSalami: Int = 800
        var cantidad = (tvCanSalami!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanSalami!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanSalami!!.setText(cantidad.toString())
        }
        valorSalami!!.setText("" + valSalami * cantidad)
    }

    fun calculoSalchichas(valor: Int) {
        val valSalchichas: Int = 800
        var cantidad = (tvCanSalchichas!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanSalchichas!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanSalchichas!!.setText(cantidad.toString())
        }
        valorSalchichas!!.setText("" + valSalchichas * cantidad)
    }

    fun calculoSalchicon(valor: Int) {
        val valSalchicon: Int = 800
        var cantidad = (tvCanSalchicon!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanSalchicon!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanSalchicon!!.setText(cantidad.toString())
        }
        valorSalchicon!!.setText("" + valSalchicon * cantidad)
    }


    fun envioCarrito(view: android.view.View) {
        var chorizo: String = valorChorizo!!.text.toString()
        var pizza: String = valorPizza!!.text.toString()
        var hamburguesa: String = valorHamburguesa!!.text.toString()
        var jamon: String = valorJamon!!.text.toString()
        var mortadela: String = valorMortadela!!.text.toString()
        var salami: String = valorSalami!!.text.toString()
        var salchichas: String = valorSalchichas!!.text.toString()
        var salchichon: String = valorSalchicon!!.text.toString()

        var chorizoCan: Int = tvCanChorizo!!.text.toString().toInt()
        var pizzaCan: Int = tvCanPizza!!.text.toString().toInt()
        var hamburguesaCan: Int = tvCanHamburguesa!!.text.toString().toInt()
        var jamonCan: Int = tvCanJamon!!.text.toString().toInt()
        var mortadelaCan: Int = tvCanMortadela!!.text.toString().toInt()
        var salamiCan: Int = tvCanSalami!!.text.toString().toInt()
        var salchichasCan: Int = tvCanSalchichas!!.text.toString().toInt()
        var salchichonCan: Int = tvCanSalchicon!!.text.toString().toInt()


        Toast.makeText(
            this,
            "SE HA CARGADO AL CARRITO DE MERCADO LO SIGUIENTE :  \n Chorizo = $ " + chorizo + "\nPizza = $ " + pizza + "\nHamburguesas = $ " + hamburguesa +
                    "\nJamon = $ " + jamon + "\nMortadela = $ " + mortadela + "\nSalami = $ " + salami + "\nSalchichas = $ " + salchichas +
                    "\nSalchicon = $ " + salchichon,
            Toast.LENGTH_LONG
        ).show()

        val cargueCarrito = CarroMercado(
            "Embutidos",
            "chorizo",
            "pizza",
            "hamburguesa",
            "jamon",
            "mortadela",
            "salami",
            "salchichas",
            "salchichon",
            chorizo,pizza,hamburguesa,jamon,mortadela,salami,salchichas,salchichon,chorizoCan,pizzaCan,hamburguesaCan,jamonCan,mortadelaCan,salamiCan,salchichasCan,salchichonCan
        )
        cargueCarrito.cargar()
        //cargueCarrito.cargarPrueba()




    }

    fun VerCarrito(view: android.view.View) {
        val marker = Intent(this, VerCarroMercado::class.java)
        marker.putExtra("usuario",usuario)
        startActivity(marker)
    }
}