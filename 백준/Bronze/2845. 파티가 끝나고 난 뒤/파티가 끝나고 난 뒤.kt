fun main() {
    val (L, P) = readln().split(" ").map { it.toInt() }
    val nums = readln().split(" ").map { it.toInt() }
    val n = L * P
    println(nums.map { it - n }.joinToString(" "))
}
