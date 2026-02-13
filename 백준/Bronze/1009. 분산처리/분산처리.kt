fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        var data = 1
        repeat(b) {
            data = data * a % 10
        }
        println(if (data == 0) 10 else data)
    }
}