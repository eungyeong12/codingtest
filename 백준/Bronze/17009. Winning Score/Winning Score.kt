fun main() {
    var score1 = 0
    var score2 = 0
    var count = 3
    repeat(3) {
        score1 += readln().toInt() * count
        count--
    }
    count = 3
    repeat(3) {
        score2 += readln().toInt() * count
        count--
    }
    println(if (score1 > score2) "A" else if (score1 < score2) "B" else "T")
}