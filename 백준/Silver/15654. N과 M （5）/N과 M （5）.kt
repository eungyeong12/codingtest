fun main() = with(System.`in`.bufferedReader()) {
	val (n, m) = readLine().split(" ").map { it.toInt() }
	val result = IntArray(m)
	val visited = BooleanArray(n)
	val nums = readLine().split(" ").map { it.toInt() }.toIntArray()
	val sb = StringBuilder()
	
	nums.sort()
	
	fun dfs(depth: Int) {
		// 재귀 종료 조건
		if (depth == m) {
			result.forEach { sb.append(it).append(" ") }
			sb.append("\n")
			return
		}
	
		// 재귀 호출
		for (i in 0 until n) {
			// 아직 사용하지 않은 숫자라면
			if (!visited[i]) {
				visited[i] = true // i번째 숫자 사용
				result[depth] = nums[i] // 현재 깊이에 i번째 숫자 추가
				dfs(depth + 1) // 다음 깊이로 탐색 진행
				visited[i] = false // 탐색이 끝난 후, 다른 경우를 위해 백트래킹
			}
		}
	}
	
	dfs(0)
	print(sb)
}