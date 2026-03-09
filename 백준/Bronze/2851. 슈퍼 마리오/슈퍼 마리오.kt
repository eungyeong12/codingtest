fun main() {
    val list = List(10) { readln().toInt() }
    val scores = list.runningReduce { acc, i -> acc + i }
    for (i in 1..scores.lastIndex) {
        if (scores[i] >= 100) {
            val prev = scores[i - 1]
            val current = scores[i]

            when {
                100 - prev == current - 100 -> {
                    println(current)
                    return
                }
                100 - prev > current - 100 -> {
                    println(current)
                    return
                }
                else -> {
                    println(prev)
                    return
                }
            }
        }
    }
    println(scores.last())
}