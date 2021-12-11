package com.example.store7app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import org.w3c.dom.Text

class Buy_activity : AppCompatActivity() {

    private var nombre: EditText? = null
    private var apellido: EditText? = null
    private var cedula: EditText? = null
    private var telefono: EditText? = null
    private var correo: EditText? = null
    private var tvTotal: TextView?=null
    var db = FirebaseFirestore.getInstance()
    var usuario: String? = null
    var total: String? = null

    val cant:String? = null
    val fech:String? = null
    val prod:String? = null
    val usua:String? = null
    val valo:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        nombre = findViewById<EditText>(R.id.txtNombre)
        apellido = findViewById<EditText>(R.id.txtApellido)
        cedula = findViewById<EditText>(R.id.txtCedula)
        telefono = findViewById<EditText>(R.id.txtTelefono)
        correo = findViewById<EditText>(R.id.txtCorreo)
        tvTotal=findViewById<TextView>(R.id.tvTotal)

        usuario = getIntent().getStringExtra("usuario")
        total = getIntent().getStringExtra("total")

        correo!!.setText(usuario)
        tvTotal!!.setText("TOTAL A PAGAR $ "+total)


    }

    private fun traerBD() {

       var datos: MutableList<String> = mutableListOf<String>()
        db.collection("$usuario").get().addOnSuccessListener { document ->
            var x = 0
            for (documento in document) {

              var datos=(("$documento".substringAfter("key=$usuario/")).substringBefore(","))

                db.collection("$usuario").document(datos).get().addOnSuccessListener {

                    var cantidad = it.getString("cantidad").toString()
                    var fecha:String? = it.getString("fecha")
                    var producto:String? = it.getString("producto")
                    var usuario:String? = it.getString("usuario")
                    val valor:String? = it.getString("valor")

                }

                val listaProductos = hashMapOf(
                //    "cantidad" to cantidad,
                    "estado" to "vendidoSS")
                var coleccion = db.collection("$usuario").document(datos)
                    .set(listaProductos)
            }
        }
    }



    private fun eliminarBDCarrito() {

         Toast.makeText(this,"COMPARANDO", Toast.LENGTH_LONG).show()
          db.collection("carritoMercado").document("Cereales").delete()
          db.collection("carritoMercado").document("Embutidos").delete()
          db.collection("carritoMercado").document("Frutas").delete()
          db.collection("carritoMercado").document("Proteinas").delete()
          db.collection("carritoMercado").document("Salsas").delete()
          db.collection("carritoMercado").document("Verduras").delete()
    }

    fun envio(view: android.view.View) {

        Toast.makeText(this,"SE INICA LA GESTION DE COMPRA ", Toast.LENGTH_LONG).show()

      //  eliminarBDCarrito()
       // traerBD()
    }
}