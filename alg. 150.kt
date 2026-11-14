import kotlin.math.*
fun main() {
    println("Digite o ângulo em graus:")
    val ang = readln().toDouble()
    val rang = ang * PI / 180.0

    if ((rang > PI / 2 && rang <= PI) || (rang > 3 * PI / 2 && rang <= 2 * PI)) {
        println("Seno: ${sin(rang)}")
    } else {
        println("Co-seno: ${cos(rang)}")
    }
}
