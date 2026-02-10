fun main() {
    val n = readln().toInt()
    val stars = (0 until n).map { it * 2 + 1 }
    val last = stars.last()
    stars.reversed().forEach {
        val spaceCount = (last - it) / 2
        print(" ".repeat(spaceCount))
        print("*".repeat(it))
        println()
    }
    stars.drop(1).forEach {
        val spaceCount = (last - it) / 2
        print(" ".repeat(spaceCount))
        print("*".repeat(it))
        println()
    }
}