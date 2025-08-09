fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val m = readLine().toInt()
    val s = readLine()
    
    var i = 0
    var cnt = 0
    var ans = 0
    
    while (i <= s.length - 3) {
        if (s[i] == 'I' && s[i + 1] == 'O' && s[i + 2] == 'I') {
            cnt++
            if (cnt >= n) ans++
            i += 2
        } else {
            cnt = 0
            i++
        }
    }
    println(ans)
}