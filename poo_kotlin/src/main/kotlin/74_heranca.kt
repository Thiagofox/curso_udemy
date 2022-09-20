open class Eletronico(var marca:String) {
    fun ligar(){
        println("Ligado")
    }
    fun desligar() {
        println("Desligado")
    }
}
class Computador(marca: String): Eletronico(marca){
    fun instalarSoftware(){
        println("Software Instalado")
    }
    fun  processar(){
        println("Processado")
    }
}

fun main() {
    val computador = Computador("Macbook")
    computador.ligar()
    computador.desligar()
    computador.instalarSoftware()
    println(computador.marca)
}

/**
 * Herança é uma funcionalidade em orientação a objetos que permite fazer a especialização de classes.
 * A classe Maquina é a classe superior de Computador.
 * A classe Computador é a especialização de Maquina, possuindo um atributo a mais.
 * Uma classe especializada possui os mesmo atributos e métodos (não privados) e pode definir novos.
 *
 * Para que uma classe possa ser herdada, é necessário o uso da palavra 'open'.
 */
/*
// Classe base
open class Maquina(val marca: String) {
    fun minhaMarca() {
        println("Sou da marca: $marca")
    }

    private fun somenteMaquina() {
        println("Esse método é acessível somente por instâncias da classe Maquina.")
    }
}
// Classe especializada
class Computador(marca: String, val preco: Float) : Maquina(marca)

fun main() {

    val comp = Computador("DELL", 4000f)
    comp.minhaMarca()
    comp.preco

    // Não acessível
    // comp.somenteMaquina()
}*/
