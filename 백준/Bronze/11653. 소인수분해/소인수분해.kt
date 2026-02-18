fun main() {
    var n = readln().toInt()
    while (n > 1) {
        (2..n).forEach {
            while (n % it == 0) {
                n /= it
                println(it)
            }
        }
    }
}