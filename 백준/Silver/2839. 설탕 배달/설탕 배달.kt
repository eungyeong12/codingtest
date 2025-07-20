import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val dp = IntArray(n + 1) { 5000 }
    dp[0] = 0
    for (i in 1..n) {
        if (i >= 3) dp[i] = minOf(dp[i], dp[i - 3] + 1)
        if (i >= 5) dp[i] = minOf(dp[i], dp[i - 5] + 1)
    }
    println(if (dp[n] >= 5000) -1 else dp[n])
}