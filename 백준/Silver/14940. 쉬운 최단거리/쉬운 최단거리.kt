fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = Array(n) { readLine().split(" ").map { it.toInt() } }
    val dist = Array(n) { IntArray(m) { -1 } }
    var sx = -1
    var sy = -1
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (map[i][j] == 2) {
                sx = i
                sy = j
            }
        }
    }
    
    val q = ArrayDeque<Pair<Int, Int>>()
    
    dist[sx][sy] = 0
    q.addLast(sx to sy)
    
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    
    while (q.isNotEmpty()) {
        val (x, y) = q.removeFirst()
        for (d in 0 until 4) {
            val nx = x + dx[d]
            val ny = y + dy[d]
            if (nx !in 0 until n || ny !in 0 until m) continue
            if (map[nx][ny] == 0) continue
            if (dist[nx][ny] != -1) continue
            dist[nx][ny] = dist[x][y] + 1
            q.addLast(nx to ny)
        }
    }
    
    val sb = StringBuilder()
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (map[i][j] == 0) sb.append(0)
            else sb.append(dist[i][j])
            if (j + 1 < m) sb.append(' ')
        }
        sb.append('\n')
    }
    print(sb)
}