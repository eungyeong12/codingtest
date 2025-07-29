fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(n + 1)
    
    repeat(m) {
        val (u, v) = readLine().split(" ").map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }
    
    fun dfs(node: Int) {
        visited[node] = true
        for (next in graph[node]) {
            if (!visited[next]) dfs(next)
        }
    }
    
    var count = 0
    for (i in 1..n) {
        if (!visited[i]) {
            dfs(i)
            count++
        }
    }
    
    println(count)
}