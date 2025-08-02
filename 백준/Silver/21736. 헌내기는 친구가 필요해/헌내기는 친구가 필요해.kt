fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = Array(n) { readLine().toCharArray() }
    val visited = Array(n) { BooleanArray(m) }
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    var startX = 0
    var startY = 0
    
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (map[i][j] == 'I') {
                startX = i
                startY = j
            }
        }
    }
    
    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.add(startX to startY)
    visited[startX][startY] = true
    var answer = 0
    
    while (queue.isNotEmpty()) {
        val (x, y) = queue.removeFirst()
        for (dir in 0..3) {
            val nx = x + dx[dir]
            val ny = y + dy[dir]
            if (nx in 0 until n && ny in 0 until m && !visited[nx][ny] && map[nx][ny] != 'X') {
                visited[nx][ny] = true
                if (map[nx][ny] == 'P') answer++
                queue.add(nx to ny)
            }
        }
    }
    
    println(if (answer == 0) "TT" else answer)
}