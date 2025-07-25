fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    var count = 1
    repeat(t) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        println("Case #$count: $a + $b = ${a + b}")
        count++
    }
}