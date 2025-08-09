fun main() = with(System.`in`.bufferedReader()) {
    val (n0, r0, c0) = readLine().split(" ").map { it.toInt() }
    var n = n0
    var r = r0
    var c = c0
    var ans = 0
    
    while (n > 0) {
        val half = 1 shl (n - 1) // 한 변의 절반
        val area = half * half // 사분면 하나의 칸 수 
        
        when {
            r < half && c < half -> { // 0사분면
                // r, c 그대로
            }
            r < half && c >= half -> { // 1사분면
                ans += area
                c -= half
            }
            r >= half && c < half -> { // 2사분면
                ans += 2 * area
                r -= half
            }
            else -> { // 3사분면
                ans += 3 * area
                r -= half
                c -= half
            }
        }
        n--
    }
    println(ans)
}