fun main() {
    val amount = readln().split(" ").sumOf { it.toLong() }
    val c = readln().toLong()
    if (amount >= c * 2) {
        println(amount - c * 2)
    } else {
        println(amount)
    }
}
