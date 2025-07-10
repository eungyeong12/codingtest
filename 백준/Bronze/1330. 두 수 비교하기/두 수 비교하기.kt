fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    when {
        a > b -> println(">")
        a < b -> println("<")
        else -> println("==")
    }
}