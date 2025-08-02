fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val x = readLine().split(" ").map { it.toInt() }
    val sorted = x.distinct().sorted()
    val mapping = sorted.withIndex().associate { it.value to it.index }
    println(x.joinToString(" ") { mapping[it].toString() })
}