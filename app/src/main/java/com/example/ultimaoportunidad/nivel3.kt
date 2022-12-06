package com.example.ultimaoportunidad

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class nivel3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel3)
        var tercerNivel="tercer"
        //sonidos
        var mp1=MediaPlayer()
        var mp2=MediaPlayer()
        var mp3=MediaPlayer()
        var mp4= MediaPlayer()

        var sonido: ImageButton = findViewById(R.id.sonido)

        var vocal_a = MediaPlayer.create(this,R.raw.vocal_a)
        var ma = MediaPlayer.create(this,R.raw.ma)
        var me = MediaPlayer.create(this,R.raw.me)
        var mi = MediaPlayer.create(this,R.raw.mi)
        var mo = MediaPlayer.create(this,R.raw.mo)
        var mu = MediaPlayer.create(this,R.raw.mu)

        var na = MediaPlayer.create(this,R.raw.na)
        var ne = MediaPlayer.create(this,R.raw.ne)

        var la = MediaPlayer.create(this,R.raw.la)
        var le = MediaPlayer.create(this,R.raw.le)
        var li = MediaPlayer.create(this,R.raw.li)
        var lo = MediaPlayer.create(this,R.raw.lo)
        var lu = MediaPlayer.create(this,R.raw.lu)


        var ca = MediaPlayer.create(this,R.raw.ca)
        var que = MediaPlayer.create(this,R.raw.que)
        var qui = MediaPlayer.create(this,R.raw.qui)
        var co = MediaPlayer.create(this,R.raw.co)
        var ku = MediaPlayer.create(this,R.raw.ku)
        var ce = MediaPlayer.create(this,R.raw.ce)

        var ta = MediaPlayer.create(this,R.raw.ta)
        var te = MediaPlayer.create(this,R.raw.te)
        var ti = MediaPlayer.create(this,R.raw.ti)
        var to = MediaPlayer.create(this,R.raw.to)
        var tu = MediaPlayer.create(this,R.raw.tu)

        var pa = MediaPlayer.create(this,R.raw.pa)
        var pe = MediaPlayer.create(this,R.raw.pe)
        var pi = MediaPlayer.create(this,R.raw.pi)
        var po = MediaPlayer.create(this,R.raw.po)
        var pu = MediaPlayer.create(this,R.raw.pu)

        var sa = MediaPlayer.create(this,R.raw.za)

        var bo = MediaPlayer.create(this,R.raw.bo)

        var correcto = MediaPlayer.create(this,R.raw.correcto)
        var muyBien = MediaPlayer.create(this, R.raw.muy_bien)
        var sonidito = MediaPlayer.create(this, R.raw.sonidito)
        var vocalFaltante = MediaPlayer.create(this, R.raw.vocalfaltante)
        var silabaFaltante = MediaPlayer.create(this, R.raw.silabafaltante)

        var contadorfallo=0;
        var  numeroSeleccionado =0
        var numeroCoronas=0
        var textoCoronas=""
        var progressBar2 : ProgressBar = findViewById(R.id.progressBar2)
        var textView9 : TextView = findViewById(R.id.textView9)
        var  palabraCorrecta : TextView = findViewById(R.id.palabra_correcta)
        var  palabraIncompleta : TextView = findViewById<TextView>(R.id.palabra_incompleta)
        var radioButton11 : RadioButton = findViewById<RadioButton>(R.id.radioButton11)
        var radioButton12 : RadioButton = findViewById<RadioButton>(R.id.radioButton12)
        var radioButton13 : RadioButton = findViewById<RadioButton>(R.id.radioButton13)
        var radioGroup1 : RadioGroup = findViewById<RadioGroup>(R.id.radioGroup1)
        var botonAceptar1 : Button = findViewById<Button>(R.id.botonAceptar1)
        var siguiente1: Button = findViewById<Button>(R.id.siguiente1)
        var linearVuelveIntentarlo1 : LinearLayout = findViewById<LinearLayout>(R.id.linearVuelveIntentarlo1)
        var linearContenido1 : LinearLayout = findViewById<LinearLayout>(R.id.linearContenido1)
        var  linearPalabarCorrecta : LinearLayout = findViewById<LinearLayout>(R.id.linearPalabarCorrecta)
        var linearPerfecto1 : LinearLayout = findViewById<LinearLayout>(R.id.linearPerfecto1)
        var  linearBien1 : LinearLayout = findViewById<LinearLayout>(R.id.linearBien1)
        var  linearMal1: LinearLayout = findViewById<LinearLayout>(R.id.linearMal1)
        var textCorrecto1 : TextView = findViewById<TextView>(R.id.textCorrecto1)
        var imagenImagen : ImageView = findViewById<ImageView>(R.id.imagen_imagen)

        var linearBotones : LinearLayout = findViewById<LinearLayout>(R.id.linearBotones)
        var boton1 : Button = findViewById<Button>(R.id.boton1)
        var boton2 : Button = findViewById<Button>(R.id.boton2)
        var boton3 : Button = findViewById<Button>(R.id.boton3)
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
            silabaFaltante.start()
            if(contador>=0 && contador<10) {
                //luz
                if (contador == 0) {
                    respuestaCorrecta=3

                    imagenImagen.setImageResource(R.drawable.uno)
                    palabraCorrecta.setText("NÚMERO")
                    palabraIncompleta.setText("NÚ___RO")
                    radioButton11.setText("MI")
                    mp1=mi
                    radioButton12.setText("MA")
                    mp2=ma
                    radioButton13.setText("ME")
                    mp3=me
                    mp4= MediaPlayer.create(this,R.raw.numero)

                }
                //sol
                if (contador == 1) {
                    respuestaCorrecta=2

                    imagenImagen.setImageResource(R.drawable.amigo)
                    palabraCorrecta.setText("AMIGO")
                    palabraIncompleta.setText("A___GO")
                    radioButton11.setText("SA")
                    radioButton12.setText("MI")
                    radioButton13.setText("BO")


                    mp1=sa
                    mp2=mi
                    mp3=bo
                    mp4= MediaPlayer.create(this,R.raw.amigo)
                }
                //rio
                if (contador == 2) {
                    respuestaCorrecta=3
                    imagenImagen.setImageResource(R.drawable.rio)
                    palabraCorrecta.setText("PALABRA")
                    palabraIncompleta.setText("PA___BRA")
                    radioButton11.setText("LO")
                    radioButton12.setText("LE")
                    radioButton13.setText("LA")

                    mp1=lo
                    mp2=le
                    mp3=la
                    mp4= MediaPlayer.create(this,R.raw.palabra)

                }
                //dia
                if (contador == 3) {
                    respuestaCorrecta=3
                    imagenImagen.setImageResource(R.drawable.pequnio)
                    palabraCorrecta.setText("PEQUEÑO")
                    palabraIncompleta.setText("PE___ÑO")
                    radioButton11.setText("SE")
                    radioButton12.setText("QUI")
                    radioButton13.setText("QUE")
                    mp1=ce
                    mp2=qui
                    mp3=que
                    mp4= MediaPlayer.create(this,R.raw.pequenio)
                }
                //uno
                if (contador == 4) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.primero)
                    palabraCorrecta.setText("PRIMERO")
                    palabraIncompleta.setText("PRI___RO")
                    radioButton11.setText("ME")
                    radioButton12.setText("CA")
                    radioButton13.setText("NE")

                    mp1=me
                    mp2=ca
                    mp3=ne
                    mp4= MediaPlayer.create(this,R.raw.primero)
                }
                //dos
                if (contador == 5) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.comida)
                    palabraCorrecta.setText("COMIDA")
                    palabraIncompleta.setText("CO___DA")
                    radioButton11.setText("MI")
                    radioButton12.setText("ME")
                    radioButton13.setText("CO")
                    mp1=mi
                    mp2=me
                    mp3=co
                    mp4= MediaPlayer.create(this,R.raw.comida)
                }
                //ojo
                if (contador == 6) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.zapato)
                    palabraCorrecta.setText("ZAPATO")
                    palabraIncompleta.setText("ZA___TO")
                    radioButton11.setText("PA")
                    radioButton12.setText("TA")
                    radioButton13.setText("CA")
                    mp1=pa
                    mp2=ta
                    mp3=ca
                    mp4= MediaPlayer.create(this,R.raw.zapato)
                }
                //flor
                if (contador == 7) {
                    respuestaCorrecta=2
                    imagenImagen.setImageResource(R.drawable.cometa)
                    palabraCorrecta.setText("COMETA")
                    palabraIncompleta.setText("CO___TA")
                    radioButton11.setText("MI")
                    radioButton12.setText("ME")
                    radioButton13.setText("NE")
                    mp1=mi
                    mp2=me
                    mp3=ne
                    mp4= MediaPlayer.create(this,R.raw.cometa)
                }

                //repeticion practica, cambair depsues

                if (contador == 8) {
                    respuestaCorrecta=3
                    imagenImagen.setImageResource(R.drawable.camisa)
                    palabraCorrecta.setText("CAMISA")
                    palabraIncompleta.setText("CA___SA")
                    radioButton11.setText("MA")
                    radioButton12.setText("ME")
                    radioButton13.setText("MI")

                    mp1=ma
                    mp2=me
                    mp3=mi
                    mp4= MediaPlayer.create(this,R.raw.camisa)
                }
                //repeticicion practica cambiar despues

                if (contador == 9) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.semana)
                    palabraCorrecta.setText("SEMANA")
                    palabraIncompleta.setText("SE___NA")
                    radioButton11.setText("MA")
                    radioButton12.setText("NA")
                    radioButton13.setText("CE")
                    mp1=ma
                    mp2=na
                    mp3=ce
                    mp4= MediaPlayer.create(this,R.raw.semana)
                }
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
                    }

                }

            }
            else{
                val intent = Intent(this, pantalla_completado::class.java)
                intent.putExtra("numNivel", tercerNivel)
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


        val intent = Intent(this, seleccionNiveles::class.java)
        intent.putExtra("numCoronas", textoCoronas)
        //startActivity(intent)
    }
}