fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    if (a < b) {
        println(b - a)
    } else {
        println(24 - a + b)
    }
}