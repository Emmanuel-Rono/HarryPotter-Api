package com.emmanuel_rono.harry_potter_api

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class dataviewModel(private val repository:dataRepository):ViewModel() {
    // create A variable to store data m-livedata
    private val charcters = MutableLiveData<List<CharactersItem>>()
    //Variable to store and update the data
    val newCharacter:LiveData<List<CharactersItem>>
        get() = charcters
    //function to update the viewModel
    fun gett_the_character() {
        viewModelScope.launch {
            val the_Characters =repository.getcharacters()
            charcters.value=the_Characters
        }

    }
}