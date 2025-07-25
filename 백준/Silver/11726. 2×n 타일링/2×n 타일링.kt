fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(10001)
    dp[1] = 1
    dp[2] = 2 
    for(i in 3..1001) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % 10007
    }
    println(dp[n])
}