fun main() {
    println("Digite o dia:")
    val dia = readln().toInt()
    println("Digite o mês:")
    val mes = readln().toInt()
    println("Digite o ano:")
    val ano = readln().toInt()

    var valida = true

    if (ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
        valida = false
    } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
        valida = false
    } else if (mes == 2) {
        val bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
        if (bissexto && dia > 29) valida = false
        if (!bissexto && dia > 28) valida = false
    }

    if (valida) println("DATA VÁLIDA") else println("DATA INVÁLIDA")
}
