fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val sb = StringBuilder()
    repeat(t) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        sb.appendLine(a + b)
    }
    print(sb)
}