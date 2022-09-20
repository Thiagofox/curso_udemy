fun main() {
    convertYears(2)
    println("--------------------------------------------")
    println(getLength("Thiago Cavalcante"))
    println("--------------------------------------------")
    println(getNumCubic(2))
    println("--------------------------------------------")
    println(transformMiles(160F))
    println("--------------------------------------------")
    println(replaceAForX("Thiago Cavacante"))
    println("____________________________________________")
}

fun convertYears( anos: Int) {
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")


}

fun getLength (str: String) = str.length

fun getNumCubic(num: Int) = num * num * num

fun transformMiles (mile: Float) = mile * 1.6

fun replaceAForX (sentence :String) :String {
    return sentence.lowercase().replace("a", "x")
}

