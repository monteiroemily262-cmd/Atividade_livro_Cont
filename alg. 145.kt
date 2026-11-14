fun main() {
    println("Digite o nome do livro:")
    val livro = readln()
    println("Digite o tipo de usuário (professor / aluno):")
    val tipo = readln()

    val dias = when (tipo.lowercase()) {
        "professor" -> 10
        "aluno" -> 3
        else -> 0
    }

    if (dias == 0) {
        println("Tipo de usuário desconhecido")
    } else {
        println("Nome do livro: $livro")
        println("Tipo de usuário: $tipo")
        println("Total de dias: $dias")
    }
}
