fun main() {
    println("Pontos do 1º jogador:")
    var p1 = readln().toInt()
    println("Pontos do 2º jogador:")
    var p2 = readln().toInt()
    println("Pontos do 3º jogador:")
    var p3 = readln().toInt()

    if (p1 < p2) { val aux = p1; p1 = p2; p2 = aux }
    if (p1 < p3) { val aux = p1; p1 = p3; p3 = aux }
    if (p2 < p3) { val aux = p2; p2 = p3; p3 = aux }

    println("Ordem decrescente: $p1, $p2, $p3")
    val soma = p1 + p2 + p3
    if (soma > 100) {
        println("Média = %.2f".format(soma / 3.0))
    } else {
        println("Equipe desclassificada!")
    }
}
