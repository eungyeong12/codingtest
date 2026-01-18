fun main() {
    val nums = List(28) { readln() }.map { it.toInt() }
    for(i in 1..30) {
        if (i !in nums) {
            println(i)
        }
    }
}