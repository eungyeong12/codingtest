fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val list = List(n) { it + 1 }.toMutableList()
    repeat(m) {
        val (i, j) = readln().split(" ").map { it.toInt() - 1 }
        val reversedList = list.subList(i, j + 1).reversed()
        for (index in i..j) {
            list[index] = reversedList[index - i]
        }
    }
    println(list.joinToString(" "))
}