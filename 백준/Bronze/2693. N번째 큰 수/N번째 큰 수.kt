fun main() {
    val t = readln().toInt()
    repeat(t) {
        val list = readln().split(" ").map { it.toInt() }.sortedDescending()
        println(list[2])
    }
}