lateinit var paper: Array<List<Int>>
lateinit var visited: Array<BooleanArray>
var N = 0
var M = 0
var max = 0

val dy = intArrayOf(-1, 1, 0, 0)
val dx = intArrayOf(0, 0, -1, 1)

fun main() = with(System.`in`.bufferedReader()) {
    val (_N, _M) = readLine().split(" "). map { it.toInt() }
    N = _N
    M = _M
    
    paper = Array(N) { readLine().split(" ").map { it.toInt() } }
    visited = Array(N) { BooleanArray(M) }
    
    for (i in 0 until N) {
	    for (j in 0 until M) {
		    visited[i][j] = true
		    dfs(i, j, 1, paper[i][j])
		    visited[i][j] = false
		    checkExceptionShape(i, j)
		  }
		}
		println(max)
}

fun dfs(y: Int, x: Int, depth: Int, sum: Int) {
	if (depth == 4) {
		max = maxOf(max, sum)
		return
	}
	
	for (i in 0..3) {
		val ny = y + dy[i]
		val nx = x + dx[i]
		
		if (ny in 0 until N && nx in 0 until M && !visited[ny][nx]) {
			visited[ny][nx] = true
			dfs(ny, nx, depth + 1, sum + paper[ny][nx])
			visited[ny][nx] = false // 백트래킹
		}
	}
}

fun checkExceptionShape(y: Int, x: Int) {
	// 'ㅗ' 모양
	if (y >= 1 && x >= 1 && x < M - 1) {
		max = maxOf(max, paper[y][x] + paper[y - 1][x] + paper[y][x - 1] + paper[y][x + 1])
	}
	// 'ㅜ' 모양
	if (y < N - 1 && x >= 1 && x < M - 1) {
		max = maxOf(max, paper[y][x] + paper[y + 1][x] + paper[y][x - 1] + paper[y][x + 1])
	}
	// 'ㅏ' 모양
	if (y >= 1 && y < N - 1 && x < M - 1) {
		max = maxOf(max, paper[y][x] + paper[y - 1][x] + paper[y + 1][x] + paper[y][x + 1])
	}
	// 'ㅓ' 모양
	if (y >= 1 && y < N - 1 && x >= 1) {
		max = maxOf(max, paper[y][x] + paper[y - 1][x] + paper[y + 1][x] + paper[y][x - 1])
	}
}