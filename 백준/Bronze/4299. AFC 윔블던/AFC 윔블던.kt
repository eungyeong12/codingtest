fun main() {
    val (sum, subtraction) = readln().split(" ").map { it.toInt() }
    val a = (sum + subtraction) / 2
    val b = sum - a
    if (b >= 0 && a - b == subtraction) {
        println("$a $b")
    } else {
        println(-1)
    }
}
