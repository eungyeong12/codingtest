fun main() {
    val (t1, t2) = readln().split(" ").map { it.toInt() }
    println(minOf(t1, t2))
}