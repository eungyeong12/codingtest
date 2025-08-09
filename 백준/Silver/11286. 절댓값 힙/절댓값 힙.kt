import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pq = PriorityQueue<Int> { a, b ->
        val absA = kotlin.math.abs(a)
        val absB = kotlin.math.abs(b)
        if (absA == absB) a - b else absA - absB
    }
    
    val sb = StringBuilder()
    
    repeat(n) {
        val x = readLine().toInt()
        if (x == 0) {
            if (pq.isEmpty()) sb.appendLine(0)
            else sb.appendLine(pq.poll())
        } else {
            pq.offer(x)
        }
    }
    
    print(sb)
}