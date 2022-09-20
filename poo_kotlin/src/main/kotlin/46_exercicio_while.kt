fun fillWaterBox() {
    var waterBox = 0
    val bucket = 7
    var count = 0
    while (waterBox < 2000) {
        waterBox += bucket
        count++
    }
    println(count)
}

fun fizzBuzz() {
    var i = 1
    while (i < 50) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            println(i)
            println("FizzBuzz")
        } else if (i % 5 == 0) {
            println(i)
            println("Fizz")
        } else if (i % 3 == 0) {
            println(i)
            println("Buzz")
        }
        i++
    }
}

fun reverseString(str: String) {
    var i = str.length - 1
    while (i >= 0) {
        print(str[i])
        i--
    }
}

fun checkEqualNumberOfChars(str: String):Boolean {
    var i = 0
    var countX = 0
    var countO = 0
    val strToLower = str.lowercase()
    while (i < strToLower.length) {
        if (strToLower[i] == 'x') {
            countX++
        } else if (strToLower[i] == 'o') {
            countO++
        }
        i++
    }
    return countX == countO
    // é o mesmo que
/*if (countX == countO) {
        return true
    } else {
        return false
    }*/

}

fun challenge(): String {
    val salary = 10000f
    var investAna = 0f
    var investPaula = 0f
    var months = 0
    do {
        investAna += (salary * 0.05f) + (salary * 0.05f) + (investAna * 0.002f)
        investPaula += (salary * 0.05f) + (investPaula * 0.008f)
        months++

        println("Ana $investAna - Paula $investPaula")
    }
    while (investAna > investPaula)

    return "O número de meses que vai demorar para o patrimonio de Paula superar o de Ana é de: $months"
}

fun main() {
    fillWaterBox()
    fizzBuzz()
    reverseString("Meu nome é Julius.")
    println(checkEqualNumberOfChars("XoxOxo"))
    println(challenge())
}