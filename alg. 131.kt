fun main() {
    println("Digite o nome:")
    val nome = readln()
    val letra = nome.take(1).uppercase()

    when (letra) {
        in "A".."K" -> println("$nome sala: 101")
        in "L".."N" -> println("$nome sala: 102")
        in "O".."Z" -> println("$nome sala: 103")
        else -> println("Nome inválido")
    }
}
