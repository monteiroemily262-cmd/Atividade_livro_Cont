fun main() {
    println("Destino (1-Norte, 2-Nordeste, 3-Centro-Oeste, 4-Sul):")
    val op = readln().toInt()
    println("Viagem (1-Ida, 2-Ida e Volta):")
    val iv = readln().toInt()

    val preco = when (op) {
        1 -> if (iv == 1) 500.0 else 900.0
        2 -> if (iv == 1) 350.0 else 650.0
        3 -> if (iv == 1) 350.0 else 600.0
        4 -> if (iv == 1) 300.0 else 550.0
        else -> -1.0
    }

    if (preco >= 0.0) {
        println("O valor da passagem é R$ %.2f".format(preco))
    } else {
        println("Opção inexistente")
    }
}
