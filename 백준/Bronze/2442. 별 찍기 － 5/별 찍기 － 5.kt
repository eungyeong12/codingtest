fun main() {
    val n = readln().toInt()
    val odds = (0 until n).map { it * 2 + 1 }
    val last = odds.last()
    odds.forEach {
        print(" ".repeat((last - it) / 2))
        print("*".repeat(it))
        println()
    }
}
