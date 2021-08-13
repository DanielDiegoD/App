package com.example.sesion2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

// Activity en la que el usuario puede modificar su informacion con la que creo el usuario

class Configuracion : AppCompatActivity() {


    // Inicializacion de los Botones
    private lateinit var buttonInformacion: Button
    private lateinit var buttonCambiarInformacion:Button
    private lateinit var buttonCerrarSesion: Button

    // Inicializacion de los TextView
    private lateinit var textInformacion: TextView
    private lateinit var textCambiarInformacion: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)

        buttonInformacion = findViewById(R.id.buttonInformacion)
        buttonCambiarInformacion = findViewById(R.id.buttonCambiarInformacion)
        buttonCerrarSesion = findViewById(R.id.buttonCerrarSesion)

        // Inicializacion de los textView
        //textInformacion = findViewById(R.id.textInformacion)
        //textCambiarInformacion = findViewById(R.id.textCambiarInformacion)

        buttonInformacion.setOnClickListener {
            textInformacion.setVisibility(View.VISIBLE)
        }

        buttonCambiarInformacion.setOnClickListener {
            textCambiarInformacion.setVisibility(View.VISIBLE)
        }

        buttonCerrarSesion.setOnClickListener {
            Toast.makeText(applicationContext,  "Has Cerrado Sesion ", Toast.LENGTH_SHORT )
                .show()

            intent = Intent(this, MainActivity::class.java).apply{}
            startActivity(intent)

        }



    }
}