
fun checkAge18 (age: Int) {
    if(age >= 18) {
        println("Maior de Idade")
    }
        if(age > 60) {
            println("Terceira Idade")
        }
    else if (age < 10 ) {
        println("Criança")
    }
    else{
        println("Menor de Idade")
    }
}

fun greeting(dia: Boolean): String {
    return if(dia) {
        "Bom Dia"
    }
    else {
        "Boa Noite"
    }
}


fun main() {
    checkAge18(8)
    checkAge18(19)
    checkAge18(15)
    checkAge18(78)
    println(greeting(false))
    println(greeting(true))

}

