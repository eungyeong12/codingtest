fun main() {
    val n = readln()
    val nums = readln().split(" ")
    println(nums.count { it.last() == n.first()})
}
