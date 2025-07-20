import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val n = br.readLine().toInt()
    val queue = ArrayDeque<Int>()

    repeat(n) {
        val input = br.readLine().split(" ")
        when (input[0]) {
            "push" -> queue.addFirst(input[1].toInt())
            "pop" -> sb.appendLine(if (queue.isEmpty()) -1 else queue.removeLast())
            "size" -> sb.appendLine(queue.size)
            "empty" -> sb.appendLine(if (queue.isEmpty()) 1 else 0)
            "front" -> sb.appendLine(if (queue.isEmpty()) -1 else queue.last())
            "back" -> sb.appendLine(if (queue.isEmpty()) -1 else queue.first())
        }
    }

    print(sb)
}