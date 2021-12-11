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


class VerCarroMercado : AppCompatActivity() {


    protected var tvDatos: TextView? = null
    protected var productos: MutableList<String> = mutableListOf()
    protected var hola: MutableList<String> = mutableListOf()
    protected var cadena: String = ""
    var total =0

    //recycler view
    private lateinit var recyclerView: RecyclerView
    private var db = FirebaseFirestore.getInstance()
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

        Toast.makeText(this,"desde ver carrito  "+ usuario,Toast.LENGTH_SHORT).show()



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

                        println("" + categoria[x + 1] + " = " + cantida[x] + " = " + valor[x])
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

    fun separarCadena(datos: String) {

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

    }


    fun comprar(view: android.view.View) {
        Toast.makeText(this,"COMPARANDO",Toast.LENGTH_LONG).show()
        db.collection("carritoMercado").document("Cereales").delete()
        db.collection("carritoMercado").document("Embutidos").delete()
        db.collection("carritoMercado").document("Frutas").delete()
        db.collection("carritoMercado").document("Proteinas").delete()
        db.collection("carritoMercado").document("Salsas").delete()
        db.collection("carritoMercado").document("Verduras").delete()

        val marker = Intent(this,MarkerActivity::class.java)
        marker.putExtra("usuario",usuario)
        startActivity(marker)
    }

}

