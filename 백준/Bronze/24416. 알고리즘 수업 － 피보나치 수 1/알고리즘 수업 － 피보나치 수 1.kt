fun main() {
    var count1 = 0
    var count2 = 0

    val n = readln().toInt()
    val f = IntArray(n + 1)

    f[1] = 1
    f[2] = 1
    for (i in 3..n) {
        f[i] = f[i - 1] + f[i - 2]
    }

    println("${f[n]} ${n - 2}")
}