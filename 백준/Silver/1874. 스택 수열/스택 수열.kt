fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val seq = IntArray(n) { readLine().toInt() }
    val sb = StringBuilder()
    val stack = ArrayDeque<Int>()
    var current = 1
    var isPossible = true
    for (target in seq) {
        while (current <= target) {
            stack.addLast(current++)
            sb.appendLine('+')
        }
        if (stack.last() == target) {
            stack.removeLast()
            sb.appendLine('-')
        } else {
            isPossible = false
            break
        }
    }
    if (isPossible) {
        print(sb)
    } else {
        println("NO")
    }
}