package com.example.store7app

import android.content.Intent
import android.graphics.Color
import android.graphics.Color.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.firebase.firestore.FirebaseFirestore

class LoginActivity : AppCompatActivity() {

    private var user: EditText? = null
    private var password: EditText? = null
    private var robot: CheckBox? = null
    private var vLayout:LinearLayout?=null
    private var vResult: TextView?=null
    var db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var user: EditText = findViewById(R.id.txtUser)
        var password: EditText = findViewById(R.id.txtPassword)
        var robot: CheckBox = findViewById(R.id.chRobot)
        var button: Button = findViewById(R.id.ingreso)
        var vista:TextView=findViewById(R.id.vResult)


        // Register the onClick listener with the implementation above
        button.setOnClickListener { view ->
            // do something when the button is clicked
            var usuario = user!!.text.toString()
            var contrasena = password!!.text.toString()

            if (usuario.isEmpty() || contrasena.isEmpty()) {
                Toast.makeText(getApplicationContext(), "LOS CAMPOS ESTAN VACIOS",
                    Toast.LENGTH_LONG).show()
                vista.text="ERROR DE LOGUEO"
                vista.setTextColor( Color.RED )
            } else {
// chequeo desde la base de datos
                db.collection("Formulario").document(usuario).get()
                    .addOnSuccessListener { document ->
                        //valida correo y contrasena
                        if(document.exists()&& document.getString("contrasena")==contrasena) {

                            Toast.makeText(getApplicationContext(), "Bienvenido "+usuario,
                                Toast.LENGTH_LONG).show()
                            if(robot.isChecked){
                                vista.text="OK USUARIO LOGUEADO"
                                vista.setTextColor(Color.GREEN)


                                val marker = Intent(this,MarkerActivity::class.java)
                                startActivity(marker)
                            }else{
                                Toast.makeText(getApplicationContext(), "CHEQUEA QUE NO ERES UN ROBOT",
                                    Toast.LENGTH_LONG).show()
                                vista.text="ERROR DE LOGUEO"
                                vista.setTextColor( Color.RED)
                            }

                        }

                 else {
                    Toast.makeText(getApplicationContext(),"USUARIO NO EXISTE O PASSWORD INCORRECTO",
                    Toast.LENGTH_SHORT).show()
                    vista.text="ERROR DE LOGUEO"
                    vista.setTextColor( Color.RED )
                  }
            }
        }
    }

    fun validacionUsuarioBD(usuario:String,contrasena:String){


       db.collection("Formulario").document(usuario).get()
               .addOnSuccessListener { document ->
                   if(document.exists()&& document.getString("contrasena")==contrasena) {

                       if(robot.isChecked){
                           vista.text="OK USUARIO LOGUEADO"
                           vista.setTextColor(Color.GREEN)


                           val marker = Intent(this,MarkerActivity::class.java)
                           startActivity(marker)
                       }else{
                           Toast.makeText(getApplicationContext(), "CHEQUEA QUE NO ERES UN ROBOT",
                               Toast.LENGTH_LONG).show()
                           vista.text="ERROR DE LOGUEO"
                           vista.setTextColor( Color.RED)
                       }

                   }
        }
    }
}}






