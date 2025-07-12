fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val quiz = readLine()!!
        var score = 0
        var current = 0
        for (c in quiz) {
            if (c == 'O') {
                current++
                score += current
            } else {
                current = 0
            }
        }
        println(score)
    }
}