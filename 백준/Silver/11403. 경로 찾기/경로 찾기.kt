fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val graph = Array(n) { readLine().split(" ").map { it.toInt() }.toMutableList() }
    
    // 경유지 k를 통해 i -> j 경로가 생기면 1로 갱신
    for (k in 0 until n) {
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (graph[i][k] == 1 && graph[k][j] == 1) graph[i][j] = 1
            }
        }
    }
    
    val sb = StringBuilder()
    for (i in 0 until n) {
        for (j in 0 until n) sb.append(graph[i][j]).append(' ')
        sb.append('\n')
    }
    print(sb)
}