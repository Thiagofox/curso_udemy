fun main() {

    var i = 0
    while (true) {
        if (i == 10) {
            // Quebra o laço de repetição mesmo que a condição de execução seja verdadeira
            break
        }
        i++
        println(i)
    }

    var t = 0
    while (t < 100000000) {
        if (t >= 21) {
            break
        }
        println(t)
        t++
    }


    while (i <= 100) {
        if (i < 90) {
            i++

            // Continue faz com que o laço de repetição passe para a próxima iteração
            continue

            println("Eu nunca serei executado.")
        }
        print("$i ")
        i++
    }
}

