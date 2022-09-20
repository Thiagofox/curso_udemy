fun main() {
    // List é um conjunto ordenado de dados
    // List set e map são uma unterfade de collection e possuem varios metodos  que a ajudam
    val lst0 = listOf<Int>() // lista vazia
    val lst1 = listOf(true, false, 3.2, 1, "aujshd") // podem receber vários tipos de dados por traz é um vararg
    val lst2: List<Int> = listOf(1, 2, 3, 4, 5) // listOf é Imutavel não pode ser modificada
    val lst3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5) // pode ser modificada

    println(lst3)
    println(lst3[0])
    println(lst3.size)

    lst3.add(6)
    lst3.add(7)
    println(lst3)
    println(lst3.size)

    println("_________________________________")

    println(lst3)
    println("Remove elemento 7")
    lst3.remove(7)
    println(lst3)

    println("_________________________________")

    println("Remove elemento da posição 0")
    println(lst3)
    lst3.removeAt(0)
    println(lst3)

    println("_________________________________")

    println("Verifica se o elemento 5 esta na lista")
    println(lst3)
    println(lst3.contains(5))

    println("_________________________________")
    println("Limpa a lista")
    lst3.clear()
    println(lst3)
}


/**
 * Listas
 */
/*
fun main() {

    // Lista imutável
    val lista1 = listOf(1, 2, 3, 4, 5, 6, 6) // Inferência de tipo
    var lista2: List<Int> = listOf(1, 2) // Declaração explícita

    println("Lista, posição 0: ${lista1[0]}")
    println("Tamanho da lista: ${lista1.size}")

    // Lista mutável
    val lista3 = mutableListOf(1, 2, 3, 4, 5, 6, 6)
    var lista4: MutableList<Int> = mutableListOf(1, 2)

    println()
    println("Tamanho da lista 3: ${lista3.size}")

    // Alterando lista mutável
    lista3.add(100)
    lista3.add(100)
    lista3.add(8)
    lista3.remove(2)

    println("Tamanho da lista 3: ${lista3.size}")
    println(lista3)

    // Verifica se existe um elemento
    println(lista3.contains(8))

    // Limpando a coleção - Somente possível em mutável
    lista3.clear()
}*/
