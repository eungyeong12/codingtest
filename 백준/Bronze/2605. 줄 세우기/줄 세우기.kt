fun main() {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }.mapIndexed { index, element ->
        element to index + 1
    }.toMutableList()
    (1 until n).forEach {
        list.add(it - list[it].first, list[it])
        list.removeAt(it + 1)
    }
    println(list.map { it.second }.joinToString(" "))
}