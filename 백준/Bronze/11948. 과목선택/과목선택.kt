fun main() {
    val score1 = List(4) { readln() }.map { it.toInt() }
    val score2 = List(2) { readln() }.map { it.toInt() }
    println(score1.sum() - score1.min() + score2.max())
}