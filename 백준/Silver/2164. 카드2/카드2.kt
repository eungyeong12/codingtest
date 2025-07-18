import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val queue = ArrayDeque<Int>((1..n).toList())
    while (queue.size > 1) {
        queue.removeFirst()
        queue.addLast(queue.removeFirst())
    }
    println(queue.first())
}