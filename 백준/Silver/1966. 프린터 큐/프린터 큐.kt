fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    repeat(t) {
        val (n, m) = readLine().split(" ").map { it.toInt() }
        val priorities = readLine().split(" ").map { it.toInt() }
        val queue = ArrayDeque<Pair<Int, Int>>()
        for (i in 0 until n) {
            queue.addLast(i to priorities[i])
        }
        var count = 0
        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            if (queue.any { it.second > current.second }) {
                queue.addLast(current)
            } else {
                count++
                if (current.first == m) {
                    println(count)
                    break
                }
            }
        }
    }
}