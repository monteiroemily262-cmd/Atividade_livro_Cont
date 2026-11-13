fun main() {
    println("Digite o 1º lado:")
    val a = readln().toDouble()
    println("Digite o 2º lado:")
    val b = readln().toDouble()
    println("Digite o 3º lado:")
    val c = readln().toDouble()

    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && b == c) {
            println("Triângulo Equilátero")
        } else if (a == b || a == c || b == c) {
            println("Triângulo Isósceles")
        } else {
            println("Triângulo Escaleno")
        }
    } else {
        println("As medidas não formam um triângulo.")
    }
}
