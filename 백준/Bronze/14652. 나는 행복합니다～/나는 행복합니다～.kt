fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    var count = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (count == k) {
                println("$i $j")
                return
            }
            count++
        }
    }
}