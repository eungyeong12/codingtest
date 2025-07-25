fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    repeat(t) {
        val s = readLine()
        println("${s.first()}${s.last()}")
    }
}