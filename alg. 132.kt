fun main() {
    println("Digite o valor em Reais a ser convertido:")
    val r = readln().toDouble()
    println("Digite a moeda (f - franco suíço, l - libra, d - dólar, m - marco alemão):")
    val moeda = readln()

    when (moeda.lowercase()) {
        "f" -> {
            println("Digite o valor de um franco suíço em reais:")
            val f = readln().toDouble()
            println("Total de francos suíços: ${r / f}")
        }
        "l" -> {
            println("Digite o valor de uma libra esterlina em reais:")
            val l = readln().toDouble()
            println("Total de libras esterlinas: ${r / l}")
        }
        "d" -> {
            println("Digite o valor de um dólar em reais:")
            val d = readln().toDouble()
            println("Total de dólares: ${r / d}")
        }
        "m" -> {
            println("Digite o valor de um marco alemão em reais:")
            val m = readln().toDouble()
            println("Total de marcos alemães: ${r / m}")
        }
        else -> println("Moeda desconhecida")
    }
}
