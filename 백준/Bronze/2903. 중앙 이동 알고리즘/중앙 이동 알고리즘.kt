fun main() {
    // 1 -> 3 * 3 = 9
    // 2 -> 5 * 5 = 25
    // 3 -> 9 * 9 = 81
    val n = readln().toInt()
    val arr = LongArray(n + 1)
    arr[1] = 3
    for(i in 2..n) {
        arr[i] = arr[i - 1] * 2 - 1
    }
    println(arr[n] * arr[n])
}