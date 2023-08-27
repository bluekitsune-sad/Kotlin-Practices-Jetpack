package com.example.roomdb.di

import android.content.Context
import androidx.room.Room
import com.example.roomdb.data.PersonDatabase
import com.google.android.datatransport.runtime.dagger.Module
import com.google.android.datatransport.runtime.dagger.Provides
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class) //basically we're declaring that we want to have a single instance of ROOM database throughout the whole app.
object DatabaseModel{
    @Singleton
    @Provides
    fun providesDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        PersonDatabase::class.java,
        "my_database"
    ).createFromAsset("database/person.db").build()
        //using createFromAsset because the db is in Asset if this was not the case then you would use createFromfile
    @Singleton
    @Provides
    fun provideDao(database: PersonDatabase) = database.personDao()
}