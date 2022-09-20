fun main() {
            // classe do arquivo 67_construtores.kt
    val p = PessoaContrutor("thiago", 1988, "082")
    p.acorda()
    p.dorme()
    // forma de acoplar metodos e objetos de uma classe
    with(p) {
        this.acorda()
        this.dorme()
        println(cpf)
    }
}


/*
fun main() {
    val str = "Programação Kotlin"

    str.uppercase()
    str.lowercase()
    val size = str.length

    // Faz o uso da instância da classe para chamar diversos métodos
    // Scope function
    // Pode-se ler "com esse objeto, faça.."
    with(str) {
        uppercase()
        lowercase()
        val size = length
    }
}*/
