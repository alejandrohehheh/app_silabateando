package com.example.ultimaoportunidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class pantalla_completado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_completado)

        var  name : TextView = findViewById(R.id.felicitaciones)
        var boton: Button = findViewById(R.id.regresoInicio)

        var boton2: Button = findViewById(R.id.siguinetNivel)
        val bundle = intent.extras
        val dato = bundle?.getString("numNivel")
        val numcorona=bundle?.getString("numCoronas")
        name.setText("¡Felicidades has\n superado el \n"+dato+ " nivel \n con "+numcorona+" coronas!")

        boton.setOnClickListener {

            val intent = Intent(this, seleccionNiveles::class.java)
            if (numcorona != null) {
                intent.putExtra("aumentoCoronas", numcorona)
            }
            startActivity(intent)
        }
        boton2.setOnClickListener{
            if (dato=="primer"){
                val intent = Intent(this, nivel2::class.java)
                startActivity(intent)
            }
            else{
                val intent = Intent(this, nivel3::class.java)
                startActivity(intent)
            }

        }
    }
}