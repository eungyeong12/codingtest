fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val scores = IntArray(n + 1)
    val dp = IntArray(n + 1) 
    for (i in 1..n) {
        scores[i] = readLine().toInt()
    }
    if (n >= 1) {
        dp[1] = scores[1]
    }
    if (n >= 2) {
        dp[2] = scores[1] + scores[2]
    }
    
    for (i in 3..n) {
        dp[i] = maxOf(
            dp[i - 2] + scores[i],
            dp[i - 3] + scores[i - 1] + scores[i]
        )
    }
    println(dp[n])
}