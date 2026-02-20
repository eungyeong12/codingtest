fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(b)
    var index = 0
    var n = 1
    while (index < b) {
        (1..n).forEach {
            if (index < b) {
                arr[index++] = n
            }
        }
        n++
    }
    println(arr.toList().subList(a - 1, b).sum())
}