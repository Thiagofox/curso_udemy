
/*
private class X()
-> A private class limita o acesso da classe em outros arquivos
private opem classX()
-> limita a classe a ter classes herdeiras(filhas)

*/


open class Eletronico2(private var marca:String) {
    private fun ativarCorrente(){
        // conceito de abstração POO -> para a classe [Computador2] não interessa como a classe [Eletronico2]
        // ativa a corrente portanto usamos o modificador de visibilidade para que o acesso seja somente
        // dentro do escopo da classe
        println("Corrente ativada")
    }
    protected fun ligar(){
        // o Protected da acesso ao escopo da classe e suas classes herdeiras
        ativarCorrente()
        println("Ligado")
    }
    fun desligar() {
        println("Desligado")
    }
}
public class Computador2(marca: String): Eletronico2(marca){
// por padrão todas as classes metoros e atributos são public portanto o uso delas é redundante
    fun instalarSoftware(){
        println("Software Instalado")
    }
    fun  processar(){
        println("Processado")
    }
}

fun main() {
    val computador2 = Computador2("Macbook")
//    computador2.ligar() // não é possivel pois a função [ligar] é protected portanto somente[Eletronico2] e
//    [Computador2] possuem acesso
    computador2.desligar()
    computador2.instalarSoftware()
    // val x = X()
    // println(computador2.marca) // impossivel o acesso da marca pois o atributo é privado
    // computador2.ativarCorrente() // impossivel o acesso pois o método é privado
}


/**
 * Modificadores: public, private, protected
 * ---
 * public
 * Aberto para classes herdeiras e não herdeiras. Visibilidade ilimitada.
 * --
 * private
 * Visibilidade somente dentro da classe.
 * --
 * protected
 * Visibilidade para a classe onde é declarada e classes herdeiras.
 */
/*
fun main() {
    val fig = Figura()

    // Não acessível
    // fig.funcaoProtected()
    // fig.funcaoPrivada()
}

open class Figura {
    protected fun funcaoProtected() {
    }

    private fun funcaoPrivada() {}
}

class Quadrado(lado: Int) : Figura() {
    fun area() {
        funcaoProtected()

        // Não acessível
        // funcaoPrivada()
    }
}*/
