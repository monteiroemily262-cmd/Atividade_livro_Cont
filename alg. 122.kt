fun main() {
    println("Digite o 1º lado:")
    val a = readln().toDouble()
    println("Digite o 2º lado:")
    val b = readln().toDouble()
    println("Digite o 3º lado:")
    val c = readln().toDouble()

    if (a < b + c && b < a + c && c < a + b) {
        println("Podem ser lados de um triângulo.")
    } else {
        println("Não podem ser lados de um triângulo.")
    }
}
