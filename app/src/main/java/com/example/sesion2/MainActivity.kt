package com.example.sesion2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button //importar librerias
import android.widget.TextView
import android.widget.EditText
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {
    private lateinit var btnAccept :Button // lateinit hace que la variable se inicialize despues, se declara variable btnAccept de tipo button
    private lateinit var text: TextView
    private lateinit var register_text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAccept = findViewById(R.id.btnaccept) //R.id en recursos id
        text = findViewById(R.id.text)
        register_text=findViewById(R.id.register)

        /*btnAccept.setOnClickListener{// Listener espera que haya una accion sobre el boton, cuando sucede reacciona
          //  text.text="Haz dado click al boton"
              text.text = getString(R.string.button_clicked) // cambiar texto en text view
              btnAccept.isEnabled =false
              text.visibility = View.VISIBLE
             //text.isVisible= false

        }*/

        register_text.setOnClickListener{

             register_text.highlightColor
            // text.text = getString(R.string.button_clicked) // cambiar texto en text view
            //text.visibility = View.VISIBLE
             val intent= Intent(this,Registro::class.java).apply{}
             startActivity(intent)

        }


    }

}