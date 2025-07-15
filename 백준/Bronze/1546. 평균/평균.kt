fun main() {
    val n = readln().toInt()
    val scores = readln().split(" ").map { it.toDouble() }
    val max = scores.maxOrNull()
    val avg = scores.map { it / max!! * 100 }.sum() / n
    println(avg)
}