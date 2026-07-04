import java.util.*

class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        val sortedJobs = jobs.sortedBy { it[0] }

        val waitingQueue = PriorityQueue<IntArray>(compareBy { it[1] })

        var currentTime = 0
        var jobIndex = 0
        var totalTurnaroundTime = 0
        var completedCount = 0

        while (completedCount < jobs.size) {
            while (jobIndex < sortedJobs.size && sortedJobs[jobIndex][0] <= currentTime) {
                waitingQueue.add(sortedJobs[jobIndex])
                jobIndex++
            }

            if (waitingQueue.isNotEmpty()) {
                val job = waitingQueue.poll()

                val requestTime = job[0]
                val duration = job[1]

                currentTime += duration
                totalTurnaroundTime += currentTime - requestTime
                completedCount++
            } else {
                currentTime = sortedJobs[jobIndex][0]
            }
        }

        return totalTurnaroundTime / jobs.size
    }
}