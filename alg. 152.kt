fun main() {
    println("Digite o peso (kg):")
    val peso = readln().toDouble()
    println("Digite a idade:")
    val idade = readln().toInt()

    val gotasMg = 500.0 / 20.0 // mg por gota

    if (peso < 5.0) {
        println("Não pode tomar o remédio porque não tem peso suficiente. Consulte um médico.")
    } else if (idade >= 12) {
        val mg = if (peso >= 60.0) 1000.0 else 875.0
        println("Tomar ${mg / gotasMg} gotas")
    } else {
        val mg = when {
            peso <= 9.0 -> 125.0
            peso <= 16.0 -> 250.0
            peso <= 24.0 -> 375.0
            peso <= 30.0 -> 500.0
            else -> 750.0
        }
        println("Tomar ${mg / gotasMg} gotas")
    }
}
