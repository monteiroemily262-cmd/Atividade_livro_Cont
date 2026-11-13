fun main() {
    println("Digite o 1º lado:")
    val a = readln().toDouble()
    println("Digite o 2º lado:")
    val b = readln().toDouble()
    println("Digite o 3º lado:")
    val c = readln().toDouble()

    if (a < b + c && b < a + c && c < a + b) {
        val maior: Double
        val outrosSoma: Double

        if (a > b && a > c) {
            maior = a * a
            outrosSoma = b * b + c * c
        } else if (b > c) {
            maior = b * b
            outrosSoma = a * a + c * c
        } else {
            maior = c * c
            outrosSoma = a * a + b * b
        }

        if (maior == outrosSoma) {
            println("Triângulo Retângulo")
        } else if (maior > outrosSoma) {
            println("Triângulo Obtusângulo")
        } else {
            println("Triângulo Acutângulo")
        }
    } else {
        println("As medidas não formam um triângulo.")
    }
}
