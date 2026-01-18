fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val basket = MutableList(n + 1) { 0 }
    repeat(m) {
        val (i, j, k) = readln().split(" ").map { it.toInt() }
        for (index in i..j) {
            basket[index] = k
        }
    }
    println(basket.drop(1).joinToString(" "))
}