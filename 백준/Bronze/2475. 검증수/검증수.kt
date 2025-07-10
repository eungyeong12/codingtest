fun main() {
    val nums = readLine()!!.split(" ").map { it.toInt() }
    val sum = nums.map { it * it }.sum()
    println(sum % 10)
}