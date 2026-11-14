fun main() {
    println("Digite uma palavra:")
    val pal = readln()
    val letra = pal.take(1).lowercase()

    val novaPalavra = if (letra == "l" || letra == "d") {
        pal.take(2) + pal.takeLast(1)
    } else {
        pal.drop(1)
    }
    println("Palavra: $novaPalavra")
}
