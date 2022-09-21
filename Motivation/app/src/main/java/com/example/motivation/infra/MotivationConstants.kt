package com.example.motivation.infra

class MotivationConstants private constructor() {
    // ninguem deve instanciar a classe motivation constants portanto ele tem o construtor fechado
    // [private constructor]
    object KEY {
        const val  USER_NAME = "USER_NAME"
    }

    object FILTER {
        const val ALL = 1
        const val HAPPY = 2
        const val SUNNY = 3
    }

}