fun main() {
    val nums = readln().split(" ").map { it.toInt() }
    println(nums.sorted().joinToString(" "))
}
