fun main() {
    var indiceDoWhile = 0
    do {
        print("$indiceDoWhile ")
        indiceDoWhile++
    } while (indiceDoWhile <= 10)

    var j = 10



    do {
        println("$j")
        j--
    }
    while (j != 0)

    println()



    do {
        println("Qual seu nome")
        val nome = readLine()

    }
    while (nome == "")

}