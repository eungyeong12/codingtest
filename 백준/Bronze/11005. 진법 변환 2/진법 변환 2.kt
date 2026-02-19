import java.util.Locale.getDefault

fun main() {
    val (n, b) = readln().split(" ").map { it.toLong() }
    println(n.toString(b.toInt()).uppercase(getDefault()))
}