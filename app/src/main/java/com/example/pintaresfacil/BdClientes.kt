package com.example.pintaresfacil

import androidx.annotation.LongDef
import androidx.room.*


@Entity (tableName = "Clientes")
data class BdClientes(
    @PrimaryKey (autoGenerate = true) val id: Long,
    val nombre: String,
    val apellidos: String,
    val dni : String,
    val email : String,
    val movil : Int,
    val contraseña : String

)

