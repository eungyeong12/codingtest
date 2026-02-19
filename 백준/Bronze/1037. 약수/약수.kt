fun main() {
    val count = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    println(list.min() * list.max())
}