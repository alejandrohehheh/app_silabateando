package com.example.ultimaoportunidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.TextValueSanitizer
import android.widget.Button
import android.widget.TextView

class silabateando : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_silabateando)


        var boton: Button = findViewById(R.id.button2)
        var  name : TextView= findViewById(R.id.name)
        val bundle = intent.extras
        val dato = bundle?.getString("nombre")
        name.setText("¡HOLA "+dato+ " BIENVENIDO A!")

        boton.setOnClickListener {

            val intent = Intent(this, seleccionNiveles::class.java)
            startActivity(intent)
        }
    }




}