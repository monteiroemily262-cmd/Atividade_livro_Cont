fun main() {
    println("Digite a placa do carro:")
    val placa = readln()
    val p = placa.takeLast(1)

    val mes = when (p) {
        "1" -> "Janeiro"
        "2" -> "Fevereiro"
        "3" -> "Março"
        "4" -> "Abril"
        "5" -> "Maio"
        "6" -> "Junho"
        "7" -> "Julho"
        "8" -> "Agosto"
        "9" -> "Setembro"
        "0" -> "Outubro"
        else -> "Opção inválida"
    }
    println(mes)
}
