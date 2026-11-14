fun main() {
    println("Digite o nome:")
    val nome = readln()
    println("Digite o valor da conta:")
    val vc = readln().toDouble()
    val letra = nome.take(1).uppercase()

    if (letra == "A" || letra == "D" || letra == "M" || letra == "S") {
        val vcd = vc * 0.7
        println("$nome - Valor com desconto: R$ %.2f".format(vcd))
    } else {
        println("Que pena. Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará.")
    }
}
