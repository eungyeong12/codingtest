fun main() {
    val n = readLine()!!.toInt()
    val nums = readLine()!!.split(" ").map { it.toInt() }
    println("${nums.minOrNull()} ${nums.maxOrNull()}")
}