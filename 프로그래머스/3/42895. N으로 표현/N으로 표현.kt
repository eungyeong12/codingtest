class Solution {
    fun solution(N: Int, number: Int): Int {
        if (N == number) return 1
        
        val dp = Array(9) { mutableSetOf<Int>() }
        
        var baseNum = 0
        for (i in 1..8) {
            baseNum = baseNum * 10 + N
            dp[i].add(baseNum)
        }
        
        for (i in 1..8) {
            for (j in 1 until i) {
                for (op1 in dp[j]) {
                    for (op2 in dp[i - j]) {
                        dp[i].add(op1 + op2)
                        dp[i].add(op1 - op2)
                        dp[i].add(op1 * op2)
                        if (op2 != 0) dp[i].add(op1 / op2)
                    }
                }
            }
            
            if (dp[i].contains(number)) {
                return i
            }
        }
        
        return -1
    }
}