fun main() {
    val (s, k, h) = readln().split(" ").map { it.toInt() }
    if (s + k + h >= 100) {
        println("OK")
    } else {
        val min = minOf(s, minOf(k, h))
        if (s == min) {
            println("Soongsil")
        } else if (k == min) {
            println("Korea")
        } else {
            println("Hanyang")
        }
    }
}