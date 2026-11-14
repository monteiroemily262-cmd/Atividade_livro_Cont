fun main() {
    println("Digite o saldo médio:")
    val saldo = readln().toDouble()

    val credito = when {
        saldo <= 500.0 -> 0.0
        saldo <= 1000.0 -> saldo * 0.30
        saldo <= 3000.0 -> saldo * 0.40
        else -> saldo * 0.50
    }

    if (credito > 0.0) {
        println("Como seu saldo era de R$ $saldo, seu crédito será de R$ $credito")
    } else {
        println("Como seu saldo era de R$ $saldo, você não terá nenhum crédito")
    }
}
