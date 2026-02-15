fun main() {
    val c = readln().toInt()
    repeat(c) {
        val tokens = readln().split(" ").map { it.toInt() }
        val n = tokens[0]
        val scores = tokens.drop(1)
        val avg = scores.average()
        println(String.format("%.3f", scores.count { it > avg } * 100.0 / n) + "%")
    }
}