fun main() {
    val n = readln().toInt()
    println("Gnomes:")
    repeat(n) {
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        when (b) {
            in a..c -> println("Ordered")
            in c..a -> println("Ordered")
            else -> println("Unordered")
        }
    }
}