fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (a, b) = readln().split(" ")
        println(if (a == b) "OK" else "ERROR")
    }
}