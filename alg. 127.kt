fun main() {
    println("Digite o nome:")
    val nome = readln()
    println("Digite a 1ª nota:")
    val nota1 = readln().toDouble()
    println("Digite a 2ª nota:")
    val nota2 = readln().toDouble()

    val media = (nota1 + nota2) / 2.0

    if (media >= 7.0) {
        println("$nome - Média: $media - AP")
    } else if (media < 3.0) {
        println("$nome - Média: $media - RP")
    } else {
        println("$nome - Média: $media - PF")
    }
}
