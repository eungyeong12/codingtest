fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val list = List(n) { it + 1 }.toMutableList()
    repeat(m) {
        val (i, j) = readln().split(" ").map { it.toInt() - 1 }
        val temp = list[i]
        list[i] = list[j]
        list[j] = temp
    }
    println(list.joinToString(" "))
}