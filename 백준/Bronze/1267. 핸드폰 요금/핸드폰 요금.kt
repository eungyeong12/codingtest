fun main() {
    val n = readln().toInt()
    val times = readln().split(" ").map { it.toInt() }
    val y = times.sumOf { 10 + it / 30 * 10 }
    val m = times.sumOf { 15 + it / 60 * 15 }
    println(if (y == m) "Y M $y" else if (y < m) "Y $y" else "M $m")
}