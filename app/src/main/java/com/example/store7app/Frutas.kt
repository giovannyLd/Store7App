package com.example.store7app

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.graphics.Color

import android.os.Bundle
import android.view.View
import android.widget.*
//import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

class Frutas : AppCompatActivity() {

    protected var tvArandanos: TextView? = null
    protected var btnMenosArandanos: Button? = null
    protected var tvCanArandanos: TextView? = null
    protected var btnMasArandanos: Button? = null
    protected var valorArandanos:TextView?=null

    protected var tvBanana: TextView? = null
    protected var btnMenosBanana: Button? = null
    protected var tvCanBanana: TextView? = null
    protected var btnMasBanana: Button? = null
    protected var valorBanana:TextView?=null

    protected var tvCereza: TextView? = null
    protected var btnMenosCereza: Button? = null
    protected var tvCanCereza: TextView? = null
    protected var btnMasCereza: Button? = null
    protected var valorCereza:TextView?=null

    protected var tvDurazno: TextView? = null
    protected var btnMenosdurazno: Button? = null
    protected var tvCanDurazno: TextView? = null
    protected var btnMasDurazno: Button? = null
    protected var valorDurazno:TextView?=null

    protected var tvManzana: TextView? = null
    protected var btnMenosManzana: Button? = null
    protected var tvCanManzana: TextView? = null
    protected var btnMasManzana: Button? = null
    protected var valorManzana:TextView?=null

    protected var tvPatilla: TextView? = null
    protected var btnMenosPatilla: Button? = null
    protected var tvCanPatilla: TextView? = null
    protected var btnMasPatilla: Button? = null
    protected var valorPatilla:TextView?=null

    protected var tvPina: TextView? = null
    protected var btnMenosPina: Button? = null
    protected var tvCanPina: TextView? = null
    protected var btnMasPina: Button? = null
    protected var valorPina:TextView?=null

    protected var tvpapaya: TextView? = null
    protected var btnMenosPapaya: Button? = null
    protected var tvCanPapaya: TextView? = null
    protected var btnMasPapaya: Button? = null
    protected var valorPapaya:TextView?=null
    // var db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)

        tvArandanos = findViewById(R.id.tvArandanos)
        btnMenosArandanos = findViewById(R.id.btnMenosArandanos)
        tvCanArandanos = findViewById(R.id.tvCanArandanos)
        btnMasArandanos = findViewById(R.id.btnMasArandanos)
        valorArandanos=findViewById(R.id.valorArandanos)
        valorArandanos!!.setText("0")

        tvBanana = findViewById(R.id.tvbanana)
        btnMenosBanana = findViewById(R.id.btnMenosBanana)
        tvCanBanana = findViewById(R.id.tvCanBanana)
        btnMasBanana = findViewById(R.id.btnMasBanana)
        valorBanana= findViewById(R.id.valorBanana)
        valorBanana!!.setText("0")

        tvCereza = findViewById(R.id.tvCereza)
        btnMenosCereza = findViewById(R.id.btnMenosCereza)
        tvCanCereza = findViewById(R.id.tvCanCereza)
        btnMasCereza = findViewById(R.id.btnMasCereza)
        valorCereza= findViewById(R.id.valorCereza)
        valorCereza!!.setText("0")

        tvDurazno = findViewById(R.id.tvDurazno)
        btnMenosdurazno = findViewById(R.id.btnMenosDurazno)
        tvCanDurazno = findViewById(R.id.tvCanDurazno)
        btnMasDurazno = findViewById(R.id.btnMasDurazno)
        valorDurazno= findViewById(R.id.valorDurazno)
        valorDurazno!!.setText("0")

        tvManzana = findViewById(R.id.tvManzana)
        btnMenosManzana = findViewById(R.id.btnMenosManzana)
        tvCanManzana = findViewById(R.id.tvCanManzana)
        btnMasManzana = findViewById(R.id.btnMasManzana)
        valorManzana= findViewById(R.id.valorManzana)
        valorManzana!!.setText("0")

        tvPatilla = findViewById(R.id.tvPatilla)
        btnMenosPatilla = findViewById(R.id.btnMenosPatilla)
        tvCanPatilla = findViewById(R.id.tvCanPatilla)
        btnMasPatilla = findViewById(R.id.btnMasPatilla)
        valorPatilla= findViewById(R.id.valorPatilla)
        valorPatilla!!.setText("0")



        tvPina = findViewById(R.id.tvPina)
        btnMenosPina = findViewById(R.id.btnMenosPina)
        tvCanPina = findViewById(R.id.tvCanPina)
        btnMasPina = findViewById(R.id.btnMasPina)
        valorPina= findViewById(R.id.valorPina)
        valorPina!!.setText("0")

        tvpapaya = findViewById(R.id.tvPapaya)
        btnMenosPapaya = findViewById(R.id.btnMenosPapaya)
        tvCanPapaya = findViewById(R.id.tvCanPapaya)
        btnMasPapaya = findViewById(R.id.btnMasPapaya)
        valorPapaya= findViewById(R.id.valorPapaya)
        valorPapaya!!.setText("0")

    }

    fun menosArandanos(view: android.view.View) { calculoArandanos(-1) }
    fun masArandanos(view: android.view.View) { calculoArandanos(1) }
    fun menosBanana(view: android.view.View) {calculoBanana(-1)}
    fun masBanana(view: android.view.View) {calculoBanana(1)}
    fun menosCereza(view: android.view.View) {calculoCereza(-1)}
    fun masCereza(view: android.view.View) {calculoCereza(1)}
    fun menosDurazno(view: android.view.View) {calculoDurazno(-1)}
    fun masDurazno(view: android.view.View) {calculoDurazno(1)}
    fun menosManzana(view: android.view.View) {calculoManzana(-1)}
    fun masManzana(view: android.view.View) {calculoManzana(1)}
    fun menosPatilla(view: android.view.View) {calculoPatilla(-1)}
    fun masPatilla(view: android.view.View) {calculoPatilla(1)}
    fun menosPina(view: android.view.View) {calculoPina(-1)}
    fun masPina(view: android.view.View) {calculoPina(1)}
    fun menosPapaya(view: android.view.View) {calculoPapaya(-1)}
    fun masPapaya(view: android.view.View) {calculoPapaya(1)}

    fun calculoArandanos(valor: Int) {

        val valArandanos:Int = 1200
        var cantidad = (tvCanArandanos!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanArandanos!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanArandanos!!.setText(cantidad.toString()) }
        valorArandanos!!.setText(""+valArandanos * cantidad)
    }

    fun calculoBanana(valor:Int){
        val valBanana:Int = 800
        var cantidad = (tvCanBanana!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanBanana!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanBanana!!.setText(cantidad.toString()) }
        valorBanana!!.setText("" + valBanana * cantidad) }

    fun calculoCereza(valor:Int){
        val valCereza:Int = 2000
        var cantidad = (tvCanCereza!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanCereza!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanCereza!!.setText(cantidad.toString()) }
        valorCereza!!.setText("" + valCereza * cantidad) }

    fun calculoDurazno(valor:Int){
        val valDurazno:Int = 1500
        var cantidad = (tvCanDurazno!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanDurazno!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanDurazno!!.setText(cantidad.toString()) }
        valorDurazno!!.setText("" + valDurazno * cantidad) }

    fun calculoManzana(valor:Int){
        val valManzana:Int = 800
        var cantidad = (tvCanManzana!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanManzana!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanManzana!!.setText(cantidad.toString()) }
        valorManzana!!.setText("" + valManzana * cantidad) }

    fun calculoPatilla(valor:Int){
        val valPatilla:Int = 800
        var cantidad = (tvCanPatilla!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanPatilla!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanPatilla!!.setText(cantidad.toString()) }
        valorPatilla!!.setText("" + valPatilla * cantidad) }

    fun calculoPina(valor:Int){
        val valPina:Int = 800
        var cantidad = (tvCanPina!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanPina!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanPina!!.setText(cantidad.toString()) }
        valorPina!!.setText("" + valPina * cantidad) }

    fun calculoPapaya(valor:Int){
        val valPapaya:Int = 800
        var cantidad = (tvCanPapaya!!.text.toString()).toInt() + valor
        if(cantidad>0){ tvCanPapaya!!.setText(cantidad.toString())
        }else { cantidad =0; tvCanPapaya!!.setText(cantidad.toString()) }
        valorPapaya!!.setText("" + valPapaya * cantidad) }


    fun envioCarrito(view: android.view.View) {
        var arandanos:String=valorArandanos!!.text.toString()
        var banana:String = valorBanana!!.text.toString()
        var cereza:String = valorCereza!!.text.toString()
        var durazno:String = valorDurazno!!.text.toString()
        var manzana:String = valorManzana!!.text.toString()
        var patilla:String = valorPatilla!!.text.toString()
        var pina:String = valorPina!!.text.toString()
        var papaya:String = valorPapaya!!.text.toString()


        Toast.makeText(this, "Arandanos = $ "+ arandanos+"\nBanana = $ "+banana+"\nCerezas = $ "+cereza+
                "\nDurazno = $ "+durazno+"\nManzana = $ "+manzana+"\nPatilla = $ "+patilla+"\nPina = $ "+pina+
                "\nPapaya = $ "+papaya, Toast.LENGTH_LONG).show()
        var intentCarrito= Intent(this,Pruebas::class.java)

        intentCarrito.putExtra("categoria","Frutas")
        intentCarrito.putExtra("producto1","banana")
        intentCarrito.putExtra("producto2","cereza")
        intentCarrito.putExtra("producto3","cereza")
        intentCarrito.putExtra("producto4","durazno")
        intentCarrito.putExtra("producto5","manzana")
        intentCarrito.putExtra("producto6","patilla")
        intentCarrito.putExtra("producto7","pina")
        intentCarrito.putExtra("producto8","papaya")
        intentCarrito.putExtra("valor1", arandanos)
        intentCarrito.putExtra("valor2", banana)
        intentCarrito.putExtra("valor3",cereza)
        intentCarrito.putExtra("valor4",durazno)
        intentCarrito.putExtra("valor5",manzana)
        intentCarrito.putExtra("valor6",patilla)
        intentCarrito.putExtra("valor7",pina)
        intentCarrito.putExtra("valor8",papaya)
        startActivity(intentCarrito)


    }




}



