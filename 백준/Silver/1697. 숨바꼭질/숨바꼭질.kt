fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val max = 100001
    
    val visited = BooleanArray(max)
    val queue = ArrayDeque<Pair<Int, Int>>()
    
    queue.add(Pair(n, 0))
    visited[n] = true
    
    while (queue.isNotEmpty()) {
        val (pos, time) = queue.removeFirst()
        if (pos == k) {
            println(time)
            return
        }
        
        for (next in listOf(pos - 1, pos + 1, pos * 2)) {
            if (next in 0 until max && !visited[next]) {
                queue.add(Pair(next, time + 1))
                visited[next] = true
            }
        }
    }
}