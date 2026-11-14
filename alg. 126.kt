fun main() {
    println("Digite o valor de X:")
    val x = readln().toDouble()

    if (x == 5.0) {
        println("O número é o 5")
    } else if (x == 200.0) {
        println("O número é o 200")
    } else if (x == 400.0) {
        println("O número é o 400")
    } else if (x >= 500.0 && x <= 1000.0) {
        println("Intervalo 500-1000")
    } else {
        println("Fora do escopo")
    }
}
