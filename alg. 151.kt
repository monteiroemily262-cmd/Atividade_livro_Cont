fun main() {
    println("Digite o peso (kg):")
    val peso = readln().toDouble()
    println("Digite a altura (m):")
    val altura = readln().toDouble()

    val imc = peso / (altura * altura)

    val faixa = when {
        imc < 20.0 -> "Abaixo do peso"
        imc <= 25.0 -> "Normal"
        imc <= 30.0 -> "Excesso de peso"
        imc <= 35.0 -> "Obesidade"
        else -> "Obesidade mórbida"
    }
    println("Faixa de risco: $faixa")
}
