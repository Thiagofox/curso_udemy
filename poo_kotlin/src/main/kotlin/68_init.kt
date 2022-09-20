class Animal(var especie: String){
    // bloco init - é o inicializador bloco que é executado ao instanciar a classe
    // o init é usado para fazer verificação de valores

    var fala: String = ""
    init {
        if (especie == "cao") {
            fala = "AU"
        }
        else if( especie == "gato") {
            fala = "Miau"
        }
        else {
            fala = "som de animal"
        }
    }

    fun falar(){
        println(fala)
    }
}

fun main() {
    val cao = Animal("cao")
    val gato = Animal("gato")
    val papagaio = Animal("papagaio")
    cao.falar()
    gato.falar()
    papagaio.falar()

}

//import java.util.*

/*
fun main() {
    val nina = Animal("Cachorro")
}

class Animal(val especie: String) {
    var fala: String = ""

    init {
        fala = if (especie.lowercase() == "cachorro") {
            "au"
        } else if (especie.lowercase() == "gato") {
            "miau"
        } else {
            ""
        }
    }

    init {
        println(fala)
    }

}

class Funcionario(val nome: String) {
    var tipoContrato: String = ""

    init {
        tipoContrato = "CLT"
    }
}*/
