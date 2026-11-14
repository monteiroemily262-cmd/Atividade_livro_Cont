fun main() {
    println("Digite a idade:")
    val idade = readln().toInt()

    if (idade < 16) {
        println("Não-eleitor")
    } else if (idade in 18..65) {
        println("Eleitor obrigatório")
    } else {
        println("Eleitor facultativo")
    }
}
