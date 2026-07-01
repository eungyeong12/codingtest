class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        
        val days = progresses.indices.map { index ->
            val remaining = 100 - progresses[index]
            val speed = speeds[index]
            
            (remaining + speed - 1) / speed
        }
        
        var currentDeployDay = days[0]
        var count = 1
        
        for (i in 1 until days.size) {
            if (days[i] <= currentDeployDay) {
                count++
            } else {
                answer.add(count)
                currentDeployDay = days[i]
                count = 1
            }
        }
        
        answer.add(count)
        
        return answer.toIntArray()
    }
}