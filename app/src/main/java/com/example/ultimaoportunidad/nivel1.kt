package com.example.ultimaoportunidad

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.provider.MediaStore.Audio.Media
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class nivel1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel1)

        //sonidos
        var mp1=MediaPlayer()
        var mp2=MediaPlayer()
        var mp3=MediaPlayer()
        var mp4= MediaPlayer()

        var ave = MediaPlayer.create(this,R.raw.ave)
        var bus = MediaPlayer.create(this,R.raw.bus)
        var dia = MediaPlayer.create(this,R.raw.dia)
        var dos = MediaPlayer.create(this,R.raw.dos)
        var flor = MediaPlayer.create(this,R.raw.flor)
        var luz = MediaPlayer.create(this,R.raw.luz)
        var ojo = MediaPlayer.create(this,R.raw.ojo)
        var rio = MediaPlayer.create(this,R.raw.rio)
        var sol = MediaPlayer.create(this,R.raw.sol)
        var uno = MediaPlayer.create(this,R.raw.uno)


        var vocal_a = MediaPlayer.create(this,R.raw.vocal_a)
        var vocal_e = MediaPlayer.create(this,R.raw.vocal_e)
        var vocal_i = MediaPlayer.create(this,R.raw.vocal_i)
        var vocal_o = MediaPlayer.create(this,R.raw.vocal_o)
        var vocal_u = MediaPlayer.create(this,R.raw.vocal_u)
        var correcto = MediaPlayer.create(this,R.raw.correcto)
        var muyBien = MediaPlayer.create(this, R.raw.muy_bien)
        var sonidito = MediaPlayer.create(this, R.raw.sonidito)
        var vocalFaltante = MediaPlayer.create(this, R.raw.vocalfaltante)

        var contadorfallo=0;
        var  numeroSeleccionado =0
        var numeroCoronas=0
        var numNivel=1
        var textoCoronas=""
        var primerNivel="primer"

        var progressBar2 : ProgressBar= findViewById(R.id.progressBar2)
        var textView9 : TextView= findViewById(R.id.textView9)
       var  palabraCorrecta :TextView = findViewById(R.id.palabra_correcta)
       var  palabraIncompleta : TextView= findViewById<TextView>(R.id.palabra_incompleta)
        var radioButton11 : RadioButton = findViewById<RadioButton>(R.id.radioButton11)
        var radioButton12 :RadioButton = findViewById<RadioButton>(R.id.radioButton12)
        var radioButton13 : RadioButton = findViewById<RadioButton>(R.id.radioButton13)
        var radioGroup1 : RadioGroup = findViewById<RadioGroup>(R.id.radioGroup1)
        var botonAceptar1 : Button= findViewById<Button>(R.id.botonAceptar1)
        var siguiente1: Button = findViewById<Button>(R.id.siguiente1)
         var linearVuelveIntentarlo1 : LinearLayout = findViewById<LinearLayout>(R.id.linearVuelveIntentarlo1)
        var linearContenido1 : LinearLayout= findViewById<LinearLayout>(R.id.linearContenido1)
       var  linearPalabarCorrecta : LinearLayout= findViewById<LinearLayout>(R.id.linearPalabarCorrecta)
        var linearPerfecto1 : LinearLayout= findViewById<LinearLayout>(R.id.linearPerfecto1)
       var  linearBien1 : LinearLayout = findViewById<LinearLayout>(R.id.linearBien1)
       var  linearMal1: LinearLayout = findViewById<LinearLayout>(R.id.linearMal1)
        var textCorrecto1 :TextView= findViewById<TextView>(R.id.textCorrecto1)
        var imagenImagen :ImageView= findViewById<ImageView>(R.id.imagen_imagen)

        var sonido: ImageButton = findViewById(R.id.sonido)

        var linearBotones :LinearLayout = findViewById<LinearLayout>(R.id.linearBotones)
        var boton1 : Button= findViewById<Button>(R.id.boton1)
        var boton2 : Button= findViewById<Button>(R.id.boton2)
        var boton3 :Button= findViewById<Button>(R.id.boton3)
     // var   botonPrueba : Button = findViewById<Button>(R.id.botonPrueba)

        var contador = 0
        var contador2 = ""
        var contador3 = 0
        var ciclo=0
        var contadorFallo = 0
        var respuestaCorrecta=0 //numero de respuesta que es la correcta
        //si la respuesta es 1 entonces  al seleccionar el radioButton 11 sera correcta
        //ejemplo: 1.- raddioButton11 2.- radioButton12 3.- radioButton13
        var bandera=0

        fun mostrarPantalla(){
            vocalFaltante.start()
            if(contador>=0 && contador<10) {
                //luz
                if (contador == 0) {
                    respuestaCorrecta=3

                    imagenImagen.setImageResource(R.drawable.foco)
                    palabraCorrecta.setText("LUZ")
                    palabraIncompleta.setText("L___Z")
                    radioButton11.setText("A")
                    mp1=vocal_a
                    radioButton12.setText("O")
                    mp2=vocal_o
                    radioButton13.setText("U")
                    mp3=vocal_u
                    mp4=luz

                }
                //sol
                if (contador == 1) {
                    respuestaCorrecta=2

                    imagenImagen.setImageResource(R.drawable.sol)
                    palabraCorrecta.setText("SOL")
                    palabraIncompleta.setText("S___L")
                    radioButton11.setText("E")
                    radioButton12.setText("O")
                    radioButton13.setText("U")

                    mp1=vocal_e
                    mp2=vocal_o
                    mp3=vocal_u
                    mp4=sol
                }
                //rio
                if (contador == 2) {
                    respuestaCorrecta=3
                    imagenImagen.setImageResource(R.drawable.rio)
                    palabraCorrecta.setText("RÍO")
                    palabraIncompleta.setText("R___O")
                    radioButton11.setText("O")
                    radioButton12.setText("A")
                    radioButton13.setText("I")

                    mp1=vocal_o
                    mp2=vocal_a
                    mp3=vocal_i
                    mp4=rio
                }
                //dia
                if (contador == 3) {
                    respuestaCorrecta=3
                    imagenImagen.setImageResource(R.drawable.dia)
                    palabraCorrecta.setText("DÍA")
                    palabraIncompleta.setText("D___A")
                    radioButton11.setText("U")
                    radioButton12.setText("A")
                    radioButton13.setText("I")
                    mp1=vocal_u
                    mp2=vocal_a
                    mp3=vocal_i
                    mp4=dia
                }
                //uno
                if (contador == 4) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.uno)
                    palabraCorrecta.setText("UNO")
                    palabraIncompleta.setText("UN___")
                    radioButton11.setText("O")
                    radioButton12.setText("E")
                    radioButton13.setText("I")

                    mp1=vocal_o
                    mp2=vocal_e
                    mp3=vocal_i
                    mp4=uno
                }
                //dos
                if (contador == 5) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.dos)
                    palabraCorrecta.setText("DOS")
                    palabraIncompleta.setText("D___S")
                    radioButton11.setText("O")
                    radioButton12.setText("U")
                    radioButton13.setText("I")
                    mp1=vocal_o
                    mp2=vocal_u
                    mp3=vocal_i
                    mp4=dos
                }
                //ojo
                if (contador == 6) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.ojo)
                    palabraCorrecta.setText("OJO")
                    palabraIncompleta.setText("OJ___")
                    radioButton11.setText("O")
                    radioButton12.setText("U")
                    radioButton13.setText("E")
                    mp1=vocal_o
                    mp2=vocal_u
                    mp3=vocal_e
                    mp4=ojo
                }
                //flor
                if (contador == 7) {
                    respuestaCorrecta=2
                    imagenImagen.setImageResource(R.drawable.ave)
                    palabraCorrecta.setText("AVE")
                    palabraIncompleta.setText("AV___")
                    radioButton11.setText("A")
                    radioButton12.setText("E")
                    radioButton13.setText("O")
                    mp1=vocal_a
                    mp2=vocal_e
                    mp3=vocal_o
                    mp4=ave
                }

                //repeticion practica, cambair depsues

                if (contador == 8) {
                    respuestaCorrecta=3
                    imagenImagen.setImageResource(R.drawable.flor)
                    palabraCorrecta.setText("FLOR")
                    palabraIncompleta.setText("FL___R")
                    radioButton11.setText("A")
                    radioButton12.setText("U")
                    radioButton13.setText("O")

                    mp1=vocal_a
                    mp2=vocal_u
                    mp3=vocal_o
                    mp4=flor
                }
                //repeticicion practica cambiar despues

                if (contador == 9) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.bus)
                    palabraCorrecta.setText("BUS")
                    palabraIncompleta.setText("B___S")
                    radioButton11.setText("U")
                    radioButton12.setText("O")
                    radioButton13.setText("A")
                    mp1=vocal_u
                    mp2=vocal_o
                    mp3=vocal_a
                    mp4=bus
                }

                /*
                boton1.setOnClickListener {
                    mp1.start()
                    numeroSeleccionado=1
                }
                boton2.setOnClickListener {
                    mp2.start()
                    numeroSeleccionado=2
                }
                boton3.setOnClickListener {
                    mp3.start()
                    numeroSeleccionado=3
                }
                */

                /*
                if (respuestaCorrecta == 1) {
                    if (numeroSeleccionado == 1) {

                        botonAceptar1.setOnClickListener {

                            siguiente1.visibility = View.VISIBLE
                            linearVuelveIntentarlo1.visibility = View.GONE
                            botonAceptar1.visibility = View.GONE
                            linearContenido1.visibility = View.GONE
                            linearPalabarCorrecta.visibility = View.VISIBLE

                            if (contadorFallo == 0) {
                                linearPerfecto1.visibility = View.VISIBLE
                            }
                            if (contadorFallo == 1) {
                                linearBien1.visibility = View.VISIBLE
                            }
                            if (contadorFallo >= 2) {
                                linearMal1.visibility = View.VISIBLE
                            }
                            textCorrecto1.visibility = View.VISIBLE
                            siguiente1.visibility = View.VISIBLE

                            if (contador in 0..9) {
                                contador += 1
                                contador2 = contador.toString()
                                //ciclo++
                                progressBar2.progress = contador

                                textView9.setText("$contador2/10")
                                contador3 = contador
                            }
                        }
                    }
                    else{
                        botonAceptar1.setOnClickListener {
                            linearVuelveIntentarlo1.visibility = View.VISIBLE
                            contadorFallo++
                        }
                    }
                }
                if (respuestaCorrecta == 2) {

                    if ( numeroSeleccionado==2) {

                        botonAceptar1.setOnClickListener {

                            siguiente1.visibility = View.VISIBLE
                            linearVuelveIntentarlo1.visibility = View.GONE
                            botonAceptar1.visibility = View.GONE
                            linearContenido1.visibility = View.GONE
                            linearPalabarCorrecta.visibility = View.VISIBLE

                            if (contadorFallo == 0) {
                                linearPerfecto1.visibility = View.VISIBLE
                            }
                            if (contadorFallo == 1) {
                                linearBien1.visibility = View.VISIBLE
                            }
                            if (contadorFallo >= 2) {
                                linearMal1.visibility = View.VISIBLE
                            }
                            textCorrecto1.visibility = View.VISIBLE
                            siguiente1.visibility = View.VISIBLE

                            if (contador in 0..9) {
                                contador += 1
                                contador2 = contador.toString()
                                //ciclo++
                                progressBar2.progress = contador

                                textView9.setText("$contador2/10")
                                contador3 = contador
                            }
                        }
                    }
                    else{
                        botonAceptar1.setOnClickListener {
                            linearVuelveIntentarlo1.visibility = View.VISIBLE
                            contadorFallo++
                        }
                    }

                }

                if (respuestaCorrecta == 3) {

                    if (numeroSeleccionado==3) {

                        botonAceptar1.setOnClickListener {

                            siguiente1.visibility = View.VISIBLE
                            linearVuelveIntentarlo1.visibility = View.GONE
                            botonAceptar1.visibility = View.GONE
                            linearContenido1.visibility = View.GONE
                            linearPalabarCorrecta.visibility = View.VISIBLE

                            if (contadorFallo == 0) {
                                linearPerfecto1.visibility = View.VISIBLE
                            }
                            if (contadorFallo == 1) {
                                linearBien1.visibility = View.VISIBLE
                            }
                            if (contadorFallo >= 2) {
                                linearMal1.visibility = View.VISIBLE
                            }
                            textCorrecto1.visibility = View.VISIBLE
                            siguiente1.visibility = View.VISIBLE

                            if (contador in 0..9) {
                                contador += 1
                                contador2 = contador.toString()
                                //ciclo++
                                progressBar2.progress = contador

                                textView9.setText("$contador2/10")
                                contador3 = contador
                            }
                        }
                    }
                    else{
                        botonAceptar1.setOnClickListener {
                            linearVuelveIntentarlo1.visibility = View.VISIBLE
                            contadorFallo++
                        }
                    }
                }

                 */

                sonido.setOnClickListener{
                    mp4.start()
                }

                radioGroup1.setOnCheckedChangeListener { radioGroup, i ->
                    if (respuestaCorrecta == 1) {
                        if (i == R.id.radioButton11) {
                            mp1.start()
                            botonAceptar1.setOnClickListener {

                                siguiente1.visibility = View.VISIBLE
                                linearVuelveIntentarlo1.visibility = View.GONE
                                botonAceptar1.visibility = View.GONE
                                linearContenido1.visibility = View.GONE
                                linearPalabarCorrecta.visibility = View.VISIBLE

                                if (contadorFallo == 0) {
                                    muyBien.start()
                                    numeroCoronas+=3
                                    linearPerfecto1.visibility = View.VISIBLE
                                }
                                if (contadorFallo == 1) {
                                    correcto.start()
                                    numeroCoronas+=2
                                    linearBien1.visibility = View.VISIBLE
                                }
                                if (contadorFallo >= 2) {
                                    correcto.start()
                                    numeroCoronas+=1
                                    linearMal1.visibility = View.VISIBLE
                                }
                                textCorrecto1.visibility = View.VISIBLE
                                siguiente1.visibility = View.VISIBLE

                                if (contador in 0..9) {
                                    contador += 1
                                    contador2 = contador.toString()
                                    //ciclo++
                                    progressBar2.progress = contador

                                    textView9.setText("$contador2/10")
                                    contador3 = contador
                                }

                            }
                        }
                        if (i == R.id.radioButton12) {
                            mp2.start()
                            botonAceptar1.setOnClickListener {
                                linearVuelveIntentarlo1.visibility = View.VISIBLE
                                contadorFallo++
                            }
                        }
                        if (i == R.id.radioButton13) {
                            mp3.start()
                            botonAceptar1.setOnClickListener {
                                linearVuelveIntentarlo1.visibility = View.VISIBLE
                                contadorFallo++
                            }
                        }
                    }
                    if (respuestaCorrecta == 2) {
                        if (i == R.id.radioButton11) {
                            mp1.start()
                            botonAceptar1.setOnClickListener {
                                linearVuelveIntentarlo1.visibility = View.VISIBLE
                                contadorFallo++
                            }
                        }
                        if (i == R.id.radioButton12) {
                            mp2.start()
                            botonAceptar1.setOnClickListener {

                                siguiente1.visibility = View.VISIBLE
                                linearVuelveIntentarlo1.visibility = View.GONE
                                botonAceptar1.visibility = View.GONE
                                linearContenido1.visibility = View.GONE
                                linearPalabarCorrecta.visibility = View.VISIBLE


                                if (contadorFallo == 0) {
                                    muyBien.start()
                                    numeroCoronas += 3
                                    linearPerfecto1.visibility = View.VISIBLE
                                }
                                if (contadorFallo == 1) {
                                    correcto.start()
                                    numeroCoronas+=2
                                    linearBien1.visibility = View.VISIBLE
                                }
                                if (contadorFallo >= 2) {
                                    correcto.start()
                                    numeroCoronas+=1
                                    linearMal1.visibility = View.VISIBLE
                                }
                                textCorrecto1.visibility = View.VISIBLE
                                siguiente1.visibility = View.VISIBLE

                                if (contador in 0..9) {
                                    contador += 1
                                    contador2 = contador.toString()
                                    //ciclo++
                                    progressBar2.progress = contador

                                    textView9.setText("$contador2/10")
                                    contador3 = contador
                                }

                            }
                        }
                        if (i == R.id.radioButton13) {
                            mp3.start()
                            botonAceptar1.setOnClickListener {
                                linearVuelveIntentarlo1.visibility = View.VISIBLE
                                contadorFallo++
                            }
                        }

                        }

                    if (respuestaCorrecta == 3) {
                        if (i == R.id.radioButton11) {
                            mp1.start()
                            botonAceptar1.setOnClickListener {
                                linearVuelveIntentarlo1.visibility = View.VISIBLE
                                contadorFallo++
                            }
                        }
                        if (i == R.id.radioButton12) {
                            mp2.start()
                            botonAceptar1.setOnClickListener {
                                linearVuelveIntentarlo1.visibility = View.VISIBLE
                                contadorFallo++
                            }
                        }
                        if (i == R.id.radioButton13) {
                            mp3.start()
                            botonAceptar1.setOnClickListener {

                                siguiente1.visibility = View.VISIBLE
                                linearVuelveIntentarlo1.visibility = View.GONE
                                botonAceptar1.visibility = View.GONE
                                linearContenido1.visibility = View.GONE
                                linearPalabarCorrecta.visibility = View.VISIBLE


                                if (contadorFallo == 0) {
                                    muyBien.start()
                                    numeroCoronas+=3
                                    linearPerfecto1.visibility = View.VISIBLE
                                }
                                if (contadorFallo == 1) {
                                    correcto.start()
                                    numeroCoronas=numeroCoronas+2
                                    linearBien1.visibility = View.VISIBLE
                                }
                                if (contadorFallo >= 2) {
                                    correcto.start()
                                    numeroCoronas=numeroCoronas+1
                                    linearMal1.visibility = View.VISIBLE
                                }
                                textCorrecto1.visibility = View.VISIBLE
                                siguiente1.visibility = View.VISIBLE

                                if (contador in 0..9) {
                                    contador += 1
                                    contador2 = contador.toString()
                                    //ciclo++
                                    progressBar2.progress = contador

                                    textView9.setText("$contador2/10")
                                    contador3 = contador
                                }
                                //muyBien.stop()

                            }
                        }
                    }

                }

            }
            else{
                val intent = Intent(this, pantalla_completado::class.java)
                intent.putExtra("numNivel", primerNivel)
                intent.putExtra("numCoronas", numeroCoronas.toString())
                startActivity(intent)
            }




            //aqui cambia la interfaz
            siguiente1.setOnClickListener {

                radioGroup1.clearCheck()
                textCorrecto1.visibility = View.GONE
                siguiente1.visibility = View.GONE
                linearMal1.visibility = View.GONE
                linearBien1.visibility = View.GONE
                linearPerfecto1.visibility = View.GONE
                linearVuelveIntentarlo1.visibility = View.GONE
                botonAceptar1.visibility = View.VISIBLE
                linearContenido1.visibility = View.VISIBLE
                linearPalabarCorrecta.visibility = View.GONE
                contadorFallo = 0
                mostrarPantalla()

            }

            //bandera=1
        }

        mostrarPantalla()

       textoCoronas= numeroCoronas.toString()

/*
        val intent = Intent(this, seleccionNiveles::class.java)
        intent.putExtra("numCoronas", textoCoronas)
        startActivity(intent)
        */

    }

    override fun onDestroy() {


        super.onDestroy()
    }
}