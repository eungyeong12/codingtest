fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    val pick = IntArray(m)
    
    fun dfs(depth: Int, start: Int) {
        if (depth == m) {
            for (i in 0 until m) sb.append(pick[i]).append(' ')
            sb.append('\n')
            return
        }
        
        for (num in start..n) {
            pick[depth] = num
            dfs(depth + 1, num)
        }
    }
    
    dfs(0, 1)
    print(sb)
}