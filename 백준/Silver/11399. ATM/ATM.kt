fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val times = readLine().split(" ").map { it.toInt() }.sorted().toMutableList()
    for (i in 1 until n) {
        times[i] += times[i - 1]
    }
    println(times.sum())
}