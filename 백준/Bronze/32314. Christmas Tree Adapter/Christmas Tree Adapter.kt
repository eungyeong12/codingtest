fun main() {
    val a = readln().toInt()
    val (w, v) = readln().split(" ").map { it.toInt() }
    println(if (a <= w / v) 1 else 0)
}