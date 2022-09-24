package com.example.exemplomvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() { // Classe [MainViewModel] -> do tipo [ViewModel()]

    private var textWelcome = MutableLiveData<String>() // tipo da variabel -> informação, Mutavel, viva(pode ser observada) do tipo string

    init {
        textWelcome.value = "Olá" // atribuição do valor string
    }

    fun welcome(): LiveData<String> { // Função que retorna a variavel do tipo [LiveData] pois ela é privada
        return textWelcome
    }
}