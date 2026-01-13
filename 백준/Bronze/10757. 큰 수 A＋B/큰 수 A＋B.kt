fun main() {
    val nums = readln().split(" ").map { it.toBigInteger() }
    println(nums.sumOf { it })
}