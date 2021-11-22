package com.example.store7app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MarkerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marker)

        var botoncereales: ImageButton = findViewById(R.id.btnCereales)
        botoncereales.setOnClickListener { view ->
          val marker = Intent(this,Cereales::class.java)
            startActivity(marker)
        }
        var botonfrutas: ImageButton = findViewById(R.id.btnFrutas)
        botonfrutas.setOnClickListener { view ->
            val marker = Intent(this,Frutas::class.java)
            startActivity(marker)
        }
        var botonverduras: ImageButton = findViewById(R.id.btnVerduras)
        botonverduras.setOnClickListener { view ->
            val marker = Intent(this,Verduras::class.java)
            startActivity(marker)
        }
        var botonproteinas: ImageButton = findViewById(R.id.btnProteinas)
        botonproteinas.setOnClickListener { view ->
            val marker = Intent(this,Proteinas::class.java)
            startActivity(marker)
        }
        var botonsalsas: ImageButton = findViewById(R.id.btnProteinas)
        botonsalsas.setOnClickListener { view ->
            val marker = Intent(this,Salsas::class.java)
            startActivity(marker)
        }

    }
}