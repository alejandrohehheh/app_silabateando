package com.example.ultimaoportunidad

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class nivel2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel2)

        var segundoNivel= "segundo"
        //sonidos
        var mp1=MediaPlayer()
        var mp2=MediaPlayer()
        var mp3=MediaPlayer()
        var mp4= MediaPlayer()

        var sonido: ImageButton = findViewById(R.id.sonido)

        var na = MediaPlayer.create(this,R.raw.na)
        var ne = MediaPlayer.create(this,R.raw.ne)
        var no = MediaPlayer.create(this,R.raw.no)
        var me=MediaPlayer.create(this,R.raw.me)
        var da =MediaPlayer.create(this,R.raw.da)
        var zi =MediaPlayer.create(this,R.raw.zi)
        var ca=MediaPlayer.create(this, R.raw.ca)
        var za=MediaPlayer.create(this, R.raw.za)
        var co=MediaPlayer.create(this, R.raw.co)
        var ce=MediaPlayer.create(this, R.raw.ce)
        var bo=MediaPlayer.create(this, R.raw.bo)
        var lu=MediaPlayer.create(this, R.raw.lu)
        var go=MediaPlayer.create(this, R.raw.go)
        var nia=MediaPlayer.create(this, R.raw.nia)
        var nie=MediaPlayer.create(this, R.raw.nie)
        var nii=MediaPlayer.create(this, R.raw.nii)
        var nio=MediaPlayer.create(this, R.raw.nio)

        var vocal_o = MediaPlayer.create(this,R.raw.vocal_o)
        var vocal_u = MediaPlayer.create(this,R.raw.vocal_u)
        var correcto = MediaPlayer.create(this,R.raw.correcto)
        var muyBien = MediaPlayer.create(this, R.raw.muy_bien)
        var sonidito = MediaPlayer.create(this, R.raw.sonidito)
        var silabaFaltante = MediaPlayer.create(this, R.raw.silabafaltante)

        //contadorfallo=0;
        var  numeroSeleccionado =0
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
        var numeroCoronas=0
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
                //luna
                if (contador == 0) {
                    respuestaCorrecta=1

                    imagenImagen.setImageResource(R.drawable.luna)
                    palabraCorrecta.setText("LUNA")
                    palabraIncompleta.setText("LU____")
                    radioButton11.setText("NA")
                   radioButton12.setText("NO")
                    radioButton13.setText("NE")
                    mp1=na
                    mp2=no
                    mp3=ne
                    mp4= MediaPlayer.create(this,R.raw.luna)
                }
                //mesa
                if (contador == 1) {
                    respuestaCorrecta=1

                    imagenImagen.setImageResource(R.drawable.mesa)
                   palabraCorrecta.setText("MESA")
                   palabraIncompleta.setText("____SA")
                    radioButton11.setText("ME")
                    radioButton12.setText("DA")
                    radioButton13.setText("ZI")
                    mp1=me
                    mp2=da
                    mp3=zi
                    mp4= MediaPlayer.create(this,R.raw.mesa)
                }
                //CAMA
                if (contador == 2) {
                    respuestaCorrecta=2
                    imagenImagen.setImageResource(R.drawable.cama)
                    palabraCorrecta.setText("CAMA")
                    palabraIncompleta.setText("____MA")
                    radioButton11.setText("NO")
                    radioButton12.setText("CA")
                    radioButton13.setText("NA")
                    mp1=no
                    mp2=ca
                    mp3=na
                    mp4= MediaPlayer.create(this,R.raw.cama)
                }
                //silla
                if (contador == 3) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.silla)
                    palabraCorrecta.setText("SILLA")
                    palabraIncompleta.setText("___LLA")
                    radioButton11.setText("SI")
                    radioButton12.setText("SE")
                    radioButton13.setText("SA")
                    mp1=zi
                    mp2=ce
                    mp3=za
                    mp4= MediaPlayer.create(this,R.raw.silla)
                }
                //banco
                if (contador == 4) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.banco)
                    palabraCorrecta.setText("BANCO")
                    palabraIncompleta.setText("BAN____")
                    radioButton11.setText("CO")
                    radioButton12.setText("CI")
                    radioButton13.setText("ME")
                    mp1=co
                    mp2=zi
                    mp3=me
                    mp4= MediaPlayer.create(this,R.raw.banco)
                }
                //dos
                if (contador == 5) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.coco)
                    palabraCorrecta.setText("COCO")
                    palabraIncompleta.setText("____CO")
                    radioButton11.setText("CO")
                    radioButton12.setText("NO")
                    radioButton13.setText("DA")
                    mp1=co
                    mp2=no
                    mp3=da
                    mp4= MediaPlayer.create(this,R.raw.coco)
                }
                //ojo
                if (contador == 6) {
                    respuestaCorrecta=2
                    imagenImagen.setImageResource(R.drawable.foco)
                    palabraCorrecta.setText("FOCO")
                    palabraIncompleta.setText("FO___")
                    radioButton11.setText("ME")
                    radioButton12.setText("CO")
                    radioButton13.setText("NA")
                    mp1=me
                    mp2=co
                    mp3=na
                    //mp4= MediaPlayer.create(this,R.raw.foco)
                }
                //flor
                if (contador == 7) {
                    respuestaCorrecta=3
                    imagenImagen.setImageResource(R.drawable.boca)
                    palabraCorrecta.setText("BOCA")
                    palabraIncompleta.setText("___CA")
                    radioButton11.setText("NE")
                    radioButton12.setText("DA")
                    radioButton13.setText("BO")
                    mp1=ne
                    mp2=da
                    mp3=bo
                    mp4= MediaPlayer.create(this,R.raw.boca)
                }

                //repeticion practica, cambair depsues

                if (contador == 8) {
                    respuestaCorrecta=2
                    imagenImagen.setImageResource(R.drawable.gorro)
                    palabraCorrecta.setText("GORRO")
                    palabraIncompleta.setText("___RRO")
                    radioButton11.setText("LU")
                    radioButton12.setText("GO")
                    radioButton13.setText("ME")


                    mp1=lu
                    mp2=go
                    mp3=me
                    mp4= MediaPlayer.create(this,R.raw.gorro)
                }
                //repeticicion practica cambiar despues

                if (contador == 9) {
                    respuestaCorrecta=1
                    imagenImagen.setImageResource(R.drawable.ninia)
                    palabraCorrecta.setText("NIÑA")
                    palabraIncompleta.setText("NI___")
                    radioButton11.setText("ÑA")
                    radioButton12.setText("ÑO")
                    radioButton13.setText("NA")

                    mp1=nia
                    mp2=nio
                    mp3=na
                    mp4= MediaPlayer.create(this,R.raw.ninia)
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

                                mp1.stop()
                                mp2.stop()
                                mp3.stop()
                                radioGroup1.clearCheck()
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

                                mp1.stop()
                                mp2.stop()
                                mp3.stop()
                                radioGroup1.clearCheck()
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

                                mp1.stop()
                                mp2.stop()
                                mp3.stop()
                                radioGroup1.clearCheck()
                                siguiente1.visibility = View.VISIBLE
                                linearVuelveIntentarlo1.visibility = View.GONE
                                botonAceptar1.visibility = View.GONE
                                linearContenido1.visibility = View.GONE
                                linearPalabarCorrecta.visibility = View.VISIBLE

                                if (contadorFallo == 0 && i==R.id.radioButton13) {
                                    muyBien.start()
                                    numeroCoronas+=3
                                    linearPerfecto1.visibility = View.VISIBLE
                                }
                                if (contadorFallo == 1 && i==R.id.radioButton13) {
                                    correcto.start()
                                    numeroCoronas+=2
                                    linearBien1.visibility = View.VISIBLE
                                }
                                if (contadorFallo >= 2 && i==R.id.radioButton13) {
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
                intent.putExtra("numNivel", segundoNivel)
                intent.putExtra("numCoronas", numeroCoronas.toString())
                startActivity(intent)
            }




            //aqui cambia la interfaz
            siguiente1.setOnClickListener {

                mp1.stop()
                mp2.stop()
                mp3.stop()

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
    }
}