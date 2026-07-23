class Solution {
    fun solution(n: Int, times: IntArray): Long {
        times.sort()
        
        var start = 1L
        var end = times.last().toLong() * n
        var answer = end
        
        while (start <= end) {
            val mid = (start + end) / 2
            var totalAudited = 0L
            
            for (time in times) {
                totalAudited += mid / time
                
                if (totalAudited >= n) break
            }
            
            if (totalAudited >= n) {
                answer = mid
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
        
        return answer
    }
}