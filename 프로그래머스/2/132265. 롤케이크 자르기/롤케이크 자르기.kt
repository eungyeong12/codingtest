class Solution {
    fun solution(topping: IntArray): Int {
        var answer = 0
        
        val rightCounts = IntArray(10001)
        val leftCounts = IntArray(10001)
        
        var rightUnique = 0
        var leftUnique = 0
        
        for (t in topping) {
            if (rightCounts[t] == 0) {
                rightUnique++
            }
            rightCounts[t]++
        }
        
        for (t in topping) {
            rightCounts[t]--
            if (rightCounts[t] == 0) {
                rightUnique--
            }
            if (leftCounts[t] == 0) {
                leftUnique++
            }
            leftCounts[t]++
            
            if (leftUnique == rightUnique) {
                answer++
            }
        }
        
        return answer
    }
}