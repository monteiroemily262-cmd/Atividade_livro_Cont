fun main() {
    println("Digite o tipo de carro (A / B / C):")
    val tipo = readln()
    println("Digite o percurso em km:")
    val percurso = readln().toDouble()

    val kmPorLitro = when (tipo.uppercase()) {
        "A" -> 8.0
        "B" -> 10.0
        "C" -> 12.0
        else -> 0.0
    }

    if (kmPorLitro > 0.0) {
        val consumo = percurso / kmPorLitro
        println("Consumo estimado em litros: %.2f".format(consumo))
    } else {
        println("Modelo inexistente")
    }
}
