fun main() {
    println("Digite um verbo:")
    val verbo = readln()
    val ultima = verbo.takeLast(1)

    if (ultima == "r" || ultima == "R") {
        val penultima = verbo.dropLast(1).takeLast(1)
        when (penultima) {
            "a", "A" -> println("1ª conjugação")
            "e", "E", "o", "O" -> println("2ª conjugação")
            "i", "I" -> println("3ª conjugação")
            else -> println("Não existe verbo com terminação ur")
        }
    } else {
        println("Não é um verbo no infinitivo")
    }
}
