import kotlin.math.sqrt

fun main() {
    println("Entre com o valor de a:")
    val a = readln().toDouble()
    println("Entre com o valor de b:")
    val b = readln().toDouble()
    println("Entre com o valor de c:")
    val c = readln().toDouble()

    if (a == 0.0) {
        println("Não é equação do 2º grau")
    } else {
        val delta = (b * b) - (4 * a * c)
        if (delta >= 0.0) {
            val raizDelta = sqrt(delta)
            val x1 = (-b + raizDelta) / (2 * a)
            val x2 = (-b - raizDelta) / (2 * a)
            println("X1 = $x1 \t X2 = $x2")
        } else {
            println("Não há raízes reais")
        }
    }
}
