class Solution {
    fun solution(n: Int, costs: Array<IntArray>): Int {
        val parent = IntArray(n) { it }
        
        fun find(i: Int): Int {
            if (parent[i] == i) return i
            parent[i] = find(parent[i])
            return parent[i]
        }
        
        fun union(i: Int, j: Int) {
            val rootI = find(i)
            val rootJ = find(j)
            if (rootI != rootJ) {
                parent[rootJ] = rootI
            }
        }
        
        val sortedCosts = costs.sortedBy { it[2] }
        
        var totalCost = 0
        var edgeCount = 0
        
        for (cost in sortedCosts) {
            val from = cost[0]
            val to = cost[1]
            val weight = cost[2]
            
            if (find(from) != find(to)) {
                union(from, to)
                totalCost += weight
                edgeCount++
                
                if (edgeCount == n - 1) break
            }
        }
        
        return totalCost
    }
}