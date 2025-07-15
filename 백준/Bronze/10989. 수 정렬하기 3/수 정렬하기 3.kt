fun main() {
    val n = readln().toInt()
    val count = IntArray(10001)
    repeat(n) {
        val num = readln().toInt()
        count[num]++
    }
    val sb = StringBuilder()
    for (i in 1..10000) {
        repeat(count[i]) {
            sb.appendLine(i)
        }
    }
    print(sb)
}