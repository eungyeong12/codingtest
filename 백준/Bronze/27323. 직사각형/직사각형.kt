fun main() {
    val (a, b) = List(2) { readln() }.map { it.toInt() }
    println(a * b)
}