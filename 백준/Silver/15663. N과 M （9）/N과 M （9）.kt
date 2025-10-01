fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val nums = readLine().split(" ").map { it.toInt() }.toIntArray()
    nums.sort()
    val visited = BooleanArray(n)
    val result = IntArray(m)
    val sb = StringBuilder()
    
    fun dfs(depth: Int) {
        if (depth == m) {
            result.forEach { sb.append(it).append(" ") }
            sb.append("\n")
            return
        }
        
        var lastUsedNum = 0
        
        for (i in 0 until n) {
            if (visited[i] || nums[i] == lastUsedNum) {
                continue
            }
            
            visited[i] = true
            result[depth] = nums[i]
            lastUsedNum = nums[i]
            dfs(depth + 1)
            visited[i] = false
        }
    }
    
    dfs(0)
    print(sb)
}