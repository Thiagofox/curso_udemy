fun printNumbers1to50() {
    for (i in 1..50){
        print("$i ")
    }
}

fun printNunbers50to1() {
    for (i in 50 downTo 1){
        print("$i ")
    }
}

fun printNumbers1to50exeptMult5() {
    for (i in 1..50){
        if (i%5 == 0){
            continue
        }
        print("$i ")
    }
}

fun sumNum1to500(){
    var sum = 0
    for (i in 1..500) {
        sum += i
    }
    println(sum)
}

fun stairs(num : Int){
    for (i in 1 .. num) {
        for(j in 1 .. i){
            print("*")
        }
        println()
    }
}

fun main() {
    printNumbers1to50()
    println()
    printNunbers50to1()
    println()
    printNumbers1to50exeptMult5()
    println()
    sumNum1to500()
    stairs(5)
}