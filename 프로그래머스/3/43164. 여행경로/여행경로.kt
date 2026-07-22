class Solution {
    fun solution(tickets: Array<Array<String>>): Array<String> {
        val sortedTickets = tickets.sortedBy { it[1] }
        val visited = BooleanArray(tickets.size)
        val path = ArrayList<String>()
        
        fun dfs(current: String, count: Int): Boolean {
            path.add(current)
            
            if (count == tickets.size) {
                return true
            }
            
            for (i in sortedTickets.indices) {
                if (!visited[i] && sortedTickets[i][0] == current) {
                    visited[i] = true
                    if (dfs(sortedTickets[i][1], count + 1)) return true
                    visited[i] = false
                }
            }
            
            path.removeAt(path.size - 1)
            return false
        }
        
        dfs("ICN", 0)
        return path.toTypedArray()
    }
}