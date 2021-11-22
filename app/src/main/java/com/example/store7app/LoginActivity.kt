package com.example.store7app

import android.content.Intent
import android.graphics.Color
import android.graphics.Color.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class LoginActivity : AppCompatActivity() {

    private var user: EditText? = null
    private var password: EditText? = null
    private var robot: CheckBox? = null
    private var vLayout:LinearLayout?=null
    private var vResult: TextView?=null

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
                if (usuario == "giovanny" && contrasena=="1234") {
                    if(robot.isChecked){
                        vista.text="OK USUARIO LOGUEADO"
                        vista.setTextColor(Color.GREEN)
                        Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show()

                        val marker = Intent(this,MarkerActivity::class.java)
                        startActivity(marker)
                    }else{
                        Toast.makeText(getApplicationContext(), "CHEQUEA QUE NO ERES UN ROBOT",
                            Toast.LENGTH_LONG).show()
                        vista.text="ERROR DE LOGUEO"
                        vista.setTextColor( Color.RED)
                    }
                } else {
                    Toast.makeText(getApplicationContext(),"USUARIO NO EXISTE O PASSWORD INCORRECTO",
                    Toast.LENGTH_SHORT).show()
                    vista.text="ERROR DE LOGUEO"
                    vista.setTextColor( Color.RED )
                  }
            }
        }
    }
}






