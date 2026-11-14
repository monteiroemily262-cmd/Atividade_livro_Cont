fun main() {
    println("Digite o 1º nome:")
    var n1 = readln()
    println("Digite pontos:")
    var p1 = readln().toInt()

    println("Digite o 2º nome:")
    var n2 = readln()
    println("Digite pontos:")
    var p2 = readln().toInt()

    println("Digite o 3º nome:")
    var n3 = readln()
    println("Digite pontos:")
    var p3 = readln().toInt()

    if (p1 < p2) { val auxP = p1; p1 = p2; p2 = auxP; val auxN = n1; n1 = n2; n2 = auxN }
    if (p1 < p3) { val auxP = p1; p1 = p3; p3 = auxP; val auxN = n1; n1 = n3; n3 = auxN }
    if (p2 < p3) { val auxP = p2; p2 = p3; p3 = auxP; val auxN = n2; n2 = n3; n3 = auxN }

    println("VENCEDOR: $n1 - $p1 pontos")
    println("SEGUNDO COLOCADO: $n2 - $p2 pontos")
    println("TERCEIRO COLOCADO: $n3 - $p3 pontos")
}
