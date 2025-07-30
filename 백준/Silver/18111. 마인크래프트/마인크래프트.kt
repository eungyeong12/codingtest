fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, b) = readLine().split(" ").map { it.toInt() }
    val ground = Array(n) { readLine().split(" ").map { it.toInt() }}
    var minTime = Int.MAX_VALUE
    var resultHeight = 0
    
    for (target in 0..256) { // 모든 가능한 땅의 높이(0~256)
        var remove = 0
        var add = 0
        for (i in 0 until n) {
            for (j in 0 until m) {
                val diff = ground[i][j] - target
                if (diff > 0) remove += diff // 높이가 더 높으면 제거
                else add -= diff // 높이가 더 낮으면 추가
            }
        }
        if (remove + b >= add) { // 인벤토리 + 제거한 블록이 필요한 블록보다 많아야 함
            val time = remove * 2 + add
            if (time < minTime || (time == minTime && target > resultHeight)) {
                minTime = time
                resultHeight = target
            }
        }
    }
    println("$minTime $resultHeight")
}