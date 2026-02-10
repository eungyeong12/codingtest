fun main() {
    val s = readln()
    s.chunked(10).forEach {
        println(it)
    }
}