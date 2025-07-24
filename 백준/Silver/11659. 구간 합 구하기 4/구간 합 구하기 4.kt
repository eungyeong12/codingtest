fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val nums = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    val arr = IntArray(n + 1)

    for (i in 1..n) {
        arr[i] = arr[i - 1] + nums[i - 1]
    }

    repeat(m) {
        val (i, j) = readLine().split(" ").map { it.toInt() }
        sb.appendLine(arr[j] - arr[i - 1])
    }
    print(sb)
}