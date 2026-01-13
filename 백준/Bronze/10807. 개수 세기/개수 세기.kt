fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }
    val v = readln().toInt()
    println(nums.count { it == v })
}