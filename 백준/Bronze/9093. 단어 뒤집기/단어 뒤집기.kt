fun main() {
    val n = readln().toInt()
    repeat(n) {
        val s = readln().split(" ")
        println(s.joinToString(" ") { it.reversed() })
    }
}