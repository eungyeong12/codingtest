fun main() {
    val l = readln().toInt()
    val list = List(l + 1) { 0 }.toMutableList()
    val n = readln().toInt()
    val audiences = List(n) {
        val (p, k) = readln().split(" ").map { it.toInt() }
        p to k
    }
    audiences.forEachIndexed { index, i ->
        val num = index + 1
        val (p, k) = i
        for (j in p..k) {
            if (list[j] == 0) list[j] = num
        }
    }
    var expectMaxNum = 0
    var expectMaxCount = 0
    audiences.map { it.second - it.first }.forEachIndexed { index, i ->
        if (i > expectMaxCount) {
            expectMaxCount = i
            expectMaxNum = index + 1
        }
    }
    println(expectMaxNum)
    var realMaxNum = 0
    var realMaxCount = 0
    val real = list.groupingBy { it }.eachCount()
    real.forEach { (num, count) ->
        if (num != 0 && count > realMaxCount) {
            realMaxCount = count
            realMaxNum = num
        }
    }
    println(realMaxNum)
}
