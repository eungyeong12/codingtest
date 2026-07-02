class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        val queue = ArrayDeque<Pair<Int, Int>>()
        
        priorities.forEachIndexed { index, priority ->
            queue.addLast(index to priority)
        }
        
        var executionOrder = 0
        
        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            
            val hasHigherPriority = queue.any { it.second > current.second }
            
            if (hasHigherPriority) {
                queue.addLast(current)
            } else {
                executionOrder++
                
                if (current.first == location) {
                    return executionOrder
                }
            }
        }
        
        return executionOrder
    }
}