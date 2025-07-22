fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val coins = IntArray(n) { readLine().toInt() }.reversed()
    
    var amount = k
    var count = 0
    
    for (coin in coins) {
        if (amount == 0) break
        count += amount / coin
        amount %= coin
    }
    println(count)
}