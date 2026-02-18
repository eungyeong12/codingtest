import kotlin.math.abs

fun main() {
    val a = readln()
    val b = readln()

    val cntA = IntArray(26)
    val cntB = IntArray(26)

    a.forEach { cntA[it - 'a']++ }
    b.forEach { cntB[it - 'a']++ }

    var answer = 0
    (0 until 26).forEach {
        answer += abs(cntA[it] - cntB[it])
    }
    println(answer)
}