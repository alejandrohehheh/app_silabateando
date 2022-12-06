package com.example.ultimaoportunidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class seleccionNiveles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_niveles)

        var boton: Button = findViewById(R.id.ButtonNivel1)
        var boton2: Button = findViewById(R.id.ButtonNivel2)
        var boton3: Button = findViewById(R.id.ButtonNivel3)


        var  name : TextView= findViewById(R.id.textView3)
        val bundle = intent.extras
        var dato = bundle?.getString("aumentoCoronas")
        var dato2= 0
        var dato3= 0
        var dato4= 0

        //val dato2=bundle?.getString("aumentoCoronas")
        if(dato3==0){
            if(dato==null){
                name.setText("0")
            }
            else{
                name.setText(dato)
                dato2=dato.toInt()
            }
            dato3++
        }
        else{
            name.setText(dato+dato2)
            dato=dato+dato2
        }



        boton.setOnClickListener {
            val intent = Intent(this, nivel1::class.java)
            startActivity(intent)
        }
        boton2.setOnClickListener {
            val intent = Intent(this, nivel2::class.java)
            startActivity(intent)
        }
        boton3.setOnClickListener {
            val intent = Intent(this, nivel3::class.java)
            startActivity(intent)
        }
    }
}