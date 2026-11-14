fun main() {
    println("Digite o nome do Município:")
    val nome = readln()
    println("Número de eleitores aptos:")
    val ne = readln().toInt()
    println("Número de votos do candidato mais votado:")
    val votos = readln().toInt()

    if (ne > 20000 && votos <= ne / 2) {
        println("$nome terá segundo turno")
    } else {
        println("$nome não terá segundo turno")
    }
}
