fun getBonusSalary(cargo: String, exp: Int): String {
    val salary: Float
    if (cargo.lowercase() == "gerente"){
        if(exp < 2) {
            salary = 2000F
            return "O Cargo de Gerente recebe o salário de $salary"
        }
        else {
            salary = 3000F
            return "O Cargo de Gerente recebe o salário de $salary"
        }
    }
    else if (cargo.lowercase() == "coordenador") {
        if(exp < 1){
            salary = 1500F
            return "O Cargo de Coordenador recebe o salário de $salary"
        }
        else {
            salary = 1800F
            return "O Cargo de Coordenador recebe o salário de $salary"
        }
    }
    else if (cargo.lowercase() == "engenheiro de software"){
        salary = 1000F
        return "O Cargo de Engenheiro do Software recebe o salário de $salary"
    }
    else {
        salary = 500F
        return "O Cargo de Estagiário recebe o salário de $salary"
    }
}

fun main() {
    println(getBonusSalary("Gerente", 3))
    println( getBonusSalary("Gerente", 1))
    println( getBonusSalary("Coordenador", 1))
    println(getBonusSalary("Coordenador", 2))
    println(getBonusSalary("Engenheiro de Software", 0))
    println(getBonusSalary("estágiario",0))
}