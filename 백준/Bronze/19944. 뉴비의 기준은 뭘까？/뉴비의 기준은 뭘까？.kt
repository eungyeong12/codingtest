fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    if (m == 1 || m == 2) {
        println("NEWBIE!")
        return
    }
    if (m <= n && m != 1 && m != 2) {
        println("OLDBIE!")
        return
    }
    println("TLE!")
}
