/**
 * Em alguns casos, é necessário que hava um processamento ou uma lógica antes da atribuição do valor a variável.
 * Para isso e também evitar declarar a variável como nula, é usado a palavra lateinit.
 *
 * Variáveis declaradas com lateinit não são alocadas na memória até que sejam inicializadas.
 */

class Receita {
    lateinit var instrucoes: String

    fun geraReceita(){
        // Preenchimento através da função
        instrucoes = "Lave as mãos"
    }

    fun imprimeReceita() {
        if (!this::instrucoes.isInitialized){
            // Preenchimento através da função
            instrucoes = "Lave as mãos"
            println(instrucoes)
        }
        println(instrucoes)
    }

}
fun main() {
    val receita = Receita()
    receita.geraReceita()
    receita.imprimeReceita()
}



