fun main() = with(System.`in`.bufferedReader()) {
    val (k, n) = readLine().split(" ").map { it.toInt() }
    val cables = IntArray(k) { readLine().toInt() }

    var left = 1L
    var right = cables.maxOrNull()!!.toLong()
    var answer = 0L
    
    while (left <= right) {
        val mid = (left + right) / 2
        var count = 0L
        
        for (cable in cables) {
            count += cable / mid
        }
        
        if (count >= n) {
            answer = mid // 길이를 더 늘릴 수 있음
            left = mid + 1
        } else {
            right = mid - 1 // 길이를 줄여야 함
        }
    }
    println(answer)
}