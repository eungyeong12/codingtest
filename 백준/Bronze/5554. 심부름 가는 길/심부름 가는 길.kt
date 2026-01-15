fun main() {
    val seconds = List(4) { readln() }.sumOf { it.toInt() }
    println(seconds / 60)
    println(seconds % 60)
}
