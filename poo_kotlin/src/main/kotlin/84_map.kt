fun main() {

    /*
    MAP -> Coleção do tipo CHAVE -> VALOR (Pares - para cada chave um  valor)
           so podem haver um valor asociado a uma chave ou seja a chave 10 so
           pode ter um unico valor no Map -> chave 10 - valor 15
    */
//                                     para criar uma entrada no map usamos o pair
    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlin"), Pair("Alemanha", "Buden"))
    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlin"), Pair("Alemanha", "Buden"))

    println(map1) // {França=Paris, Alemanha=Buden} -> sempre prevalece o ultimo valor informado para a chave

    println(map1.size)     // 2
    println(map1.entries)  // [França=Paris, Alemanha=Buden]
    println(map1.keys)     // [França, Alemanha]
    println(map1.values)   // [Paris, Buden]

    map2["Brasil"] = "Brasília"              // adiciona
    println(map2)                            // {França=Paris, Alemanha=Buden, Brasil=Brasília}

    map2.remove("Brasil")                // remove
    println(map2)                            // {França=Paris, Alemanha=Buden}

    println(map2.contains("Alemanha"))       // verifica se existe a chave // true
    map2.containsKey("Alemanha")
    map2.containsValue("Buden")
    map2.clear()                             // limpa o map
}

/**
 * Map
 *
 * Mapa são listas de dados entrada-valor. Significa que para uma chave, existe um valor associado.
 * Assim como Set, map também não permite elementos duplicados.
 */
/*
fun main() {

    val map1: Map<String, String> = mapOf(Pair("França", "Paris"), Pair("França", "Paris"))
    val map2 = mutableMapOf(Pair("França", "Paris"), Pair("França", "Paris"))

    // Todas as entradas, ou seja, chaves
    println(map1.keys)

    // Todas os valores, ou seja, quais são os valores associados as chaves
    println(map1.values)

    // Como adicionar novos valores
    map2["Alemanha"] = "Berlim"
    println(map2)

    // Como remover valores - Sempre informar a chave
    map2.remove("Alemanha")
    println(map2)

    // Verifica se existe o elemento
    println(map2.contains("França"))

    // Imprime o valor associada a chave
    println(map2["França"])

    // Limpando a coleção - Somente possível em mutável
    map2.clear()
}*/
