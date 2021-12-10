package com.example.store7app

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.facebook.login.Login
import com.google.firebase.firestore.FirebaseFirestore

class Pruebas : AppCompatActivity() {

    val superheros = PruebaClass(
        "spiderman",
        "petter",
        "Marvel",
        "https://firebasestorage.googleapis.com/v0/b/supermercado-649e8.appspot.com/o/brocoli.png?alt=media&token=911a877d-5f0a-43ff-b973-41a390d8fb96"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pruebas)


    }
}

