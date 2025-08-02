fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val fruits = readLine().split(" ").map { it.toInt() }
    val count = IntArray(10)
    var left = 0
    var right = 0
    var kind = 0
    var maxLen = 0
    
    while (right < n) {
        val curr = fruits[right]
        if (count[curr] == 0) kind++
        count[curr]++
        while (kind > 2) {
            val leftFruit = fruits[left]
            count[leftFruit]--
            if (count[leftFruit] == 0) kind--
            left++
        }
        maxLen = maxOf(maxLen, right - left + 1)
        right++
    }
    println(maxLen)
}