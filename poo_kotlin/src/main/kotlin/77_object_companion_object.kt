/*class Matematica {
    //so existe um na classe
    companion object NOME{ // pode ou não ser nomeado
        val PI = 3.1415
        fun teste() {}
        init {
            println("Incicializado companion object")
        }
    }
    // podem haver mais de um na classe
    object obj1{ // obrigatorio ser nomeado
        val thiago = "thiago"
        fun printThiago() {
            println("Thiago")
        }
        init {
            println("Inicializado object")
        }
    }

}


fun main() {
    Matematica.PI
    Matematica.PI
    Matematica.PI

    println(Matematica.PI)
    println(Matematica.teste())

    println(Matematica.obj1.thiago)
    Matematica.obj1.printThiago()

    val matematica = Matematica()
    // matematica.PI // O companion object leva o escopo para a classe, impossibilitando o acesso pelo objeto
    // matematica.teste // O companion object leva o escopo para a classe, impossibilitando o acesso pelo objeto
}*/


/**
 * companion object - Sempre somente 1 por classe. Pode ou não ser nomeado.
 * object - Quantos desejar por classe. Deve ter nome.
 * --
 * É comparável ao static do Java. Porém, caso seja preciso chamar a partir do Java,
 * deve ser feito a annotation @JvmStatic.
 * --
 * Ambos companion object e object são inicializados a primeira vez que são acessados.
 * Nas demais vezes, o valor já está disponível na execução do programa.
 */
fun main() {
    // Init disparado
    Empresa.Inscricao.numero

    // Init não é mais chamado
    Empresa.Inscricao.numero
    Empresa.Inscricao.numero
}

class Empresa {
    object Inscricao {
        val numero = "1447EYFN"
        fun abc() {}

        init {
            print("Init disparado!")
        }
    }

    companion object NOME {
        val setor = "Agropecuario"

        init {
            print("Init disparado!")
        }
    }
}
