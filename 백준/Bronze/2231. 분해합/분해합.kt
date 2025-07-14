fun main() {
    val n = readln()!!.toInt()
    for (i in 1 until n) {
        val sum = i + i.toString().map { it - '0' }.sum()
        if (sum == n) {
            println(i)
            return
        } 
    }
    println(0)
}