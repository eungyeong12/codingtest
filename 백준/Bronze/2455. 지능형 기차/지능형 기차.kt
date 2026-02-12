fun main() {
    val list = List(4) { 0 }
        .runningFold(0) { acc, _ ->
            val (a, b) = readln().split(" ").map { it.toInt() }
            acc - a + b
        }
    println(list.max())
}