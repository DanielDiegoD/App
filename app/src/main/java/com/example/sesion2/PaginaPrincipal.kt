package com.example.sesion2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// Activity de la pagina principal

class PaginaPrincipal : AppCompatActivity() {

    // Creacion de los botones
    private lateinit var buttonCuenta: Button
    private lateinit var buttonOperaciones : Button
    private lateinit var buttonConfiguracion : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_principal)

        // Inicalizacion de los botones
        buttonOperaciones = findViewById(R.id.buttonOperaciones)
        buttonCuenta = findViewById(R.id.buttonCuenta)
        buttonConfiguracion = findViewById(R.id.buttonConfiguracion)

        // Funcion para ir al Actitvity Operaciones Bancarias
        buttonOperaciones.setOnClickListener {
            intent = Intent(this, OperacionesBancarias::class.java).apply{}
            startActivity(intent)


        }

        buttonCuenta.setOnClickListener {
            intent = Intent(this, OpcionesCuenta::class.java).apply{}
            startActivity(intent)

        }

        buttonConfiguracion.setOnClickListener {
            intent = Intent(this, Configuracion::class.java).apply{}
            startActivity(intent)

        }


    }

}