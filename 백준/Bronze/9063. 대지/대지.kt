fun main() {
    val n = readln().toInt()
    val list = List(n) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        x to y
    }
    val sortedByX = list.sortedBy { it.first }
    val sortedByY = list.sortedBy { it.second }
    val x = sortedByX.last().first - sortedByX.first().first
    val y = sortedByY.last().second - sortedByY.first().second
    println(x * y)
}