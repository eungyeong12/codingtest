fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        println(lcm(a, b))
    }
}

// 최대공약수
fun gcd(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = x % y
        x = y
        y = temp
    }
    return x
}

// 최소공배수
fun lcm(a: Int, b: Int): Int {
    return a / gcd(a, b) * b
}