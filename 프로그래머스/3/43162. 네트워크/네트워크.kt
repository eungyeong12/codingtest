class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        val visited = BooleanArray(n)
        
        for (i in 0 until n) {
            if (!visited[i]) {
                dfs(i, computers, visited)
                answer++
            }
        }
        
        return answer
    }
    
    private fun dfs(index: Int, computers: Array<IntArray>, visited: BooleanArray) {
        visited[index] = true
        
        for (i in computers.indices) {
            if (computers[index][i] == 1 && !visited[i]) {
                dfs(i, computers, visited)
            }
        }
    }
}