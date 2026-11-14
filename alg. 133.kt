fun main() {
    println("Entre com a altura:")
    val h = readln().toDouble()
    println("Entre com o sexo (M / F):")
    val sexo = readln()

    val pesoIdeal = if (sexo.uppercase() == "M") {
        (72.7 * h) - 58
    } else {
        (62.1 * h) - 44.7
    }

    println("Seu peso ideal: $pesoIdeal kg")
}
