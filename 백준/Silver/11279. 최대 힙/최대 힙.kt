import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pq = PriorityQueue<Int>(compareByDescending { it })
    val sb = StringBuilder()
    repeat(n) {
        val x = readLine().toInt()
        if (x > 0) {
            pq.add(x)
        } else {
            sb.appendLine(if (pq.isEmpty()) 0 else pq.poll())
        }
    }
    print(sb)
}