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
    protected var valorArroz:TextView?=null

    protected var tvAvena: TextView? = null
    protected var btnMenosAvena: Button? = null
    protected var tvCanAvena: TextView? = null
    protected var btnMasAvena: Button? = null
    protected var valorAvena:TextView?=null

    protected var tvLenteja: TextView? = null
    protected var btnMenosLenteja: Button? = null
    protected var tvCanLenteja: TextView? = null
    protected var btnMasLenteja: Button? = null
    protected var valorLenteja:TextView?=null

    protected var tvMaiz: TextView? = null
    protected var btnMenosMaiz: Button? = null
    protected var tvCanMaiz: TextView? = null
    protected var btnMasMaiz: Button? = null
    protected var valorMaiz:TextView?=null

    protected var tvPan: TextView? = null
    protected var btnMenosPan: Button? = null
    protected var tvCanPan: TextView? = null
    protected var btnMasPan: Button? = null
    protected var valorPan:TextView?=null

    protected var tvPasta: TextView? = null
    protected var btnMenosPasta: Button? = null
    protected var tvCanPasta: TextView? = null
    protected var btnMasPasta: Button? = null
    protected var valorPasta:TextView?=null

    protected var tvQuinoa: TextView? = null
    protected var btnMenosQuinoa: Button? = null
    protected var tvCanQuinoa: TextView? = null
    protected var btnMasQuinoa: Button? = null
    protected var valorQuinoa:TextView?=null

    protected var tvTrigo: TextView? = null
    protected var btnMenosTrigo: Button? = null
    protected var tvCanTrigo: TextView? = null
    protected var btnMasTrigo: Button? = null
    protected var valorTrigo:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cereales)

        tvArroz = findViewById(R.id.tvArroz)
        btnMenosArroz = findViewById(R.id.btnMenosArroz)
        tvCanArroz = findViewById(R.id.tvCanArroz)
        btnMasArroz = findViewById(R.id.btnMasArroz)
        valorArroz=findViewById(R.id.valorArroz)

        tvAvena = findViewById(R.id.tvAvena)
        btnMenosAvena = findViewById(R.id.btnMenosAvena)
        tvCanAvena = findViewById(R.id.tvCanAvena)
        btnMasAvena = findViewById(R.id.btnMasAvena)
        valorAvena= findViewById(R.id.valorAvena)

        tvLenteja = findViewById(R.id.tvLenteja)
        btnMenosLenteja = findViewById(R.id.btnMenosLenteja)
        tvCanLenteja = findViewById(R.id.tvCanLenteja)
        btnMasLenteja = findViewById(R.id.btnMasLenteja)
        valorLenteja= findViewById(R.id.valorLenteja)

        tvMaiz = findViewById(R.id.tvMaiz)
        btnMenosMaiz = findViewById(R.id.btnMenosMaiz)
        tvCanMaiz = findViewById(R.id.tvCanMaiz)
        btnMasMaiz = findViewById(R.id.btnMasMaiz)
        valorMaiz= findViewById(R.id.valorMaiz)

        tvPan = findViewById(R.id.tvPan)
        btnMenosPan = findViewById(R.id.btnMenosPan)
        tvCanPan = findViewById(R.id.tvCanPan)
        btnMasPan = findViewById(R.id.btnMasPan)
        valorPan= findViewById(R.id.valorPan)

        tvPasta = findViewById(R.id.tvPasta)
        btnMenosPasta = findViewById(R.id.btnMenosPasta)
        tvCanPasta = findViewById(R.id.tvCanPasta)
        btnMasPasta = findViewById(R.id.btnMasPasta)
        valorPasta= findViewById(R.id.valorPasta)

        tvQuinoa = findViewById(R.id.tvQuinoa)
        btnMenosQuinoa = findViewById(R.id.btnMenosQuinoa)
        tvCanQuinoa = findViewById(R.id.tvCanQuinoa)
        btnMasQuinoa = findViewById(R.id.btnMasQuinoa)
        valorQuinoa= findViewById(R.id.valorQuinoa)

        tvQuinoa = findViewById(R.id.tvQuinoa)
        btnMenosQuinoa = findViewById(R.id.btnMenosQuinoa)
        tvCanQuinoa = findViewById(R.id.tvCanQuinoa)
        btnMasQuinoa = findViewById(R.id.btnMasQuinoa)
        valorQuinoa= findViewById(R.id.valorQuinoa)

        tvTrigo = findViewById(R.id.tvTrigo)
        btnMenosTrigo = findViewById(R.id.btnMenosTrigo)
        tvCanTrigo = findViewById(R.id.tvCanTrigo)
        btnMasTrigo = findViewById(R.id.btnMasTrigo)
        valorTrigo= findViewById(R.id.valorTrigo)

    }

    fun menosArroz(view: android.view.View) { calculoArroz(-1) }
    fun masArroz(view: android.view.View) { calculoArroz(1) }
    fun menosAvena(view: android.view.View) {calculoAvena(-1)}
    fun masAvena(view: android.view.View) {calculoAvena(1)}
    fun menosLenteja(view: android.view.View) {calculoLenteja(-1)}
    fun masLenteja(view: android.view.View) {calculoLenteja(1)}
    fun menosMaiz(view: android.view.View) {calculoMaiz(-1)}
    fun masMaiz(view: android.view.View) {calculoMaiz(1)}
    fun menosPan(view: android.view.View) {calculoPan(-1)}
    fun masPan(view: android.view.View) {calculoPan(1)}
    fun menosPasta(view: android.view.View) {calculoPasta(-1)}
    fun masPasta(view: android.view.View) {calculoPasta(1)}
    fun menosQuinoa(view: android.view.View) {calculoQuinoa(-1)}
    fun masQuinoa(view: android.view.View) {calculoQuinoa(1)}
    fun menosTrigo(view: android.view.View) {calculoTrigo(-1)}
    fun masTrigo(view: android.view.View) {calculoTrigo(1)}

    fun calculoArroz(valor: Int) {

        val valArroz:Int = 1200
        var cantidad = (tvCanArroz!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanArroz!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanArroz!!.setText(cantidad.toString()) }
        valorArroz!!.setText(""+valArroz * cantidad)
    }

    fun calculoAvena(valor:Int){
        val valAvena:Int = 800
        var cantidad = (tvCanAvena!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanAvena!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanAvena!!.setText(cantidad.toString()) }
        valorAvena!!.setText("" + valAvena * cantidad) }

    fun calculoLenteja(valor:Int){
        val valLenteja:Int = 2000
        var cantidad = (tvCanLenteja!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanLenteja!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanLenteja!!.setText(cantidad.toString()) }
        valorLenteja!!.setText("" + valLenteja * cantidad) }

    fun calculoMaiz(valor:Int){
        val valMaiz:Int = 1500
        var cantidad = (tvCanMaiz!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanMaiz!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanMaiz!!.setText(cantidad.toString()) }
        valorMaiz!!.setText("" + valMaiz * cantidad) }

    fun calculoPan(valor:Int){
        val valPan:Int = 800
        var cantidad = (tvCanPan!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanPan!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanPan!!.setText(cantidad.toString()) }
        valorPan!!.setText("" + valPan * cantidad) }

    fun calculoPasta(valor:Int){
        val valPasta:Int = 800
        var cantidad = (tvCanPasta!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanPasta!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanPasta!!.setText(cantidad.toString()) }
        valorPasta!!.setText("" + valPasta * cantidad) }

    fun calculoQuinoa(valor:Int){
        val valQuinoa:Int = 800
        var cantidad = (tvCanQuinoa!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanQuinoa!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanQuinoa!!.setText(cantidad.toString()) }
        valorQuinoa!!.setText("" + valQuinoa * cantidad) }

    fun calculoTrigo(valor:Int){
        val valTrigo:Int = 800
        var cantidad = (tvCanTrigo!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanTrigo!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanTrigo!!.setText(cantidad.toString()) }
        valorTrigo!!.setText("" + valTrigo * cantidad) }


    fun envioCarrito(view: android.view.View) {
        var arroz:Int = (valorArroz!!.text.toString()).toInt()
        var avena:Int = (valorAvena!!.text.toString()).toInt()
        var lenteja:Int = (valorLenteja!!.text.toString()).toInt()
        var maiz:Int = (valorMaiz!!.text.toString()).toInt()
        var pan:Int = (valorPan!!.text.toString()).toInt()
        var pasta:Int = (valorPasta!!.text.toString()).toInt()
        var quinoa:Int = (valorQuinoa!!.text.toString()).toInt()
        var trigo:Int = (valorTrigo!!.text.toString()).toInt()
        Toast.makeText(this, ""+ arroz+"\n"+avena+"\n"+lenteja+"\n"+maiz+"\n"+pan+"\n"+pasta+"\n"+quinoa+"\n"+trigo, Toast.LENGTH_SHORT).show()
    }




}





