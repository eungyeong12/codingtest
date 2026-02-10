fun main() {
    val n = readln().toInt()
    for (i in 1..n) {
        print("*".repeat(i))
        print(" ".repeat(n * 2 - i * 2))
        print("*".repeat(i))
        println()
    }
    for (i in n - 1 downTo 1) {
        print("*".repeat(i))
        print(" ".repeat(n * 2 - i * 2))
        print("*".repeat(i))
        println()
    }
}
