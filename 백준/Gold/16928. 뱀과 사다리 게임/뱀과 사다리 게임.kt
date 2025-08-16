fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    
    val board = mutableMapOf<Int, Int>()
    for (i in 0 until n + m) {
        val (u, v) = readLine().split(" ").map { it.toInt() }
        board[u] = v
    }
    
    val queue = ArrayDeque<Int>()
    val visited = IntArray(101) { 0 }
    
    queue.addLast(1)
    visited[1] = 0
    
    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        
        if (current == 100) {
            println(visited[current])
            return
        }
        
        for (i in 1..6) {
            var next = current + i
            
            if (next > 100) continue
            
            if (board.containsKey(next)) {
                next = board[next]!!
            }
            
            if (visited[next] == 0) {
                visited[next] = visited[current] + 1
                queue.addLast(next)
            }
        }
    }
}