fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val graph = Array(n + 1) { ArrayList<Int>() }
    repeat(n - 1) {
        val (u, v) = readLine().split(" ").map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }
    
    val parents = IntArray(n + 1)
    val visited = BooleanArray(n + 1)
    
    val queue = ArrayDeque<Int>()
    queue.add(1)
    visited[1] = true
    
    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        
        for (neighbor in graph[current]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true
                parents[neighbor] = current
                queue.add(neighbor)
            }
        }
    }
    
    val sb = StringBuilder()
    for (i in 2..n) {
        sb.appendLine(parents[i])
    }
    print(sb)
}