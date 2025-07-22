fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    val map = HashMap<String, String>()
    repeat(n) {
        val (site, password) = readLine().split(" ")
        map.put(site, password)
    }
    repeat(m) {
        sb.appendLine(map[readLine()])
    }
    print(sb)
}