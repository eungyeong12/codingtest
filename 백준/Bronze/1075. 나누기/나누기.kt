fun main() {
    val n = readln().toLong()
    val f = readln().toLong()
    (0..99).forEach {
        val num = (n.toString().substring(0, n.toString().length - 2) + if (it < 10) "0$it" else it.toString()).toLong()
        if (num % f == 0L) {
            val answer = num.toString().substring(num.toString().length - 2, num.toString().length).toInt()
            println(if (answer < 10) "0$answer" else answer)
            return
        }
    }
}