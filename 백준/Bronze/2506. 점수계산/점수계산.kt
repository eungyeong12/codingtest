fun main() {
    var n = readln().toInt()
    var scores = readln().split(" ").map { it.toInt() }
    var total = 0
    var score = 0
    for (s in scores) {
        if (s == 1) {
            score++
            total += score
        } else {
            score = 0
        }
    }
    println(total)
}