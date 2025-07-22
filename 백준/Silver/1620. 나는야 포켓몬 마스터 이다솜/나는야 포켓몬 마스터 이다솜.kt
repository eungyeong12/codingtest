fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    val map = mutableMapOf<String, Int>()
    val arr = Array(n + 1) { "" }
    for (i in 1..n) {
        val name = readLine()
        map.put(name, i)
        arr[i] = name
    }
    repeat(m) {
        val query = readLine()
        if (query[0].isDigit()) {
            sb.appendLine(arr[query.toInt()])
        } else {
            sb.appendLine(map[query])
        }
    }
    print(sb)
}