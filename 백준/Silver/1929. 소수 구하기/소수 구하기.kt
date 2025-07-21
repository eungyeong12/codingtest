import java.io.*

fun main() = with(System.`in`.bufferedReader()) {
    val (m, n) = readLine().split(" ").map { it.toInt() }
    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false
    isPrime[1] = false
    
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (isPrime[i]) {
            var j = i * i
            while (j <= n) {
                isPrime[j] = false
                j += i
            }
        }
    }
    
    val sb = StringBuilder()
    for (i in m..n) {
        if (isPrime[i]) {
            sb.appendLine(i)
        }
    }
    print(sb)
}