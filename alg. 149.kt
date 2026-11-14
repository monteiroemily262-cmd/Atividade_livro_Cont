fun main() {
    println("Digite o nome do produto:")
    val nomep = readln()
    println("Digite o valor da compra:")
    val vcompra = readln().toDouble()

    val vvenda = when {
        vcompra < 10.0 -> vcompra * 1.7
        vcompra < 30.0 -> vcompra * 1.5
        vcompra < 50.0 -> vcompra * 1.4
        else -> vcompra * 1.3
    }

    println("$nomep será vendido por R$ %.2f".format(vvenda))
}
