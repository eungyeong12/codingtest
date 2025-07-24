fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val dp = LongArray(101)
    dp[1] = 1L
    dp[2] = 1L
    for (i in 3..100) {
        dp[i] = dp[i - 3] + dp[i - 2]
    }
    repeat(t) {
        val n = readLine().toInt()
        println(dp[n])
    }
}