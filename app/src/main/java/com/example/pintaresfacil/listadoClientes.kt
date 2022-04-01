package com.example.pintaresfacil

import android.content.Context
import android.database.Cursor
import android.icu.number.Notation.simple
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.CursorAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.listadoclientes.*



class listadoClientes : AppCompatActivity() {

    val app = applicationContext as BdClienteApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listadoclientes)







    }

}



