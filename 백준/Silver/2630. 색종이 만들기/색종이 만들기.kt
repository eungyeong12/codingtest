fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val paper = Array(n) { readLine().split(" ").map { it.toInt() }.toIntArray() }
    
    var white = 0
    var blue = 0
    
    fun countColor(x: Int, y: Int, len: Int) { // (x, y)에서 시작하는 len x len 종이 확인
        val color = paper[x][y]
        var isSame = true
        loop@ for (i in x until x + len) {
            for (j in y until y + len) {
                if (paper[i][j] != color) {
                    isSame = false
                    break@loop
                }
            }
        }
        if (isSame) {
            if (color == 0) white++
            else blue++
        } else {
            val half = len / 2
            countColor(x, y, half)
            countColor(x + half, y, half)
            countColor(x, y + half, half)
            countColor(x + half, y + half, half)
        }
    }
    
    countColor(0, 0, n)
    println(white)
    println(blue)
}