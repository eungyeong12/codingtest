fun main() {
    val n = readln().toInt()
    val list = List(n) { readln().toInt() }.reversed()
    var max = list[0]
    var count = 1
    list.drop(1).forEach {
        if (max < it) {
            max = it
            count++
        }
    }
    println(count)
}