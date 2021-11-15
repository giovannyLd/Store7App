package com.example.store7app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.*

class Cereales : AppCompatActivity() {


    protected var tvArroz: TextView? = null
    protected var btnMenosArroz: Button? = null
    protected var tvCanArroz: TextView? = null
    protected var btnMasArroz: Button? = null
    protected val valArroz: Int = 1200

    protected var tvAvena: TextView? = null
    protected var btnMenosAvena: Button? = null
    protected var tvCanAvena: TextView? = null
    protected var btnMasAvena: Button? = null
    protected val valAvena: Int = 800

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cereales)

        tvArroz = findViewById(R.id.tvArroz)
        btnMenosArroz = findViewById(R.id.btnMenosArroz)
        tvCanArroz = findViewById(R.id.tvCanArroz)
        btnMasArroz = findViewById(R.id.btnMasArroz)

        tvAvena = findViewById(R.id.tvAvena)
        btnMenosAvena = findViewById(R.id.btnMenosAvena)
        tvCanAvena = findViewById(R.id.tvCanAvena)
        btnMasAvena = findViewById(R.id.btnMasAvena)

    }

    fun menosArroz(view: android.view.View) {
        calculoArroz(-1)
    }

    fun masArroz(view: android.view.View) {
        calculoArroz(1)
    }

    fun calculoArroz(valor: Int) {

        var cantidad = (tvCanArroz!!.text.toString()).toInt() + valor

        if(cantidad>0){ tvCanArroz!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanArroz!!.setText(cantidad.toString()) }
        tvArroz!!.setText("        ARROZ $ " + valArroz * cantidad)


    }

    fun menosAvena(view: android.view.View) {calculoAvena(-1)}
    fun masAvena(view: android.view.View) {calculoAvena(1)}
    fun calculoAvena(valor:Int){
        var cantidad = (tvCanAvena!!.text.toString()).toInt() + valor

        if(cantidad>0){ tvCanAvena!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanAvena!!.setText(cantidad.toString()) }
        tvAvena!!.setText("                  AVENA $ " + valAvena * cantidad)


    }
}





