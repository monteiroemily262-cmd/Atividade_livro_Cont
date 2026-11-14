fun main() {
    println("Entre com o nome:")
    val nome = readln()
    println("Entre com a idade:")
    val idade = readln().toInt()

    val valor = when {
        idade <= 10 -> 30.0
        idade <= 29 -> 60.0
        idade <= 45 -> 120.0
        idade <= 59 -> 150.0
        idade <= 65 -> 250.0
        else -> 400.0
    }
    println("$nome pagará R$ $valor")
}
