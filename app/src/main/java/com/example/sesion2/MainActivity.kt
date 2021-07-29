package com.example.sesion2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button //importar librerias
import android.widget.TextView
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.isVisible

//Activity de la pantalla de de login


class MainActivity : AppCompatActivity() {

    // Variables de los layout del Activity
    private lateinit var btnIngresar :Button
    private lateinit var editUsuario: EditText
    private lateinit var editContraseña: EditText
    private lateinit var register_text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializacion de las Variables
        btnIngresar = findViewById(R.id.btnIngresar)
        editUsuario = findViewById(R.id.editUsuario)
        editContraseña = findViewById(R.id.editPassword)
        register_text=findViewById(R.id.register)

        btnIngresar.setOnClickListener{

            if (editUsuario.text.toString().isEmpty() or editContraseña.text.toString().isEmpty()){
                Toast.makeText(applicationContext,  "Ingresa tu Usuario y Contraseña", Toast.LENGTH_SHORT)
                    .show()
            }



            else {
                Toast.makeText(applicationContext,  "Iniciaste sesion Exitosamente", Toast.LENGTH_SHORT)
                    .show()

                var intent = Intent( this, PaginaPrincipal:: class.java).apply{}
                startActivity(intent)
            }

        }

        register_text.setOnClickListener{

             register_text.highlightColor

             val intent= Intent(this,Registro::class.java).apply{}
             startActivity(intent)

        }


    }

}