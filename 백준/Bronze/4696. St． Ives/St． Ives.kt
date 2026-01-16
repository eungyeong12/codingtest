import kotlin.math.pow

fun main() {
    while (true) {
        val n = readln().toDouble()
        if (n == 0.0) return

        val sum = 1 + n + n.pow(2.0) + n.pow(3.0) + n.pow(4.0)

        println(String.format("%.2f", sum))
    }
}