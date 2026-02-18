fun main() {
    val list = List(5) { readln() }
    (0 until list.maxBy { it.length }.length).forEach { i ->
        (0 until 5).forEach { j ->
            print(if (list[j].length <= i) "" else list[j][i])
        }
    }
}