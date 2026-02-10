fun main() {
    // 1 -> 3
    // 2 -> 3 + 3 + 2
    // 3 -> 3 + 3 + 3 + 3
    // 4 -> 3 + 3 + 3 + 3 + 4
    val n = readln().toLong()
    println(3 * n + n)
}