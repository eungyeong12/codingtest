fun main() {
    val (k, n, m) = readln().split(" ").map { it.toInt() }
    val amount = k * n - m
    println(if (amount >= 0) amount else 0)
}
