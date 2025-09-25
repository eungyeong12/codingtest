fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val a = readLine().split(" ").map { it.toInt() }.toIntArray()
    
    // dp[i]: a[i]를 마지막 원소로 가지는 가장 긴 증가하는 부분 수열의 길이
    val dp = IntArray(n) { 1 }
    
    for (i in 1 until n) {
        for (j in 0 until i) {
            if (a[j] < a[i]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }
    
    println(dp.maxOrNull()!!)
}