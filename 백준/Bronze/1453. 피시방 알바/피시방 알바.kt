fun main() {
    val computer = List(100) { it + 1 }.toMutableList()
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    println(list.count {
        var b = true
        if (it in computer) b = false
        computer.remove(it)
        b
    })
}