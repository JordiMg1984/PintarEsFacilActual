package com.example.pintaresfacil

import android.app.Application
import androidx.room.Room

class BdClienteApp : Application() {
    val db = Room.databaseBuilder(this,BDClienteAbstract::class.java, "clientesBd").build()


}