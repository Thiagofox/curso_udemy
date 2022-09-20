class Animal2(var especie: String) {
    var fala: String = ""
        // O getter e setter são de extrema importancia para o encapsulamento quando se visa proteger
        // determinados acessos à propriedade e métodos usando os modificadores de visibilidade
        get() {
            //
            println("Acesso get")
            return field
        }
        set(value) {
            println("Acesso set")
            field = value
            // Dentro do get e set devemos usar a palavra reservada [field] ela evita a chamada recursiva desses métodos
        }
}

fun main(args: Array<String>) {
    val animal2 = Animal2("cachorro")
    animal2.fala = "Auuuu"
    println(animal2.fala)
}

/*fun main() {

}

class Planeta {
    var nome: String = ""
        get() {
            // Acesso a propriedade diretamente causa recursão
            // println("Meu valor é $nome")
            // return nome

            // Maneira correta
            println("Meu valor é $field")
            return field
        }
        set(value) {
            if (value == "") {
                println("Todo planeta deve ter um nome.")
            } else {

                // Acesso a propriedade diretamente causa recursão
                // nome = value

                // Maneira correta
                field = value
            }
        }
}*/
