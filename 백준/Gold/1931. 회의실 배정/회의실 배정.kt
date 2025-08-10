fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val meetings = List(n) {
        val (s, e) = readLine().split(" ").map { it.toInt() }
        s to e
    }.sortedWith(compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first })
    
    var count = 0
    var lastEnd = 0
    for ((s, e) in meetings) {
        if (s >= lastEnd) {
            count++
            lastEnd = e
        }
    }
    println(count)
}