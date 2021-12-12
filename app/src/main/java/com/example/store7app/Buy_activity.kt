package com.example.store7app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class Buy_activity : AppCompatActivity() {

    private var nombre: EditText? = null
    private var apellido: EditText? = null
    private var cedula: EditText? = null
    private var telefono: EditText? = null
    private var correo: EditText? = null
    private var tvTotal: TextView? = null
    var db = FirebaseFirestore.getInstance()
    var usuario: String? = null
    var total: String? = null

    var keyLista: ArrayList<String> = ArrayList()
    val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        nombre = findViewById<EditText>(R.id.txtNombre)
        apellido = findViewById<EditText>(R.id.txtApellido)
        cedula = findViewById<EditText>(R.id.txtCedula)
        telefono = findViewById<EditText>(R.id.txtTelefono)
        correo = findViewById<EditText>(R.id.txtCorreo)
        tvTotal = findViewById<TextView>(R.id.tvTotal)

        usuario = getIntent().getStringExtra("usuario")
        total = getIntent().getStringExtra("total")

        correo!!.setText(usuario)
        tvTotal!!.setText("TOTAL A PAGAR $ " + total)




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

    fun eliminarBDCarrito() {
        Toast.makeText(this, "COMPARANDO", Toast.LENGTH_LONG).show()
        db.collection("carritoMercado").document("Cereales").delete()
        db.collection("carritoMercado").document("Embutidos").delete()
        db.collection("carritoMercado").document("Frutas").delete()
        db.collection("carritoMercado").document("Proteinas").delete()
        db.collection("carritoMercado").document("Salsas").delete()
        db.collection("carritoMercado").document("Verduras").delete()

        db.collection("$usuario").get().addOnSuccessListener { document ->

            for (documento in document) {
                var datos =
                    (("$documento".substringAfter("key=$usuario/")).substringBefore(",")).toString()
                keyLista.add(datos)
            }
            gestionKey("cancelada",keyLista)
        } }

    public fun envio(view: View) {
        eliminarBDCarrito()
        extractKey("vendido")
    }

    fun Cancelar(view: android.view.View) {
        eliminarBDCarrito()
        extractKey("cancelada")
    }


}