fun main() {
    println("Prato (1-Vegetariano, 2-Peixe, 3-Frango, 4-Carne):")
    var calorias = when (readln().toInt()) {
        1 -> 180
        2 -> 230
        3 -> 250
        4 -> 350
        else -> 0
    }

    println("Sobremesa (1-Abacaxi, 2-Sorvete diet, 3-Mousse diet, 4-Mousse chocolate):")
    calorias += when (readln().toInt()) {
        1 -> 75
        2 -> 110
        3 -> 170
        4 -> 200
        else -> 0
    }

    println("Bebida (1-Chá, 2-Suco laranja, 3-Suco melão, 4-Refrigerante diet):")
    calorias += when (readln().toInt()) {
        1 -> 20
        2 -> 70
        3 -> 100
        4 -> 65
        else -> 0
    }

    println("Total de calorias: $calorias cal")
}
