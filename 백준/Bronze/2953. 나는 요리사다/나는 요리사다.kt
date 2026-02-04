fun main() {
    val scores = List(5) {
        readln().split(" ").sumOf { it.toInt() }
    }
    println("${scores.indexOf(scores.max()) + 1} ${scores.max()}")
}