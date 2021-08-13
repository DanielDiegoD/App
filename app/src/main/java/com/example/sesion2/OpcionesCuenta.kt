package com.example.sesion2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


// Activity donde el usuario puede conocer y cambiar datos de su tipo de cuenta

class OpcionesCuenta : AppCompatActivity() {

    // Creacion de botones
    private lateinit var buttonMembresia : Button
    private lateinit var buttonMembresiaCosto : Button
    private lateinit var buttonSuscripcion : Button

    // Creacion de los textView
    private lateinit var textMembresia : TextView
    private lateinit var textMembresiaCosto : TextView
    private lateinit var textSuscripcion : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones_cuenta)

        // Inicializacion de los botones

        buttonMembresia = findViewById(R.id.buttonMembresia)
        buttonMembresiaCosto = findViewById(R.id.buttonMembresiaCosto)
        buttonSuscripcion = findViewById(R.id.buttonSuscripcion)

        // Iniciliazcion de las textos
//        textMembresia = findViewById(R.id.textMembresia)
//        textMembresiaCosto = findViewById(R.id.textMembresiaCosto)
//        textSuscripcion = findViewById(R.id.textSuscripcion)

        buttonMembresia.setOnClickListener {
            textMembresia.setVisibility(View.VISIBLE)
        }

        buttonMembresiaCosto.setOnClickListener {
            textMembresiaCosto.setVisibility(View.VISIBLE)
        }

        buttonSuscripcion.setOnClickListener {
            textSuscripcion.setVisibility(View.VISIBLE)
        }


    }
}




