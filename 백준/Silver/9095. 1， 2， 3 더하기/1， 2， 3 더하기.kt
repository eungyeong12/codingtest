fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val dp = IntArray(11)
    dp[1] = 1
    dp[2] = 2 // 1 + 1, 2
    dp[3] = 4 // 1 + 1 + 1, 1 + 2, 2 + 1, 3
    for (i in 4..10) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
    }
    
    repeat(t) {
        val n = readLine().toInt()
        println(dp[n])
    }
}