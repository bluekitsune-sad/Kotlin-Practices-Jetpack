package com.example.roomdb

import androidx.lifecycle.ViewModel
import com.example.roomdb.data.PersonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    personRepository: PersonRepository
): ViewModel(){
    val readAll = personRepository.readAll

    companion object
}