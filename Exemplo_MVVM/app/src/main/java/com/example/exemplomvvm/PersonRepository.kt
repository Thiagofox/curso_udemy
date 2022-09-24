package com.example.exemplomvvm

class PersonRepository {
    fun login(email: String, password: String): Boolean { // função que valida os dados do login (Model)
        return (email != "" && password != "")
    }
}