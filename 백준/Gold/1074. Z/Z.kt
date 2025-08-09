fun z(n: Int, r: Int, c: Int): Int {
    if (n == 0) return 0
    val half = 1 shl (n - 1)
    val area = half * half
    return when {
        r < half && c < half -> z(n - 1, r, c) // 0사분면
        r < half && c >= half -> area + z(n - 1, r, c - half) // 1사분면
        r >= half && c < half -> 2 * area + z(n - 1, r - half, c) // 2사분면
        else -> 3 * area + z(n - 1, r - half, c - half)
    }
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, r, c) = readLine().split(" ").map { it.toInt() }
    println(z(n, r, c))
}