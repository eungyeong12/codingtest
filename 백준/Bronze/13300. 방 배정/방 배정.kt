fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val map = List(n) {
        val (s, y) = readln().split(" ").map { it.toInt() }
        y to s
    }.groupingBy { it }.eachCount()
    println(map.values.sumOf {
        it / k + if (it % k == 0) 0 else 1
    })
}