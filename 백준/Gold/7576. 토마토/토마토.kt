fun main() = with(System.`in`.bufferedReader()) {
    val (m, n) = readLine().split(" ").map { it.toInt() }
    val box = Array(n) { IntArray(m) }
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    val queue = ArrayDeque<Pair<Int, Int>>()
    var unripe = 0
    
    for (i in 0 until n) {
        val row = readLine().split(" ").map { it.toInt() }
        for (j in 0 until m) {
            box[i][j] = row[j]
            if (box[i][j] == 1) {
                queue.addLast(i to j)
            }
            if (box[i][j] == 0) {
                unripe++
            }
        }
    }
    
    if (unripe == 0) {
        println(0)
        return
    }
    
    var days = 0
    
    while (queue.isNotEmpty()) {
        val (x, y) = queue.removeFirst()
        days = maxOf(days, box[x][y])
        
        for (i in 0..3) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx in 0 until n && ny in 0 until m) {
                if (box[nx][ny] == 0) {
                    box[nx][ny] = box[x][y] + 1
                    queue.addLast(nx to ny)
                    unripe--
                }
            }
        }
    }
    
    if (unripe > 0) println(-1) else println(days - 1)
}