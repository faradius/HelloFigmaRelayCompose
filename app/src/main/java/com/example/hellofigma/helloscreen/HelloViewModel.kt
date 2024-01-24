package com.example.hellofigma.helloscreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HelloViewModel @Inject constructor():ViewModel(){
    var state by mutableStateOf(HelloState())
        private set

    init {
        state = state.copy(cardText = "Esperando acción")
    }

    fun onEvent(event: HelloEvent){
        when(event){
            is HelloEvent.CardHello -> { cardHello() }

            is HelloEvent.CardButton -> { cardButton() }
        }
    }

    private fun cardHello(){
        state = state.copy(cardText = "Relay Compose")
    }

    private fun cardButton(){
        state = state.copy(cardText = "Hola mundo")
    }
}