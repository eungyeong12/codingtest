fun main() {
    val (a, b, c) = readln().split(" ").map { it.toLong() }
    if (c <= b) {
        println(-1)
        return
    }
    println((a / (c - b)) + 1)
}