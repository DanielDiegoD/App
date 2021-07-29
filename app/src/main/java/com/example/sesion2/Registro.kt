package com.example.sesion2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// Activity para hacer el registro de usuario

class Registro : AppCompatActivity() {

    // Creacion de las vaiables del layout
    private lateinit var buttonRegistrar: Button
    private lateinit var buttonCancelar: Button
    private lateinit var textUsuario: EditText
    private lateinit var textClave: EditText
    private lateinit var textContraseña: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        // Inicializacion de las variables
        buttonRegistrar = findViewById(R.id.btnRegistro)
        buttonCancelar = findViewById(R.id.btnCancel)
        textUsuario = findViewById(R.id.Registro_Usuario)
        textClave = findViewById(R.id.Registro_Clave)
        textContraseña = findViewById(R.id.Registro_Contraseña)



        buttonRegistrar.setOnClickListener {

            // Validacion del registro
            if (textUsuario.text.toString().isEmpty() or textClave.text.toString().isEmpty() or textContraseña.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "El formulario esta incompleto", Toast.LENGTH_SHORT)
                    .show() }

            else { Toast.makeText(applicationContext, "Tu usuario fue creado", Toast.LENGTH_SHORT)
                    .show()

                var intent = Intent(this, MainActivity::class.java).apply{}
                startActivity(intent)

            }



        }

        buttonCancelar.setOnClickListener {
            Toast.makeText(applicationContext, "Has cancelado tu registro", Toast.LENGTH_SHORT)
                .show()

            var intent = Intent(this, MainActivity::class.java).apply{}
            startActivity(intent)
        }



    }
}