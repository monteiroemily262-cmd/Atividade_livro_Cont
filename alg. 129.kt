fun main() {
    println("Digite o salário:")
    val salario = readln().toDouble()

    val desconto = if (salario <= 600.0) {
        0.0
    } else if (salario <= 1200.0) {
        salario * 0.20
    } else if (salario <= 2000.0) {
        salario * 0.25
    } else {
        salario * 0.30
    }

    println("Desconto: R$ $desconto")
}
