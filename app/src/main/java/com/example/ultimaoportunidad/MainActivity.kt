package com.example.ultimaoportunidad

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mediaPlayer = MediaPlayer.create(this,R.raw.nombre)
        var boton: Button = findViewById(R.id.botonl)
        var et1: EditText=findViewById(R.id.et1)
        var textView2 :TextView=findViewById(R.id.textView2)
        mediaPlayer.start()
        boton.setOnClickListener {

            if(et1.length()>2){
                val intent = Intent(this, silabateando::class.java)
                intent.putExtra("nombre", et1.text.toString())
                startActivity(intent)
            }
            else{
                textView2.visibility= View.VISIBLE
            }

        }
    }

}