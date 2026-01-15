import kotlin.math.abs

fun main() {
    val (a, b, c, d) = readln().split(" ").map { it.toInt() }
    println(abs((a + d) - (b + c)))
}
