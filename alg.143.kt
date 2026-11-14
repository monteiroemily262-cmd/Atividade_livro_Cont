fun main() {
    println("Digite uma palavra:")
    val pal = readln()
    val tam = pal.length

    if (tam % 2 == 0) {
        val n1 = tam / 2
        val n2 = n1 - 1
        val p3 = "${pal[n2]}${pal[n1]}"
        if (p3 == "rr" || p3 == "ss") {
            println("É rr ou ss")
        } else {
            println("Não é rr ou ss")
        }
    } else {
        val n1 = tam / 2
        val pl = pal[n1].lowercase()
        if (pl == "a" || pl == "e" || pl == "i" || pl == "o" || pl == "u") {
            println("É vogal")
        } else {
            println("Não é vogal")
        }
    }
}
