fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, v) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }
    
    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }
    
    for (adj in graph) adj.sort()
    
    val visitedDfs = BooleanArray(n + 1)
    val visitedBfs = BooleanArray(n + 1)
    val dfsResult = StringBuilder()
    val bfsResult = StringBuilder()
    
    fun dfs(node: Int) {
        visitedDfs[node] = true
        dfsResult.append("$node ")
        for (next in graph[node]) {
            if (!visitedDfs[next]) dfs(next)
        }
    }
    
    fun bfs(start: Int) {
        val queue = ArrayDeque<Int>()
        queue.add(start)
        visitedBfs[start] = true
        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            bfsResult.append("$node ")
            for (next in graph[node]) {
                if (!visitedBfs[next]) {
                    visitedBfs[next] = true
                    queue.addLast(next)
                }
            }
        }
    }
    
    dfs(v)
    bfs(v)
    println(dfsResult.toString().trim())
    println(bfsResult.toString().trim())
}