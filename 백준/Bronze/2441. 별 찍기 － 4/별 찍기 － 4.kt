fun main() {
    val n = readln().toInt()
    for (i in n downTo 1) {
        print(" ".repeat(n - i))
        println("*".repeat(i))
    }
}