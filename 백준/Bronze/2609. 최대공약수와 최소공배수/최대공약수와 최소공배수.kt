fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val g = gcd(a, b)
    val l = a * b / g
    println(g)
    println(l)
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}