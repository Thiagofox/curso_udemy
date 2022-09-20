//fun main() {
//    val nome = "Tony"
//    val sobrenome = "Stark"
//
//    println("Olá, " + nome + sobrenome)
//    println("Olá, $nome $sobrenome")
//    println("Double: ${Double.MAX_VALUE}")
//
//
//
//    var str = "ausdhUSDHFRPudhfPUDHFSAFDEGOUHA" +
//            "a´[figja´sidfjga´fidgjdiojifjgij" +
//            "a´sdifja´DSIJFA´sidfjhAÍDF" +
//            "sfogiuhaouifdghaóidufhhi"
//    println(str)
//    println(str.length)
//
//}

fun main() {

    val kotlin = "Kotlin " + "é show"
    println(kotlin)

    val nome = "Charles " +
            "Babbage"

    // Uso do $ para concatenar String se chama interpolação
    println("Nome é $nome")
    println("Tamanho do nome é de ${nome.length} caracteres.")

    val linguagem = "Kotlin"
    val caracteristica = "É show!"
    val strFinal = linguagem + " " + caracteristica
    println("$linguagem $caracteristica")
}
