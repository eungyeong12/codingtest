fun main() {
    val n = readln().toInt()
    val list = List(n + 1) { 0 }.toMutableList()
    list[1] = 1
    for (i in 2..n) {
        list[i] = list[i - 2] + list[i - 1]
    }
    println(list[n])
}
