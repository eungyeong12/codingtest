fun main() {
    val list = List(9) { readln().toInt() }
    val sum = list.sum()
    for (i in 0 until list.size - 1) {
        for (j in i + 1 until list.size) {
            if (sum - list[i] - list[j] == 100) {
                println(list.filterNot { it == list[i] || it == list[j] }
                    .joinToString("\n"))
                return
            }
        }
    }
}