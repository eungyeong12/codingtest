fun main() {
    val nums = List(9) { readLine()!!.toInt() }
    val max = nums.maxOrNull()!!
    val index = nums.indexOf(max) + 1
    println(max)
    println(index)
}