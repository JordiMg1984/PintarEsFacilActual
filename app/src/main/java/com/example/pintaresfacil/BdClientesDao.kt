package com.example.pintaresfacil

import androidx.room.*

class BdClientesDao {



    @Dao
    interface UsuarioDao{
        @Query
            ("SELECT * FROM Clientes")
        suspend fun getAll() : List<BdClientes>

        @Insert
        suspend fun insert (bdClientes: BdClientes)

        @Update
        suspend  fun update (bdClientes: BdClientes)

        @Delete
        suspend fun delete (bdClientes : BdClientes)

        @Query
            ("DELETE FROM Clientes")
        suspend fun deleteAll()
    }

}