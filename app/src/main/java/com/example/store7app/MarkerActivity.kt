package com.example.store7app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore

class MarkerActivity : AppCompatActivity() {


    var db = FirebaseFirestore.getInstance()
    var usuario:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marker)

        usuario = getIntent().getStringExtra("usuario")

        //Toast.makeText(this,"desde marker "+ usuario,Toast.LENGTH_SHORT).show()

        var botoncereales: ImageButton = findViewById(R.id.btnCereales)
        botoncereales.setOnClickListener { view ->
          val marker = Intent(this,Cereales::class.java)
            marker.putExtra("usuario",usuario)
            startActivity(marker)
        }
        var botonfrutas: ImageButton = findViewById(R.id.btnFrutas)
        botonfrutas.setOnClickListener { view ->
            val marker = Intent(this,Frutas::class.java)
            marker.putExtra("usuario",usuario)
            startActivity(marker)
        }
        var botonverduras: ImageButton = findViewById(R.id.btnVerduras)
        botonverduras.setOnClickListener { view ->
            val marker = Intent(this,Verduras::class.java)
            marker.putExtra("usuario",usuario)
            startActivity(marker)
        }
        var botonproteinas: ImageButton = findViewById(R.id.btnProteinas)
        botonproteinas.setOnClickListener { view ->


            val marker = Intent(this,Proteinas::class.java)
            marker.putExtra("usuario",usuario)
               startActivity(marker)
              }
            var botonsalsas: ImageButton = findViewById(R.id.btnSalsas)

            botonsalsas.setOnClickListener { view ->


             val marker = Intent(this, Salsas::class.java)
                marker.putExtra("usuario",usuario)
                startActivity(marker)
            }
        var botonembutidos: ImageButton = findViewById(R.id.btnEmbutidos)
             botonembutidos.setOnClickListener { view ->


            val marker = Intent(this, Embutidos::class.java)
                 marker.putExtra("usuario",usuario)
            startActivity(marker)
        }
    }

    fun btnCarro(view: android.view.View) {


        /*var intentCarrito = Intent(this, VerCarroMercado::class.java)
        startActivity(intentCarrito)*/


        Toast.makeText(getApplicationContext(),"btncarro",Toast.LENGTH_LONG).show()

    }

    fun btnCarro1(view: android.view.View) {


        val marker = Intent(this, VerCarroMercado::class.java)
            .putExtra("usuario",usuario)
        startActivity(marker)


    }
}


