fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    val sb = StringBuilder()
    
    repeat(t) {
        val (m, n, k) = readLine().split(" ").map { it.toInt() }
        val map = Array(n) { IntArray(m) }
        val visited = Array(n) { BooleanArray(m) }
        repeat(k) {
            val (x, y) = readLine().split(" ").map { it.toInt() }
            map[y][x] = 1
        }
        
        fun dfs(y: Int, x: Int) {
            visited[y][x] = true
            for (d in 0 until 4) {
                val ny = y + dy[d]
                val nx = x + dx[d]
                if (ny in 0 until n && nx in 0 until m && map[ny][nx] == 1 && !visited[ny][nx]) {
                    dfs(ny, nx)
                }
            }
        }
        
        var count = 0
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j)
                    count++
                }
            }
        }
        sb.appendLine(count)
    }
    println(sb)
}