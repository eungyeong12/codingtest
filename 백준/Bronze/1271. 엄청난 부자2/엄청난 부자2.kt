fun main() {
    val (n, m) = readln().split(" ").map { it.toBigInteger() }
    println(n / m)
    println(n % m)
}