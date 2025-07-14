fun main() {
    val (n, m) = readln()!!.split(" ").map { it.toInt() }
    val cards = readln()!!.split(" ").map { it.toInt() }
    
    var maxSum = 0
    
    for (i in 0 until n - 2) {
        for (j in i + 1 until n - 1) {
            for (k in j + 1 until n) {
                var sum = cards[i] + cards[j] + cards[k]
                if (sum <= m && sum > maxSum) {
                    maxSum = sum
                }
            }
        }
    }
    println(maxSum)
}