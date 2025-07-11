fun main() {
    readLine()
    val nums = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    
    for (num in nums) {
        if (isPrime(num)) count++
    }
    println(count)
}

fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}