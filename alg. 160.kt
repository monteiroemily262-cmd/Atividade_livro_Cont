fun main() {
    println("Digite o valor de x:")
    val x = readln().toDouble()

    val y = when {
        x <= 1.0 -> 1.0
        x <= 2.0 -> 2.0
        x <= 3.0 -> x * x
        else -> x * x * x
    }

    println("Valor de f(x): $y")
}
