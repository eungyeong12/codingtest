fun main() {
    val n = readln().toInt()
    val list = List(n + 1) { 0L }.toMutableList()
    list[1] = 1L
    for (i in 2..n) {
        list[i] = list[i - 1] + list[i - 2]
    }
    println(list[n])
}