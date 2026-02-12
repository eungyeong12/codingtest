fun main() {
    val (a, l) = readln().split(" ").map { it.toInt() }
    println(a * (l - 1) + 1)
}