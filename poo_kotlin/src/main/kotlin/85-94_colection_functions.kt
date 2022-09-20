/**
 * Coleçõs - Grupo de valores variável
 * Uma coleção geralmente contém um número de objetos (também pode ser zero) do mesmo tipo.
 *
 * Os tipos de coleção abaixo serão tratados:
 * - List
 * - Set
 * - Map
 *
 * Coleções podem ser mutáveis ou imutáveis. Assim como as variáveis declaradas com var e val,
 * seguem o mesmo conceito.
 *
 * Mutáveis - Uma vez criada, podem ser alteradas para adicionar, remover ou atualizar valores.
 * Imutáveis - Uma vez criada, não é possível adicionar ou remover valores, somente obter.
 */
fun main() {
    val data = listaDeDados()

    // Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim" else "não"}.")
    // any() -> Retorn true se a coleção tiver pelo menos um elemento
    println("----------------------------------------")


    // Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas.")
    // count() -> Retorna o numero de elementos na coleção
    println("----------------------------------------")


    // Tenho alguma receita de Lasanha?
    println("Tenho receitas de Lasanha? ${if (data.any { it.nome == "Lasanha" }) "sim" else "não"}.")
    println("----------------------------------------")


    // Quantas receitas de Lasanha?
    println("Tenho ${data.count { it.nome == "Lasanha" }} receitas de Lasanha.")
    println("----------------------------------------")


    // Qual a primeira e última receita?
    println("A primeira receita é: ${data.first().nome}.")
    println("A última receita é: ${data.last().nome}.")
    println("----------------------------------------")


    // Caso a lista possa ser vazia
    // data.firstOrNull()
    // data.lastOrNull()

    // Qual a soma de calorias?
    // it -> se refere ao objeto que esta sendo iterado
    val sumCalories = data.sumOf { it.calorias }
    // sumOf() -> soma uma propriedade do objeto que esta sendo iterado.(precisa ser um dado numérico)
    println("A soma de calorias é: $sumCalories")
    println("----------------------------------------")


    // Sei como fazer panqueca? E sushi?
//  val knowPanqueke = data.filter { it.nome == "Panqueca" }.any()
    val knowPanqueke = data.any { it.nome == "Panqueca" }
//  val caloriesLower300 = data.filter { it.calorias <= 300 }.count()
    val caloriesLower300 = data.count { it.calorias <= 300 }
    println("Sei fazer panqueca? ${if (knowPanqueke) "sim" else "não"}")
    println("Quantas receitas que são menores ou igual a 300 -> $caloriesLower300")
    println("----------------------------------------")


//  val knowSushi = data.filter { it.nome == "Sushi" }.any()
    val knowSushi = data.any { it.nome == "Sushi" }
    println("Sei fazer sushi? ${if (knowSushi) "sim" else "não"}")
    println("----------------------------------------")

//
    // Me dê as duas primeiras receitas
    val firstTwo = data.take(2)
    val lastTwo = data.takeLast(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.nome}")
    }
    println("----------------------------------------")


    // forEach -> Funciona iterando item por item da sua lista
    val recipiesList = data.forEach{ println(it.nome)}
    println("A lista de receitas é")
    println(recipiesList)
    println("----------------------------------------")


    // Quais são as comidas com mais de 500 calorias?
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }
    println("----------------------------------------")


    // Qual a receita mais calórica? E a menos calórica?
    val maisCal = data.maxByOrNull { it.calorias }
    val maxCal = data.maxOfOrNull { it.calorias }
    val menosCal = data.minByOrNull { it.calorias }
    val minCal = data.minOfOrNull { it.calorias }
    println("Mais calórica: ${maisCal?.nome}")
    println("Mais calórica: $maxCal")
    println("Menos calórica: ${menosCal?.nome}")
    println("Menos calórica: $minCal")
    println("----------------------------------------")


    // Faça uma lista com o nome dos pratos
    // cria uma nova lista diminuindo a complexidade
    println("Crie uma lista com os nome das Receitas")
    println(data.map { it.nome })
    println("Crie uma lista com todas as calorias")
    println(data.map{ it.calorias})
    println("Nova lista que conta a quantidade de ingredients")
    println(data.map { Receitas(it.nome, it.calorias)})
    println("----------------------------------------")


    // Qual a média de caloria de todas as receitas?
    val media = data.map { it.calorias }.average()
    println("A média de calorias é: $media.")
    println("----------------------------------------")


    // Lista de dados simples
    val listaInteiros = listOf(1, 2, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
    val listWithDistinct = listaInteiros.distinct()

    println("Lista com o distinct.")
    println(listWithDistinct)

    println("Lista com o distinctBy.")
    data.distinctBy { it.nome }.forEach{ println(it.nome) }
    // note que a panqueca so aparece uma vez mesmo tendo duas
    println("----------------------------------------")


    // Ordenar uma lista
    val ordenadaAsc = listaInteiros.sorted().distinct()
    val ordenadaDesc = listaInteiros.sortedDescending().distinct()
    println("Lista ordenada Ascendente")
    println(ordenadaAsc)
    println("Lista ordenada Ascendente")
    println(ordenadaDesc)
    println("----------------------------------------")


    // Inverter uma lista
    val reverseList = listaInteiros.reversed()
    println("Lista invertida")
    println(reverseList)
}

// Retorna lista de dados
private fun listaDeDados(): List<Receitas> {
    return listOf(
        Receitas(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjerição", 3)
            )
        ),
        Receitas("Panqueca", 500),
        Receitas("Panqueca", 500),
        Receitas("Omelete", 200),
        Receitas("Parmegiana", 700),
        Receitas("Sopa de feijão", 300),
        Receitas(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )
}

data class Receitas(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes(val nome: String, val quantidade: Int)