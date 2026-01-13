fun main() {
    val n = readln().toInt()
    println(factorial(n))
}

fun factorial(n: Int): Long {
    if (n == 0) return 1
    return n * factorial(n - 1)
}