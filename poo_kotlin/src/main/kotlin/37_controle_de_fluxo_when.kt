

fun checkBonus (cargo: String): Float {
    var bonus = when(cargo) {
        "Gerente" -> 2000F
        "Coordenador" -> 1500F
        "Engenheiro de Software" -> 1000F
        "Estágiario" -> 500F
        else -> 0F
        }

    return bonus
    }


fun acontecimentoWhen(ano: Int) {
    when (ano) {
        in 0..1999 -> {
            println("Milênio passado")
        }
        in 2000..2003 -> {
            println("Presidente: Fernando Henrique Cardoso")
        }
        else -> {
            println("Deixemos pro futuro.")
        }
    }
}

fun operacao(a: Int, b: Int, operacao: String): Int {
    when (operacao) {
        "Soma" -> {
            return a + b
        }
        "Subtracao" -> {
            return a - b
        }
        else -> {
            return 0
        }
    }
}

fun operacao2(a: Int, b: Int, operacao: String): Int {
    return when (operacao) {
        "Soma" -> a + b
        "Subtracao" -> a - b
        else -> 0
    }
}

fun main() {
    println(checkBonus("Gerente"))
    println(checkBonus("Coordenador"))
    println(checkBonus("Engenheiro de Software"))
    println(checkBonus("Estágiario"))
}