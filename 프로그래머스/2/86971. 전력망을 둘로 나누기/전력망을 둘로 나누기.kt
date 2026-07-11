import java.util.*
import kotlin.math.*

class Solution {
    fun solution(n: Int, wires: Array<IntArray>): Int {
        val graph = Array(n + 1) { mutableListOf<Int>() }
        
        for (wire in wires) {
            val node1 = wire[0]
            val node2 = wire[1]
            
            graph[node1].add(node2)
            graph[node2].add(node1)
        }
        
        var answer = Int.MAX_VALUE
        
        for (wire in wires) {
            val disconnectedNode1 = wire[0]
            val disconnectedNode2 = wire[1]
            
            val visited = BooleanArray(n + 1)
            
            val connectedCount = dfs(
                current = 1,
                graph = graph,
                visited = visited,
                disconnectedNode1 = disconnectedNode1,
                disconnectedNode2 = disconnectedNode2
            )
            
            val otherCount = n - connectedCount
            val difference = abs(connectedCount - otherCount)
            
            answer = min(answer, difference)
        }
        
        return answer
    }
    
    private fun dfs(
        current: Int,
        graph: Array<MutableList<Int>>,
        visited: BooleanArray,
        disconnectedNode1: Int,
        disconnectedNode2: Int
    ): Int {
        visited[current] = true
        
        var count = 1
        
        for (next in graph[current]) {
            val isDisconnectedWire = current == disconnectedNode1 && next == disconnectedNode2 ||
            current == disconnectedNode2 && next == disconnectedNode1
            
            if (isDisconnectedWire) continue
            if (visited[next]) continue
            
            count += dfs(
                current = next,
                graph = graph,
                visited = visited,
                disconnectedNode1 = disconnectedNode1,
                disconnectedNode2 = disconnectedNode2
            )
        }
        
        return count
    }
}