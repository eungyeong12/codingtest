fun main() {
    // 1/1
    // 1/2 2/1
    // 3/1 2/2 1/3
    // 1/4 2/3 3/2 4/1
    // 5/1 4/2 3/3 2/4 1/5
    // 짝수 라인: 분모가 1씩 늘어나고 분자가 1씩 줄어듦
    // 홀수 라인: 분자가 1씩 늘어나고 분모가 1씩 줄어듦
    val n = readln().toInt()

    var line = 1
    for (i in 1..n) {
        val sum = (1..i).reduce { acc, i -> acc + i }
        if (sum >= n) {
            line = i
            break
        }
    }

    val list = mutableListOf<Pair<Int, Int>>()
    when (line % 2) {
        0 -> {
            for (j in 1..line) {
                list.add(j to line - j + 1)
            }
        }
        1 -> {
            for (j in line downTo 1) {
                list.add(j to line - j + 1)
            }
        }
    }
    val index = n - (1 until line).sum() - 1
    println("${list[index].first}/${list[index].second}")
}