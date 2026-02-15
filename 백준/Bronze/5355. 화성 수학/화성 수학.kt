fun main() {
    val t = readln().toInt()
    repeat(t) {
        val token = readln().split(" ")
        var n = token[0].toDouble()
        token.drop(1).forEach {
            when (it) {
                "@" -> n *= 3
                "%" -> n += 5
                "#" -> n -= 7
            }
        }
        println(String.format("%.2f", n))
    }
}