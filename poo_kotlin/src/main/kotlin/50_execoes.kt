//import java.lang.ArithmeticException
//import java.lang.Exception
//
//fun main() {
//    try {
//
//        val str: String? = null
//        println(str!!.length)
//
//        val a = 10 / 0
//    }
//    catch (e: NullPointerException) {
//        println(e)
//        println("Variavel Nula")
//    }
//    catch (e: ArithmeticException){
//        println(e)
//        println("Impossivel dividir por 0")
//    }
//    catch(e: Exception){
//        // Excessão mais generica
//        println("Generico")
//    }
//    finally {
//        // sempre executado
//        println("Finally")
//    }
//    println("Fim")
//}

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException

fun main() {
    try {
        val str: String? = null
        println(str!!.length) // NullPointerException
        println(12 / 0) // ArithmeticException
    }
    catch (e: ArithmeticException) {
        println("Divisão por zero!")
    }
    catch (e: NullPointerException) {
        println("NullPointer!!")
    }
    catch (e: Exception) {
        println("Tivemos um problema.")
    }
    finally {
        println("Finalmente!")
    }

}
