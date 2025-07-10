fun main() {
    while (true) {
        val line = readLine() ?: break
        val (a, b) = line.split(" ").map { it.toInt() }
        println(a + b)
    }
}