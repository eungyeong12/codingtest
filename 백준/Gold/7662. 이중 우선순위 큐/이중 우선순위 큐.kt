import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    repeat(t) {
        val k = readLine().toInt()
        val map = TreeMap<Int, Int>()
        repeat(k) {
            val (command, numStr) = readLine().split(" ")
            val num = numStr.toInt()
            when (command) {
                "I" -> map[num] = (map[num] ?: 0) + 1
                "D" -> if (map.isNotEmpty()) {
                    val e = if (num == 1) map.lastEntry() else map.firstEntry()
                    val cnt = e.value
                    if (cnt == 1) map.remove(e.key) else map[e.key] = cnt - 1
                }
            }
        }
        if (map.isEmpty()) println("EMPTY")
        else println("${map.lastKey()} ${map.firstKey()}")
    }
}