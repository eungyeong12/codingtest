fun main() {
    val list = readln().split(" ").map { it.toInt() }.sorted()
    var min = Int.MAX_VALUE
    for (i in 0..list.lastIndex - 2) {
        for (j in i + 1..<list.lastIndex) {
            for (k in j + 1..list.lastIndex) {
                min = minOf(min, lcmThreeNumbers(list[i], list[j], list[k]))
            }
        }
    }
    println(min)
}

fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)

fun lcmThreeNumbers(a: Int, b: Int, c: Int): Int {
    return lcm(lcm(a, b), c)
}