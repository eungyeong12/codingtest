fun main() {
    val chess = listOf(1, 1, 2, 2, 2, 8)
    val input = readln().split(" ").map { it.toInt() }
    chess.forEachIndexed { index, i ->
        print("${i - input[index]} ")
    }
}