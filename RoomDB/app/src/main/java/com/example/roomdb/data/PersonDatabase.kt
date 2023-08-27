package com.example.roomdb.data

import androidx.room.Database

@Database(entities = [Person::class], version = 1, exportSchema = true)
abstract class PersonDatabase {
    abstract fun personDao(): PersonDao
}