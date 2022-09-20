// LAMBDA

/*
Lambda é uma função anonima - não possui nome
vantagens -> poder ser passada por parametro - ou seja posso receber uma regra por parametro

sintaxe -> { parametros -> corpo } (sempre dentro de parametros)
*/


fun reciveA(lambda: () -> Unit) {
    lambda()
}

fun reciveB(res: (b: Int) -> Int){
    println(res(8))
}

fun reciveC( lamb: (n1: Int, n2: Int) -> Int){
    println(lamb(5, 5))
}

fun main() {
    reciveA { println("Hello") } // exemplo de lambda - não possui parametro portanto nao precisa da seta [->]

    reciveB {x: Int -> x * x }

    reciveC { x: Int, y: Int ->
        println("Executando")
        x * y // ultima linha do lambda é responsavel por fazer o retorno por marcado como [lambda]
    }
}


/**
 * Sintaxe Lambda
 *
 * { Parâmetros -> corpo }
 * { x: Int -> println(x) }
 * { x: Int, y: Int -> println(x + y) }
 *
 * Lambdas pode ser  passados por parâmetros, ou seja,
 * comportamentos podem ser passados por parâmetros.
 *
 */
/*
package lambda
fun main() {

    val a: () -> Unit = { println("Sou um lambda") }
    a()

    val b: (Int) -> Int = { x: Int -> x * 2 }
    b(10)

    val c: (Int, Int) -> Int = { x: Int, y: Int -> (x + y) }
    c(2, 2)

    receiveLambda1 { println("Hello world!") }
    receiveLambda2 { 5 }
    receiveLambda3 { x, y ->
        println("Teste")
        x + y // A última linha de um lambda é o retorno
    }

}

fun receiveLambda1(p: () -> Unit) {
    p()
}

fun receiveLambda2(p: (x: Int) -> Int) {
    p(10)
}

fun receiveLambda3(p: (x: Int, y: Int) -> Int) {
    p(10, 20)
}
*/





