fun main() {
    val nums = readln().split(" ").map { it.reversed().toInt() }
    println(nums.max())
}