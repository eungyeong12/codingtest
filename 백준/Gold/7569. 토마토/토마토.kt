fun main() = with(System.`in`.bufferedReader()) {
    val (m, n, h) = readLine().split(" ").map { it.toInt() }
    val box = Array(h) { Array(n) { IntArray(m) } }
    val queue = ArrayDeque<Triple<Int, Int, Int>>()
    
    var unripe = 0
    
    for (k in 0 until h) {
        for (i in 0 until n) {
            val row = readLine().split(" ").map { it.toInt() }
            for (j in 0 until m) {
                box[k][i][j] = row[j]
                if (row[j] == 1) {
                    queue.addLast(Triple(k, i, j))
                } else if (row[j] == 0) {
                    unripe++
                }
            }
        }
    }
    
    // 처음부터 모든 토마토가 익어있는 경우
    if (unripe == 0) {
        println(0)
        return
    }
    
    val dh = intArrayOf(1, -1, 0, 0, 0, 0) 
    val dn = intArrayOf(0, 0, 1, -1, 0, 0)
    val dm = intArrayOf(0, 0, 0, 0, 1, -1)
    
    var days = 0
    
    while (queue.isNotEmpty()) {
        val (ch, cn, cm) = queue.removeFirst()
        
        // 현재 위치의 일수 갱신
        days = maxOf(days, box[ch][cn][cm])
        
        for (i in 0 until 6) {
            val nh = ch + dh[i]
            val nn = cn + dn[i]
            val nm = cm + dm[i]
            
            if (nh in 0 until h && nn in 0 until n && nm in 0 until m) {
                // 익지 않은 토마토인 경우
                if (box[nh][nn][nm] == 0) {
                    box[nh][nn][nm] = box[ch][cn][cm] + 1
                    queue.add(Triple(nh, nn, nm))
                    unripe--
                }
            }
        }
    }
    
    // 익지 않은 토마토가 남아있는지 확인
    if (unripe > 0) {
        println(-1)
    } else {
        println(days - 1)
    }
}