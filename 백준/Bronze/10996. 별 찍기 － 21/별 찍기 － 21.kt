fun main() {
    val n = readln().toInt()
    if (n % 2 == 0) {
        repeat(n) {
            println("* ".repeat(n / 2))
            println(" *".repeat(n / 2))
        }
    }
    if (n % 2 == 1) {
        repeat(n) {
            println("* ".repeat(n / 2 + 1))
            println(" *".repeat(n / 2))
        }
    }
}