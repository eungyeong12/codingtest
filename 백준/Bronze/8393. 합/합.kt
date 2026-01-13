fun main() {
    val n = readln().toInt()
    println(List(n) { it }.sumOf { it } + n)
}