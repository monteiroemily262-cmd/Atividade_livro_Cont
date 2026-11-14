fun main() {
    println("Digite o valor de x:")
    val x = readln().toDouble()

    if (x != 2.0) {
        val fx = 8.0 / (2.0 - x)
        println("f(x) = $fx")
    } else {
        println("NÃO PODE SER FEITA")
    }
}
