fun main() {
    var count = 0
    while (true) {
        count++
        val (L, P, V) = readln().split(" ").map { it.toInt() }
        if (L == 0 && P == 0 && V == 0) break
        println("Case $count: ${L * (V / P) + minOf(V % P, L)}")
    }
}