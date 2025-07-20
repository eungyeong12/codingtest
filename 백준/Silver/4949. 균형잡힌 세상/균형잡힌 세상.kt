import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    
    while (true) {
        val line = br.readLine()
        if (line == ".") break
        
        val stack = ArrayDeque<Char>()
        var isBalanced = true
        
        for(c in line) {
            when (c) {
                '(', '[' -> stack.addLast(c)
                ')' -> {
                    if (stack.isNotEmpty() && stack.last() == '(') {
                        stack.removeLast()
                    } else {
                        isBalanced = false
                        break
                    }
                }
                ']' -> {
                    if (stack.isNotEmpty() && stack.last() == '[') {
                        stack.removeLast()
                    } else {
                        isBalanced = false
                        break
                    }
                }
            }
        }
        
        if (stack.isNotEmpty()) isBalanced = false
        sb.appendLine(if (isBalanced) "yes" else "no")
    }
    print(sb)
}