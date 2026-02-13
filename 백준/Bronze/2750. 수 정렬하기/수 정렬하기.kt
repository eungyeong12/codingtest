fun main() {
    val n = readln().toInt()
    val nums = List(n) { readln().toInt() }.sorted()
    println(nums.joinToString("\n") { it.toString() })
}