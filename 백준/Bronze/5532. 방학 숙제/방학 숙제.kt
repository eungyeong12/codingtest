fun main() {
    val l = readln().toInt()
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val math = b / d + if (b % d != 0) 1 else 0
    val korean = a / c + if (a % c != 0) 1 else 0
    println(l - maxOf(math, korean))
}
