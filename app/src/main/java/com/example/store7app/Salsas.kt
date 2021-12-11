package com.example.store7app

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
//import com.google.firebase.firestore.FirebaseFirestore
import java.util.*


class Salsas : AppCompatActivity() {


    protected var tvFruco: TextView? = null
    protected var btnMenosFruco: Button? = null
    protected var tvCanFruco: TextView? = null
    protected var btnMasFruco: Button? = null
    protected var valorFruco: TextView? = null

    protected var tvMostaza: TextView? = null
    protected var btnMenosMostaza: Button? = null
    protected var tvCanMostaza: TextView? = null
    protected var btnMasMostaza: Button? = null
    protected var valorMostaza: TextView? = null

    protected var tvAjo: TextView? = null
    protected var btnMenosAjo: Button? = null
    protected var tvCanAjo: TextView? = null
    protected var btnMasAjo: Button? = null
    protected var valorAjo: TextView? = null

    protected var tvBechamel: TextView? = null
    protected var btnMenosBechamel: Button? = null
    protected var tvCanBechamel: TextView? = null
    protected var btnMasBechamel: Button? = null
    protected var valorBechamel: TextView? = null

    protected var tvPicante: TextView? = null
    protected var btnMenosPicante: Button? = null
    protected var tvCanPicante: TextView? = null
    protected var btnMasPicante: Button? = null
    protected var valorPicante: TextView? = null

    protected var tvTartara: TextView? = null
    protected var btnMenosTartara: Button? = null
    protected var tvCanTartara: TextView? = null
    protected var btnMasTartara: Button? = null
    protected var valorTartara: TextView? = null

    protected var tvMayonesa: TextView? = null
    protected var btnMenosMayonesa: Button? = null
    protected var tvCanMayonesa: TextView? = null
    protected var btnMasMayonesa: Button? = null
    protected var valorMayonesa: TextView? = null

    protected var tvSverde: TextView? = null
    protected var btnMenosSverde: Button? = null
    protected var tvCanSverde: TextView? = null
    protected var btnMasSverde: Button? = null
    protected var valorSverde: TextView? = null
    // var db = FirebaseFirestore.getInstance()
    var usuario:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salsas)

        usuario = getIntent().getStringExtra("usuario")

        Toast.makeText(this,"desde salsas "+ usuario,Toast.LENGTH_SHORT).show()


        tvFruco = findViewById(R.id.tvFruco)
        btnMenosFruco = findViewById(R.id.btnMenosFruco)
        tvCanFruco = findViewById(R.id.tvCanFruco)
        btnMasFruco = findViewById(R.id.btnMasFruco)
        valorFruco = findViewById(R.id.valorFruco)
        valorFruco!!.setText("0")

        tvMostaza = findViewById(R.id.tvMostaza)
        btnMenosMostaza = findViewById(R.id.btnMenosMostaza)
        tvCanMostaza = findViewById(R.id.tvCanMostaza)
        btnMasMostaza = findViewById(R.id.btnMasMostaza)
        valorMostaza = findViewById(R.id.valorMostaza)
        valorMostaza!!.setText("0")

        tvAjo = findViewById(R.id.tvAjo)
        btnMenosAjo = findViewById(R.id.btnMenosAjo)
        tvCanAjo = findViewById(R.id.tvCanAjo)
        btnMasAjo = findViewById(R.id.btnMasAjo)
        valorAjo = findViewById(R.id.valorAjo)
        valorAjo!!.setText("0")

        tvBechamel = findViewById(R.id.tvBechamel)
        btnMenosBechamel = findViewById(R.id.btnMenosBechamel)
        tvCanBechamel = findViewById(R.id.tvCanBechamel)
        btnMasBechamel = findViewById(R.id.btnMasBechamel)
        valorBechamel = findViewById(R.id.valorBechamel)
        valorBechamel!!.setText("0")

        tvPicante = findViewById(R.id.tvPicante)
        btnMenosPicante = findViewById(R.id.btnMenosPicante)
        tvCanPicante = findViewById(R.id.tvCanPicante)
        btnMasPicante = findViewById(R.id.btnMasPicante)
        valorPicante = findViewById(R.id.valorPicante)
        valorPicante!!.setText("0")

        tvTartara = findViewById(R.id.tvTartara)
        btnMenosTartara = findViewById(R.id.btnMenosTartara)
        tvCanTartara = findViewById(R.id.tvCanTartara)
        btnMasTartara = findViewById(R.id.btnMasTartara)
        valorTartara = findViewById(R.id.valorTartara)
        valorTartara!!.setText("0")



        tvMayonesa = findViewById(R.id.tvMayonesa)
        btnMenosMayonesa = findViewById(R.id.btnMenosMayonesa)
        tvCanMayonesa = findViewById(R.id.tvCanMayonesa)
        btnMasMayonesa = findViewById(R.id.btnMasMayonesa)
        valorMayonesa = findViewById(R.id.valorMayonesa)
        valorMayonesa!!.setText("0")

        tvSverde = findViewById(R.id.tvSverde)
        btnMenosSverde = findViewById(R.id.btnMenosSverde)
        tvCanSverde = findViewById(R.id.tvCanSverde)
        btnMasSverde = findViewById(R.id.btnMasSverde)
        valorSverde = findViewById(R.id.valorSverde)
        valorSverde!!.setText("0")

    }

    fun menosFruco(view: android.view.View) {
        calculoFruco(-1)
    }

    fun masFruco(view: android.view.View) {
        calculoFruco(1)
    }

    fun menosMostaza(view: android.view.View) {
        calculoMostaza(-1)
    }

    fun masMostaza(view: android.view.View) {
        calculoMostaza(1)
    }

    fun menosAjo(view: android.view.View) {
        calculoAjo(-1)
    }

    fun masAjo(view: android.view.View) {
        calculoAjo(1)
    }

    fun menosBechamel(view: android.view.View) {
        calculoBechamel(-1)
    }

    fun masBechamel(view: android.view.View) {
        calculoBechamel(1)
    }

    fun menosPicante(view: android.view.View) {
        calculoPicante(-1)
    }

    fun masPicante(view: android.view.View) {
        calculoPicante(1)
    }

    fun menosTartara(view: android.view.View) {
        calculoTartara(-1)
    }

    fun masTartara(view: android.view.View) {
        calculoTartara(1)
    }

    fun menosMayonesa(view: android.view.View) {
        calculoMayonesa(-1)
    }

    fun masMayonesa(view: android.view.View) {
        calculoMayonesa(1)
    }

    fun menosSverde(view: android.view.View) {
        calculoSverde(-1)
    }

    fun masSverde(view: android.view.View) {
        calculoSverde(1)
    }

    fun calculoFruco(valor: Int) {

        val valFruco: Int = 1200
        var cantidad = (tvCanFruco!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanFruco!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanFruco!!.setText(cantidad.toString())
        }
        valorFruco!!.setText("" + valFruco * cantidad)
    }

    fun calculoMostaza(valor: Int) {
        val valMostaza: Int = 800
        var cantidad = (tvCanMostaza!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanMostaza!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanMostaza!!.setText(cantidad.toString())
        }
        valorMostaza!!.setText("" + valMostaza * cantidad)
    }

    fun calculoAjo(valor: Int) {
        val valAjo: Int = 2000
        var cantidad = (tvCanAjo!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanAjo!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanAjo!!.setText(cantidad.toString())
        }
        valorAjo!!.setText("" + valAjo * cantidad)
    }

    fun calculoBechamel(valor: Int) {
        val valBechamel: Int = 1500
        var cantidad = (tvCanBechamel!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanBechamel!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanBechamel!!.setText(cantidad.toString())
        }
        valorBechamel!!.setText("" + valBechamel * cantidad)
    }

    fun calculoPicante(valor: Int) {
        val valPicante: Int = 800
        var cantidad = (tvCanPicante!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanPicante!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanPicante!!.setText(cantidad.toString())
        }
        valorPicante!!.setText("" + valPicante * cantidad)
    }

    fun calculoTartara(valor: Int) {
        val valTartara: Int = 800
        var cantidad = (tvCanTartara!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanTartara!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanTartara!!.setText(cantidad.toString())
        }
        valorTartara!!.setText("" + valTartara * cantidad)
    }

    fun calculoMayonesa(valor: Int) {
        val valMayonesa: Int = 800
        var cantidad = (tvCanMayonesa!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanMayonesa!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanMayonesa!!.setText(cantidad.toString())
        }
        valorMayonesa!!.setText("" + valMayonesa * cantidad)
    }

    fun calculoSverde(valor: Int) {
        val valSverde: Int = 800
        var cantidad = (tvCanSverde!!.text.toString()).toInt() + valor
        if (cantidad > 0) {
            tvCanSverde!!.setText(cantidad.toString())
        } else {
            cantidad = 0; tvCanSverde!!.setText(cantidad.toString())
        }
        valorSverde!!.setText("" + valSverde * cantidad)
    }


    fun envioCarrito(view: android.view.View) {
        var fruco: String = valorFruco!!.text.toString()
        var mostaza: String = valorMostaza!!.text.toString()
        var ajo: String = valorAjo!!.text.toString()
        var bechamel: String = valorBechamel!!.text.toString()
        var picante: String = valorPicante!!.text.toString()
        var tartara: String = valorTartara!!.text.toString()
        var mayonesa: String = valorMayonesa!!.text.toString()
        var sverde: String = valorSverde!!.text.toString()


        var frucoCan: Int = tvCanFruco!!.text.toString().toInt()
        var mostazaCan: Int = tvCanMostaza!!.text.toString().toInt()
        var ajoCan: Int = tvCanAjo!!.text.toString().toInt()
        var bechamelCan: Int = tvCanBechamel!!.text.toString().toInt()
        var picanteCan: Int = tvCanPicante!!.text.toString().toInt()
        var tartaraCan: Int = tvCanTartara!!.text.toString().toInt()
        var mayonesaCan: Int = tvCanMayonesa!!.text.toString().toInt()
        var sVerdeCan: Int = tvCanSverde!!.text.toString().toInt()


        Toast.makeText(
            this,
            "SE HA CARGADO AL CARRITO DE MERCADO LO SIGUIENTE :  \n Fruco = $ " + fruco + "\nMostaza = $ " + mostaza + "\nAjos = $ " + ajo +
                    "\nBechamel = $ " + bechamel + "\nPicante = $ " + picante + "\nTartara = $ " + tartara + "\nMayonesa = $ " + mayonesa +
                    "\nSverde = $ " + sverde,
            Toast.LENGTH_LONG
        ).show()
        val cargueCarrito = CarroMercado(
            "Salsas",
            "fruco",
            "mostaza",
            "ajo",
            "bechamel",
            "picante",
            "tartara",
            "mayonesa",
            "sverde",
        fruco,mostaza,ajo,bechamel,picante,tartara,mayonesa,sverde,frucoCan,mostazaCan,ajoCan,bechamelCan,picanteCan,tartaraCan,mayonesaCan,sVerdeCan)

       cargueCarrito.cargar()
        //cargueCarrito.cargarPrueba()
        cargueCarrito.historico("$usuario")





    }

    fun VerCarrito(view: android.view.View) {
        val marker = Intent(this, VerCarroMercado::class.java)
        marker.putExtra("usuario",usuario)
        startActivity(marker)
    }
}