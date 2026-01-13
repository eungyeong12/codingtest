fun main() {
    val (x, y) = List(2) { readln() }.map { it.toInt() }
    when {
        x >= 0 && y >= 0 -> println(1)
        x < 0 && y >= 0 -> println(2)
        x < 0 && y < 0 -> println(3)
        else -> println(4)
    }
}