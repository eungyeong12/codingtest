fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = Array(n) { readLine().toCharArray().map { it - '0' }.toIntArray() }
    val visited = Array(n) { BooleanArray(m) }
    val dx = intArrayOf(-1, 1, 0, 0)
    val dy = intArrayOf(0, 0, -1, 1)
    
    val queue = ArrayDeque<Triple<Int, Int, Int>>() // (x, y, 거리)
    queue.add(Triple(0, 0, 1))
    visited[0][0] = true
    
    while (queue.isNotEmpty()) {
        val (x, y, dist) = queue.removeFirst()
        
        if (x == n - 1 && y == m - 1) {
            println(dist)
            return
        }
        
        for (d in 0..3) {
            val nx = x + dx[d]
            val ny = y + dy[d]
            
            if (nx in 0 until n && ny in 0 until m) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    queue.add(Triple(nx, ny, dist + 1))
                    visited[nx][ny] = true
                }
            }
        }
    }
}