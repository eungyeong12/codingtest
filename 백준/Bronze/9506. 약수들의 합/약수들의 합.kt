fun main() {
    while (true) {
        val n = readln().toInt()
        if (n == -1) return
        val list = (1 until n).filter { n % it == 0 }
        if (list.sum() == n) {
            println("$n = ${list.joinToString(" + ")}")
        } else {
            println("$n is NOT perfect.")
        }
    }
}
