fun main() {
    // Set tambem é uma collection, tambem implementa a interface de coleção
    // set não é um conjunto ordenado de dados, pode ser desordenado
    val set0 = setOf<Int>() // set vazio

    // NÃO PERMITE VALORES DUPLICADOS
    val set1: Set<String> = setOf<String>("Paris", "Berlin", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf<String>()

    println("O Set não permite valores duplicados")
    println(set1)

    println("_________________________________")

    set2.add("São Paulo")
    set2.add("Belo Horizonte")
    set2.add("Rio de Janeiro")
    println(set2)

    println("_________________________________")
    println("Verifica o tamanho do Set => ${set2.size}")
    println("_________________________________")

    println("Verifica se o valor Belo Horizonte está na lista")
    println(set2.contains("Belo Horizonte"))

    println("_________________________________")

    println("Remove o valor Belo Horizonte")
    set2.remove("Belo Horizonte")
    println(set2)

    println("_________________________________")
    println("Limpa o set")
    set2.clear()
    println(set2)

//  set2.removeAt() -> Não é possivel remover um elemento de um set em um determinado index
//                     pois o set é um conjunto de dados e nao tem uma ordem
}

/**
 * Set
 *
 * A coleção Set não permite elementos duplicados, o que é uma característica muito útil.
 * Caso dois valores iguais sejam adicionados no Set, somente um deles será usado e não acontecerá erro.
 * */
/*
fun main() {
    // Criação de Set com String e Int. Aceita qualquer tipo de dado.
    val set = setOf("Madrid", "São Paulo", "Berlim")
    val s11: Set<Int> = setOf(1)

    // Cria um set mutável com elementos repetidos
    val setMutavel = mutableSetOf(1, 2, 3, 4, 5, 5, 5, 5, 5, 5)

    // Imprime o set sem elementos repetidos
    println(setMutavel)

    // Adicionando mais elementos repeitidos e imprimindo novamente
    setMutavel.add(5)
    setMutavel.add(5)
    setMutavel.add(5)
    setMutavel.add(5)

    // Elementos únicos - não repetidos
    println(setMutavel)

    // Removendo um valor
    setMutavel.remove(5)

    // Verifica se existe o elemento
    println(setMutavel.contains(5))

    // Limpando a coleção - Somente possível em mutável
    setMutavel.clear()
}*/
