fun main() = with(System.`in`.bufferedReader()) {
    val x = readLine().toInt()
    val n = readLine().toInt()
    var sum = 0
    repeat(n) {
        val (a, b) = readLine().split(" "). map { it.toInt() }
        sum += a * b
    }
    if (sum == x) {
        print("Yes")
    } else {
        print("No")
    }
}