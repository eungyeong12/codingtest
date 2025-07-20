import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val k = br.readLine().toInt()
    val stack = ArrayDeque<Int>()
    
    repeat(k) {
        val n = br.readLine().toInt()
        if (n == 0) {
            stack.removeLast()
        } else {
            stack.addLast(n)
        }
    }
    
    println(stack.sum())
}