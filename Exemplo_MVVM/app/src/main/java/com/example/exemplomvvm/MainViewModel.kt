package com.example.exemplomvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() { // Classe [MainViewModel] -> do tipo [ViewModel()]

    private var textWelcome = MutableLiveData<String>() // tipo da variabel -> informação, Mutavel, viva(pode ser observada) do tipo string
    private var login = MutableLiveData<Boolean>() //  tipo da variabel -> informação, Mutavel, viva(pode ser observada) do tipo Boleano
    private val personRepository = PersonRepository()

    init {
        textWelcome.value = "Olá" // atribuição do valor string
    }

    fun welcome(): LiveData<String> { // Função que retorna a variavel do tipo [LiveData] pois ela é privada
        return textWelcome
    }

    fun login() : LiveData<Boolean> { // Função que retorna um boolean do tipo [LiveData] pois ela é privada para permitir o login
        return login // retorna um live data, true ou false, que esta sendo observado e sera chamado no setObserver na MainActivity
    }

    fun doLogin(email: String, password: String) { // função que atribuir a variavel login à resultado da função [login] da model [PersonRepository]
        login.value = personRepository.login(email, password) // neste casso um true ou false
    }
}