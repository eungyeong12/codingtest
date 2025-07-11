fun main() {
    val s = readLine()!!.split(" ").map { it.toInt() }.sum()
    val t = readLine()!!.split(" ").map { it.toInt() }.sum()
    println(maxOf(s, t))
}