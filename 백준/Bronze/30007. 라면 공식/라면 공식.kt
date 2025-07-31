fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val (a, b, x) = readLine().split(" ").map { it.toInt() }
        println(a * (x - 1) + b)
    }
}