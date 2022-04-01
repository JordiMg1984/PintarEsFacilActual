package com.example.pintaresfacil

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [BdClientes::class],
    version = 1
)
abstract class BDClienteAbstract : RoomDatabase(){
    abstract fun bdClientesDao() : BdClientesDao

    companion object{
        @Volatile private var instance : BDClienteAbstract? = null
        private val LOCK = Any ()

        operator fun invoke (ctx: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase (ctx).also { instance = it}
        }

        private fun buildDatabase(ctx: Context) = Room.databaseBuilder(ctx, BDClienteAbstract::class.java, "Clientes").build()

        }


    }
