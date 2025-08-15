fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val grid = Array(n) { readLine().toCharArray() }
    
    val weakGrid = Array(n) { i ->
        CharArray(n) { j -> if(grid[i][j] == 'G') 'R' else grid[i][j] }
    }
    
    val visitedNormal = Array(n) { BooleanArray(n) }
    val visitedWeak = Array(n) { BooleanArray(n) }
    
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    
    var normalCnt = 0
    var weakCnt = 0
    
    fun bfs(sx: Int, sy: Int, g: Array<CharArray>, visited: Array<BooleanArray>) {
        val queue = ArrayDeque<Pair<Int, Int>>()
        val color = g[sx][sy]
        visited[sx][sy] = true
        queue.addLast(sx to sy)
        
        while (queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()
            for (d in 0 until 4) {
                val nx = x + dx[d]
                val ny = y + dy[d]
                if (nx !in 0 until n || ny !in 0 until n) continue
                if (!visited[nx][ny] && g[nx][ny] == color) {
                    visited[nx][ny] = true
                    queue.addLast(nx to ny)
                }
            }
        }
    }
    
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!visitedNormal[i][j]) {
                bfs(i, j, grid, visitedNormal)
                normalCnt++
            }
            if (!visitedWeak[i][j]) {
                bfs(i, j, weakGrid, visitedWeak)
                weakCnt++
            }
        }
    }
    
    println("$normalCnt $weakCnt")
}