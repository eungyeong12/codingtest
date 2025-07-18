import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val board = Array(n) { br.readLine().toCharArray() }
    var minPaint = Int.MAX_VALUE
    
    for (i in 0..(n - 8)) {
        for (j in 0..(m - 8)) {
            var countW = 0 // 'W'로 시작
            var countB = 0 // 'B'로 시작
            
            for (x in 0 until 8) {
                for (y in 0 until 8) {
                    val current = board[i + x][j + y]
                    val expectedW = if ((x + y) % 2 == 0) 'W' else 'B'
                    val expectedB = if ((x + y) % 2 == 0) 'B' else 'W'
                    if (current != expectedW) countW++
                    if (current != expectedB) countB++
                }
            }
            minPaint = minOf(minPaint, countW, countB)
        }
    }
    println(minPaint)
}