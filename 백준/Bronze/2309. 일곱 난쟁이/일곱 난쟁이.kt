fun main() {
    val list = List(9) { readln().toInt() }.sorted()
    val sum = list.sum()
    (0 until 9).forEach { i ->
        (8 downTo (i + 1)).forEach { j ->
            if (sum - list[i] - list[j] == 100) {
                println(list.filterNot { it == list[i] || it == list[j] }
                    .joinToString("\n"))
                return
            }
        }
    }
}