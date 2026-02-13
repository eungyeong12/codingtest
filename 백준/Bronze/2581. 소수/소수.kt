fun main() {
    val m = readln().toInt()
    val n = readln().toInt()
    val primes = (m..n).filter { num ->
        num != 1 && (num == 2 ||
        (2 until num).all { num % it != 0 })
    }
    if (primes.isNotEmpty()) println(primes.sum())
    println(if (primes.isEmpty()) -1 else primes.min())
}