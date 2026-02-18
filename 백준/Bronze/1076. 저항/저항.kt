import kotlin.math.pow

fun main() {
    val map = mapOf("black" to 0, "brown" to 1, "red" to 2,
        "orange" to 3, "yellow" to 4, "green" to 5, "blue" to 6,
        "violet" to 7, "grey" to 8, "white" to 9)
    val list = List(3) { map[readln()] }
    println((list[0].toString() + list[1].toString()).toLong() * 10.0.pow(list[2]!!.toDouble()).toLong())
}