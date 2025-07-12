fun main() {
    val nums = readLine()!!.split(" ").map { it.toInt() }
    when {
        nums == (1..8).toList() -> println("ascending")
        nums == (8 downTo 1).toList() -> println("descending")
        else -> println("mixed")
    }
}