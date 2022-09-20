abstract class Mamifero(val nome: String) { // Servir de molde para as outras classe que à herdam
                                            // A Classe Abstrata precisa ser herdada
    fun acordar(){
        println("Acordei") // Classe abstrata podem ter comportamentos já implementados
                           // posso implemtar métodos que eu sei que o comportamento não
                           // é tão diferente para as classes que herdam
    }
    fun dormir(){
        println("Dormi")
    }
    abstract fun falar() // quando possuimos um comportamento que sabemos que existe porem é diferente para cada classe
                         // filha usar classes/métodos abstratos é um caminho onde você deixa que as classes herdeiras
                         // decidirem a implementação
    abstract fun comer()
}
class Cachorro(nome: String): Mamifero(nome){
    override fun falar() {
        println("Au")
    }
    override fun comer() {
        println("Dentes")
    }
}

fun main() {
    val cachorro = Cachorro("Toby")
    cachorro.falar()
    cachorro.comer()
    cachorro.dormir()

   // val mamifero = Mamifero() // ERRO -> a classe abstrata nunca pode ser instanciada pois existem métodos sem corpo/lógica
}


/**
 * A classe abstrata define alguns comportamentos que as classes que herdam devem ter.
 * Uma classe abstrata não pode ser instanciada, é usada para moldar classes que herdam seu comportamento.
 * Uma classe abstrata deve ter no mínimo um método abstrato. Assim, podem existir métodos já implementados.
 */
/*
fun main() {
    val cachorro = Cachorro("Bolt")
    cachorro.falar()
    cachorro.nome()
}

abstract class Mamifero(val nome: String) {
    private var peso = 0f

    abstract fun falar()
    open fun nome() {
        println("Sou um mamífero: $nome")
    }
}

*/
/**
 * Herda de mamífero
 * Implementa obrigatoriamente a função definida como abstrata na classe pai.
 * Não precisa implementar métodos que não são definidos como abstratos, mas poderia com o uso do override.
 *//*

class Cachorro(especie: String) : Mamifero(especie) {
    override fun falar() {
        println("Au au")
    }

    override fun nome() {
        super.nome()
    }
}*/
