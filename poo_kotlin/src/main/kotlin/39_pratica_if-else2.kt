fun checkIfIsASquare() {

    println("Digite o valor do primeiro lado")
    val sizeA = readLine()
    println("Digite o valor do segundo lado")
    val sizeB = readLine()

    if (sizeA == sizeB) {
        println("É um quadrado")
    }
    else {
        println("Não é um quadrado")
    }
}

fun checkIfTriangleHasEqualSides() {

    println("Digite o valor do primeiro lado")
    val sizeA = readLine()
    println("Digite o valor do segundo lado")
    val sizeB = readLine()
    println("Digite o valor do terveiro lado")
    val sizeC = readLine()

    if (sizeA == sizeB && sizeA == sizeC) {
        println("É um triangulo equilatero")
    }
    else {
        println("Não é um triangulo equilatero")
    }
}

fun qualASaida(num: Int) {
    if(num >= 0){
        if(num == 0){
            println("Primeira string")
        }
        else {
            println("Segunda string")
        }
    }
    else {
        println("Terceira string")
    }
}

private fun String.startsWith() {

}

fun portaria() {
    println("Digite a Idade:")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos")
            return
        }
        println("Informe o tipo de convite")
        var tipoConvite = readLine()

        if (tipoConvite != null && tipoConvite != "") {
            tipoConvite = tipoConvite.toString()
            if (tipoConvite != "premium" && tipoConvite != "luxo" && tipoConvite != "comum") {
                println("Negado. Convite inválido")
                return
            }
            println("Digite o código do convite")
            var codigoConvite = readLine()

            if (codigoConvite != null && codigoConvite != "") {
                codigoConvite = codigoConvite.lowercase()

                if (tipoConvite == "comum" && codigoConvite.startsWith("xt")) {
                    println("Welcome!")
                } else if ((tipoConvite == "luxo" || tipoConvite == "premium") && codigoConvite.startsWith("xl")) {
                    println("Welcome")
                } else {
                    println("Negado, Convite inválido")
                }
            }
        }
    }
}
fun main() {
    portaria()
//    checkIfIsASquare()
//    checkIfTriangleHasEqualSides()
//    qualASaida(4) // segunda string
//    qualASaida(0) // primeira string
//    qualASaida(-4) // terceira string

}