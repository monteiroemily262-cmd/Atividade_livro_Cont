fun main() {
    println("Digite 5 números inteiros diferentes:")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()
    val n4 = readln().toInt()
    val n5 = readln().toInt()

    if (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 &&
        n2 != n3 && n2 != n4 && n2 != n5 &&
        n3 != n4 && n3 != n5 && n4 != n5) {
        
        var maior = n1
        var menor = n1

        if (n2 > maior) maior = n2 else if (n2 < menor) menor = n2
        if (n3 > maior) maior = n3 else if (n3 < menor) menor = n3
        if (n4 > maior) maior = n4 else if (n4 < menor) menor = n4
        if (n5 > maior) maior = n5 else if (n5 < menor) menor = n5

        println("Maior = $maior")
        println("Menor = $menor")
    } else {
        println("Os valores devem ser diferentes.")
    }
}
