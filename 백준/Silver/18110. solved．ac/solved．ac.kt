import java.io.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val scores = IntArray(n) { readLine().toInt() }.sorted()
    
    if (n == 0) {
        println(0)
        return
    }
    
    val cut = Math.round(n * 0.15).toInt()
    var sum = 0
    for (i in cut until n - cut) {
        sum += scores[i]
    }
    println(Math.round(sum.toDouble() / (n - cut * 2)).toInt())
}