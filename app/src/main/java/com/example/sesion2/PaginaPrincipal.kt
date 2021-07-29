package com.example.sesion2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// Activity de la pagina principal

class PaginaPrincipal : AppCompatActivity() {

    private lateinit var buttonCuenta: Button
    private lateinit var buttonOperaciones : Button
    private lateinit var buttonConfiguracion : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_principal)

        buttonOperaciones = findViewById(R.id.buttonOperaciones)
        buttonCuenta = findViewById(R.id.buttonCuenta)
        buttonConfiguracion = findViewById(R.id.buttonConfiguracion)

        buttonOperaciones.setOnClickListener {
            intent = Intent(this, OperacionesBancarias::class.java).apply{}
            startActivity(intent)


        }


    }

}