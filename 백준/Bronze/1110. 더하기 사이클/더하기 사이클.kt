fun main() {
    val n = readln().toInt()
    var count = 0
    var current = n
    while (true) {
        count++
        current = (current % 10 * 10) + ((current / 10 + current % 10) % 10)
        if (current == n) break
    }
    println(count)
}