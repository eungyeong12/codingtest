fun main() {
    val arr = BooleanArray(10001)
    for (i in 1..10000) {
        val n = d(i)
        if (n <= 10000) arr[n] = true
    }
    println(
        (1..10000)
            .filter { !arr[it] }
            .joinToString("\n")
    )
}

fun d(n: Int) = n + n.toString().sumOf { it - '0' }