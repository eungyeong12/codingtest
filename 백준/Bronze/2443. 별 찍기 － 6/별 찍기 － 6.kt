fun main() {
    val n = readln().toInt()
    val stars = (n - 1 downTo 0).map { it * 2 + 1 }
    val first = stars.first()
    stars.forEach {
        print(" ".repeat((first - it) / 2))
        print("*".repeat(it))
        println()
    }
}
