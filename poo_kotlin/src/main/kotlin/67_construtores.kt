/**
 * Um construtor é um método chamado no momento que uma classe é instanciada.
 * É muito comum que no construtor haja a atribuição de valores para os atributos da classe.
 *
 * Nesse exemplo existe um construtor primário e dois secundários.
 * Existem alguns detalhes nos contrutores secundários que devem ser observados.
 * 1. Atributos não podem ser val nem var, devem somente ter o nome do atributo e o tipo.
 * 2. Não podem ser acessados dentro ou fora da classe.
 * Se existe algum valor a mais no construtor secundário, variável dentro da classe deve ser declarada.
 */
/*
fun main() {
    val p1 = Pessoa4("Davy Jones")
    val p2 = Pessoa4("Davy Jones", 54)
}

class Pessoa4(val nome: String) {

    // Atributo dentro da classe que o construtor secundário fará a atribuição
    // Em casos desse tipo, é importante prestar atenção que a variável pode ser nula
    // caso seja iniciada pelo construtor primário.
    private var idade: Int? = null

    constructor(nome: String, idade: Int) : this(nome) {
        this.idade = idade
    }

    fun saudacoes() {
        println("Meu nome é $nome e tenho $idade")
    }

}

// Exemplo de classe que não pode ser instanciada de fora dela
class Pessoa5 private constructor(val nome: String) {
    // Nesse caso, os parâmetros ficam dentro do "construtor"
}*/


// Exemplo do video

class PessoaContrutor(val nome: String, val anoNascimento: Int){

    var cpf: String? = null
    // O contrutor secundário deve repetir as informações do contstrutor primário[nome e anoNascimento]
    // e deve usar o [this] passando os atributos do construtor primário
    // ao acrescentar o novo atributo [cpf] ele deve fazer uma atribuição usando o this
    constructor(nome: String, anoNascimento: Int, cpf: String) : this(nome, anoNascimento) {
    // this -> se refere a instancia da classe
    //      -> é o escopo da instancua da classe -> objeto
        this.cpf = cpf
        // o contrutor secundário permite que validações sejam feitas em atributos
        if (cpf == ""){
            // fazer algo
        }
    }

    fun acorda(){
        println("Acordou")
    }
    fun dorme(){
        println("Dormiu")
    }
}

fun main() {
    // classe - comportamentos(métodos) e atributos
    val pessoaContrutor = PessoaContrutor("Thiago", 1988, "08208488674")
    // instanciamento de uma classe
    println(pessoaContrutor.nome)
    println(pessoaContrutor.anoNascimento)
    println(pessoaContrutor.cpf)
    pessoaContrutor.acorda()
    pessoaContrutor.dorme()
}