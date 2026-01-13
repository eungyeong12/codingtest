fun main() {
    val t = readln().toInt()
    for(i in 1..t) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        println("Case #${i}: ${a + b}")
    }
}