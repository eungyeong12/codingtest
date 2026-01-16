fun main() {
    val n = readln().toInt()
    repeat(n) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        if (x >= y) {
            println("MMM BRAINS")
        } else {
            println("NO BRAINS")
        }
    }
}