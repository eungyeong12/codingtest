fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = Array(n) { readLine().trim().toCharArray().map { it - '0' }.toIntArray() }
    val visited = Array(n) { BooleanArray(n) }
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    
    fun bfs(sx: Int, sy: Int): Int {
        val q = ArrayDeque<Pair<Int, Int>>()
        q.addLast(sx to sy)
        visited[sx][sy] = true
        var cnt = 0
        
        while (q.isNotEmpty()) {
            val (x, y) = q.removeFirst()
            cnt++
            for (d in 0 until 4) {
                val nx = x + dx[d]
                val ny = y + dy[d]
                if (nx !in 0 until n || ny !in 0 until n) continue
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    visited[nx][ny] = true
                    q.addLast(nx to ny)
                }
            }
        }
        return cnt
    }
    
    val sizes = mutableListOf<Int>()
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (map[i][j] == 1 && !visited[i][j]) {
                sizes.add(bfs(i, j))
            }
        }
    }
    
    sizes.sort()
    val sb = StringBuilder()
    sb.appendLine(sizes.size)
    for (s in sizes) sb.appendLine(s)
    print(sb)
}