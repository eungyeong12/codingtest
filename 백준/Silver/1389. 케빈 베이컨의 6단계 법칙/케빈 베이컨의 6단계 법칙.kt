fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val INF = 10000
    val dist = Array(n + 1) { IntArray(n + 1) { INF } }
    
    for (i in 1..n) dist[i][i] = 0 // 자기 자신까지의 거리는 0
    
    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        dist[a][b] = 1
        dist[b][a] = 1
    }
    
    for (k in 1..n) {
        for (i in 1..n) {
            for (j in 1..n) {
                if(dist[i][j] > dist[i][k] + dist[k][j]) {
                    dist[i][j] = dist[i][k] + dist[k][j]
                }
            }
        }
    }
    
    var answer = 0
    var minSum = Int.MAX_VALUE
    for (i in 1..n) {
        val sum = dist[i].slice(1..n).sum()
        if (sum < minSum) {
            minSum = sum
            answer = i
        }
    }
    println(answer)
}