fun main() {
    println("Digite sua idade:")
    val idade = readln().toInt()

    if (idade >= 65) {
        println("Maior de 65 anos")
    } else if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}
