package com.example.sesion2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

// Activity en donde se encuentarn las operaciones financieras

class OperacionesBancarias : AppCompatActivity() {

    // creacion de los botones
    private lateinit var buttonDepositar: Button
    private lateinit var buttonRetirar: Button
    private lateinit var buttonObtenerFondos: Button
    private lateinit var buttonTransferir: Button

    // creacion de los text
    private lateinit var textDepositar: TextView
    private lateinit var textRetirar: TextView
    private lateinit var textObtenerFondos: TextView
    private lateinit var textTransferir: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operaciones_bancarias)

        // Inicializacion de los botones
        buttonDepositar = findViewById(R.id.buttonDepositar)
        buttonRetirar = findViewById(R.id.buttonRetirar)
        buttonObtenerFondos = findViewById(R.id.buttonObtenerFondos)
        buttonTransferir = findViewById(R.id.buttonTransferir)

        // Incializacion de los textos
//        textDepositar = findViewById(R.id.textDepositar)
//        textRetirar  = findViewById(R.id.textRetirar)
//        textObtenerFondos  =findViewById(R.id.textObtenerFondos)
//        textTransferir = findViewById(R.id.textTransferir)

        buttonDepositar.setOnClickListener {
            textDepositar.setVisibility(View.VISIBLE)

        }

        // Funciones que ejecutan la operación financiera
        buttonRetirar.setOnClickListener {
            textRetirar.setVisibility(View.VISIBLE)

        }
        buttonObtenerFondos.setOnClickListener {
            textObtenerFondos.setVisibility(View.VISIBLE)

        }

        buttonTransferir.setOnClickListener {
            textTransferir.setVisibility(View.VISIBLE)

        }


    }
}