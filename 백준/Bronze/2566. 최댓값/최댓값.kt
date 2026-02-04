fun main() {
    val arr = List(9) { readln().split(" ").map { it.toInt() } }
    val max = arr.maxOf { it.max() }
    arr.forEach {
        it.forEach { num ->
            if (num == max) {
                println(max)
                println("${arr.indexOf(it) + 1} ${it.indexOf(max) + 1}")
            }
        }
    }
}