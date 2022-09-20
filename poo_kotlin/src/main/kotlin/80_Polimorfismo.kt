/*
POLIMORFISMO -> Significa várias formas
*//*

*//*interface Funcionarios{
    var salario: Float

    fun bonus() : Float
}*//*

abstract class Funcionarios(var salario: Float) {
    abstract fun bonus() : Float
}

class Gerente(salario: Float): Funcionarios(salario) {
    override fun bonus(): Float {
        return salario * 0.5F
    }
}
class Analista(salario: Float) : Funcionarios(salario) {
    override fun bonus(): Float {
       return salario * 0.3F
    }
}

fun mostraBonus(func: Funcionarios){
    println(func.bonus())
}

fun main() {
    mostraBonus(Gerente(5000F))
    mostraBonus(Analista(4000F))
}*/

fun main() {
    val gerente: Funcionario = Gerente()
    val analista: Funcionario = Analista()

    calculo(gerente)
    calculo(analista)
}

interface Funcionario {
    fun bonus()
}

class Gerente : Funcionario {
    override fun bonus() {
        println("Bônus do gerente.")
    }
}

class Analista : Funcionario {
    override fun bonus() {
        println("Bônus do analista.")
    }
}

fun calculo(f: Funcionario) {
    f.bonus()
}