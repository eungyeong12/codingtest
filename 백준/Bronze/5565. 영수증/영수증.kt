fun main() {
    val total = readln().toInt()
    val price = List(9) { readln() }.sumOf { it.toInt() }
    println(total - price)
}
