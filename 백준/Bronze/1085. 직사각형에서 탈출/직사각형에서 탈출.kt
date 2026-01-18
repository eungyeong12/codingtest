fun main() {
    val (x, y, w, h) = readln().split(" ").map { it.toInt() }
    println(minOf(x, minOf(y, minOf(w -x, h - y))))
}