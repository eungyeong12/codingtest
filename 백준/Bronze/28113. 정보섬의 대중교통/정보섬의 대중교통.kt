fun main() {
    val (n, a, b) = readln().split(" ").map { it.toInt() }
    if (n <= b) {
        if (a < maxOf(n, b)) {
            println("Bus")
        } else if (a > maxOf(n, b)) {
            println("Subway")
        } else {
            println("Anything")
        }
    } else {
        println("Bus")
    }
}