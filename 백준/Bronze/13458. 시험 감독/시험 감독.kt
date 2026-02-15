fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toLong() }
    val (b, c) = readln().split(" ").map { it.toInt() }
    println(a.sumOf {
        1 + if (it - b > 0) (it - b) / c + if ((it - b) % c != 0L) 1 else 0 else 0
    })
}