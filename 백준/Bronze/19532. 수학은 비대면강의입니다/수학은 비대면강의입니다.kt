fun main() {
    val list = readln().split(" ").map { it.toInt() }
    val a = list[0]
    val b = list[1]
    val c = list[2]
    val d = list[3]
    val e = list[4]
    val f = list[5]
    (-999..999).forEach {
        val x = it
        val y = if (b != 0) (c - a * x) / b else (f - d * x) / e
        if (a * x + b * y == c && d * x + e * y == f) {
            println("$x $y")
            return
        }
    }
}