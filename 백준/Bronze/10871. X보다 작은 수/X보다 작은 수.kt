fun main() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    println(a.filter { it < x }.joinToString(" "))
}