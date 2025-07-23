fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt() // 컴퓨터 수
    val m = readLine().toInt() // 연결 수
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(n + 1)
    
    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }
    
    var count = 0
    
    fun dfs(node: Int) {
        visited[node] = true
        for (next in graph[node]) {
            if (!visited[next]) {
                count++
                dfs(next)
            }
        }
    }
    
    dfs(1)
    println(count)
}