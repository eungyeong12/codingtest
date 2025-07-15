fun main() {
    val t = readln().toInt()
    repeat(t) {
        val k = readln().toInt()
        val n = readln().toInt()
        val apt = Array(k + 1) { IntArray(n + 1) }
        
        // 0층 초기화
        for (i in 1..n) {
            apt[0][i] = i
        }
        // 1층부터 k층까지
        for (floor in 1..k) {
            for (room in 1..n) {
                apt[floor][room] = apt[floor][room - 1] + apt[floor - 1][room]
            }
        }
        println(apt[k][n])
    }
}