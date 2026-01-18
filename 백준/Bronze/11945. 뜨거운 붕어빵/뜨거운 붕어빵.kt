fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    repeat(n) {
        println(readln().reversed())
    }
}