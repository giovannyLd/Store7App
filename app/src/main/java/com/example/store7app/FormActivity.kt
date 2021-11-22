package com.example.store7app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.firebase.firestore.FirebaseFirestore


class FormActivity : AppCompatActivity() {

    private var nombre: EditText? = null
    private var apellido: EditText? = null
    private var cedula: EditText? = null
    private var telefono: EditText? = null
    private var correo: EditText? = null
    private var contrasena: EditText? = null
    private var contrasenaConf: EditText? = null
    private var registro: Button? = null
    private var terminos: CheckBox? = null
    private var irATerminos: TextView? = null
    var db = FirebaseFirestore.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        nombre = findViewById<EditText>(R.id.txtNombre)
        apellido = findViewById<EditText>(R.id.txtApellido)
        cedula = findViewById<EditText>(R.id.txtCedula)
        telefono = findViewById<EditText>(R.id.txtTelefono)
        correo = findViewById<EditText>(R.id.txtCorreo)
        contrasena = findViewById<EditText>(R.id.txtContrasena)
        contrasenaConf = findViewById<EditText>(R.id.txtConstrasenaConfirmar)
        terminos = findViewById<CheckBox>(R.id.chTerminos)
        irATerminos = findViewById<TextView>(R.id.irATerminos)






    }


    fun validacionMayuMinuNumeEspecial(contrasena: String): Boolean {
        // var cadena="G10vanny"
        var boolMinuscula = false
        var boolMayuscula = false
        var boolNumero = false
        var boolCaracterEspecial = false
        for (x in contrasena) {

            if (x.toByte().toInt() >= 97 && x.toByte() <= 122) {
                boolMinuscula = true
            } else if (x.toByte().toInt() >= 65 && x.toByte() <= 90) {
                boolMayuscula = true
            } else if (x.toByte().toInt() >= 48 && x.toByte() <= 57) {
                boolNumero = true
            } else if (x.toByte().toInt() >= 33 && x.toByte() <= 47 ||
                x.toByte().toInt() >= 58 && x.toByte() <= 64 ||
                x.toByte().toInt() >= 92 && x.toByte() <= 96 ||
                x.toByte().toInt() >= 123 && x.toByte() <= 165
            ) {
                boolCaracterEspecial = true
            }

        }
        if (boolCaracterEspecial && boolMayuscula && boolMinuscula && boolNumero) {
            return true

        } else {
            return false
        }
    }

    fun mensaje(mensaje: String) {
        Toast.makeText(
            getApplicationContext(),
            "" + mensaje,
            Toast.LENGTH_LONG
        ).show()

    }

    fun envio(view: android.view.View) {

        var nombre = nombre!!.text.toString()
        var apellido = apellido!!.text.toString()
        var cedula = cedula!!.text.toString()
        var telefono = telefono!!.text.toString()
        var correo = correo!!.text.toString()
        var contrasena = contrasena!!.text.toString()
        var contrasenaConf = contrasenaConf!!.text.toString()
        var terms = terminos!!.isChecked;


        if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || telefono.isEmpty() ||
            correo.isEmpty() || contrasena.isEmpty() || contrasenaConf.isEmpty()
        ) {
            println("ingreso al setOnclik ")
            mensaje("DEBE DILIGENCIAR TODOS LOS CAMPOS")
        } else {
            if (contrasena != contrasenaConf) {
                mensaje("EN CONFIRMACION DECONTRANSEÑA NO SON IGUALES")

            } else {
                if (contrasena.length < 8) {
                    mensaje("CONTRASEÑA DEBE TENER MINIMO 8 CARACTERES")


                } else {
                    //validacion de caracteres especiales
                    if (!validacionMayuMinuNumeEspecial(contrasena)) {
                        mensaje("CONTRASEÑA DEBE TENER CARACTERES ESPECIALES  " + contrasena)
                    } else {
                        mensaje("OK CONTRASEÑA  " + contrasena)
                        if (terms) {

                            var persona: Persona =
                                Persona(nombre, apellido, cedula, telefono, correo, contrasena)

                            Toast.makeText(
                                getApplicationContext(),
                                persona.nombre + "\n " + persona.apellido + "\n " + persona.cedula + "\n " + persona.telefono + "\n " + persona.correo + "\n " + persona.contrasena,
                                Toast.LENGTH_LONG
                            ).show()

                            // if(it.isSuccessful)
                           db.collection("Formulario").document(correo).set(

                                hashMapOf(
                                    "nombre" to persona.nombre,
                                    "apellido" to persona.apellido,
                                    "telefono" to persona.telefono,
                                    "cedula" to persona.cedula,
                                    "contrasena" to persona.contrasena
                                )
                            )

                            // showHome(cedula, ProviderType.BASIC)


                        } else {
                            mensaje("Debe aceptar terminos y condiciones ")
                        }
                    }
                }

            }
        }

    }

    fun irATerminos(view: android.view.View) {


        var terminos = Intent(this, terminosCondicionesActivity::class.java)
        startActivity(terminos)
    }
}




