class Solution {
    fun solution(n: Int): Long {
        if (n == 1) return 1L
        if (n == 2) return 2L
        
        var prev2 = 1L
        var prev1 = 2L
        var current = 0L
        
        for (i in 3..n) {
            current = (prev1 + prev2) % 1234567L
            
            prev2 = prev1
            prev1 = current
        }
        
        return current 
    }
}