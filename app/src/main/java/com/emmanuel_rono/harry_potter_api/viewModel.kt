package com.emmanuel_rono.harry_potter_api

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class dataviewModel:ViewModel() {
    // create A variable to store data m-livedata
    private val charcters = MutableLiveData<List<CharactersItem>>()

    //Variable to store and update the data
    val newCharacter: MutableLiveData<List<CharactersItem>>
        get() = charcters
    //function to update the viewModel
    fun gett_the_character() {
        val the_Characters = dataRepository.getTheCharacters()
        charcters.value=the_Characters
    }
}