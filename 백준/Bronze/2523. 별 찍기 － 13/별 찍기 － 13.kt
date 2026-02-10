fun main() {
    val n = readln().toInt()
    for (i in 1..n) {
        print("*".repeat(i))
        println()
    }
    for (i in n - 1 downTo 1) {
        print("*".repeat(i))
        println()
    }
}
