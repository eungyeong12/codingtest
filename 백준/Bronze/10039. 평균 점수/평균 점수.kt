fun main() {
    val avg = List(5) { readln() }.map { it.toInt() }
        .map { if (it < 40) 40 else it }.average()
    println(avg.toInt())
}
