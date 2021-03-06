package com.example.store7app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R.string
import android.content.DialogInterface
import android.text.TextUtils.split
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


class VerCarroMercado : AppCompatActivity() {


    protected var tvDatos: TextView? = null
    protected var productos: MutableList<String> = mutableListOf()
    protected var hola: MutableList<String> = mutableListOf()
    protected var cadena: String = ""
    var total =0

    //recycler view
    private lateinit var recyclerView: RecyclerView
    private var db = FirebaseFirestore.getInstance()
    val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
    var keyLista: ArrayList<String> = ArrayList()


    var usuario:String?=null
 /*   private val listaProductos: List<ProductoEntity> = listOf(
        ProductoEntity("Arroz", "arroz- 2 - 1800"),
        ProductoEntity("avena", "avena -3. 2200")
    )*/
  /*  private lateinit var productoAdapter: ProductoAdapter
*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_carro_mercado)

        usuario = getIntent().getStringExtra("usuario")

        //Toast.makeText(this,"desde ver carrito  "+ usuario,Toast.LENGTH_SHORT).show()
//recycler view
        //   recyclerView=findViewById<RecyclerView>(R.id.vistaRecycler)
        //   recyclerView.layoutManager= LinearLayoutManager(actvity_ver_Carro_mercado)
        //   recyclerView.setHasFixedSize(true)
        //getAllProduct()
        //   productoAdapter = ProductoAdapter(listProduct, this)
        //   productoAdapter = ProductoAdapter(productos, this)
        // recycleView.adapter = productoAdapter


        tvDatos = findViewById(R.id.tvDatos)

        var datos: MutableList<String> = mutableListOf<String>()
        db.collection("carritoMercado").get().addOnSuccessListener { document ->
            var x = 0
            for (documento in document) {

                // datos.add("${documento.data}")
                //  separarCadena("${documento.data}")
                cadena = "${documento.data}"
                var imagen =
                    ((cadena.substringAfter("imagen=[")).substringBefore("]")).replace(
                        " ",
                        ""
                    ).split(",").toMutableList()
                var valor =
                    ((cadena.substringAfter("listaValor=[")).substringBefore("]")).replace(
                        " ",
                        ""
                    ).split(",").toMutableList()

                var categoria =
                    ((cadena.substringAfter("listaCategoria=[")).substringBefore("]")).replace(
                        " ",
                        ""
                    ).split(",").toMutableList()

                var cantida =
                    ((cadena.substringAfter("listaCantidad=[")).substringBefore("]")).replace(
                        " ",
                        ""
                    ).split(",").toMutableList()

                var x = 0
                while (x < cantida.size) {
                    if (cantida[x] != "0") {
                      //  println("" + categoria[x + 1] + " = " + cantida[x] + " = " + valor[x])
                        productos.add("          " + categoria[x + 1] + "                 " + cantida[x] + "    =     $ " + valor[x]+"\n")
                    total += valor[x].toInt()
                    }
                    x++
                }
            }
            tvDatos!!.setText("" + productos+"" +
                    "\n--------------------------------------------------------------" +
                    "\n              Total       =                  $ "+total)
        }


    }

  /*  fun separarCadena(datos: String) {

        var imagen =
            ((datos.substringAfter("imagen=[")).substringBefore("]")).replace(
                " ",
                ""
            ).split(",").toMutableList()
        var valor =
            ((datos.substringAfter("listaValor=[")).substringBefore("]")).replace(
                " ",
                ""
            ).split(",").toMutableList()

        var categoria =
            ((datos.substringAfter("listaCategoria=[")).substringBefore("]")).replace(
                " ",
                ""
            ).split(",").toMutableList()

        var cantida =
            ((datos.substringAfter("listaCantidad=[")).substringBefore("]")).replace(
                " ",
                ""
            ).split(",").toMutableList()


        var x = 0
        while (x < cantida.size) {

            if (cantida[x] != "0") {

                println("" + categoria[x + 1] + " = " + cantida[x] + " = " + valor[x])
                productos.add("" + x + "// " + categoria[x + 1] + " = " + cantida[x] + " = " + valor[x])
            }
            x++
        }

    }*/


    fun comprar(view: android.view.View) {


        if(total != 0) {

            val marker = Intent(this, Buy_activity::class.java)
            marker.putExtra("usuario", usuario)
            marker.putExtra("total",total.toString())
            startActivity(marker)
        }
    else{
            Toast.makeText(this,"NO HAY ARTICULOS EN EL CARRITO DE MERCADO"+ total,Toast.LENGTH_LONG).show()
        }
    }

    fun extractKey(estado:String) {

        println("entra a extracKey "+ estado)
        Toast.makeText(this,"desde extractKey "+estado,Toast.LENGTH_LONG).show()
        db.collection("$usuario").get().addOnSuccessListener { document ->
            for (documento in document) {
                var datos =
                    (("$documento".substringAfter("key=$usuario/")).substringBefore(",")).toString()
                keyLista.add(datos)
            }
            gestionKey(estado,keyLista)
        }
    }

    fun gestionKey(estado:String,keyLista: ArrayList<String>) {
        println("linea47 pruebaa2" + keyLista)
        for(lista in keyLista){
            db.collection("$usuario").document(lista).get().addOnSuccessListener { document ->
                if (document.exists()) {
                    var usuario: String? = (document.getString("usuario"))
                    var producto: String? = (document.getString("producto"))
                    var valor: Int? = document.getLong("valor")?.toInt()
                    var cantidad: Int? = document.getLong("cantidad")?.toInt()
                    var estadoAntes:String? = document.getString("estado")

                    if(estadoAntes=="en carrito"){
                        assignNewState(estado, lista, usuario, producto, valor, cantidad)
                    }} } } }

    public fun assignNewState(estado:String, keyLista: String, usuario: String?, producto: String?, valor: Int?, cantidad: Int?) {
        var listaProductos = hashMapOf(
            "cantidad" to cantidad,
            "fecha" to sdf.format(Date()),
            "producto" to producto,
            "usuario" to usuario,
            "valor" to valor,
            "estado" to estado)
        db.collection("$usuario").document(keyLista)
            .set(listaProductos)
    }

    fun cancelar(view: android.view.View) {
        Toast.makeText(this,usuario +" A CANCELADO EL PEDIDO", Toast.LENGTH_LONG).show()



        db.collection("carritoMercado").document("Cereales").delete()
        db.collection("carritoMercado").document("Embutidos").delete()
        db.collection("carritoMercado").document("Frutas").delete()
        db.collection("carritoMercado").document("Proteinas").delete()
        db.collection("carritoMercado").document("Salsas").delete()
        db.collection("carritoMercado").document("Verduras").delete()
        db.collection("carritoMercado").document("Verduras").delete()


           extractKey("cancelada")


        val marker = Intent(this,MarkerActivity::class.java)
        marker.putExtra("usuario",usuario)
        startActivity(marker)
    }
}

