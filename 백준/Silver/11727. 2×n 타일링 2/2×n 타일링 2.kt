fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(1001)
    dp[1] = 1
    dp[2] = 3
    for (i in 3..1000) {
        dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007
    }
    println(dp[n])
}