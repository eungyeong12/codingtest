fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val t = readLine().toInt()
    val dp = Array(41) { IntArray(2) }
    // dp[i][0]: fibonacci(i)에서 0이 출력되는 횟수
    // dp[i][1]: fibonacci(i)에서 1이 출력되는 횟수
    
    dp[0][0] = 1
    dp[0][1] = 0
    dp[1][0] = 0
    dp[1][1] = 1
    
    for (i in 2..40) {
        dp[i][0] = dp[i - 1][0] + dp[i - 2][0]
        dp[i][1] = dp[i - 1][1] + dp[i - 2][1]
    }
    
    repeat(t) {
        val n = readLine().toInt()
        sb.appendLine("${dp[n][0]} ${dp[n][1]}")
    }
    
    print(sb)
}