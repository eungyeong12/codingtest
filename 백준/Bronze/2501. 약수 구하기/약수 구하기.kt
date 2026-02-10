fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val divisors = (1..n).filter { n % it == 0 }
    println(if (divisors.size >= k) divisors[k - 1] else 0)
}
