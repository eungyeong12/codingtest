fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val trees = readLine().split(" ").map { it.toInt() }
    var left = 0L
    var right = trees.max().toLong()
    var answer = 0L
    
    while (left <= right) {
        val mid = (left + right) / 2
        var total = 0L
        for (tree in trees) {
            if (tree > mid) total += (tree - mid)
        }
        if (total >= m) {
            answer = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    println(answer)
}