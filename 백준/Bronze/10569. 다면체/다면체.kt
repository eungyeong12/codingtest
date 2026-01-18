fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (v, e) = readln().split(" ").map { it.toInt() }
        println(2 - v + e)
    }
}