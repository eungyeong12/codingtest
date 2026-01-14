fun main() {
    val nums = readln().split(" ").map { it.toInt() }.sortedDescending()
    println(nums[1])
}
