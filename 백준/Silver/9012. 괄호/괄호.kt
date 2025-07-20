import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val sb = StringBuilder()
    repeat(n) {
        val line = br.readLine()
        val stack = ArrayDeque<Char>()
        var isVPS = true
        for (c in line) {
            when (c) {
                '(' -> stack.addLast(c)
                ')' -> {
                    if (stack.isNotEmpty() && stack.last() == '(') {
                        stack.removeLast()
                    } else {
                        isVPS = false
                        break
                    }
                }
            }
        }
        if (stack.isNotEmpty()) isVPS = false
        sb.appendLine(if (isVPS) "YES" else "NO")
    }
    print(sb)
}