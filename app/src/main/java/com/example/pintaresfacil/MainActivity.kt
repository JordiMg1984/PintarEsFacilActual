package com.example.pintaresfacil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.carritocompra.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Conultamos los datos apartir del Dni y la contraseña, luego mandamos el nombre de usuario a las otras activitys

        btnValidarIdentifica.setOnClickListener{





        }




        //Boton para ir al registro cliente
        btnRegistro.setOnClickListener{
            val intent= Intent(this,RegistroCliente::class.java)
            startActivity(intent);
        }




    }
}