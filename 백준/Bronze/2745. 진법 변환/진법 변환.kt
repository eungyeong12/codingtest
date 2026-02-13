fun main() {
    val (n, b) = readln().split(" ")
    val base = b.toInt()
    val result = n.fold(0) { acc, ch ->
        val digit = when (ch) {
            in '0'..'9' -> ch - '0'
            else -> ch - 'A' + 10
        }
        acc * base + digit
    }

    println(result)
}