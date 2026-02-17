import kotlin.math.sqrt

fun main() {
    val m = readln().toInt()
    val n = readln().toInt()
    val list = (m..n).filter {
        val half = sqrt(it.toDouble()).toInt()
        half * half == it
    }
    println(if (list.isEmpty()) -1 else list.sum())
    if (list.isNotEmpty()) println(list[0])
}