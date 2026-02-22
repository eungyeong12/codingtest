fun main() {
    val s = readln()
    println(StringBuilder().apply {
        s.forEach {
            when (it) {
                in 'A'..'Z' -> {
                    append('A' + (it - 'A' + 13) % 26)
                }
                in 'a'..'z' -> {
                    append('a' + (it - 'a' + 13) % 26)
                }
                else -> append(it)
            }
        }
    })
}