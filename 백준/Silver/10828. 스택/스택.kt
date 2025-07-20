import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val sb = StringBuilder()
    val stack = ArrayDeque<Int>()
    
    repeat(n) {
        val input = br.readLine().split(" ")
        when (input[0]) {
            "push" -> stack.addLast(input[1].toInt())
            "top" -> sb.appendLine(if (stack.isEmpty()) -1 else stack.last())
            "size" -> sb.appendLine(stack.size)
            "pop" -> sb.appendLine(if (stack.isEmpty()) -1 else stack.removeLast())
            "empty" -> sb.appendLine(if (stack.isEmpty()) 1 else 0)        
        }
    }
    
    print(sb)
}