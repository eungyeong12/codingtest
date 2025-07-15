fun factorial(n: Int): Int {
    var res = 1
    for (i in 2..n) res *= i
    return res
}

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val result = factorial(n) / (factorial(k) * factorial(n - k))
    println(result)
}