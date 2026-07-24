class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val countMap = HashMap<Int, Int>()
        for (size in tangerine) {
            countMap[size] = countMap.getOrDefault(size, 0) + 1
        }
        
        val sortedCounts = countMap.values.sortedDescending()
        
        var answer = 0
        var totalSelected = 0
        
        for (count in sortedCounts) {
            totalSelected += count
            answer++
            
            if (totalSelected >= k) {
                break
            }
        }
        
        return answer
    }
}