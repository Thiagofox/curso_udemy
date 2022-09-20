interface Selvagem{
    fun atacar()
//    val teste = "teste" // ERRO -> Impossivel atribuir valor a uma variavel dentro de uma interface
}

/*
INTERFACE É UM CONTRATO; Que define os métodos, e aquele que assina esse contrato tem que instanciar/implemetar.

-> Interface, diferente das classes vc não herda você implementa.
-> Os métodos da Interface podem ter corpo

Diferença entre Interfaces e Classes abstratas -> A Classe abstrata consegue manter estados, a Interface não
- são as variaveis que ficam detro da interface ou dentro da classe abstrata
- Você não pode criar uma variavel dentro de uma interface - não é capaz de ter valor(manter estado)
- inicializadores não são permitidos em interfaces
*/


abstract class Mamifero2(val nome: String) {
    fun acordar(){
        println("Acordei")
    }
    fun dormir(){
        println("Dormi")
    }
    abstract fun falar()
    abstract fun comer()
}

class Cachorro2(nome: String): Mamifero2(nome), Selvagem{
    override fun falar() {
        println("Au")
    }

    override fun comer() {
        println("Dentes")
    }

    override fun atacar() {
        println("Ataque com as presas")
    }
}

fun main() {
    val cachorro2 = Cachorro2("Toby")
    cachorro2.falar()
    cachorro2.comer()
    cachorro2.dormir()
    cachorro2.atacar()
//    val selvagem = Selvagem() // Erro -> não é possivel instanciar uma interface
}


/**
 * Interfaces podem conter declarações de métodos que serão sobrescritos e também métodos com implementação.
 * Os métodos que serão sobrescritos precisam estar com assinatura e tipo de retorno definido,
 * não há necessidade de haver corpo.
 *
 * A diferença de interface com classe abstrata é que interfaces não podem armazenar estados.
 * Ou seja, os atributos da classe não podem ter valores.
 * */

/*
fun main() {
    val a1 = ImplementsInterface()
    a1.ola()
}

interface Interface1 {
    fun teste()
}

interface Interface2 {
    fun ola() {
        println("Olá interface 2!")
    }

    fun tchau()
}

class ImplementsInterface : Interface1, Interface2 {
    override fun teste() {
        println("Sobrescrita")
    }

    override fun tchau() {
        println("Adeus")
    }
}*/
