fun main() {
    readLine()
    val sum = readLine()!!.map { it.toString().toInt() }.sum()
    println(sum)
}