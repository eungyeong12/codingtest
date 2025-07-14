fun main() {
    val n = readln()!!.toInt()
    var count = 1
    var range = 1
    while (n > range) {
        range += 6 * count
        count++
    }
    println(count)
}