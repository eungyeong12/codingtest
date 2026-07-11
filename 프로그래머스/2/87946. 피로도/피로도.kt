class Solution {
    var answer = 0
    
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        val visited = BooleanArray(dungeons.size)
        
        explore(
            currentFatigue = k,
            count = 0,
            dungeons = dungeons,
            visited = visited
        )
        
        return answer
    }
    
    private fun explore(
        currentFatigue: Int,
        count: Int,
        dungeons: Array<IntArray>,
        visited: BooleanArray
    ) {
        answer = maxOf(answer, count)
        
        for (index in dungeons.indices) {
            if (visited[index]) continue
            
            val requiredFatigue = dungeons[index][0]
            val consumedFatigue = dungeons[index][1]
            
            if (currentFatigue < requiredFatigue) continue
            
            visited[index] = true
            
            explore(
                currentFatigue = currentFatigue - consumedFatigue,
                count = count + 1,
                dungeons = dungeons,
                visited = visited
            )
            
            visited[index] = false
        }
    }
}