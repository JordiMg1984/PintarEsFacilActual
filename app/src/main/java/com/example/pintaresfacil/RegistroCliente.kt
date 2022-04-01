package com.example.pintaresfacil

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import kotlinx.android.synthetic.main.registro_cliente.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class RegistroCliente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_cliente)





        btnValidarRegistro.setOnClickListener {

           val db = BDClienteAbstract(this)

            GlobalScope.launch (Dispatchers.IO){


            }


            }

        //Volvemos al menu principal
        btnMenuPrincipalRegistro.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent);
        }   }


}